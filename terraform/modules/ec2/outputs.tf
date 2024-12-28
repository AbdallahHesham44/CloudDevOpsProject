output "public_ip" {
  
   //value       = module.ec2_instanc
   
   value = aws_instance.ec2.public_ip

  description = "The public IP address of the EC2 instance"
}

output "instance_id" {
  value = aws_instance.ec2.id
}

