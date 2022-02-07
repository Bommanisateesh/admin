{
  "Version":"2012-10-17",
  "Statement":[
    {
      "Sid":"AddPerm",
      "Effect":"Allow",
      "Principal": "*",
      "Action":["s3:GetObject"],
      "Resource":["arn:aws:s3:::examplebucket/*"]
    }
  ]
}
{
			  "Version": "2012-10-17",
  			  "Id": "S3PolicyId1",
			  "Statement": [
    		{
     			 "Sid": "IPAllow",
     			 "Effect": "Allow",
      			"Principal": "*",
      			"Action": "s3:*",
     			 "Resource": "arn:aws:s3:::examplebucket/*",
    	  "Condition": {
         			"IpAddress": {"aws:SourceIp": "183.83.164.161/24"},
         			"NotIpAddress": {"aws:SourceIp": "54.240.143.188/32"} 
     		      } 
    		} 
 	      ]
	}
