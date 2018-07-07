pipeline {
    agent any
    stages {
        stage('Stage 1') {
            when {
                branch 'jenkins'
            }
            steps {
                echo 'Hello world, running on branch jenkinsfile!'
            }
        }
        stage('Stage 2') {
            when {
                branch 'master'
            }
            steps {
                echo 'Hello world, running on branch master!'
            }
        }
    }
}
