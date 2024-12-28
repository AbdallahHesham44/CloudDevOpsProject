// vars/checkoutCode.groovy
def call() {
    stage('Checkout Code') {
        git branch: 'main', url: 'https://github.com/AbdallahHesham44/CloudDevOpsProject.git'
    }
}

return this
