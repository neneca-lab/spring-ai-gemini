```markdown
# Chat Client com Spring AI e Google Gemini

Este projeto é um aplicativo Chat Client simples utilizando **Spring AI** integrado ao **Google Gemini**, um poderoso modelo de linguagem do Google. O objetivo é fornecer uma interface de comunicação inteligente e eficiente, aproveitando a flexibilidade do **Spring Framework**.

## Tecnologias Utilizadas
- **Java**
- **Spring Boot**
- **Spring AI**
- **Vertex AI Gemini** (Google AI)

## Dependências
As principais dependências do projeto são:

1. **Spring Web**: Para criação de endpoints REST.
2. **Vertex AI Gemini**: Para integração com os modelos de linguagem do Google.

## Como Executar o Projeto

1. Clone o repositório:
   ```sh
   git clone https://github.com/neneca-lab/spring-ai-gemini.git
   ```

2. Acesse o diretório do projeto:
   ```sh
   cd spring-ai-gemini
   ```

3. Instale as dependências e compile o projeto:
   ```sh
   mvn clean install
   ```

4. Execute a aplicação:
   ```sh
   mvn spring-boot:run
   ```

## Endpoints Disponíveis

- **`POST /chat`**: Envia uma mensagem ao modelo de IA e retorna uma resposta.

  **Exemplo de Requisição:**
  ```json
  {
    "message": "Olá, como você está?"
  }
  ```

  **Exemplo de Resposta:**
  ```json
  {
    "response": "Olá! Estou bem, obrigado por perguntar. E você?"
  }
  ```

## Contribuição
Sinta-se à vontade para contribuir com melhorias para este projeto! Para isso:
- Faça um **fork** do repositório.
- Crie uma nova **branch** para sua funcionalidade ou correção (`feature/nova-funcionalidade`).
- Envie um **pull request** com a sua contribuição.

## 👨🏽‍💻 Desenvolvedor <a name = "authors"></a>
- [@neneca-lab](https://github.com/neneca-lab) 
