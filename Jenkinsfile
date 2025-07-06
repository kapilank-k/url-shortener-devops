pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'kapilank/url-shortener-app:1.0.0'
    }

    stages {
        stage('Checkout Code') {
            steps {
                checkout scm
            }
        }

        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }

        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }

        // stage('Build Docker Image') {
        //     steps {
        //         sh 'docker build -t $DOCKER_IMAGE .'
        //     }
        // }

        // stage('Docker Login') {
        //     steps {
        //         withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USERNAME', passwordVariable: 'DOCKER_PASSWORD')]) {
        //             sh 'echo $DOCKER_PASSWORD | docker login -u $DOCKER_USERNAME --password-stdin'
        //         }
        //     }
        // }

        // stage('Push Image') {
        //     steps {
        //         sh 'docker push $DOCKER_IMAGE'
        //     }
        // }
    }

    post {
        success {
            echo '✅ Pipeline complete.'
        }
        failure {
            echo '❌ Pipeline failed.'
        }
    }
}
