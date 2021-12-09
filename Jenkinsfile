pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        // maven "Default"
        maven "maven3.8.4"
        jdk "jdk11"
    }

    stages {
        stage('Build') {
            steps {

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                // bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    echo 'great success (test ?)'
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
                
                always {
                    echo 'Je passe toujours ici'
                }
                
                failure {
                    echo 'a failure occured'
                }
            }
        }
    }
}
