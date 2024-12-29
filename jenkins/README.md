# Jenkins Pipeline for CI/CD

This README provides an overview of the Jenkins pipeline for automating the CI/CD process. The pipeline leverages Jenkins, Docker, SonarQube, Kubernetes, and a shared library to streamline the deployment workflow.

## Pipeline Overview

This Jenkins pipeline automates the following steps:
1. Checkout code from a Git repository.
2. Set necessary file permissions.
3. Build the project using Gradle.
4. Perform static code analysis using SonarQube.
5. Build and push Docker images to DockerHub.
6. Deploy the application to a Kubernetes cluster.

## Requirements

- Jenkins server with the following plugins installed:
  - Pipeline
  - Git
  - Docker Pipeline
  - SonarQube Scanner
- Shared library integrated into Jenkins under the name `my-shared-library-2`.
- Docker and Kubernetes (e.g., Kind or Minikube) installed on the agent.
- Access to DockerHub for pushing images.
- SonarQube server set up for static code analysis.

## Pipeline Configuration

### Environment Variables

- `DOCKER_IMAGE`: The Docker image repository and tag.
- `kubeconfigPath`: Path to the Kubernetes configuration file.
- `deploymentYaml`: Path to the Kubernetes deployment YAML file.

### Tools

- Gradle: Ensure Gradle is installed and configured in Jenkins.

### Stages

1. **Checkout**
   - Clones the project repository from GitHub.

2. **Set Permissions**
   - Sets executable permissions for the `gradlew` script in the project.

3. **Build**
   - Builds the project using the Gradle wrapper script.

4. **SonarQube Analysis**
   - Performs static code analysis to ensure code quality.

5. **Docker Login**
   - Authenticates with DockerHub.

6. **Docker Build**
   - Builds the Docker image using the provided Dockerfile.

7. **Docker Push**
   - Pushes the Docker image to the specified DockerHub repository.

8. **Set up Kubernetes (Kind)**
   - Prepares the Kubernetes environment for deployment.

9. **Deploy to Kind**
   - Deploys the application to the Kubernetes cluster using the deployment YAML.

### Post Actions

- **Always**: Cleans up the workspace.
- **Success**: Prints a success message.
- **Failure**: Prints a failure message.

## How to Use

1. Clone the repository containing the Jenkinsfile and the shared library.
2. Configure the shared library in Jenkins:
   - Navigate to `Manage Jenkins > Configure System > Global Pipeline Libraries`.
   - Add a library with the following details:
     - Name: `my-shared-library-2`
     - Default version: `main`
     - Repository URL: `<your-shared-library-repo>`
3. Update the Jenkinsfile with your specific configuration:
   - Repository URL.
   - Docker image name.
   - Kubernetes configuration.
4. Run the pipeline from the Jenkins dashboard.

## Troubleshooting

### Common Errors

1. **Missing Parameter Errors**
   - Ensure the correct parameters are passed to shared library functions.

2. **Git Authentication Issues**
   - Verify that Jenkins has the correct Git credentials configured.

3. **Docker Push Failures**
   - Ensure DockerHub credentials are set up in Jenkins.

4. **Kubernetes Deployment Issues**
   - Check the `kubeconfigPath` and `deploymentYaml` values.

### Debugging

- Add `echo` statements to debug variable values and shared library function calls.
- Check Jenkins logs for detailed error messages.

## Diagram

The pipeline workflow is represented in the following architecture diagram:

![Pipeline Diagram](diagram.png)

## Contributing

Feel free to contribute to this project by submitting pull requests or reporting issues.

## License

This project is licensed under the MIT License. See the LICENSE file for details.





