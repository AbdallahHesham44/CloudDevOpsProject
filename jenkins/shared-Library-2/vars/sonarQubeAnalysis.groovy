def call() {
    stage('SonarQube Analysis') {
        steps {
            dir('App') {
                echo "Running SonarQube analysis"
                sh './gradlew sonar --stacktrace'
            }
        }
    }
}
