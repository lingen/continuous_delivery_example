pipeline {
    agent any

    stages {
        stage('编译与构建') {
            steps {
                sh 'cd test-backend'
                sh 'gradle build -x test'
            }
        }

        stage('镜像制作'){
            steps {
                sh 'docker build test-backend:1 .'
            }
        }

        stage('重启服务'){
            steps {
                sh 'docker run -dp 8080:8080  test-backend:1'
            }
        }
    }
}