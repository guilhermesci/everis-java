#### "Roadmap"  
- Realizar o donwload manualmente ou através do Gradle ou Maven.
- Criar o arquivo persistence.xml e realizar as configurações (provider=hibernate)  
- Utilizar as annotations nas classes que serão mapeadas  
- Configurar o EntityManager  

---

Lembrando que para utilizar o JPA **É NECESSÁRIO** utilizar alguma **implementação**, pois o JPA é apenas a **ESPECIFICAÇÃO**. Algumas das implementações mais conhecidas para o JPA são:  
- **Hibernate** - É uma ferramenta **ORM** open source e é a líder de mercado, sendo a inspiração para a especificação Java Persistence API(JPA). O Hibernate nasceu sem JPA e tinha sua própria implementação ORM (que ainda é possível usar), porém as versões atuais já possuem compatibilidade com a especificação JPA e são mais aconselháveis de usar do que sua implementação nativa.  
  - Apenas como observação, as **APIS nativas do Hibernate** utilizam as classes **"SessionFactory"** e **"Session"** (no JPA são utilizados **EntityManagerFactory** e **EntityManager**). Porém, mesmo quando se utiliza o JPA com a implementação do Hibernate, na verdade são utilizadas as classes **SessionFactory** e **Session** de forma "envelopada" (wraped).
- **EclipseLink** - É um projeto open source de persistência da Eclipse Foundation. Ele é a implementação de referência do JPA, além de permitir desenvolvedores interagirem com vários serviços de data, incluindo banco de dados, web services, OXM (Object XML mapping), EIS (Enterprise Information Systems). Alguns padrões suportados pelo EclipseLink são: JPA, JAXB, JCA, SOD.

---

Anotação **@Entity** - Indica a aplicação que os objetos da classe especificada serão persistidos no banco de dados. Também podem ser utilizadas outras anotações para auxiliar 
no mapeamento da classe, tais como **@Id**, **@Column**, **@Table**, **@OneToOne**, **@OneToMany**, **@ManyToOne** e **@ManyToMany**.  

Interface **EntityManager** - É utilizada para gerenciar o ciclo de vida das entidades. Os principais métodos utilizados são **find**, **persist** e **remove**.

As principais anotações utilizadas junto com a annotation **@Entity** são:  

- **@Table** - É uma annotation opcional. Por padrão o **NOME DA ENTIDADE** é usado para realizar o mapeamento com o **NOME DA TABELA** do banco de dados. Essa annotation será 
necessária caso o nome da entidade seja diferente do nome da tabela do banco de dados.  
- **@Column** - É uma annotation opcional. Por padrão o **ATRIBUTO** da entidade é usado para realizar o mapeamento com o nome da **COLUNA** do banco de dados. Essa annotation
será necessária caso os atributos da entidade sejam diferentes das colunas do banco de dados.  
- **@Id** - **É OBRIGATÓRIO** especificar ao menos uma **ID** para a entidade  

Também existem as **annotations de relacionamento** que são utilizadas para representar os relacionamentos entre **TABELAS** do banco de dados (através das chaves estrangeiras 
no banco de dados) em uma aplicação que esteja utilizando o **JPA**. As principais annotations são **@OneToOne**, **@OneToMany**, **@ManyToOne** e **@ManyToMany**.  

Na aplicação utilizando **JPA**, é possível realizar relacionamento *unidirecionais* e *bidirecionais*. No *unidirecional* é possível chegar de uma instância A para uma 
instância B facilmente, porém o caminho *ao contrário* é **dificultado**. Na *bidirecional*, tanto de A para B como de B para A o acesso é **facilitado**.  

Nas annotations de relacionamento, a propriedade **"fetch"** exige atenção especial do desenvolvedor. Seus possíveis valores são **eager** (ansioso) ou **lazy** (preguiçoso). 
Suas características são:  
- **Eager** - A entidade mapeada com esse atributo **SEMPRE** será carregada na aplicação quando a **entidade que está MAPEANDO for consultada**, mesmo que nunca seja utilizada 
durante a execução da aplicação.
- **Lazy** - A entidade mapeada com esse atributo **SOMENTE** será carregada na aplicação quando **esta for EXPLICITAMENTE consultada** pela entidade que está mapeando (É o mais 
aconselhável de usar caso não se saiba , em um primeiro momento o real número de frequência de consultas).  

Para persistir dados com as entidades mapeadas, é **ÓBRIGATÓRIO** iniciar uma transação. Para manipular transações, é necessário utilizar o seguinte método do **EntityManager**:  
- **getTransaction** - Retorna uma **EntityTransaction**, sendo **obrigatório** o seu uso quando **utilizar algum método** que **realize alterações** no banco de dados. Pode 
utilizar os seguintes métodos:  
  - **begin** - **Inicia** uma transação;  
  - **commit** - Finaliza uma transação, **persistindo** todos os dados que foram modificados desde o início da transação;  
  - **rollback** - Finaliza uma transação, **revertendo** todos os dados que foram modificados desde o início da transação.  

Os principais métodos do **EntityManager** para interagir com as entidades são:  
- **find** - **Retorna** a entidade que está persistida no banco de dados através de sua **chave primária**;  
- **persist** - **Persiste** a entidade no banco de dados (É necessário ter iniciado uma transação);  
- **remove** - **Remove** a entidade do banco de dados (É necessário ter iniciado uma transação).  

Para configurar uma **aplicação JAVA** para interagir com o **banco de dados** usando as **especificações do JPA**, será necessário configurar o arquivo **persistence.xml**.  

Nele é possível especificar qual **framework de implementação** será utilizado, quais **classes serão mapeadas como ENTIDADES, URL DE CONEXÃO, USUÁRO, SENHA E DRIVER** (normalmente JDBC para BDs relacionais).
