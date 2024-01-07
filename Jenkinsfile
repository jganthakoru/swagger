pipeline {
    agent any

    stages {
        stage('checking mvn version') {
            steps {
                bat 'mvn -v'
            }
        }
        stage('clone repository') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '5ad85c01-24dd-4cda-a3a5-9dac8451e23a', url: 'https://github.com/jganthakoru/swagger.git']])
        }
         stage('build') {
            steps {
               bat 'mvn clean install'
            }
        }
    }
}