# AzureOauth2Springboot

## Projeto consiste am realizar a autenticaçao e o redirecionamento para página de autenticação do azure

### Premissas
* Application Register criada no azure
* Java 11
* Springboot 2.5.2
* maven

******

### Criando application Register

1 - Subscrição na azure <br />
2 - Principal Criado no azure com contribuidor ativo (abaixo procedimento de criação) <br />

<a href="https://learn.microsoft.com/en-us/azure/storage/files/storage-how-to-use-files-portal?tabs=azure-portal"> Create and use an Azure file share </a>. 

## Passo 1 Ex: Criação  de usuário 
Para Criação do princiapal que será utilizado no conecction do azure devops é necessário realizar o comando abaixo 

az ad sp create-for-rbac --name springboot_app --role Contributor --scopes "/subscriptions/2c81448w21********"

![image](https://user-images.githubusercontent.com/28166733/227680438-fcf9c9a9-38f7-4045-bc9e-6e19af5625a6.png)

apos os dados ser exibidos copiar os valores clientid, client server, tenant id 


