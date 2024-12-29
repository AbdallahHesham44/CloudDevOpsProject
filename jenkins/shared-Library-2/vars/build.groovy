def call() {
    stage('Build') {
        steps {
            dir('App') {
                sh './gradlew build'
            }
        }
    }
}
