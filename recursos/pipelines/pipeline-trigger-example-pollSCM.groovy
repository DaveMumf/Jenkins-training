
pipeline {
    agent any
    triggers {
        cron('*/10 * * * *')
    }
    stages {
        stage('Build') {
            steps {
                echo 'echo Clonando repo'
            }
        }
    }
}