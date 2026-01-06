# Sistema de Gestão de Funcionários (POO)

## Descrição
Projeto simples desenvolvido para disciplina de Programação Orientada a Objetos (POO), demonstrando os principais conceitos do paradigma: classes, herança, polimorfismo, encapsulamento, interfaces, classes abstratas, tratamento de exceções e organização em pacotes.

## Estrutura do Projeto
```
final.laise.atividade/
├── src/
│   ├── models/         # Classes de domínio (Funcionario, Desenvolvedor, Gerente, Estagiario)
│   ├── interfaces/     # Interfaces (Beneficiario, Promovivel)
│   ├── exceptions/     # Exceções customizadas
│   ├── utils/          # Utilitários
│   ├── services/       # Serviços para manipulação de funcionários
│   └── Main.java       # Classe principal para testes
└── README.md           # Este arquivo
```

## Funcionalidades
- Cadastro de diferentes tipos de funcionários (Desenvolvedor, Gerente, Estagiário)
- Adição e listagem de benefícios
- Promoção de funcionários
- Cálculo de salário considerando bônus e carga horária
- Busca de funcionário por CPF
- Tratamento de exceções ao adicionar benefícios inválidos

## Conceitos de POO aplicados
- **Classe abstrata:** `Funcionario` serve como base para os demais funcionários
- **Herança:** `Desenvolvedor`, `Gerente` e `Estagiario` herdam de `Funcionario`
- **Polimorfismo:** Métodos sobrescritos e uso de referências do tipo `Funcionario`
- **Encapsulamento:** Atributos privados e acesso via métodos
- **Interface:** `Beneficiario` e `Promovivel` para comportamentos específicos
- **Exceções customizadas:** Exemplo: `BeneficioInvalidoException`
- **Organização em pacotes**

## Como executar
1. Compile todos os arquivos Java dentro da pasta `src/`.
2. Execute a classe `Main`.

Exemplo no terminal:
```sh
cd src
javac */*.java *.java
java Main
```

## Justificativa do uso de interfaces
As interfaces permitem garantir que diferentes tipos de funcionários possam receber benefícios ou serem promovidos, mesmo que cada classe implemente essas ações de forma diferente. Isso facilita a manutenção e a expansão do sistema.

## Observações
- O projeto é didático e pode ser expandido conforme a necessidade.
- O código está comentado e organizado para facilitar o entendimento.

---

Desenvolvido para fins acadêmicos.
