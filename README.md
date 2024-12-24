# CloudDevOpsProject

## Overview
The **CloudDevOpsProject** is a comprehensive DevOps project that demonstrates skills in containerization, infrastructure provisioning, configuration management, and CI/CD pipelines. This project covers end-to-end tasks, from setting up a GitHub repository to deploying applications on OpenShift.

---

## Repository Setup

### Task
- Create a GitHub repository named **CloudDevOpsProject**.
- Initialize the repository with a README file.

### Deliverables
- [GitHub Repository Link](#) (Replace with actual URL).

---

## Containerization with Docker

### Task
- Develop a `Dockerfile` for building the application image.
- Source code: [FinalProjectCode](https://github.com/IbrahimAdell/FinalProjectCode).

### Deliverables
- Dockerfile committed to the repository.

---

## Infrastructure Provisioning with Terraform

### Task
- Deliver Terraform scripts to provision AWS resources:
  - VPC, Subnet, Security Groups.
  - EC2 instance for application deployment.
- Use Terraform Modules.

### Deliverables
- Terraform scripts committed to the repository.
- Modularized Terraform code.

---

## AWS Integration

### Task
- Provide instructions to integrate AWS services:
  - Use S3 Terraform Backend for state management.
  - Integrate CloudWatch for monitoring.

### Deliverables
- Documentation for AWS integration with Terraform scripts.

---

## Configuration Management with Ansible

### Task
- Develop Ansible playbooks for EC2 instance configuration:
  - Install required packages (Git, Docker, Java).
  - Install packages for Jenkins and SonarQube.
  - Set up necessary environment variables.
- Use Ansible roles.

### Deliverables
- Ansible playbooks committed to the repository.
- Structured using Ansible roles.

---

## Continuous Integration with Jenkins

### Task
- Configure Jenkins pipeline in `Jenkinsfile` with the following stages:
  1. Git Checkout.
  2. Unit Test.
  3. Build JAR.
  4. SonarQube Test.
  5. Build Docker Image.
  6. Push Docker Image to Registry.
  7. Deploy on OpenShift.
- Utilize Shared Jenkins Library and Jenkins slave.

### Deliverables
- `Jenkinsfile` committed to the repository.
- Implementation of shared libraries.

---

## Instructions for Execution

1. Clone the repository:
   ```bash
   git clone <repository_url>
   ```

2. Build and run the Docker container:
   ```bash
   docker build -t application-image .
   docker run -d -p 8080:8080 application-image
   ```

3. Provision infrastructure with Terraform:
   ```bash
   terraform init
   terraform plan
   terraform apply
   ```

4. Configure EC2 instances with Ansible:
   ```bash
   ansible-playbook -i inventory playbook.yml
   ```

5. Run the Jenkins pipeline for continuous integration and deployment.

---

## Contact
For any questions or issues, please open an issue in the repository or contact the maintainer.

