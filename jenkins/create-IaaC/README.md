# Jenkins Pipeline for Terraform and Ansible Deployment

This pipeline automates the process of deploying infrastructure using Terraform and configuring it with Ansible. Below is an overview of the pipeline's structure and functionality.

---

## Pipeline Stages

### 1. **Checkout Code**
- Clones the repository from GitHub containing the Terraform and Ansible configuration files.
- **Git Configuration:**
  - Branch: `main`
  - URL: `https://github.com/AbdallahHesham44/CloudDevOpsProject.git`

### 2. **Terraform Init**
- Initializes the Terraform configuration within the `terraform` directory.
- **Environment Variables:**
  - `TF_VAR_AWS_ACCESS_KEY`: Set from AWS credentials.
  - `TF_VAR_AWS_SECRET_KEY`: Set from AWS credentials.
- **Credentials:**
  - `aws-cred` is used to authenticate with AWS.
  - Region: `us-west-1`.

### 3. **Terraform Apply**
- Applies the Terraform configuration to create resources.
- **Flags:**
  - `-auto-approve`: Automatically approves the changes.
- **Credentials:**
  - Uses the same `aws-cred` and region configuration as the previous stage.

### 4. **Sleep for 3 Minutes**
- Waits for 3 minutes to allow the provisioned resources to initialize.

### 5. **Run Ansible**
- Executes the Ansible playbook to configure the deployed resources.
- **Configuration:**
  - Directory: `ansible`
  - Inventory file: `inventory`
  - Playbook file: `playbook.yml`
  - Additional SSH arguments: Disables strict host key checking.
- **Credentials:**
  - Uses `ssh-key` for authenticating the SSH connection to the EC2 instances.

### Post Actions
- Archives the following artifacts:
  - `inventory`
  - `terraform/terraform.tfstate`
- Cleans the workspace to ensure no leftover files remain after the pipeline execution.

---

## Prerequisites

1. **Jenkins Configuration**:
   - Install the following plugins:
     - Git
     - Terraform
     - Ansible
   - Configure Jenkins credentials:
     - AWS Credentials: `aws-cred`
     - SSH Key: `ssh-key`
2. **Terraform Configuration**:
   - Ensure the `terraform` directory contains valid Terraform scripts.
   - Variables should match the ones used in the pipeline (e.g., `TF_VAR_AWS_ACCESS_KEY`).
3. **Ansible Configuration**:
   - The `ansible` directory must contain:
     - An `inventory` file with the target hosts.
     - A `playbook.yml` file to define the desired configuration.
4. **EC2 Instance**:
   - Ensure the EC2 instance has the correct IAM role and security group to allow Ansible access.

---

## Troubleshooting

### Common Errors
1. **Terraform Init Errors:**
   - Check if the AWS credentials and region are configured correctly.
   - Verify the Terraform scripts for syntax errors.

2. **Terraform Apply Issues:**
   - Ensure AWS limits are not exceeded.
   - Verify the `terraform.tfstate` file for any inconsistencies.

3. **Ansible Playbook Fails:**
   - Ensure the SSH key permissions are correct.
   - Verify the inventory file contains the correct IP address or hostname.
   - Check if the playbook syntax is valid.

4. **Permission Denied (publickey):**
   - Ensure the correct private key is used for the Ansible connection.
   - Verify the EC2 instance's SSH access.

---

## Notes

- Adjust the `sleep` duration in the "Sleep for 3 Minutes" stage if your resources take longer to initialize.
- This pipeline uses global environment variables for flexibility; ensure these are updated as needed.

---

## Additional Resources
- [Terraform Documentation](https://www.terraform.io/docs)
- [Ansible Documentation](https://docs.ansible.com/)
- [Jenkins Pipeline Syntax](https://www.jenkins.io/doc/book/pipeline/syntax/)

