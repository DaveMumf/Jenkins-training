pipeline {
    agent any 
    stages {
        stage('Deploy to STG ENV') { 
            steps {
                sh 'echo Deployando imagen'
                sh 'echo docker compose yaml'
                sh 'echo agregando y verificando configuracion de ambiente'
                sh 'echo npm run app'
                sh 'sleep 10'
            }
        }
        stage('Disponer de ambiente para usuario') { 
            steps {
                sh 'echo ambiente instalado'
                sh 'sleep 10'
            }
        }
        stage('Ejecutar TEST') {
            parallel {
                stage('TEST #1 - Esperar OK de usuario') { 
                    steps {
                        sh 'echo Ok del usuario'
                        sh 'sleep 10'
                    }
                }
                stage('TEST #2 Security Test') { 
                    steps {
                        sh 'echo El Código pasa las pruebas de seguridad'
                        sh 'sleep 15'
                    }
                }
                stage('TEST #3 performance Test') { 
                    steps {
                        sh 'echo levantar el terraform simil PROD'
                        sh 'echo traerse la imagen dockerizada del test de performance' 
                        sh 'El Código pasa las pruebas de performance'
                        sh 'sleep 20'
                    }
                }
            }
        }
        stage('Reporting') { 
            steps {
                sh 'echo envio de reportes'
            }
        }
    }
}

