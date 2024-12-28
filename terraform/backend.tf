terraform {
  backend "s3" {
    bucket         = "abdallah-hesham-bucket-backend"
    key            = "terraform/state.tfstate"
    region         = "us-east-1"
    encrypt        = true
  }
}
resource "aws_dynamodb_table" "terraform_state_lock" {
  name           = "ivolvegp-table"
  billing_mode   = "PAY_PER_REQUEST"
  hash_key       = "id"

  attribute {
    name = "id"
    type = "S"
  }
}
