# Netbeans to Intellij Project
### Netbeans to Intellij project to convert your netbeans project into intellij project

---  
## Note
#### this program is still on development and this was build on linux.

---
## Build
how to build and run
```bash
$ cd src
$ javac *.java
```

---  
## How To Run
see the requirement to run this  
note: make sure you already on src directory
- run using args:
```bash
$ java rynetin --source <your netbeans project path> --to <your intellij project path>
or
$ java rynetin -s <your netbeans project path> -t <your intellij project path>
```

- run inside of the program:
```bash
$ java rynetin
netbeans project path: <your netbeans project path>
intellij project path: <your intellij project path>
```

---  
## Requirement
requirement for this program  
- JDK (Java Development Kit) 11+
- Netbeans Project
- Intellij Project

how to check your jdk and java version  
- Java version
```bash
$ java --version
```
- Java Compiler (javac) version
```bash
$ javac --version
```