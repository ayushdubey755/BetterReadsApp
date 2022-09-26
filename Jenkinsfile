pipeline{
    agent any
    tools{
        maven 'maven_version'
    }
    stages{
        stage('Build Maven'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/develop']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/ayushdubey755/BetterReadsApp']]])
                bat 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                   //bat 'docker build -f Dockerfile C:/ProgramData/Jenkins/.jenkins/workspace/jenkins-test'
                   bat 'docker build -t ayushdubey755/betterreads .'
                }
            }
        }
        stage('push docker image'){
            steps{
                script{

                  bat 'docker login -u ayushdubey755 -p Dockerhub@755'
                  bat 'docker push ayushdubey755/betterreads'

                }
            }
        }

    }

}