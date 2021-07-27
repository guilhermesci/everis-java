# Tipos 

## Primitivos  

Java define oito tipos de dados primitivos : byte, short, int, long, float, double, boolean e char. Todas as outras variáveis em java são tipos de referência de objeto.

- Não aceitam nulos  
- Possuem valores default  
- Pode não ser inicializado

<div class="w3-responsive">
<table class="ws-table-all notranslate">
<tbody><tr>
<th style="width:20%">Data Type</th>
<th style="width:17%">Size</th>
<th style="width:50%">Description</th>
<th style="width:13%">Default</th>
</tr>
<tr>
<td>byte</td>
<td>1 byte</td>
<td>Stores whole numbers from -128 to 127</td>
<td>0</td>
</tr>
<tr>
<td>short</td>
<td>2 bytes</td>
<td>Stores whole numbers from -32,768 to 32,767</td>
<td>0</td>
</tr>
<tr>
<td>int</td>
<td>4 bytes</td>
<td>Stores whole numbers from -2,147,483,648 to 2,147,483,647</td>
<td>0</td>
</tr>
<tr>
<td>long</td>
<td>8 bytes</td>
<td>Stores whole numbers from -9,223,372,036,854,775,808 to 
9,223,372,036,854,775,807</td>
<td>0L</td>
</tr>
<tr>
<td>float</td>
<td>4 bytes</td>
<td>Stores fractional numbers. Sufficient for 
storing 6 to 7 decimal digits</td>
<td>0f</td>
</tr>
<tr>
<td>double</td>
<td>8 bytes</td>
<td>Stores fractional numbers. Sufficient for 
storing 15 decimal digits</td>
<td>0d</td>
</tr>
<tr>
<td>boolean</td>
<td>1 bit</td>
<td>Stores true or false values</td>
<td>false</td>
</tr>
<tr>
<td>char</td>
<td>2 bytes</td>
<td>Stores a single character/letter or ASCII values</td>
<td>'\u0000'</td>
</tr>
</tbody>
</table>
</div>

Tipos primitivos em Java são "estaticamente tipados", o que significa que todas as variáveis devem primeiro ser declaradas antes que possam ser utilizadas, 
ao contrário de linguagens como Python.  
Errado ``numero = 10;`` | Correto ``int numero = 10;``

## Wrappers

Uma classe wrapper é um objeto que encapsula um tipo primitivo. Cada tipo primitivo tem um wrapper correspondente:  
- byte, short, int, long, float, double, boolean, char  
- Byte, Short, Integer, Long, Float, Double, Boolean, Character  

