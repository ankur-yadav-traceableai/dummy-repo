@Library('my-lib') _

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
