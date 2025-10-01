#### Estoque Chaves

Este projeto é um sistema desenvolvido em **Java** com integração ao banco de dados **MySQL**, com o objetivo de gerenciar o estoque de chaves, virgens e usadas.   
Ele permite cadastrar usuários, registrar chaves usadas para revenda, controlar estoque de chaves virgens e editar informações já colocadas no sistema.

---

## Funcionalidades

- Cadastro de **chaves** com informações detalhadas (Tipo, numeração, quantidade).
- Registro de **entradas e saídas** do caixa.
- Controle de **inventário de chaves** disponíveis e utilizadas.
- Suporte a **múltiplas oficinas**.
- Controle de **usuários e permissões**.
- Relatórios básicos para acompanhamento de atividades.

---

## Tecnologias Utilizadas

- **Java SE 17**  
- **Swing** para interface gráfica  
- **MySQL** para persistência de dados  
- **DAO/DTO Pattern** para organização do código  
- **Maven** para gerenciamento de dependências  

---

## Estrutura do Projeto
  src/

├── dao/ # Classes de acesso ao banco de dados

├── dto/ # Objetos de transferência de dados

├── img/ # Imagens dos ícones

└──  view/ # Interfaces gráficas (Swing)

---

## Histórico de Atualizações
- **v3.0.0** - (01/10/2025)
  - Criação das classes de histórico DTO e DAO, além de uma tela para cadastro e edição do mesmo
  - 

- **v2.2.0** - (29/09/2025)
  - Adição dos métodos de verificação de historico
  - melhora na organização dos botões principais

- **v2.1.1** - (29/09/2025)
  - Adição de botões aperfeiçoados, melhorados e mais amplos.
  - Incrementação da nova função de visualização de saídas e entradas do histórico.

- **v2.1.0** - (29/09/2025)
  - Atualização de alguns ícones para melhor entendimento do usuário.
  - Ajustes nas inplementações de cadastro.
  - Alterações das funções para melhor funcionamento do sistema.

- **v2.0.0** - (24/09/2025)
  - Segunda versão estável
  - Implementação de novas telas para melhorar o gerenciamento das funções.
  - Ajustes nos botões e atalhos

- **v1.0.0** – (22/09/2025)  
  - Primeira versão estável.  
  - Implementação de cadastro de chaves e usuários, sendo possível ralizar o login.  

- **v0.3.0** – (15/09/2025)  
  - Adição de imagens para melhor interação com o usuário.  
  - Ajustes na interface gráfica.  

- **v0.2.0** – (08/09/2025)  
  - Implementação do módulo de manutenção.  

- **v0.1.0** – (01/09/2025)  
  - Estrutura inicial do projeto criada (DAO, DTO, VIEW).  

---

## Desenvolvedores

Este projeto foi idealizado e desenvolvido por:  
## Klint Burzlaff Berta Lemes - 16 anos
## Nicoly Marques Lemes - 17 anos

---

## Informações sobre o Banco de Dados usado

O banco de dados usado é o SGDB, o banco de dados original tem o nome de "estoquechaves", mas é de sua opção mudá-lo, apenas tenha certeza que você atualizou as informações em 'ConexaoDAO' no pacote 'DAO'

Caso não saiba como começar, temos um Prompt disponível que você pode acessar:
(https://docs.google.com/document/d/1TyN46ldqZWO7lPA0_PCgpV3fyp2Td0RUUTEVml7acvI/edit?usp=sharing)

---

## Licença

Este projeto está licenciado sob a licença **MIT** – veja o arquivo [LICENSE](LICENSE) para mais detalhes.
