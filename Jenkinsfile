@Library('my-lib') _

pipeline {
    agent any

    stages {

        stage('Hello') {
            steps {
                echo 'Hello World'

                // Call the shared library step
                hello()
            }
        }
    }
}
