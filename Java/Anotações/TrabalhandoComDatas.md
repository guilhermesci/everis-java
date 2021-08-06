# java.util.Date  

O java.util.date está na JDK desde sua versão 1.0

Principais Construtores:  
- Date()  
- Date(int year, int month, int date)  
- Date(int year, int month, int date, int hrs, int min)  
- Date(int year, int month, int date, int hrs, int min, int sec)  
- Date(long date)  
- Date(string s)  

Construtores que **não foram depreciados** em suas versões recentes:  
- Data()  
- Data(long date)  

A diferença entre os dois construtores é que o primeiro instancia o objeto no milissegundo mais próximo de sua execução, já o segundo espera que passe por 
parâmetro os milissegundos com base padrão de tempo (epoch) que usa como referência 1 de janeiro de 1970 00:00:00.
> "O epoch timestamp é um padrão laragamente aceito para representar uma data como um inteiro 32-bits a partir do início do **Unix Epoch...**"  

Para utilizar o segundo construtor constumamos utilizar o método estático System.currentTimeMillis() que retorna o milissegundo mais próximo de sua execução com base no sistema operacional.  

### Métodos Úteis  

- after(Date)  
retorno: boolean  
descrição: checa se o objeto data de referência é posterior ao comparado.  

- before(Date)  
retorno: boolean  
descrição: checa se o objeto data de referência é anterior ao comparado.  

- compareTo(Date)  
retorno: int  
descrição: compara dois objetos data.  

- equals(Date)  
retorno: boolean  
descrição: checa se os objetos são iguais.  

- getTime()  
retorno: long  
descrição: retorna a data em milissegundos.  

- setTime(long)  
retorno: void  
descrição: define uma data com base em milissegundos.  

- from(Instant)  
retorno: static Date  
descrição: define uma data com base em um instant  

- toInstant()  
retorno: Instant  
descrição: retorna um instant com base em um date.  

# java.time.Instant  

- Surgiu na JDK 1.8;  
- Imutável e Thread safe;  
- Modela um ponto instantâneo de uma linha do tempo;  
- Indicado para gravar marcações temporais em eventos da sua aplicação.  

# java.util.Calendar  

Calendar é uma classe abstrata que provê métodoas para converter data entre um instante específico. Possui alguns campos específicos para manipulação como MONTH, YEAR, HOUR.  

Algumas possíveis formatações para impressão:  
- System.out.printf("%tc\n", objCalendar);  
- System.out.printf("%tF\n", objCalendar);  
- System.out.printf("%tD\n", objCalendar);  
- System.out.printf("%tr\n", objCalendar);  
- System.out.printf("%tT\n", objCalendar);  

---  

https://docs.oracle.com/javase/8/docs/api/java/util/Date.html  
https://docs.oracle.com/javase/8/docs/api/java/util/Calendar.html  
https://docs.oracle.com/javase/8/docs/api/java/time/Instant.html  
https://docs.oracle.com/javase/8/docs/api/java/text/DateFormat.html  
https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html  
https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html  
https://docs.oracle.com/javase/8/docs/api/java/time/LocalDateTime.html
