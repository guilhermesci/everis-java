# Programação Orientada a Objetos  
A programação orientada a objetos possui 4 pilares principais, são eles:  
- Abstração  
- Encapsulamento  
- Herança  
- Polimorfismo  

## Abstração  
Abstração é a habilidade de concentrar nos aspectos essenciais de um contexto qualquer, ignorando características menos importantes ou acidentais. Em modelagem orientada a objetos, uma classe é uma abstração de entidades existentes no domínio do sistema de software.    

## Encapsulamento  
Encapsular os dados de uma aplicação significa evitar que estes sofram acessos indevidos. Se trata de um dos elementos que adicionam segurança à aplicação em uma programação orientada a objetos pelo fato de esconder as propriedades, criando uma espécie de caixa preta.  

A maior parte das linguagens orientadas a objetos implementam o encapsulamento baseado em propriedades privadas, ligadas a métodos especiais chamados getters e setters, que irão retornar e setar o valor da propriedade, respectivamente. Essa atitude evita o acesso direto a propriedade do objeto, adicionando uma outra camada de segurança à aplicação.  

Para fazermos um paralelo com o que vemos no mundo real, temos o encapsulamento em outros elementos. Por exemplo, quando clicamos no botão ligar da televisão, não sabemos o que está acontecendo internamente. Podemos então dizer que os métodos que ligam a televisão estão encapsulados.  

## Herança  
O conceito de encapsular estrutura e comportamento em um tipo não é exclusivo da orientação a objetos; particularmente, a programação por tipos abstratos de dados segue esse mesmo conceito. **O que torna a orientação a objetos única é o conceito de herança.**  

Herança é um mecanismo que permite que características comuns a diversas classes sejam fatoradas em uma classe base, ou superclasse. A partir de uma classe base, outras classes podem ser especificadas. Cada classe derivada ou subclasse apresenta as características (estrutura e métodos) da classe base e acrescenta a elas o que for definido de particularidade para ela.  

Sendo uma linguagem de programação orientada a objetos, Java oferece mecanismos para definir classes derivadas a partir de classes existentes. É fundamental que se tenha uma boa compreensão sobre como objetos de classes derivadas são criados e manipulados, assim como das restrições de acesso que podem se aplicar a membros de classes derivadas. Também importante para uma completa compreensão da utilização desse mecanismo em Java é a compreensão de como relacionam-se interfaces e herança.  

Herança é sempre utilizada em Java, mesmo que não explicitamente. Quando uma classe é criada e não há nenhuma referência à sua superclasse, implicitamente a classe criada é derivada diretamente da classe Object. É por esse motivo que todos os objetos podem invocar os métodos da classe Object, tais como equals() e toString().  

## Polimorfismo  
Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, especializados para cada classe derivada, usando para tanto uma referência a um objeto do tipo da superclasse. A decisão sobre qual o método que deve ser selecionado, de acordo com o tipo da classe derivada, é tomada em tempo de execução, através do mecanismo de ligação tardia.  

No caso de polimorfismo, é necessário que os métodos tenham exatamente a mesma identificação, sendo utilizado o mecanismo de redefinição de métodos. Esse mecanismo de redefinição não deve ser confundido com o mecanismo de sobrecarga de métodos.  

> ### Ligação tardia  
> Quando o método a ser invocado é definido durante a compilação do programa, o mecanismo de ligação prematura (early binding) é utilizado.  
> 
> Para a utilização de polimorfismo, a linguagem de programação orientada a objetos deve suportar o conceito de ligação tardia (late binding), onde a definição do método que será efetivamente invocado só ocorre durante a execução do programa. O mecanismo de ligação tardia também é conhecido pelos termos dynamic binding ou run-time binding.  
> 
> Em Java, todas as determinações de métodos a executar ocorrem através de ligação tardia exceto em dois casos:  
> 
> 1. métodos declarados como final não podem ser redefinidos e portanto não são passíveis de invocação polimórfica da parte de seus descendentes; e  
> 2. métodos declarados como private são implicitamente finais.

