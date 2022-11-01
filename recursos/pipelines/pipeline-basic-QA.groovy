pipeline {
    agent any 
    stages {
        stage('Deploy DEV to QA ENV') { 
            steps {
                sh 'echo Descargando imagen'
                sh 'sleep 10'
                sh 'echo Deployando usando docker compose yaml'
                sh 'sleep 10'
                as 'agregando y verificando configuracion de ambiente'
                sh 'sleep 10'
                sh 'echo ejecutando aplicacion con npm run app'
                sh 'sleep 10'
                sh 'echo app corriendo correctamente'
            }
        }
        stage('Traerse imagen dockerizada de QA Framework') { 
            steps {
                sh 'echo descargando proyecto de QA'
                sh 'sleep 10'
                sh 'echo QA - Test instalado'
                sh 'sleep 10'
            }
        }
        stage('Smoke Test') { 
            steps {
                sh 'sleep 10'
                sh 'echo ejecutando Smoke Test ampliados'
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de humo'
            }
        }
        stage('Regression Test') { 
            steps {
                sh 'sleep 10'
                sh 'echo ejecutando pruebas de full regresion'
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de regresión'
            }
        }
        stage('Security Test') { 
            steps {
                sh 'sleep 10'
                sh 'echo ejecutando pruebas de seguridad complejas'
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de seguridad'
            }
        }
        stage('Performance Test') { 
            steps {
                sh 'sleep 10'
                sh 'levantar la infra simil PROD'
                sh 'sleep 10'
                sh 'traerse la imagen dockerizada del test de performance' 
                sh 'sleep 10'
                sh 'echo El Código pasa las pruebas de performance'
            }
        }
        stage('Reporting') { 
            steps {
                sh 'echo envio de reportes'
                sh 'sleep 10'
            }
        }
    }
}

