def call() {
    stage('Docker Push') {
        steps {
            echo "Pushing Docker image to Docker Hub"
            sh "docker push $DOCKER_IMAGE"
        }
    }
}