![image](https://github.com/user-attachments/assets/38eb85d0-ac9b-4b73-a7f9-bc421bb972a4)

![image](https://github.com/user-attachments/assets/d0f00823-7f87-45b8-99f9-f61d9cf91d09)

![image](https://github.com/user-attachments/assets/8469d244-ee18-4407-aa46-1fac622a0c93)



![image](https://github.com/user-attachments/assets/e1d269bd-fe56-424e-8225-e2499202a997)


![image](https://github.com/user-attachments/assets/60838adb-8058-406c-800f-b7baad6b275c)


![image](https://github.com/user-attachments/assets/edb68873-10c7-40d7-8e6b-e58192cce3fb)


# CI/CD Pipeline for CloudDevOpsProject 🚀

This repository contains a comprehensive Jenkins pipeline for automating the CI/CD process of the **CloudDevOpsProject**. The pipeline integrates multiple tools and frameworks to ensure code quality, containerization, and deployment to Kubernetes.

---

## 🛠️ Tools and Technologies Used

- **Jenkins**: Orchestrates the CI/CD pipeline.
- **Gradle**: Build and dependency management.
- **SonarQube**: Static code analysis.
- **Docker**: Containerization of the application.
- **Kubernetes**: Deployment and orchestration.
- **AWS**: Cloud infrastructure.
- **Terraform**: Infrastructure as Code (IaC).

---

## 📋 Pipeline Overview

The pipeline includes the following stages:

1. **Checkout**: Retrieves the latest code from the Git repository.
2. **Set Permissions**: Ensures the necessary permissions for Gradle.
3. **Build**: Compiles the application using Gradle.
4. **SonarQube Analysis**: Performs static code analysis to ensure code quality.
5. **Docker Login**: Authenticates with Docker Hub.
6. **Docker Build**: Builds the Docker image for the application.
7. **Docker Push**: Pushes the Docker image to Docker Hub.
8. **Set up Kubernetes (Kind)**: Sets up the Kubernetes cluster using Kind.
9. **Deploy to Kind**: Deploys the application to the Kubernetes cluster.

---

## 🔧 Prerequisites

- Jenkins installed and configured.
- Gradle installed in Jenkins.
- Access to Docker Hub credentials in Jenkins.
- SonarQube server configured in Jenkins.
- Kubernetes installed (Kind or Minikube).
- AWS credentials for Terraform and cloud resource setup.

---

## ⚙️ Configuration

### Jenkins Pipeline Configuration

```groovy
@Library('my-shared-library-2') _
pipeline {
    agent any

    tools {
        gradle 'Gradle'
    }

    environment {
        DOCKER_IMAGE = 'docker.io/abdallah1312/ivolve-app:latest'
        kubeconfigPath = '/home/abdallah/.kube/config'
        deploymentYaml = 'Kubernetes/deployment.yaml'
    }

    stages {
        stage('Checkout') {
            steps {
                checkoutCode()
            }
        }
        stage('Set Permissions') {
            steps {
                setPermissions()
            }
        }
        stage('Build') {
            steps {
                build()
            }
        }
        stage('SonarQube Analysis') {
            steps {
                sonarQubeAnalysis()
            }
        }
        stage('Docker Login') {
            steps {
                dockerLogin()
            }
        }
        stage('Docker Build') {
            steps {
                dockerBuild()
            }
        }
        stage('Docker Push') {
            steps {
                dockerPush()
            }
        }
        stage('Set up Kubernetes (Kind)') {
            steps {
                setupKubernetes()
            }
        }
        stage('Deploy to Kind') {
            steps {
                deployToKind()
            }
        }
    }

    post {
        always {
            cleanWs()
        }
        success {
            echo 'Build successful!'
        }
        failure {
            echo 'Build failed.'
        }
    }
}
```

---

## 🚑 Troubleshooting

- **Invalid Parameter Error**: Ensure the parameters in shared library functions are correct.
- **Permission Issues**: Verify file permissions for `gradlew` and other scripts.
- **SonarQube Connection Failure**: Check the SonarQube server URL and credentials.
- **Docker Push Error**: Verify Docker Hub credentials and repository access.
- **Kubernetes Deployment Errors**: Check the `kubeconfig` file and deployment YAML.

---

## 📧 Contact

For any questions or issues, feel free to reach out:

- **Author**: Abdallah Hesham
- **Email**: [your-email@example.com](mailto:your-email@example.com)
- **GitHub**: [AbdallahHesham44](https://github.com/AbdallahHesham44)

---

## 🎨 Visual Workflow

![CI/CD Workflow Diagram](./diagram.png)

This diagram illustrates the integration of various tools and stages within the CI/CD pipeline.


