# Checkpoint 1 - Lucas de Alencar Pereira

## Instalação

### 1. Limpar e criar a pasta `/target`
```sh
mvn clean package
```

### 2. Configuração do Swagger

A documentação pode ser acessada via Swagger

Adicione as seguintes configurações no `application.properties`:
```properties
springdoc.swagger-ui.path=/
springdoc.swagger-ui.disable-swagger-default-url=true
```

## Navegação

### Executar:
Pra rodar a aplicação usando aven:
```sh
mvn spring-boot:run
```

### Documentação (Swagger)
Depois de iniciar a aplicação acesse:
[http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## Conclusão do projeto:

### Criar Paciente
**POST** `/pacientes`
```json
{
  "nome": "João Silva",
  "endereco": "Rua A, 123",
  "bairro": "Centro",
  "email": "joao@email.com",
  "telefoneCompleto": "(11) 98765-4321"
}
```

### Atualizar Paciente
**PUT** `/pacientes/{id}`
```json
{
  "nome": "João Silva Atualizado",
  "endereco": "Rua B, 456",
  "bairro": "Jardins",
  "email": "joao.novo@email.com",
  "telefoneCompleto": "(11) 99999-9999"
}
```

### Deletar Paciente
**DELETE** `/pacientes/{id}`

### Buscar Paciente por ID
**GET** `/pacientes/{id}`

### Listar Todos os Pacientes
**GET** `/pacientes`

## Referências
- [Spring Boot](https://spring.io/projects/spring-boot)
- [SpringDoc (Swagger)](https://springdoc.org/)

