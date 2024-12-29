def call() {
    stage('Set Permissions') {
        steps {
            dir('App') {
                sh 'chmod +x ./gradlew'
            }
        }
    }
}
