# Terraform Modules🚀

Terraform modules are a fundamental component of Terraform's architecture, enabling you to organize, reuse, and manage your infrastructure as code (IaC) efficiently. Instead of writing all your Terraform code in a single file, modules allow you to encapsulate and abstract away common configurations, making your Terraform code more modular, reusable, and maintainable.


# Terraform Structure🏗️

![image](https://github.com/user-attachments/assets/88c889fa-8081-45b0-bd3f-aaf4a77f9115)

 />

## Create Terraform Modules📚

### 1.Create Vpc Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/vpc/main.tf)
<br />
└── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/vpc/variables.tf)

#### 1.1. main.tf file:

<img width="510" alt="vpcmainmarwan" src="https://github.com/user-attachments/assets/9ad3075c-cefd-4a68-9165-d38f7ba14fb8" />

#### 1.2. variables.tf file:

<img width="321" alt="vpcvarmarwan" src="https://github.com/user-attachments/assets/bb26e7a1-fccd-4b02-8277-956e24748c93" />

--- 

### 2.Create IGW Module And Route table:


├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/internet-gateway/main.tf)
<br />
└── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/internet-gateway/variables.tf)

#### 2.1. main.tf file:
<img width="670" alt="igw,rtmarwan" src="https://github.com/user-attachments/assets/8ca37916-836b-497f-a795-f96cf96b7b39" />

The Output Of Igw and Rt

<img width="385" alt="outputrt,igwmarwan" src="https://github.com/user-attachments/assets/6bcafa34-0999-47ed-90c8-2c18078c0f3a" />

#### 2.2. variables.tf file:

<img width="794" alt="igwvarsmarwan" src="https://github.com/user-attachments/assets/90598e1f-3cb0-4fad-9834-ad391eb54167" />

---

### 3.Create Subnet Module:


├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/subnet/main.tf)
<br />
└── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/subnet/variables.tf)

#### 3.1. main.tf file:

<img width="795" alt="subnetmarwan" src="https://github.com/user-attachments/assets/30a305c9-b1b0-4fc1-b986-77f6c515274a" />

#### 3.2. variables.tf file

<img width="539" alt="varssub marwan" src="https://github.com/user-attachments/assets/d94d3a0e-5b4f-43db-a6f9-ae3472fc1638" />

---

#### 4.Create Security Group Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/security-group/main.tf)
<br />
└── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/security-group/variables.tf)

#### 4.1. main.tf file:

<img width="684" alt="sggggg" src="https://github.com/user-attachments/assets/356e3f65-e22d-46c8-8fec-f6f7b2b8e59b" />



#### 4.2. variables.tf file

<img width="792" alt="sgvarsmarwan" src="https://github.com/user-attachments/assets/41f1e501-c473-4a41-aaaf-8a3bf3e1de1b" />

---

### 5. Create EC2 Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/ec2/main.tf)
<br />
├── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/ec2/variables.tf)
<br />
└── [**output.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/ec2/outputs.tf)

#### 5.1. main.tf file:

<img width="796" alt="ec2main marwan" src="https://github.com/user-attachments/assets/d4848812-e07b-4732-b6e6-e04c40ba34dd" />

<img width="795" alt="ec2main--marwan" src="https://github.com/user-attachments/assets/fb8c3c8e-99ef-48bc-8150-8d12ff1afbdc" />


#### 5.2. variables.tf:

<img width="609" alt="varsmarwan" src="https://github.com/user-attachments/assets/898a2b40-7a25-46a1-a19c-23959bfa5bdd" />


#### 5.3. output.tf

<img width="791" alt="opec2,marwan" src="https://github.com/user-attachments/assets/68e65fcf-90c8-4d56-9915-fb8b33d3c1e8" />

---

### 6. Create Cloudwatch Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/cloudwatch/main.tf)
<br />
├── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/cloudwatch/variables.tf)

#### 6.1. main.tf file:

<img width="792" alt="cloudwatch main marwan" src="https://github.com/user-attachments/assets/b646a45e-687c-45d7-baa8-955110651fdc" />

#### 6.2. variables.tf:

<img width="797" alt="vars cloudmarwan" src="https://github.com/user-attachments/assets/b3d0b1b4-53e7-4d93-a884-036f65323c7a" />

---

### 7. Create sns Topic Module:

├── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/sns/main.tf)
<br />
├── [**variables.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/sns/variables.tf)
<br />
└── [**output.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/modules/sns/output.tf)

#### 7.1. main.tf file:
<img width="681" alt="main terraform" src="https://github.com/user-attachments/assets/90707194-4ee7-4947-a3cd-7de179b7a855" />


#### 7.2. variables.tf:
<img width="681" alt="sns varterraform" src="https://github.com/user-attachments/assets/b7e459e1-29f4-4b39-b958-c047ab114870" />


#### 7.3. output.tf
<img width="686" alt="sns-o-p" src="https://github.com/user-attachments/assets/b79de38f-4bfe-41de-b61f-2094760bfc47" />



### 8. create main.tf

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/main.tf)

<img width="795" alt="main tffmarwan" src="https://github.com/user-attachments/assets/d0d701b1-34e0-49b5-896d-27627b20f6a0" />

<img width="681" alt="main terraform" src="https://github.com/user-attachments/assets/e253fcd7-5dd4-4658-94c2-f9c0dc7473a1" />


---

### 9. create variables.tf

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/variables.tf)

