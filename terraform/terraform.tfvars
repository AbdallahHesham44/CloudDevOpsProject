region              = "us-east-2"
s3_bucket_name      = "abdallah-hesham-bucket-backend"
dynamodb_table_name = "ivolvegp-table"
vpc_name            = "ivolve"
vpc_cidr            = "10.0.0.0/16"
subnets = [
  {
    cidr = "10.0.1.0/24"
    availability_zone = "us-east-2a"
    map_public_ip_on_launch = true
  },
  {
    cidr = "10.0.2.0/24"
    availability_zone = "us-east-2b"
    map_public_ip_on_launch = true
  }
]

security_group_rules = [
  {
    from_port   = 22
    to_port     = 22
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  },
  {
    from_port   = 80
    to_port     = 80
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
,
  {
    from_port   = 9000
    to_port     = 9000
    protocol    = "tcp"
    cidr_blocks = ["0.0.0.0/0"]
  }
]
ami_id               = "ami-036841078a4b68e14"
instance_type        = "t3.xlarge"
ec2_name             = "abdallah-sonar"
cloudwatch_log_group  = "log-group"
cloudwatch_log_stream = "log-stream"
cloudwatch_config_ssm_key = "cloudwatch-config"
sns_subscription_protocol = "email"
sns_subscription_endpoint = "abdallah.hesham.102@gmail.com"


