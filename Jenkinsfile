pipeline{
    agent {
        docker {
            image "maven:latest"
            args "--entrypoint ''"
        }
    }
    stages{
        // stage('check version'){
        //     steps{
        //         sh 'mvn --version'
        //     }
        // }
        stage('Build'){
            steps{
                sh "mvn clean compile"
            }
        }
        stage('test'){
            steps{
                sh 'mvn test'
            }
        }
    }
}