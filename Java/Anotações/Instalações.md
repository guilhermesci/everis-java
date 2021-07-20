# Instalação de ambiente Unix

## Instalando o Java 10

$ sudo add apt-get repository ppa:linuxuprising/java  
$ sudo apt-get update  
$ sudo apt-get install oracle-java10-installer  

export JAVA_HOME="/usr/lib/jvm/java-10-oracle"  
export PATH=$JAVA_HOME/bin:$PATH  

$ java -version  

Local de instalação (/user/lib/jvm)  

## Ferramentas de build

### Gradle
+ https://gradle.org/
+ https://gradle.org/releases (Download "binary-only")

- Exemplo versão 7.1.1
- Ganhando popularidade (Android Studio)
- Usa linguagem de programação Groovy

$ mkdir /opt/gradle  
$ unzip -d /opt/gradle gradle-7.1.1-bin.zip  
$ ls /opt/gradle/gradle-7.1.1  
$ export PATH=$PATH:/opt/gradle/gradle-7.1.1/bin  

$ sudo apt-get purge gradle `old versions`  
$ gradle -v `check version`  
  
### Maven
+ https://maven.apache.org/  (Download apache-maven-3.8.1-bin.zip)

- Exemplo versão 3.8.1  
- Legados do ANT  
- Baseado em XML  

$ mkdir /opt/maven  
$ unzip -d /opt/maven apache-maven-3.8.1-bin.zip  
$ ls /opt/maven/apache-maven-3.8.1  
$ export PATH=$PATH:/opt/maven/apache-maven-3.8.1/bin

$ sudo apt-get purge maven `old versions`  
$ mvn -v `check version`  

### Wrappers  
- Garante a mesma versão para todos os desenvolvedores  

+ https://github.com/takari/maven-wrapper  
+ https://docs.gradle.org/current/userguide/gradle_wrapper.html  

$ gradle wrapper  
$ ./gradlew -v `check version`  

$ mvn -N io.takari:maven:wrapper  
$ ./mvn -v `check version`  

# Instalando o IntelliJ

$ cd ~/firefox  
$ ./firefox --new-instance --safe-mode  
https://www.jetbrains.com/idea/  
$ cd "DownloadDirectory"  
$ sudo tar -xzf ideaIC-2018.1.3.tar.gz  
$ cd idea-IC-181.5087.20/bin/  
$ ./idea.sh  
