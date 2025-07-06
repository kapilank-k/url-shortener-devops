<<<<<<< HEAD
pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'kapilank/url-shortener-app'
        VERSION = '1.0.0'
    }

    stages {
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
        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE:$VERSION .'
            }
        }
        stage('Docker Login') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                }
            }
        }
        stage('Push Image') {
            steps {
                sh 'docker push $DOCKER_IMAGE:$VERSION'
            }
        }
    }

    post {
        always {
            echo '✅ Pipeline complete.'
        }
    }
}
=======
pipeline {
    agent any

    environment {
        DOCKER_IMAGE = 'kapilank/url-shortener-app'
        VERSION = '1.0.0'
    }

    stages {
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

        stage('Build Docker Image') {
            steps {
                sh 'docker build -t $DOCKER_IMAGE:$VERSION .'
            }
        }

        stage('Docker Login') {
            steps {
                withCredentials([usernamePassword(credentialsId: 'dockerhub-creds', usernameVariable: 'DOCKER_USER', passwordVariable: 'DOCKER_PASS')]) {
                    sh 'echo $DOCKER_PASS | docker login -u $DOCKER_USER --password-stdin'
                }
            }
        }

        stage('Push Image') {
            steps {
                sh 'docker push $DOCKER_IMAGE:$VERSION'
            }
        }
    }

    post {
        always {
            echo ' Pipeline complete.'
        }
    }
}
>>>>>>> 76cc34e (add Jenkinsfile to full project)
