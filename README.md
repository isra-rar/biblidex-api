# Biblidex - Personagens Bíblicos API

**Biblidex** é uma API para consulta e gerenciamento de personagens bíblicos. Este projeto foi criado com o objetivo de facilitar o estudo e referência a personagens importantes da Bíblia, incluindo informações sobre povos, tribos, livros e testamentos associados a cada personagem. A aplicação está sendo disponibilizada como open source para toda a comunidade.

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot** (versão mais recente)
- **PostgreSQL** para persistência de dados
- **JPA/Hibernate** para manipulação do banco de dados
- **Maven** como gerenciador de dependências
- **Docker** (opcional, para conteinerização do banco de dados)

## Estrutura do Projeto

O projeto utiliza uma arquitetura simples:
- **Entity**: Representa os personagens bíblicos com atributos como nome, povo, livro, testamento, tribo e informações adicionais.
- **Repository**: Interface para operações com o banco de dados.
- **Controller**: Disponibiliza os endpoints para consumo da API.
- **CommandLineRunner**: Carrega dados iniciais para o banco de dados com personagens bíblicos.

## Endpoints Disponíveis

A API expõe dois endpoints principais para interagir com os dados dos personagens:

### 1. Listar Todos os Personagens

**Endpoint:**
```
GET /bible-characters
```

**Descrição:** Retorna todos os personagens bíblicos cadastrados no sistema.

**Exemplo de Resposta:**
```json
[
  {
    "id": 1,
    "nome": "Adão",
    "povo": "HEBREU",
    "livro": "GENESIS",
    "testamento": "ANTIGO",
    "tribo": null,
    "info": "O primeiro homem criado por Deus"
  },
  {
    "id": 2,
    "nome": "Eva",
    "povo": "HEBREU",
    "livro": "GENESIS",
    "testamento": "ANTIGO",
    "tribo": null,
    "info": "A primeira mulher criada por Deus"
  }
]
```

### 2. Buscar Personagem por ID

**Endpoint:**
```
GET /bible-characters/{id}
```

**Descrição:** Retorna os detalhes de um personagem bíblico específico com base no ID fornecido.

**Exemplo de Resposta:**
```json
{
  "id": 3,
  "nome": "Noé",
  "povo": "HEBREU",
  "livro": "GENESIS",
  "testamento": "ANTIGO",
  "tribo": null,
  "info": "Construtor da arca para salvar sua família e os animais"
}
```

**Resposta para ID Inexistente:**
```json
{
  "error": "Personagem não encontrado."
}
```

## Como Rodar o Projeto via Docker
1. Clone o repositório no docker hub:
   ```bash
   docker pull isr4/biblidex-api-app:1.0
   cd biblidex-api-app
   ```
2. Execute o comando docker-compose up para rodar o app localmente:
   ```bash
   docker-compose up -d (-d para rodar em modo interativo)
   ```
3. Acesse a API em:
   ```
   http://localhost:8080/bible-characters
   ```

## Como Rodar o Projeto Locamente

1. Clone o repositório:
   ```bash
   git clone  https://github.com/isra-rar/biblidex-api.git
   cd biblidex
   ```

2. Configure o banco de dados PostgreSQL no arquivo `application.yml`:
   ```yaml
   spring:
     datasource:
       url: jdbc:postgresql://localhost:5432/biblidex
       username: seu-usuario
       password: sua-senha
   ```

3. Execute o projeto com Maven:
   ```bash
   mvn spring-boot:run
   ```

4. Acesse a API em:
   ```
   http://localhost:8080/
   ```



## Como Contribuir

Fique à vontade para contribuir com melhorias no código, adição de novos personagens ou correção de bugs:

1. Faça um fork do repositório.
2. Crie uma branch para suas mudanças:
   ```bash
   git checkout -b minha-feature
   ```
3. Commit suas mudanças:
   ```bash
   git commit -m "Adicionei uma nova feature"
   ```
4. Faça um push para a branch:
   ```bash
   git push origin minha-feature
   ```
5. Abra um pull request no GitHub.

## Licença

Este projeto está licenciado sob a Licença MIT. Para mais detalhes, consulte o arquivo LICENSE no repositório.

---

**Conecte-se com a Comunidade**
- Caso tenha dúvidas ou sugestões, abra uma issue no repositório.
- Compartilhe este projeto para ajudar outras pessoas a explorarem a rica história bíblica!

