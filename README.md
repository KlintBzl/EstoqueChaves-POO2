Estoque Chaves

Este projeto é um sistema desenvolvido em **Java** com integração ao banco de dados **MySQL**, com o objetivo de gerenciar estoque,   
Ele permite cadastrar computadores, registrar peças substituídas, controlar reparos e gerar relatórios de inventário.

---

## Funcionalidades

- Cadastro de **máquinas** com informações detalhadas (número de patrimônio, laboratório, estado).
- Registro de **manutenções**, incluindo peças substituídas e técnico responsável.
- Controle de **inventário de peças** disponíveis e utilizadas.
- Suporte a **múltiplos laboratórios**.
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

- **v1.0.0** – (22/09/2025)  
  - Primeira versão estável.  
  - Implementação de cadastro de máquinas e inventário.  

- **v0.3.0** – (15/09/2025)  
  - Adição de relatórios básicos.  
  - Ajustes na interface gráfica.  

- **v0.2.0** – (08/09/2025)  
  - Implementação do módulo de manutenção.  

- **v0.1.0** – (01/09/2025)  
  - Estrutura inicial do projeto criada (DAO, DTO, VIEW).  

---

## Desenvolvedores

Este projeto foi idealizado e desenvolvido por:  
##  Integrante 1
## Integrante 2


---

## Informações sobre o Banco de Dados usado

---


## Licença

Este projeto está licenciado sob a licença **MIT** – veja o arquivo [LICENSE](LICENSE) para mais detalhes.
