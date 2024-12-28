// vars/sleepForResources.groovy
def call() {
    stage('Sleep for 3 Minutes') {
        script {
            echo 'Waiting for resources to initialize...'
            sleep(time: 3, unit: 'MINUTES')  // Adjusted to wait for 3 minutes
        }
    }
}

return this
