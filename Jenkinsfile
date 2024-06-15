pipeline {
    agent any
    
    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }
        
        stage('Build') {
            steps {
                script {
                    // 컴파일할 Java 파일들의 목록을 찾기 위해 Groovy 스크립트 사용
                    def javaFiles = findFiles(glob: 'Mission01/src/**/*.java')
                            .files
                            .collect { it.path }
                            .join(' ')
                    
                    // javac 명령어 실행
                    bat "javac -encoding UTF-8 -d Mission01/classes ${javaFiles}"
                }
            }
        }
        
        stage('Test') {
            steps {
                script {
                    def classpath = "Mission01/classes;Mission01/lib/*;Mission01/lib/junit-platform-console-standalone-1.7.1.jar"
                    bat "java -cp ${classpath} org.junit.platform.console.ConsoleLauncher --scan-classpath > Mission01/test_results.txt"
                }
            }
        }
    }
    
    post {
        always {
            archiveArtifacts 'Mission01/test_results.txt'
        }
        failure {
            echo 'Build or test failed'
        }
        success {
            echo 'Build and test succeeded'
        }
    }
}

