def call() {
    stage('Set up Kubernetes (Kind)') {
        steps {
            script {
                // Create a Kind cluster if it doesn't exist
                sh 'kind create cluster --name my-cluster'

                // Export the kubeconfig for the Kind cluster
                sh 'export KUBEVERSION=$(kind get kubeconfig-path --name=my-cluster)'
                sh 'export KUBECONFIG=$KUBEVERSION'
            }
        }
    }
}