---

# Outras definições

## Objetos
É através de objetos que (praticamente) todo o processamento ocorre em aplicações desenvolvidas com linguagens de programação orientadas a objetos. O uso racional de objetos, obedecendo aos bons princípios associados à sua definição conforme estabelecido no paradigma de desenvolvimento orientado a objetos, é chave para o desenvolvimento de bons sistemas de software.  

Toda linguagem de programação orientada a objetos oferece mecanismos para definir os tipos de objetos para cada aplicação através do conceito de classes. Objetos são instâncias de classes; essas instâncias precisam ser criadas para que, através de sua manipulação, possam realizar seu trabalho. Após a conclusão de suas atividades, objetos podem ser removidos.  

Arranjos de tipos primitivos ou de objetos são criados e manipulados de forma análoga a objetos.  

## Classe
A definição de um modelo conceitual para o domínio da aplicação, contemplando as classes relevantes e suas associações, é um dos principais resultados das etapas de análise e projeto orientado a objetos. A adoção de uma linguagem de modelagem, tal como o diagrama de classes UML, permite expressar esse resultado de maneira organizada e padronizada.  

Uma classe é um gabarito para a definição de objetos. Através da definição de uma classe, descreve-se que propriedades -- ou atributos -- o objeto terá.  

Além da especificação de atributos, a definição de uma classe descreve também qual o comportamento de objetos da classe, ou seja, que funcionalidades podem ser aplicadas a objetos da classe. Essas funcionalidades são descritas através de métodos. Um método nada mais é que o equivalente a um procedimento ou função, com a restrição que ele manipula apenas suas variáveis locais e os atributos que foram definidos para um objeto desse tipo.  

Uma vez que estejam definidas quais serão as classes que irão compor uma aplicação, assim como qual deve ser sua estrutura interna e comportamento, é possível criar essas classes em Java.  

## Interface
Uma interface Java é uma classe abstrata para a qual todos os métodos são implicitamente abstract e public, e todos os atributos são implicitamente static e final. Em outros termos, uma interface Java aproxima-se da especificação de uma "classe abstrata pura".  

A sintaxe para a declaração de uma interface é similar àquela para a definição de classes, porém seu corpo define apenas assinaturas de métodos e constantes.  

Uma interface estabelece uma espécie de contrato que é obedecido por uma classe. Quando uma classe implementa uma interface, garante-se que todas as funcionalidades especificadas pela interface serão oferecidas pela classe.  

## Construtores  
Um construtor é um (pseudo-)método especial, definido para cada classe. O corpo desse método determina as atividades associadas à inicialização de cada objeto criado. Assim, o construtor é apenas invocado no momento da criação do objeto através do operador *new*.  

A assinatura de um construtor diferencia-se das assinaturas dos outros métodos por não ter nenhum tipo de retorno (nem mesmo void). Além disto, o nome do construtor deve ser o próprio nome da classe.  

O construtor pode receber argumentos, como qualquer método. Usando o mecanismo de sobrecarga, mais de um construtor pode ser definido para uma classe. Veja por exemplo os construtores definidos para a classe Point de Java.  

Toda classe tem pelo menos um construtor sempre definido. Se nenhum construtor for explicitamente definido pelo programador da classe, um construtor default, que não recebe argumentos, é criado pelo compilador Java. No entanto, se o programador da classe criar pelo menos um método construtor, o construtor default não será criado automaticamente -- se ele o desejar, deverá criar um construtor sem argumentos explicitamente.  

No momento em que um construtor é invocado, a seguinte seqüência de ações é executada para a criação de um objeto:  
1. O espaço para o objeto é alocado e seu conteúdo é inicializado (bitwise) com zeros.  
2. O construtor da classe base é invocado.  
3. Os membros da classe são inicializados para o objeto, seguindo a ordem em que foram declarados na classe.  
4. O restante do corpo do construtor é executado.  

