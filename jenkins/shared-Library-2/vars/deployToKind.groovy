def call() {
    stage('Deploy to Kind') {
        steps {
            script {
                // Ensure that the KUBECONFIG is pointing to the correct Kind cluster
                sh 'export KUBECONFIG=$HOME/.kube/config'

                // Deploy the application
                sh 'kubectl apply -f Kubernetes/deployment.yaml --validate=false'
            }
        }
    }
}
