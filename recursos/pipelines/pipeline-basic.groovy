pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh 'echo Buildeando componente'
                sleep 2000
            }
        }
        stage('Test') { 
            steps {
                sh 'echo Testeando componente'
                sleep 2000
            }
        }
        stage('Deploy') { 
            steps {
                sh 'echo Deployando component'
                sleep 2000
            }
        }
    }
}