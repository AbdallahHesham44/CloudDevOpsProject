variable "ami_id" {}
variable "instance_type" {}
variable "subnet_id" {}
variable "security_group_id" {}
variable "tags" {
  type = map(string)
}
variable "cloudwatch_config_ssm_key" {}
