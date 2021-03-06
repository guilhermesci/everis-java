# JPA  

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

---

# JPQL  

O **JPQL (Java Persistence Query Language)** é uma linguagem de consulta independente **orientada a objetos** definida pelo **JPA**.  

**JPQL** é usado para realizar consultas no banco de dados. É inspirado no SQL (inclusive a sua sintaxe), porém ele interage com o banco de dados através das **entidades** do **JPA**, ao invés de interagir diretamente nas tabelas de banco de dados (como é no SQL).  

Com o **JPQL** é possível utilizar as **propriedades de orientação a objetos** nas consultas realizadas no banco de dados através de **entidades mapeadas**, tal como **herança**.  
Algumas vantagens ao utilizar o **JPQL** em relação aos métodos básicos de gestão de entidades do **EntityManager** são:  
1) **NÃO** é necessário realizar os join **explicitamente** entre entidades que estão com **annotations de relacionamento**, pois os joins são criados **automaticamente** durante uma consulta;  
2) **JPQL** utiliza as funcionalidades de carregamento **"lazy / eager"** nos relacionamentos entre entidades, aumentando a eficiência das consultas na aplicação;  
3) As consultas podem ser armazenadas em cache para **melhorar a performance da aplicação**;  
4) Operações de busca, atualização e remoção de **entidades em MASSA**, ao invés de realizar operações em apenas uma instância por vez através de chaves primárias (como nos métodos do EntityManager);  
5) Realizar consultas mais **complexas**;  
6) Realizar funções de **agregação**.  

---

# JPQL x JPA Criteria API  

Existe uma alternativa a consultas **JPQL** a partir do **JPA 2.0** chamada **JPA Criteria API**, que é muito útil para construir **consultas dinâmicas**.  

No **JPQL** as consultas só são verificadas no **momento de execução**, não sendo possível detectar erros de sintaxe na consulta durante a compilação. Já o **JPA Criteria API** consegue detectar esses erros no **momento de compilação**.  

Essa funcionalidade se torna possível porque no JPA Criteria API as consultas são definidas como **instâncias de objetos Java** e representam elementos de consulta. Já as consultas JPQL são definidas apenas como **"string"**.  

No entando o **JPA Criteria API** é mais complicado de se utilizar do que o **JPQL**. Sendo assim, para consultas **estáticas simples**, é preferível utilizar o **JPQL**, enquanto que para consultas **dinâmicas** é preferível o **JPA Criteria API**.  

Em relação a eficiência, ambas são **EQUIVALENTES em poder e eficiência**. Portanto saber quando escolher uma ou outra é um grande desafio para projetos de software.  

---

# JPA Criteria API  

Para o JPA Criteria API verificar os possíveis erros em tempo de compilação, é necessário utilizar o **JPA Metamodel** para referenciar os **atributos** das entidades.  

O **JPA Metamodel** provê a habilidade de examinar o modelo de persistência de um objeto para **consultar** os detalhes de uma **entidade JPA**. Para **cada entidade, uma classes metamodelo** é criada com o mesmo nome da classe, porém procedido pelo símbolo (*underscore*) e com os **atributos estáticos** que representam os campos de persistência.  

Sem o **JPA Metamodel**, os atributos serão referenciados através de Strings, tendo como principal desvantagem o risco de ocorrer algum erro em tempo de execução para o usuário final.  

Para usar o **JPQL** ou o **JPQ Criteria API** é necessário ter um objeto da classe **EntityManager**, pois é através dos seus métodos **createQuery** (JPQL) e **getCriteriaBuilder** (JPA Criteria API) que se inicia a criação das consultas.  

Para criar os **JPA Metamodel** de cada entidade será necessário adicionar o **JAR "hibernate-jpamodelgen"** através do Gradle, Maven ou manualmente. Esse JAR **automatiza a criação de Metamodels** (também existem outras organizações que oferecem esse tipo de solução).  

É possível criar manualmente os **JPA Metamodels** de cada entidade que irão auxiliar na **validação das consultas** realizadas através do **JPA Criteria API**, porém isso seria trabalhoso demais. Por essa razão é mais fácil utilizar um gerador de Metamodels para automatizar esse processo.  

---

### Outras linguagens de consulta  

#### HQL  
**HQL** - O **H**ibernate **Q**uery **L**anguage é uma **linguagem de consulta orientada a objetos** que realiza operações nas tabelas e colunas da base de dados através do **Hibernate** (através de classes e propriedades da orientação a objetos). Ela inspirou a criação do JPQL e para utilizá-lá, é necessário utilizar as annotations nativas do Hibernate (**Session e SessionFactory**).  

#### EQL  
**EQL** - O **E**clipseLink **Q**uery **L**anguage provê diversas extensões para a especificação padrão do **JPQL**. Essas extensões provêem acesso a funcionalidades padrões do **SQL**, além de funcionalidades específicas do **EclipseLink**.
