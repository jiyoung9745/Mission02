pipeline {
    agent any
    
    stages {
        stage('git clone') {
            steps {
               
                git 'https://github.com/jiyoung9745/Mission02.git'
            }
        }
        
        stage('Compile Java classes') {
            steps {
                
                dir('Mission01/src') {
                   
                    bat 'javac -encoding UTF-8 -d ../classes *.java'
                }
            }
        }
        
        stage('Test') {
            steps {
                echo 'Testing..'
             
            }
        }
        
        stage('execute sh') {
            steps {
              
                sh "chmod 774 ./Mission01.sh"

                sh "./Mission01.sh"
            }
        }        
    }
}
