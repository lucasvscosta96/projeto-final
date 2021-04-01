
### Gerar o build ###
./mvnw package

### Gerar o build do docker ###
docker build -t lucasvscosta/{environment}-projeto-final -f Dockerfile .

### Rodar imagem docker e gravar localmente ###
docker run -d -p 8082:8082 --name {environment}-projeto-final lucasvscosta/{environment}-projeto-final

### Para se logar no dockerhub ###
docker login

### Criar a tag apontando para o repositorio do docker hub ###
docker tag lucasvscosta/{environment}-projeto-final + URL Docker

### Fazer push da imagem para o docker hub ###
docker push lucasvscosta/{environment}-projeto-final

