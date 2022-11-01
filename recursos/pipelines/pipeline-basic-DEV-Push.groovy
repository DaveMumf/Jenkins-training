pipeline {
    agent any 
    stages {
        stage('Build') { 
            steps {
                sh 'echo Clonando repo'
                sh 'sleep 10'
                sh 'echo chequear dependencias y vulnerabilidades desde Nexus'
                sh 'sleep 10'
                sh 'echo Instalando'
                sh 'sleep 10'                
                sh 'echo Resultado: El Código compila OK'
            }
        }
        stage('Test Unitarios') { 
            steps {
                sh 'sleep 10'
                sh 'echo ejecutando pruebas unitarias'
                sh 'sleep 10'
                sh 'echo El Código pasa todas las pruebas unitarias'
            }
        }
        stage('Test Sintaxis') { 
            steps {
                sh 'sleep 10'
                sh 'echo Ejecutando SonarQube '
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de sintaxis o estructura del texto'
            }
        }
        stage('Smoke Test') { 
            steps {
                sh 'sleep 10'
                sh 'echo ejecutando Smoke Test'
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de humo'
            }
        }
        stage('Regression Test') { 
            steps {
                sh 'sleep 10'
                sh 'echo ejecutando pruebas de regresion'
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de regresión'
            }
        }
        stage('Security Test') { 
            steps {
                sh 'sleep 10'
                sh 'echo ejecutando pruebas de seguridad simples'
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de seguridad'
            }
        }
        stage('Deploy to DEV ENV - BRANCH') { 
            steps {
                sh 'sleep 10'
                sh 'echo Deployando component'
                sh 'sleep 10'
                sh 'echo el branch se puede mergear correctamente'
            }
        }
    }
}
