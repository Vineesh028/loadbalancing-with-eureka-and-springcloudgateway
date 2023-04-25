# loadbalancing-with-eureka-and-springcloudgateway

Run the APIGateway, EurekaDiscoveryServer then ProductService (run multiple instances)

Get call gives the port number of instance

curl --location --request GET 'http://localhost:8082/product-service/product'
