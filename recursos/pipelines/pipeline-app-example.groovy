pipeline {
    agent any
    stages {
        stage("Clonar") {
            steps {
                git url: 'https://github.com/geb/geb-example-gradle'
            }
        }
        stage("Compilar") {
        steps {
            sh "./gradlew compileJava"
        }
        }
        stage("Probar") {
            steps {
            sh "./gradlew test"
        }
    }
}
}