![image](https://user-images.githubusercontent.com/7232708/126391897-5e8d7f0e-3a41-4efb-9ba3-5fdfd4a6f57f.png)  

Cada classe de wrapper possui Object como uma superclasse. Byte, Short, Integer, Long Float e Double têm Number como sua superclasse direta. 
Isso significa que cada classe de wrapper pode implementar os métodos da classe Object , como hashCode (), equals (Object obj), clone () e toString ().  

### Valores padrão da classe Wrapper  
Como os wrappers são tipos de referência, seu valor padrão será nulo. Por outro lado, os tipos primitivos nunca podem ser nulos. 
Se os tipos primitivos não forem atribuídos a um valor, a linguagem atribuirá a eles um valor padrão. É importante entender esse comportamento 
quando você escolhe entre usar um tipo primitivo ou um wrapper.  

#### Wrappers são imutáveis  
> 
> Todos os objetos wrapper primitivos em Java são finais, o que significa que são imutáveis. Quando um objeto de invólucro tem seu valor modificado,
> o compilador deve criar um novo objeto e então reatribuir esse objeto ao original.  
>>     public void addOne (Integer i) {  
>>         i = i + 1;  
>>     }  
>  
> Essa criação e eventual garbage collection de objetos irá adicionar muita sobrecarga, especialmente ao fazer grandes cálculos em loops.  

### Autoboxing  
- É a conversão automática de tipos primitivos em suas classes de objetos wrapper correspondentes. ``Byte b = 127;``  

### Unboxing  
- É a conversão automática de wrapper em seus tipos primitivos correspondentes. ``boolean varTrue = Boolean.TRUE;``  

### Sugestão  
- Quando usar tipos primitivos  :
     - Ao fazer uma grande quantidade de cálculos, os tipos primitivos são sempre mais rápidos - eles têm muito menos sobrecarga.  
     - Quando você não quer que a variável seja nula.  
     - Quando você não deseja que o valor padrão seja nulo.  
     - Se o método deve retornar um valor  

- Quando usar a classe Wrapper  
     - Quando você está usando coleções ou genéricos - é obrigatório  
     - Se você deseja MIN_SIZE ou MAX_SIZE de um tipo.  
     - Quando você deseja que a variável possa ser nula.  
     - Quando você deseja que o valor padrão seja nulo.  
     - Se às vezes o método pode retornar um valor nulo.  

## Não Primitivos  

Todos os outros tipos diferentes dos tipos primitivos são Objetos.
- String
- Number
- Object (Todos os outros objetos extendem Object)
- Qualquer outro...

## Tipagem forte e estática

- Forte = Após atribuir um tipo para uma variável, não é possível atribuir um valor diferente deste tipo.  
- Estática = Os tipos são verificados em tempo de compilação  
- *Tipo Inferido* = Utilizando a palavra reservada ``var`` o tipo da variável é reconhecido de forma implícita. Criado a partir da versão 10.  

# Modificadores de acesso  

<div class="responsive-table">
  <div class="responsive-table"><table>
    <tbody><tr>
      <th></th>
      <th>private</th>
      <th>default</th>
      <th>protected</th>
      <th>public</th>
    </tr>
    <tr>
      <td>A partir da mesma classe</td>
      <td>sim</td>
      <td>sim</td>
      <td>sim</td>
      <td>sim</td>
    </tr>
    <tr>
      <td>Qualquer classe do mesmo pacote</td>
      <td>não</td>
      <td>sim</td>
      <td>sim</td>
      <td>sim</td>
    </tr>
    <tr>
      <td>Qualquer classe filha(subclasse) em pacote diferente</td>
      <td>não</td>
      <td>não</td>
      <td>sim</td>
      <td>sim</td>
    </tr>
    <tr>
      <td>Qualquer classe em pacote diferente</td>
      <td>não</td>
      <td>não</td>
      <td>não</td>
      <td>sim</td>
    </tr>
  </tbody></table></div>
</div>

## Public  
Em Java, a visibilidade padrão de classes, atributos e métodos está restrita a todos os membros que fazem parte de um mesmo pacote. A palavra-chave public modifica essa visibilidade de forma a ampliá-la, deixando-a sem restrições.  

Uma classe definida como pública pode ser utilizada por qualquer objeto de qualquer pacote. Em Java, uma unidade de compilação (um arquivo fonte com extensão .java) pode ter no máximo uma classe pública, cujo nome deve ser o mesmo do arquivo (sem a extensão). As demais classes na unidade de compilação, não públicas, são consideradas classes de suporte para a classe pública e têm a visibilidade padrão.  

Um atributo público de uma classe pode ser diretamente acessado e manipulado por objetos de outras classes.  

Um método público de uma classe pode ser aplicado a um objeto dessa classe a partir de qualquer outro objeto de outra classe. O conjunto de métodos públicos de uma classe determina o que pode ser feito com objetos da classe, ou seja, determina o seu comportamento.  

## Private  
A palavra-chave private restringe a visibilidade do membro modificado, método ou atributo, exclusivamente a objetos da própria classe que contém sua definição.  

## Protected  
A palavra-chave protected restringe a visibilidade do membro modificado, atributo ou método, de forma que classes não-relacionadas não possam acessá-lo. Objetos da própria classe, de classes derivadas desta e de classes do mesmo pacote têm acesso a membros protected.  

## Default  
A classe e/ou seus membros são acessíveis somente por classes do mesmo pacote, na sua declaração não é definido nenhum tipo de modificador, sendo este identificado pelo compilador.

## Abstract  
Esse modificador não é aplicado em variáveis, apenas em classes e métodos. A definição de um método compreende especificação (a sua assinatura) e implementação (o seu corpo). Há situações em que é possível afirmar que uma classe deve ter um método com determinada especificação mas nada pode se afirmar sobre seu comportamento. Para esses casos, é possível definir que a classe tem esse método como abstrato.  

A classe que tenha pelo menos um método abstrato não pode ser instanciada e também deve ser declarada como abstrata. A definição desse método deverá ser completada em uma classe derivada dessa que contém o método abstrato, usando o mecanismo de [redefinição de métodos](https://www.dca.fee.unicamp.br/cursos/PooJava/heranca/redefmet.html).  

## Static  
Usualmente, métodos definidos em uma classe são aplicados a objetos daquela classe. Há no entanto situações nas quais um método pode fazer uso apenas dos recursos de uma classe (e não das informaões associadas a cada objeto individualmente) para realizar sua tarefa.

Para lidar com tais situações, Java define os métodos da classe, cuja declaração deve conter o modificador static. Um método estático pode ser aplicado à classe e não necessariamente a um objeto. Considere o exemplo do método sqrt(), um método estático da classe Math, usado aqui para atribuir a raiz quadrada de 2 à variável sqr2:

     double sqr2 = Math.sqrt(2.0);
Exemplos de métodos estáticos em Java incluem os métodos para manipulação de tipos primitivos definidos nas classes Character, Integer e Double, assim como todos os métodos definidos para a classe Math.

Se aplicado este modificador ao atributo, o valor dele estará presente em todas as instâncias do objeto. Caso crie duas subclasses de uma classe com atributo static, quando alterado seu valor, essa alteração será refletida nessas duas subclasses.  

## Final  
Quando aplicado em classes, não permite que a classe seja estendida. Aplicado em métodos, não permite que o mesmo seja sobrescrito (overriding) na subclasse, e nos valores de variáveis, não permite que seu valor seja alterado após sua atribuição.  

---
Referências:  
https://web.digitalinnovation.one/course/desenvolvimento-basico-em-java/learning/358a846f-33ec-4d11-8e14-41b25398694d  
https://www.dca.fee.unicamp.br/cursos/PooJava/  
https://medium.com/@bpnorlander/java-understanding-primitive-types-and-wrapper-objects-a6798fb2afe9  
