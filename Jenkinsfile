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
                bat 'javac -encoding UTF-8 -d Mission01\\classes Mission01\\src\\**\\*.java'
            }
        }
        stage('Test') {
            steps {
                script {
                    def classpath = "Mission01\\classes;Mission01\\lib\\*;Mission01\\lib\\junit-platform-console-standalone-1.7.1.jar"
                    bat "java -cp ${classpath} org.junit.platform.console.ConsoleLauncher --scan-classpath > Mission01\\test_results.txt"
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

