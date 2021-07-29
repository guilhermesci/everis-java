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
>  plugins {  
>    id 'java'  
>    **id 'checkstyle'**  
>  }
>    
>  checkstyle {  
>    toolVersion = '8.21'  
>    showViolations = true  
>    configFile = file("config/checkstyle/checkstyle.xml")  
>  }  
- Dentro de "build/reports/checkstyle/" existe o arquivo main.html onde se consegue navegar e visualizar os erros pelo browser por exemplo...
