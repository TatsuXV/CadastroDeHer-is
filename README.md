# 🦸 Sistema de Cadastro de Heróis

![Java](https://img.shields.io/badge/Java-17+-ED8B00?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?logo=spring-boot)
![MySQL](https://img.shields.io/badge/MySQL-8.0-4479A1?logo=mysql)

## 📝 Sobre o Projeto

API RESTful completa para gerenciamento de heróis, desenvolvida com **Spring Boot**, **Spring Data JPA** e banco de dados **SQL**.

O projeto implementa operações CRUD completas, relacionamentos entre entidades e boas práticas de desenvolvimento backend.

---

## 🛠️ Tecnologias

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **SQL**
- **Maven**
- **Hibernate**

---

## ⚙️ Funcionalidades

- ✅ Cadastro completo de heróis
- ✅ Listagem com filtros
- ✅ Atualização de dados
- ✅ Remoção de registros
- ✅ Relacionamentos entre entidades
- ✅ Validação de dados

---

## 🚀 Como Executar

### Pré-requisitos

- Java 17+
- Maven 3.8+
- MySQL 8.0+

### Configuração do Banco
```sql
CREATE DATABASE heroes_db;
```

### Configuração da Aplicação

Edite `src/main/resources/application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/heroes_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
```

### Executando
```bash
# Clone o repositório
git clone https://github.com/TatsuXV/CadastroDeHer-is.git

# Entre na pasta
cd CadastroDeHer-is

# Compile e execute
mvn spring-boot:run
```

---

## 📋 Endpoints

| Método | Endpoint | Descrição |
|--------|----------|-----------|
| GET | `/heroes` | Lista todos os heróis |
| GET | `/heroes/{id}` | Busca herói por ID |
| POST | `/heroes` | Cadastra novo herói |
| PUT | `/heroes/{id}` | Atualiza herói |
| DELETE | `/heroes/{id}` | Remove herói |

---

## 📚 Modelo de Dados
```json
{
  "id": 1,
  "nome": "Superman",
  "poder": "Superforça",
  "nivel": 100
}
```

---

## 🏗️ Estrutura do Projeto
