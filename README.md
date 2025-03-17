# Aplicativo de Lista de Tarefas (To-Do List)

## Descrição

Este é um aplicativo de linha de comando simples para gerenciamento de listas de tarefas (To-Do List). Ele permite adicionar, remover e listar tarefas, demonstrando conceitos importantes de programação orientada a objetos (POO), como o padrão de projeto MVC (Model-View-Controller) e o padrão Observer.

## Funcionalidades

✅ **Adicionar Tarefa:** Permite adicionar novas tarefas à lista.  
🗑 **Remover Tarefa:** Permite remover tarefas da lista, especificando o índice da tarefa.  
📋 **Listar Tarefas:** Exibe a lista de tarefas na tela.  
🚪 **Sair:** Encerra o aplicativo.

## Tecnologias Utilizadas

☕ **Java:** Linguagem de programação principal.  
🛠️ **Gradle:** Sistema de build para gerenciar dependências e automatizar o processo de compilação.  
📌 **Git:** Sistema de controle de versão para gerenciamento de código.  
💡 **IntelliJ IDEA:** Ambiente de desenvolvimento integrado (IDE).

## Estrutura do Projeto

📦 **stech**  
 ┣ 📂 **src**                         # Diretório principal do código-fonte  
 ┃ ┣ 📂 **model**                     # Camada Model (Regras de Negócio)  
 ┃ ┃ ┣ 📜 **ListaTarefas.java**        # Representa a lista de tarefas e implementa o padrão Observer  
 ┃ ┣ 📂 **view**                      # Camada View (Interface com o Usuário)  
 ┃ ┃ ┣ 📜 **Menu.java**                # Exibe o menu principal e obtém a opção do usuário  
 ┃ ┃ ┣ 📜 **InputHandler.java**        # Lida com a entrada do usuário  
 ┃ ┃ ┣ 📜 **OutputHandler.java**       # Exibe mensagens e implementa ListaTarefasObserver  
 ┃ ┃ ┣ 📜 **InputValidator.java**      # Valida as entradas do usuário  
 ┃ ┃ ┣ 📜 **ListaTarefasObserver.java** # Interface para receber atualizações do Model  
 ┃ ┣ 📂 **controller**                 # Camada Controller (Lógica de Controle)  
 ┃ ┃ ┣ 📜 **Controller.java**          # Coordena a interação entre Model e View  
 ┣ 📜 **.gitignore**                   # Arquivo para ignorar arquivos irrelevantes no Git  
 ┣ 📜 **README.md**                    # Documentação do projeto  

## Padrões de Projeto e Conceitos

🏛 **MVC (Model-View-Controller):** Separa as responsabilidades do aplicativo em Model (dados), View (interface) e Controller (lógica de controle).  
👀 **Observer:** Permite que a View seja notificada automaticamente sobre mudanças no Model.  
📌 **Separação de Responsabilidades:** Cada classe tem uma única responsabilidade, tornando o código mais organizado e manutenível.  
✅ **Validação de Entrada:** A classe `InputValidator` garante que os dados inseridos sejam válidos.  
🛡 **Tratamento de Erros:** O aplicativo lida com entradas inválidas e erros de conversão de forma adequada.  
🔍 **Interface Funcional:** Uso de interfaces funcionais para tornar o código mais expressivo e conciso.  

## Como Executar o Aplicativo

1️⃣ Clone o repositório:  
   ```bash
   git clone https://github.com/eziocdl/todo-list.git
   ```
2️⃣ Compile os arquivos `.java`:  
   ```bash
   javac -d bin src/**/*.java
   ```
3️⃣ Execute a classe `Main`:  
   ```bash
   java -cp bin application.Main
   ```

## Contribuição

Contribuições são bem-vindas! Se você tiver sugestões de melhorias ou correções, sinta-se à vontade para abrir um pull request. 🚀


