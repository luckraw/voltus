# Voltus - Subscription Management System

Voltus é um sistema de gerenciamento de assinaturas que permite gerenciar usuários, planos, assinaturas e faturas de maneira eficiente.

## Funcionalidades

- Gerenciamento de **Usuários**
- Criação e gerenciamento de **Planos**
- Controle de **Assinaturas** com status ativo/inativo
- Emissão e gerenciamento de **Faturas**

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Hibernate/JPA**
- **PostgreSQL**
- **Lombok**
- **MapStruct**
- **Jakarta Persistence API**

## Estrutura do Projeto

O projeto segue uma arquitetura de camadas bem definida:

1. **Domain**: Contém as entidades do sistema:
    - `User`: Representa os usuários do sistema.
    - `Plan`: Define os planos disponíveis.
    - `Subscription`: Relaciona usuários aos seus planos.
    - `Invoice`: Controla as faturas emitidas para cada assinatura.

2. **Service**: Contém a lógica de negócios para as operações de cada entidade:
    - `InvoiceService`
    - `PlanService`
    - `SubscriptionService`

3. **Mapper**: Utiliza o MapStruct para converter entre entidades e DTOs.

4. **Repository**: Interfaces para persistência de dados usando Spring Data JPA.

