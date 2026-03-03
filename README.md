# 📚 LiterAlura — Challenge
## 📖 Sobre o Projeto

O Literalura é um catálogo de livros interativo desenvolvido em Java, que permite ao usuário consultar e armazenar informações literárias por meio de uma interface textual no console.

A aplicação consome dados da API pública Gutendex (baseada no acervo do Project Gutenberg), garantindo informações atualizadas sobre livros e autores.
Os dados consultados podem ser persistidos em banco de dados para consultas posteriores.

## 🚀 Funcionalidades

A aplicação oferece as seguintes opções de interação:

## 🔎 Buscar livro por título

Permite pesquisar um livro específico pelo título diretamente na API e salvá-lo no banco de dados.

## 📚 Listar livros registrados

Exibe todos os livros já armazenados no banco de dados local.

## ✍️ Listar autores

Apresenta todos os autores registrados no sistema.

## 🗓️ Listar autores vivos em determinado ano

Permite informar um ano específico e retorna os autores que estavam vivos naquele período.

## 🌎 Listar livros por idioma

Exibe livros filtrados por idioma (ex: en, pt, es, fr).

# 🛠️ Tecnologias Utilizadas

Java 17

Maven

Spring Boot

Spring Data JPA

PostgreSQL

Jackson Databind

API Gutendex

# 🏗️ Arquitetura

O projeto segue uma estrutura organizada em camadas:

Model → Entidades JPA (Livro, Autor)

Repository → Interfaces de acesso a dados

Service → Regras de negócio

Principal (Console) → Interface de interação com o usuário

# 📌 Exemplo de Uso

1 - Buscar livro por título

2 - Listar livros registrados

3 - Listar autores

4 - Listar autores vivos em determinado ano

5 - Listar livros por idioma

0 - Sair

# 🎯 Objetivo do Projeto

Este projeto foi desenvolvido como parte de um challenge com o objetivo de:

Praticar consumo de API REST

Trabalhar com persistência de dados usando JPA

Aplicar conceitos de orientação a objetos

Estruturar uma aplicação utilizando Spring Boot

Consolidar boas práticas de organização de código
