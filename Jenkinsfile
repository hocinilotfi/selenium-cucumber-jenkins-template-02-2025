pipeline{
    agent {
        docker {
            image "maven:3.9.9-eclipse-temurin-11"
            args "--entrypoint ''"
        }
    }
    stages{
        stage('check version'){
            steps{
                sh 'mvn -- version'
            }
        }
        stage('Build'){
            steps{
                sh "mvn clean compile install -U"
            }
        }
        stage('test'){
            steps{
                sh 'mvn test'
            }
        }
    }
}