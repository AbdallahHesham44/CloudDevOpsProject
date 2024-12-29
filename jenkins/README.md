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
