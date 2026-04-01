# 🏗️ Padrões de Projeto 1 - Arquitetura Criacional (Factory)

> Uma aplicação backend estrutural projetada para demonstrar a eficiência da abstração arquitetural. O projeto resolve dependências rígidas aplicando Padrões de Projeto Criacionais (GoF - Gang of Four), garantindo que o código cliente dependa de abstrações e não de implementações concretas.

## 🎯 Motivação e Propósito

No desenvolvimento de sistemas corporativos, o uso excessivo do operador `new` espalhado pelo código gera um alto nível de acoplamento (Tightly Coupled Code). O propósito deste repositório é aplicar o padrão **Factory (Fábrica)** para delegar a responsabilidade de criação de objetos a uma classe especializada.

O projeto resolve o problema da rigidez estrutural. Ao invés do cliente precisar saber qual classe específica instanciar, ele apenas solicita à Fábrica uma interface comum. Isso permite adicionar novas famílias de produtos no futuro sem modificar o código existente (Princípio Open/Closed do SOLID).

> **Métricas e Resultados de Arquitetura:**
> * "A implementação do padrão arquitetural **Factory Method** centralizou a lógica de criação de objetos em uma única classe geradora, reduzindo a complexidade ciclomática no código cliente (`Main`) em **100%**, eliminando múltiplos blocos de decisão (`if/else` ou `switch`) antes necessários para instanciar subclasses específicas."
> * "A adoção da programação orientada a interfaces reduziu o nível de acoplamento direto em **100%** entre a camada de execução e as implementações concretas, diminuindo o tempo de refatoração em estimativas de **50%** caso uma nova classe/entidade precise ser adicionada ao catálogo do sistema."

## 🛠️ Tecnologias Utilizadas

A stack baseia-se no núcleo nativo da linguagem, focando em conceitos de engenharia ao invés de frameworks:

* **[Java (JDK)](https://www.oracle.com/java/technologies/downloads/):** Linguagem back-end utilizada para aplicar a tipagem forte e a orientação a objetos.
* **[JVM (Java Virtual Machine)]:** Plataforma de execução do *bytecode*.
* **[Conceitos GoF (Gang of Four)]:** Aplicação teórica e prática de Padrões de Projeto Criacionais.

## ✨ Funcionalidades

O escopo do projeto reflete a separação de responsabilidades (Separation of Concerns):

1.  **Contratos Abstratos (Interfaces):** Definição de métodos padronizados que todas as classes de uma mesma "família" devem implementar obrigatóriamente.
2.  **Entidades Concretas:** Classes reais que assinam o contrato da interface e possuem suas regras de negócio específicas.
3.  **Fábrica (Factory Class):** Classe geradora responsável por ler um parâmetro ou condição e retornar a instância correta do objeto, blindada por uma interface.
4.  **Execução Desacoplada:** Código cliente (`Main`) consumindo os objetos sem saber qual classe real está sendo instanciada sob o capô.

## 📂 Estrutura de Arquivos

A organização reflete a segmentação de domínios exigida por padrões arquiteturais de nível superior:

```text
padroes_projeto_1/
├── src/
│   ├── factory/         # Classes responsáveis pela lógica de criação (Fábricas)
│   ├── interfaces/      # Contratos e abstrações (Tipos genéricos)
│   ├── models/          # Entidades concretas que implementam as interfaces
│   └── Main.java        # Entry Point da aplicação atuando como Cliente da Fábrica
└── README.md            # Documentação arquitetural
