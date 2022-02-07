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
  "Version":"2012-10-17",
  "Statement":[
    {
      "Sid":"AddPerm",
      "Effect":"Allow",
      "Principal": "*",
      "Action":["s3:GetObject"],
      "Resource":["arn:aws:s3:::www.androidapple.com/*"]
    }
  ]
}
{

  	"Version":"2012-10-17",
 	 "Statement":[
   	 {
    	  "Sid":"AddPerm",
     	 "Effect":"Allow",
     	 "Principal": "*",
      	"Action":["s3:GetObject"],
      	"Resource":["arn:aws:s3:::www.androidapple.com/*"],
     	 "Condition": {
       	  "IpAddress": {"aws:SourceIp": "124.123.84.27/32"}
          
      	} 
    	}
          ]
        }
