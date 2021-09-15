### Alguns comandos para SO Windows e Unix, comandos utilizados no Git e ao final algumas anotações sobre a aula de introdução ao Git seus objetos e o ciclo de vida dos arquivos.  

#### Windows
- cd | cd ..  
- dir  
- mkdir  
- del (files) / rmdir (directories)  
- cls  
- echo hello > hello.txt  

#### Unix  
- cd | cd ..  
- ls  
- mkdir  
- rm -rf (r=recursivo | f=force)  
- clear -> ctrl+L  
- echo hello > hello.txt | nano arquivo.txt  
- mv file ./newfolder/ (se nao me engano também renomeia)  

#### Git  
- git --version  
- git config --list  
- git config --global --unset user.email  
- git config --global user.email "email@gmail.com"  
- git config --global user.name username  

- git init  
- ação/criação/alteração etc...  
- git add . | * | <file>  
- git status  
- git log | git log file.md | gitk  
- git commit -m "mensagem do commit"  
- git remote add origin "link remoto"  
- git remote -v  
- git push origin main (enviando para "origin" alterações do branch "main")  
---
- git pull origin main  
- git clone "link remoto"  
---
- git stash save "comentario"  
  stash list | pop 0
- git checkout move-to-branch  
- git checkout -b create-branch  
---
#### Life Cycle 
working directory -> staging area -> local repository -> remote repository  
alter ---------------> git add -------> git commit ------> git push (local -> remote) | pull (remote -> local)  

#### OBJECTS
blob -> tree -> commit  

[Clique aqui para simular vários cenários e entender melhor os conceitos](https://git-school.github.io/visualizing-git/)

