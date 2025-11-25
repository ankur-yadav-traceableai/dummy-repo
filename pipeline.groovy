@Library('my-lib') _
@Library('github.com/triologygmbh/jenkinsfile@ad12c8a9') _

pipeline {
    agent any

    stages {

        stage('Hello') {
            steps {
                echo 'Hello World from pipeline.groovy'

                // Call the shared library step
                hello()
            }
        }
    }
}
