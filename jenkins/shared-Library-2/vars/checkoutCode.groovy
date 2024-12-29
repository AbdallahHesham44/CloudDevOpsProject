def call() {
    stage('Checkout') {
        steps {
            git branch: 'main', url: 'https://github.com/AbdallahHesham44/CloudDevOpsProject.git'
        }
    }
}