Seguir essa seqüência é uma necessidade de forma a garantir que, quando o corpo de um construtor esteja sendo executado, o objeto já terá à disposição as funcionalidades mínimas necessárias, quais sejam aquelas definidas por seus ancestrais. O primeiro passo garante que nenhum campo do objeto terá um valor arbitrário, que possa tornar erros de não inicialização difíceis de detectar.  

## Sobrescrita
A sobrescrita de métodos consiste basicamente em criar um novo método na classe filha contendo a mesma assinatura e mesmo tipo de retorno do método sobrescrito.  

Quando mencionado anteriormente que o método deve possuir a mesma assinatura, significa dizer que o método deve possuir o mesmo nome, a mesma quantidade e o mesmo tipo de parâmetros utilizado no método sobrescrito.  

Com relação ao tipo de retorno, este pode ser um subtipo do tipo de retorno do método sobrescrito, por exemplo: se o método da superclasse retornar um List, é permitido que o novo método retorne um ArrayList ou qualquer outro List. No entanto o oposto não é permitido, gerando um erro de compilação.  

## Sobrecarga  
Na programação orientada a objetos, um método aplicado a um objeto é selecionado para execução através da sua assinatura e da verificação a qual classe o objeto pertence. Através do mecanismo de sobrecarga (overloading), dois métodos de uma mesma classe podem ter o mesmo nome, desde que suas listas de parâmetros sejam diferentes, constituindo assim uma assinatura diferente. Tal situação não gera conflito pois o compilador é capaz de detectar qual método deve ser escolhido a partir da análise dos tipos de argumentos do método.  

Um exemplo do uso de sobrecarga em Java é encontrado nos métodos abs(), max() e min() da classe Math, que têm implementações alternativas para quatro tipos de argumentos distintos.  

## Formas de herança
Há várias formas de relacionamentos em herança:  
1. **Extensão:** subclasse estende a superclasse, acrescentando novos membros (atributos e/ou métodos). A superclasse permanece inalterada, motivo pelo qual este tipo de relacionamento é normalmente referenciado como herança estrita.  
2. **Especificação:** a superclasse especifica o que uma subclasse deve oferecer, mas não implementa nenhuma funcionalidade. Diz-se que apenas a interface (conjunto de especificação dos métodos públicos) da superclasse é herdada pela subclasse.  
3. **Combinação de extensão e especificação:** a subclasse herda a interface e uma implementação padrão de (pelo menos alguns de) métodos da superclasse. A subclasse pode então redefinir métodos para especializar o comportamento em relação ao que é oferecido pela superclasse, ou ter que oferecer alguma implementação para métodos que a superclasse tenha declarado mas não implementado. Normalmente, este tipo de relacionamento é denominado herança polimórfica.  

A última forma é, sem dúvida, a que mais ocorre na programação orientada a objetos. Algumas modelagens introduzem uma forma de herança conhecida como contração, que deve ser evitada.  

## Recuperando informação sobre um tipo
O uso de polimorfismo está intimamente relacionado ao mecanismo de upcast, onde parte da informação sobre um objeto torna-se inacessível - ou seja, informação é momentaneamente perdida. Esse processo é seguro do ponto de vista da orientação a objetos pois a interface da classe base nunca é maior que a interface da classe derivada.  

Há situações onde é interessante recuperar a referência para o tipo original de um objeto, de modo a obter acesso à sua funcionalidade completa. Para tanto, o mecanismo de downcast precisa ser utilizado:  
``  Ref_orig = (Tipo_orig) Ref_upcast; ``  

O problema com downcasting é que é preciso verificar se o objeto que está tendo sua referência convertida é realmente do tipo especificado, ou caso contrário seria impossível garantir sua manipulação correta após a conversão.  

Em Java, todas as operações de downcasting são verificadas através do mecanismo de Run-Time Type Identification (RTTI) suportado pela linguagem. Lembre-se que é possível, para qualquer objeto, obter a indicação de a qual classe ele pertence através do método getClass().  

