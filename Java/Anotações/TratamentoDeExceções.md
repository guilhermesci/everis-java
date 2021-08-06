# Checked Exceptions  

São exceções esperadas, cujo fluxo ou método de um sistema foi preparado para receber. Um bom exemplo é uma exceção de negócio, onde se deseja informar um erro caso a exceção esperada ocorra.  

~~~java
try {  
    PreparedStatement smt = con.prepareStatement(query);  
    //...  
} catch (SQLException e) {  
    throw new AcessoADadosException("Problema na criação do Statement", e);  
}  
~~~  

# Unchecked Exceptions  

São exceções não esperadas para o fluxo ou método de um sistema, um bom exemplo é o famoso NullPointException que ocorre quando se tenta acessar uma referência de memória vazia, ou recuperar uma instância que não existe, dentre outros motivos.  

# Bloco "try/catch"  

O bloco "try/catch" sempre é utilizado quando no processo que será executado dentro de um método é esperado um erro, então se cria um bloco "protegido" onde qualquer erro que ocorra dentro do trecho "try" é direcionado para o trecho "catch" e sofrerá o devido tratamento de erro.  

# Finally  
 O finally é um bloco de código que pode ou não ser utilizado junto ao "try/catch", este trecho de código sempre será executado independente se ocorrer erro ou não dentro do fluxo. Normalmente o finally é utilizado para liberar recursos ou dar continuidade em um fluxo que deve ocorrer independente do erro.  

~~~java
try {  
    PreparedStatement smt = con.prepareStatement(query);  
    //...  
} catch (SQLException e) {  
    throw new AcessoADadosException("Problema na criação do Statement", e);  
} finally {  
    smt.close();  
}  
~~~  

# Throws e Throw

- Throws: É a assinatura do método que será retornado caso ocorra erro para o método que fez a chamada, dentro de um fluxo encadeado.
- Throw: É usado para lançar a exceção desejada, juntamente com a mensagem de erro, para o método que fez a chamada.

~~~java
public String recuperarIdUsuario (String query) throws AcessoADadosException{  
  try {  
    PreparedStatement smt = con.prepareStatement(query);  
    //...  
  } catch (SQLException e) {  
    throw new AcessoADadosException("Problema na criação do Statement", e);  
  } finally {  
    smt.close();  
  }  
}  
~~~  
