pipeline{
    agent {
        docker {
            image "maven:3-alpine"
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