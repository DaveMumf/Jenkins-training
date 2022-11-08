pipeline {
    agent any
    options {
        timeout(time: 1, unit: 'MINUTES') 
    }
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
                sh 'ejecutando pruebas de seguridad simples'
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de seguridad'
            }
        }
        stage('Empaquetando Master') { 
            steps {
                sh 'sleep 10'
                sh 'echo verificacion de packages dependientes'
                sh 'sleep 10'
                sh 'echo empaquetando con nexus'
                sh 'sleep 10'
                sh 'echo agregando al registry'
            }
        }
        stage('Versionado Master') { 
            steps {
                sh 'sleep 10'
                sh 'echo taggeado de imagen y versionado'
                sh 'sleep 10'
                sh 'echo publicar en el boletin de cambios'
            }
        }
        stage('Deploy to DEV ENV') { 
            steps {
                sh 'echo Deployando component'
            }
        }
        stage('Dockerizando imagen para QA') { 
            steps {
                sh 'echo Dockerizando'
            }
        }
    }
}