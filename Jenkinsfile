pipeline {
    agent any
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
    }
    stages {
        stage('Stage 1') {
            when {
                branch 'jenkins'
            }
            steps {
                echo "Hello ${params.PERSON}"
                echo 'Hello world, running on branch ${env.BRANCH_NAME}!'
            }
        }
        stage('Stage 2') {
            when {
                branch 'master'
            }
            steps {
                echo "Hello ${params.PERSON}"
                echo 'Hello world, running on branch ${env.BRANCH_NAME}!'
            }
        }
    }
}
