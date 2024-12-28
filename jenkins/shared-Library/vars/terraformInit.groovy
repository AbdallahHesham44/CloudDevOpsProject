// vars/terraformInit.groovy
def call() {
    stage('Terraform Init') {
        dir('terraform') {
            withCredentials([aws(credentialsId: 'aws-cred', region: 'us-east-2')]) {
                script {
                    env.TF_VAR_AWS_ACCESS_KEY = env.AWS_ACCESS_KEY_ID
                    env.TF_VAR_AWS_SECRET_KEY = env.AWS_SECRET_ACCESS_KEY
                    sh 'terraform init'
                }
            }
        }
    }
}

return this
