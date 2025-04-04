# 🏥 Sistema de Gerenciamento de Consultas Médicas

## 📄 Descrição

Este é um sistema de gerenciamento de consultas médicas desenvolvido com **Spring Boot**.  
O projeto tem como objetivo gerenciar **pacientes, médicos e agendamentos**, oferecendo funcionalidades como:

- ✅ CRUD completo para Pacientes, Médicos e Consultas  
- 🔁 Relacionamentos entre entidades, como médico e paciente em uma consulta  
- 💾 Integração com banco de dados relacional para armazenamento seguro das informações  
- 🌐 Estruturação de APIs RESTful para facilitar a comunicação com o sistema  

O sistema foi desenvolvido como parte de um **desafio técnico**, com foco em:

- Boas práticas de desenvolvimento  
- Organização de código  
- Performance e escalabilidade

---

## 🛠️ Tecnologias Utilizadas

- Java 17+
- Spring Boot
- Spring Data JPA
- Hibernate
- Lombok
- Banco de Dados H2 (ou MySQL/PostgreSQL)
- Maven

---


---

## 🔗 Relacionamentos Entre Entidades

- `@OneToOne`  
- `@OneToMany`  
- `@ManyToOne`  
- `@ManyToMany`  

Esses relacionamentos representam as conexões reais entre os dados. Por exemplo:  
Uma **consulta** pertence a um **paciente** e a um **médico**.

---

## ✅ Funcionalidades

- CRUD de Pacientes  
- CRUD de Médicos  
- Agendamento e cancelamento de Consultas  
- Relacionamentos entre entidades  
- Validações e tratamento de erros  
- Documentação da API com Swagger

---

## 🚀 Melhorias Futuras

- Autenticação e autorização (JWT)  
- Testes unitários e de integração  
- Interface frontend (ex: React)  
- Deploy em nuvem (Heroku, Render, Railway)  
- Integração com banco de dados em produção (MySQL ou PostgreSQL)


