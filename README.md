
# testesfuncionais-fatec-infocafe
Esse projeto tem como propósito criar scripts de teste para aplicação InfoCafe. Utilizando e demonstrando o funcionamento do framwork [thrall](https://github.com/lgigek/thrall). 

Para executar o projeto, é necessário inserir um usuário e senha válidos no arquivo [application.properties](https://github.com/lgigek/testesfuncionais-fatec-infocafe/blob/master/src/test/resources/properties/application.properties). 

## Rodando o projeto com Docker

### Caso o container não esteja construído
1. Construir a imagem Docker a partir do Dockerfile presente no repositório, utilizando o comando 

`docker build -t "thrall" .` 

 2. Executar o container com a imagem que foi construída no passo anterior, informando quais são as instruções para rodar o projeto, utlizando o comando

`docker run --name testesfuncionais-fatec-infocafe -v "$PWD":/usr/src -w /usr/src thrall mvn clean test -Dtest=InfoFatecRunner`

### Caso o container esteja construído
Com o container construído, é necessário executar o comando:
`docker start -i testesfuncionais-fatec-infocafe`

## Rodando o projeto sem Docker

#### Pré requisitos: 

 1. Chrome instalado;
 2. JDK 8 instalado; 
 3. Maven instalado; 

#### Executando o projeto 
`mvn clean test -Dtest=InfoFatecRunner`