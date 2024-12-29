def call() {
    stage('Docker Build') {
        steps {
            dir('App') {
                echo "Building Docker image: $DOCKER_IMAGE"
                sh "docker build -t $DOCKER_IMAGE ."
            }
        }
    }
}
