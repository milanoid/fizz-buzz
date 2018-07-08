pipeline {
    agent any
    stages {
        stage('Stage 1') {
            when {
                branch 'jenkins'
            }
            steps {
                echo $BRANCH_NAME
                echo 'Hello world, running on branch jenkinsfile!'
            }
        }
        stage('Stage 2') {
            when {
                branch 'master'
            }
            steps {
                echo $BRANCH_NAME
                echo 'Hello world, running on branch master!'
            }
        }
    }
}
