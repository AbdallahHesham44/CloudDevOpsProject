// vars/runAnsible.groovy
def call() {
    stage('Run Ansible') {
        dir('ansible') {
            ansiblePlaybook(
                credentialsId: 'ssh-key',
                inventory: 'inventory',
                playbook: 'playbook.yml',
                extras: '-e "ansible_ssh_extra_args=\'-o StrictHostKeyChecking=no\'"'
            )
            sh """
                ls
            """
        }
    }
}

return this
