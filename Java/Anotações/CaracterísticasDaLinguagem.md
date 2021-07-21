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
> O seguinte código irá causar um erro:
> - numero = 10;

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
- É a conversão automática de tipos primitivos em suas classes de objetos wrapper correspondentes.  

### Unboxing  
- É a conversão automática de wrapper em seus tipos primitivos correspondentes.

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