<img width="797" alt="vars1marwan" src="https://github.com/user-attachments/assets/6b8df88d-6ddf-407b-85a9-7c0fa30e2538" />

<img width="786" alt="vars2marwan" src="https://github.com/user-attachments/assets/00c14df3-eaa2-410f-8ac5-3f16423d2d66" />

---

### 10. create terraform.tfvars

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/terraform.tfvars)

<img width="793" alt="tfvars marwan" src="https://github.com/user-attachments/assets/1f936b2d-df55-4527-b696-373783beb537" />

---

### 11. create backend.tf

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/backend.tf)


<img width="790" alt="backend marwan" src="https://github.com/user-attachments/assets/72af87ec-a0bf-4024-8eb8-f277abf10169" />

---

### 12. create output.tf

└── [**main.tf**](https://github.com/Marwan933/CloudDevOpsProject/blob/main/terraform/outputs.tf)

<img width="796" alt="outputmarwan" src="https://github.com/user-attachments/assets/102bfbc9-c28f-43ac-a318-453224dadddf" />

---
### Before Run the commands, to connect with Aws by using this command
### Configure AWS CLI
- Go to your AWS acoount `IAM` > `User` > Press on your IAM User > Choose `Security Credentials` tab > Navigate to `Create access key`
- After Creating your access key execute the following command
  ```bash
  aws configure
  ```
- Insert the following entries
  ```bash
  AWS Access Key ID [None]: <your-access-key-id>
  AWS Secret Access Key [None]: <your-secret-access-key>
  Default region name [None]: us-east-1
  Default output format [None]: json


---

### After Creating the Terraform Modules run it using this commands
```bash
terraform init
```
### terraform init Purpose:

terraform init initializes a new or existing Terraform configuration.
It initializes the working directory containing Terraform configuration files (*.tf files).
During initialization, Terraform downloads the necessary providers and modules specified in the configuration files.
This command prepares the environment for Terraform to manage your infrastructure.

<img width="684" alt="terraform init" src="https://github.com/user-attachments/assets/3c6ff5ec-a216-479b-a6b6-21df1543d104" />


```bash
terraform plan
```
### terraform plan Purpose:

terraform plan generates an execution plan for Terraform.
It compares the current state of the infrastructure (as recorded by Terraform state) with the desired state defined in your configuration files.
This command calculates and shows the changes that Terraform will apply when you run 

<img width="684" alt="terraform-plan" src="https://github.com/user-attachments/assets/91ef6f06-b38a-4797-a1de-eafb3da97053" />

```bash
terraform apply
```
### terraform apply Purpose:

terraform apply applies the changes required to achieve the desired state defined in your Terraform configuration.
It creates, modifies, or deletes resources as necessary to match the configuration.
This command executes the execution plan generated by terraform plan.
It interacts with the cloud provider APIs or other infrastructure components to make the desired changes.

<img width="683" alt="apply" src="https://github.com/user-attachments/assets/b521534d-90c5-4460-93b1-e81cd055b049" />

---
### Show the provisioned infrastructure

#### 1- The Vpc:

<img width="823" alt="vpc" src="https://github.com/user-attachments/assets/aad8188b-3a17-4364-b73a-4e938ff7aa84" />

<img width="821" alt="vpc" src="https://github.com/user-attachments/assets/403dbabe-6117-4791-b34b-b9f61ee0c70e" />


#### 2- The Subnet:
<img width="833" alt="subnet" src="https://github.com/user-attachments/assets/ebb7b2d6-fd55-4af9-98e4-130b0198aa29" />


#### 3- The route table:
<img width="840" alt="routetable" src="https://github.com/user-attachments/assets/68792c03-5ce9-4e22-b8b6-25f4589eca9f" />

<img width="854" alt="rt" src="https://github.com/user-attachments/assets/859056f2-59fa-4f01-a666-3ad9916c5bce" />


#### 4- the igw:
<img width="840" alt="igw" src="https://github.com/user-attachments/assets/01a60f20-5473-4c4f-a44b-a7a0e91d46a0" />


#### 5- the Security Group:
<img width="843" alt="sg" src="https://github.com/user-attachments/assets/4eb3bffa-4843-498c-8ca9-4b0e5bcd198d" />


#### 6- the EC2:
<img width="843" alt="ec2" src="https://github.com/user-attachments/assets/ba08fad7-d4d9-43f0-8c43-14675c6f47d1" />


#### 7- the S3 bucket:
<img width="825" alt="s3bucket" src="https://github.com/user-attachments/assets/bf43c25e-548b-4467-b288-b8b4dfce3def" />


#### 8- The DynamoDB table:
<img width="829" alt="dynamo-db" src="https://github.com/user-attachments/assets/e06d9242-bb18-4b27-a5eb-8a78c3c5d948" />


#### 9-the Cloudwatch alarms:
<img width="830" alt="cloud" src="https://github.com/user-attachments/assets/f23b2953-8c00-4077-bce4-1b1f2e3f4603" />


#### 10- the sns topic
<img width="850" alt="sns" src="https://github.com/user-attachments/assets/867518db-980d-41fa-a59a-37bb29c9a4c8" />


---
## Troubleshooting🔍
- Ensure your AWS credentials are correctly configured.
- Check for any syntax errors in the Terraform files.
- Review logs in the AWS Management Console if resources fail to provision.

---
