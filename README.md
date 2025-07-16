# 📚 Personal Library API

Uma API REST para gerenciamento de uma biblioteca pessoal, desenvolvida com **Java 21** e **Spring Boot 3.5.3**, utilizando **MySQL** como banco de dados e **Flyway** para versionamento de esquema. Ideal para registrar livros, acompanhar leituras e organizar seu acervo pessoal. 🚀



## 🧰 Tecnologias Utilizadas

- ☕ Java 21  
- 🌱 Spring Boot 3.5.3  
- 🛢️ MySQL  
- 📦 Spring Data JPA  
- 🐦 Flyway (core + MySQL)  
- ✨ Lombok  
- 🌐 Spring Web  
- 🔧 Maven  



## 📁 Estrutura do Projeto


```
src/
├── main/
│   ├── java/
│   │   └── com.richarddev.personal_library/
│   │       ├── controller/
│   │       │   └── LivroController.java
│   │       ├── dto/
│   │       │   ├── DadosLivroCreate.java
│   │       │   ├── DadosLivroRead.java
│   │       │   └── DadosLivroUpdate.java
│   │       ├── enums/
│   │       │   ├── generoLivro.java
│   │       │   └── statusLeitura.java
│   │       ├── model/
│   │       │   └── Livro.java
│   │       ├── repository/
│   │       │   └── LivroRepository.java
│   │       └── PersonalLibraryApplication.java
│   └── resources/
│       └── db.migration/
```



## 🔃 Funcionalidades

✅ **Criar** novo livro  
✅ **Listar** todos os livros  
✅ **Atualizar** informações (ex: status de leitura)  
✅ **Remover** livro da lista  
✅ **Enum para status**: `LIDO`, `LENDO`, `NÃO_LIDO`  
✅ **Migrações automáticas** de banco de dados com Flyway  
✅ **Validações** com Jakarta Bean Validation  
✅ **🔎 Endpoints personalizados**:
- `/livros/titulo/NOME-DO-TITULO` → busca por título
- `/livros/genero/NOME-DO-GENERO` → busca por gênero  




## 🔧 Pré-requisitos

- Java 21  
- MySQL  
- Maven

## 🚀 Executando localmente

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/personal-library.git

# Acesse o projeto
cd personal-library

# Configure o banco no application.properties
# Crie um banco de dados chamado "personal_library"

# Rode a aplicação
./mvnw spring-boot:run

```

## 🧪 Testando com Postman



Coleções disponíveis para:

Cadastro de livro

Atualização de status

Listagem de livros

Busca personalizada

## ✨ Exemplo de JSON para cadastro:
```bash
{
  "titulo": "1984",
  "autor": "George Orwell",
  "anoPublicacao": 1949,
  "genero": "FICCAO",
  "status": "LENDO"
}
```
## 📌 Observações
Validação do ano de publicação para evitar datas inválidas.

O campo status e genero aceita apenas os valores definidos no enum.

Flyway cuida automaticamente da criação da tabela livros.

## 💡 Próximas Melhorias
🔍 Filtros combinados por autor, ano, status etc.

🔒 Autenticação e controle de usuários

📊 Dashboard com estatísticas de leitura

## 🤝 Contribuição
Sinta-se livre para abrir issues, sugerir melhorias ou enviar pull requests! 😄

## 🧑‍💻 Autor
Desenvolvido por Richard Herrera




