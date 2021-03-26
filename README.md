
### Gerar o build do docker ###
./mvnw. package && java -jar target/validarCpf.jar

### Gerar o build do docker ###
docker build -t eduardotech/validador-cpf-java -f Dockerfile .

### Rodar imagem docker e gravar localmente ###
docker run -d -p 8081:8081 --name validador-cpf-java eduardotech/validador-cpf-java:1.0.0

### para parar o serviço rodar ###
docker stop validador-cpf-java

### para startar o serviço rodar ###
docker start validador-cpf-java

### para remover o serviço rodar ###
docker rm validador-cpf-java

### Para se logar no dockerhub ###
docker login

### Criar a tag apontando para o repositorio do docker hub ###
docker tag eduardotech/validador-cpf-java + URL Docker

### Fazer push da imagem para o docker hub ###
docker push eduardotech/validador-cpf-java
