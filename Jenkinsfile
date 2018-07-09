pipeline {
    agent any
    triggers {
        pollSCM('* * * * *') 
    }
    parameters {
        string(name: 'PERSON', defaultValue: 'Mr Jenkins', description: 'Who should I say hello to?')
        choice(name: 'PerformMavenRelease', choices: 'False\nTrue', description: 'Whether or not to perform a maven release')
        credentials(name: 'CredsToUse', description: 'A user to build with', defaultValue: '', credentialType: "Username with password", required: true )
    }
    environment {
        BUILD_USR_CREDS = credentials("${params.CredsToUse}")
    } 
    
    stages {
        stage('Stage 1') {
            when {
                branch 'jenkins'
            }
            steps {
                echo "Hello ${params.PERSON}"
                echo 'Hello world, running on branch ' + env.BRANCH_NAME
                echo 'BUILD_USR_CREDS_USR ' + BUILD_USR_CREDS_USR
                echo 'BUILD_USR_CREDS_PSW ' + BUILD_USR_CREDS_PSW
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
