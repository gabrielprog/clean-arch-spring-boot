# Projeto de Estudo com Arquitetura Limpa e Spring Boot

Este é um projeto de estudo que implementa uma aplicação usando a arquitetura limpa (Clean Architecture) em Java, com o framework Spring Boot e gerenciado com o Maven.

## Visão Geral

O objetivo deste projeto é fornecer uma estrutura básica para desenvolver uma aplicação utilizando os princípios da arquitetura limpa. A arquitetura limpa é uma abordagem que promove a separação de preocupações em camadas, tornando o código mais organizado, testável e escalável.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Maven

## Estrutura do Projeto

O projeto segue a estrutura típica da arquitetura limpa, que consiste nas seguintes camadas:

1. **Entidades**: Contém as classes que representam os objetos principais da aplicação.
2. **Casos de Uso (Use Cases)**: Define os casos de uso da aplicação, contendo os serviços que realizam a lógica de negócios.
3. **Adpatodores (Controllers, Repositories, etc..)**: Responsáveis por lidar com as requisições HTTP, mapeando endpoints e chamando os casos de uso apropriados.


## Executando o Projeto

Para executar o projeto, siga os passos abaixo:

1. Certifique-se de ter o Java e o Maven instalados na sua máquina.
2. Clone este repositório:

```bash
git clone https://github.com/gabrielprog/clean-arch-spring-boot.git
cd clean-arch-spring-boot
mvn spring-boot:run
```
A aplicação estará disponível em http://localhost:8080.

## Contribuindo
Este projeto é destinado apenas para fins de estudo, mas você é bem-vindo para explorar e aprender com ele. Se você deseja contribuir ou fazer melhorias, fique à vontade para enviar um pull request.

## Licença
Este projeto é distribuído sob a licença MIT.



