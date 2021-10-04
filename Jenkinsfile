pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                sh 'cd test-backend'
                sh 'gradle build -x test'
            }
        }

        stage('docker image build'){
            steps {
                sh 'docker build test-backend:1 .'
            }
        }

        stage('start docker'){
            steps {
                sh 'docker run -dp 8080:8080  test-backend:1'
            }
        }
    }
}