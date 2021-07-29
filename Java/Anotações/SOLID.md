# SOLID

SOLID é um acrônimo dos princípios da programação orientada objetos descritas por Robert C. Martin "Uncle Bob". Auxiliam o programador a escrever códigos mais limpos, 
facilitando a refatoração e estimulando o reaproveitamento do código.  

## S - Single Responsibility Principle (Princípio da Responsabilidade Única)  
Uma classe deve ter um e somente um, motivo para mudar  
- A classe deve possuir **uma única responsabilidade** dentro do software  
  - Ao invés de uma classe "OrdemCompra" com os métodos: buscarOrdensDeCompra(), salvarOrdemCompra(), enviarEmail(), imprimirOrdemDeCompra(), etc...
  - Teríamos Algumas outras classes dividindo essas funções, exemplo: "OrdemDeCompra" com métodos adicionarProduto(), removerProduto(), calcularTotal(); "OrdemDeCompraRepository" com métodos buscarOrdensDeCompra(), salvarOrdemCompra(); "OrdemDeCompraMail" com método enviarEmail(); "OrdemDeCompraPrint" com método imprimirOrdemDeCompra().  

## O - Open Closed Principle (Princípio Aberto Fechado)  
Você deve poder estender um comportamento de classe, sem modificá-lo.  
- Objetos devem estar **abertos para extensão**, mas **fechados para modificação.**  
- Quando novos comportamentos precisam ser adicionados no software, **devemos estender e não alterar o código fonte original.**  
  - "Solução" seria criar uma interface e as outras classes implementam a interface sem a necessidade de alterar o código do controlador, já que ele em algum determinado método receberia objetos desta interface.  

## L - Liskov Substitution Principle (Princípio da Substituição de Liskov)  
Classes derivadas devem ser substituíveis por suas classes base.
- *"Se para cada objeto o1 do tipo S há um objeto o2 do tipo T de forma que, para todos os programas P, o comportamento de P é inalterado quando o1 é substituído por o2, então o S é um subtipo de T"*  
  - Atenção principalmente em classes que estendem outra e que sobreescrevem métodos herdados alterando atributos da superclasse.  

## I - Interface Segregation Principle (Princípio da Segregação da Interface)  
Faça interfaces refinadas que são específicas do cliente  
- Uma classe não deve ser forçada a implementar interfaces e métodos que não serão utilizados  
  - É melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.  
  - *exemplo: criar duas interfaces (Ave e AveVoa) uma para aves que não vooam mas "bicam" e outra para que além de "bicar" também "vooam" ao invés de uma interface genérica.*

## D - Dependenci Inversion Principle (Princípio da Inversão da Dependência)  
Dependa de abstrações e não de implementações.  
- Um módulo de alto nível não deve depender de módulos de baixo nível, ambos devem depender da aobstração.  
- *PS: Inversão de dependência não é igual a Injeção de Dependência.*  
