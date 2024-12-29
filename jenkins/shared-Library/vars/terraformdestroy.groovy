// vars/terraformApply.groovy
def call() {
    stage('Terraform Apply') {
        dir('terraform') {
            withCredentials([aws(credentialsId: 'aws-cred', region: 'us-east-2')]) {
                sh 'terraform destroy -auto-approve'
            }
        }
    }
}

return this
