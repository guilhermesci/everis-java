# Estruturas Condicionais

- if/else
  - short circuit e non short circuit  
    - if( true || false ) // short-circuiting boolean operator  
    - if( true | false )  // non-short-circuiting boolean operator  
- switch/case
- *if ternário*  
  - (expressão booleana) ? "verdadeiro" : "falso";

# Estruturas de Repetição

- for
- while
- do/while
- Enhanced-for

# Incremento

- ++num = incrementa primeiro e depois avalia a expressão  
- num++ = avalia a expressão e depois incrementa  

---

# Convenções de nomes

- Classes
  - Primeira letra maiúscula
  - CamelCase (NomeDaClasse)
- Métodos
  - Primeira letra minúscula
  - "CamelCase" a partir da segunda palavra composta... "exemploDeMetodo" "metodo"
- Variável
  - Primeira letra minúscula
  - Nomes explicativos

## Plugins para garantir consistência do "code style"
- Checkstyle Gradle Plugin
- PMD Gradle Plugin
  - Dentro de um projeto Gradle, deverá alterar o arquivo "build.gradle"

~~~java
plugins {
  id 'java'
  id 'checkstyle'
}

checkstyle {
  toolVersion = '8.21'
  showViolations = true
  configFile = file("config/checkstyle/checkstyle.xml")
}
~~~
- Dentro de "build/reports/checkstyle/" existe o arquivo main.html onde se consegue navegar e visualizar os erros pelo browser por exemplo...  

---

# This, Super, Equals e HashCode
- This: Auto referência  
- Super: Referência a superclasse (usando "super" em classe que não extende nenhuma classe explícitamente, se faz referência então a classe "Object")  
- Equals: Método herdado de Object, serve para fazer comparação entre objetos. Quando se comparam dois objetos, se compara a refeência deles, então por mais que tenham as mesmas informações, o Java não é capaz de identificar essa similaridade.  
- HashCode: Quando se fala em hashCode, precisamos pensar em um código gerado que garanta um caráter único ao nosso objeto. Essa pode ser uma forma interessante para que possa comparar se realmente um objeto é igual ao outro. Para isso precisamos garantir que a implementação da lógica de hashCode sempre respeite as mesmas regras, pois quando compararmos os objetos, o nosso fator de comparação será ele.
  - obj.hashCode() || Objects.hash(att1, att2, ...)  

# Generics  
## Unknow Wildcard  
~~~java
public void imprimeLista(List<?> lista){
  for(Object obj : lista){
    System.out.println(obj);
  }
}
~~~  
## Upper Bounded Wildcard  
? -> Obrigatório que extenda da classe Pessoa
~~~java
public void imprimeLista(List<? extends Pessoa> listaPessoas){
  for(Pessoa p : listaPessoas){
    System.out.println(p);
  }
}
~~~
## Lower Bounded Wildcard  
? -> Obrigatório que herde da classe Pessoa
~~~java
public void imprimeLista(List<? super Pessoa> listaPessoas){
  for(Pessoa p : listaPessoas){
    System.out.println(p);
  }
}
~~~
### Convenção dos caracteres wildcard
- **K** para *Key* -> Map<K,V>
- **V** para *Value* -> Map<K,V>
- **E** para *Element* -> List<E>
- **T** para *Type* -> Collections#addAll
- **?** para genérico
