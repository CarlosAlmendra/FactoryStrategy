# Exercício 05 -  Factory Method em Java 

# Objetivo
Implementar um sistema de notificações em Java, utilizando o Factory Method 
Pattern para criar diferentes tipos de notificações de forma dinâmica. 

# Descrição
Crie um programa em Java que permita ao usuário escolher um tipo de notificação e 
enviá-la. O programa deve utilizar o Factory Method para instanciar dinamicamente as 
notificações sem modificar o código principal. 

# Requisitos
1. Criar uma interface chamada Notification com um método send(String 
message). 
2. Implementar três classes que representam diferentes notificações: 

    ```
    a. EmailNotification: Exibe uma mensagem simulando o envio por e-mail. 
    b. SMSNotification: Exibe uma mensagem simulando o envio por SMS. 
    c. PushNotification: Exibe uma mensagem simulando o envio por push 
    ```
3. Criar uma classe NotificationFactory que tenha um método estático 
createNotification(String type), que retorna uma instância do tipo de notificação 
correspondente.

5. Criar uma classe Main que exiba um menu no terminal para o usuário escolher o 
tipo de notificação e inserir a mensagem.

# Exemplo de Fluxo Esperado
```
1. O sistema exibe as opções de notificação: 
    a. 1: Email 
    b. 2: SMS 
    c. 3: Push Notification
```

2. O usuário escolhe uma opção digitando o número correspondente. 
   
3. O sistema solicita a mensagem a ser enviada
   
4. O sistema cria a instância correta utilizando o NotificationFactory e envia a 
mensagem.

# Critérios de Avaliação
```
✅ Uso correto do Factory Method Pattern.
✅ Código modular e reutilizável.
✅ Interação funcional via terminal.
✅ Facilidade para adicionar novos métodos de pagamento sem alterar código
existente.
```

# Dicas
• Utilize herança e polimorfismo para evitar uso excessivo de 
condicionais no código principal.

• Teste cada tipo de notificação individualmente para garantir 
o funcionamento correto.

• Comente seu código explicando a lógica utilizada.
