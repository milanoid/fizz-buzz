pipeline {
    agent any
    triggers {
        pollSCM('* * * * *') 
    }
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
        choice(name: 'PerformMavenRelease', choices: 'False\nTrue', description: 'Whether or not to perform a maven release')
    }
    stages {
        stage('Stage 1') {
            when {
                branch 'jenkins'
            }
            steps {
                echo "Hello ${params.PERSON}"
                echo 'Hello world, running on branch ' + env.BRANCH_NAME
            }
        }
        stage('Stage 2') {
            when {
                branch 'master'
            }
            steps {
                echo "Hello ${params.PERSON}"
                echo 'Hello world, running on branch ' + env.BRANCH_NAME
            }
        }
    }
}
