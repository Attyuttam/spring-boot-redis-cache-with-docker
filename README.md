# spring-boot-redis-cache-with-docker

To run:

1. In a terminal, run "./start-servers.sh" in the root folder of this project
2. If step 1 does not work, run the command "$ docker-compose up -d" in the root folder of this project
3. Then in the terminal at the root folder of this project, run "mvn clean package spring-boot:run -DskipTests=true"
4. Then change the application.yml file and set the port to 8081 and in another terminal (different from the one in step 3) run "mvn clean package spring-boot:run -DskipTests=true"
5. Two instances of the application will start up, one in port 8080 and the other in 8081
6. Now, you can see the essence of a global cache.

To stop:

1. Hit Ctrl+C to stop the springboot application
2. Run ./stop-servers.sh at the root folder of this application
3. If step 2 does not work, run "docker-compose rm -fsv" at the root folder of this project

The docker-compose.yml file was created using the following command:
curl -sSL https://raw.githubusercontent.com/bitnami/bitnami-docker-redis/master/docker-compose.yml > docker-compose.yml

You might get an error while running this command, just run the below command and try running the curl command again:
Remove-item alias:curl

P.S: ensure you have MySQl setup with an employee table and correct data
