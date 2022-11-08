pipeline {
    agent any
    triggers { 
        cron('* * * * *') 
    }
    options { 
        timeout(time: 5) 
    }
    parameters {
        booleanParam(name: 'COMPILACION', defaultValue: true,
        description: 'Es esto un build para depurar?')
    }
    stages {
        stage('Ambiente a instalar') {
            environment { NAME = 'Linux' }
            when { 
                expression { 
                    return params.COMPILACION 
                } 
            }
            steps {
                echo "Instalando en $NAME"
                script {
                    def browsers = ['chrome', 'firefox', 'edge']
                    for (int i = 0; i < browsers.size(); ++i) {
                        echo "Probando en el navegador ${browsers[i]}."
                    }
                    def device = ['Android', 'iOS']
                    for (int i = 0; i < device.size(); ++i) {
                        echo "Probando en el dispositivo ${device[i]}."
                    }
                }
            
        }
    }
post { 
    always 
    { 
        echo "Enviando mail de Reporte"
    } 
    }
}