# DevDojo - Maratona JSF

https://www.youtube.com/playlist?list=PL62G310vn6nHSNpACkELWiPlM8J8z8t5J

---

## <a name="indice">Índice</a>

- [Aula 00: Introdução ao Curso](#parte1)   
- [Aula 01: Visão panorâmica sobre o JEE](#parte2)   
- [Aula 02: Configurando o ambiente de desenvolvimento](#parte3)   
- [Aula 03: Configurando container e o hot deploy](#parte4)   
- [Aula 04: Expression Language pt 01 - Introdução](#parte5)   
- [Aula 05: Expression Language pt 02, Operações lógicas](#parte6)   
- [Aula 06: Expression Language pt 03, Objetos e enumerações](#parte7)   
- [Aula 07: Expression Language pt 04, Coleções](#parte8)   
- [Aula 08: Expression Language pt 05, Executando métodos](#parte9)   
- [Aula 09: Expression Language pt 06, EL com JS e CSS](#parte10)   
- [Aula 10: Expression Language pt 07, EL Manipulando exibição com rendered e ajax](#parte11)   
- [Aula 11: Expression Language pt 08, EL lambdas e streams](#parte12)   
- [Aula 12: Escopos pt 01, RequestScoped](#parte13)   
- [Aula 13: Escopos pt 02, SessionScoped](#parte14)   
- [Aula 14: Escopos pt 03, ViewScoped](#parte15)   
- [Aula 15: Escopos pt 04, ApplicationScoped](#parte16)   
- [Aula 16: Escopos pt 05, ConversationScope](#parte17)   
- [Aula 17: Escopos pt 06, FlowScoped pt 01, Introdução e funcionamento](#parte18)   
- [Aula 18: Escopos pt 07, FlowScoped pt 02, Configuração do flow.xml](#parte19)   
- [Aula 19: Escopos pt 08, FlowScoped pt 03, Nested FlowScoped (FlowScope Aninhado)](#parte20)   
- [Aula 20: Escopos pt 09, FlowScoped pt 04, FlowBuilder, Flows com anotações](#parte21)   
- [Aula 21: Escopos pt 10, Dependent](#parte22)   
- [Aula 22: Escopos pt 11, Injeção de Beans](#parte23)   
- [Aula 23: Escopos pt 12, Filtro e login com SessionScoped](#parte24)   
- [Aula 24: Comunicação pt 01, parâmetros com f-param](#parte25)   
- [Aula 25: Comunicação pt 02, parâmetros com viewParam pt 01](#parte26)   
- [Aula 26: Comunicação pt 03, parâmetros com viewParam pt 02](#parte27)   
- [Aula 27: Comunicação pt 04, parâmetros com viewParam pt 03](#parte28)   
- [Aula 28: Comunicação pt 05, Adicionando atributos aos componentes com f:attribute](#parte29)   
- [Aula 29: Comunicação pt 06, Executando os métodos set com setPropertyActionListener](#parte30)   
- [Aula 30: Comunicação pt 07, Passando atributos entre beans com FlashScope](#parte31)   
- [Aula 31: Comunicação pt 08, Cookies](#parte32)   
- [Aula 32: Comunicação pt 09, InputSecret e chamada de métodos com argumentos](#parte33)   
- [Aula 33: Comunicação pt 10, Adicionando objetos na sessão dinamicamente](#parte34)   
- [Aula 34: Ciclo de vida do JSF pt 01, Fases do ciclo de vida](#parte35)   
- [Aula 35: Ciclo de vida do JSF pt 02, Exemplo do immediate=true](#parte36)   
- [Aula 36: Internacionalização com Resource Bundles](#parte37)   
- [Aula 37: Validação customizada com Validators](#parte38)   
- [Aula 38: Conversão customizada com Converters](#parte39)   
- [Aula 39: Validando igualdade dos valores dos componentes](#parte40)   
- [Aula 40: Datatables pt 01](#parte41)   
- [Aula 41: Datatables pt 02, Ordenando dados](#parte42)   
- [Aula 42: Datatables pt 03, Editando e removendo dados](#parte43)   
- [Aula 43: Ajax pt 01, Introdução, execute e render](#parte44)   
- [Aula 44: Ajax pt 02, @form @none @this @all](#parte45)   
- [Aula 45: Ajax pt 03, Atributo listener](#parte46)   
- [Aula 46: Ajax pt 04, eventos](#parte47)   
- [Aula 47: Ajax pt 05, Agrupando componentes](#parte48)   
- [Aula 48: Ajax pt 06, Postback](#parte49)   
- [Aula 49: Ajax pt 07, Colocando requisições Ajax em fila](#parte50)   
- [Aula 50: JSF e HTML5 pt 01 Passthrough atributos](#parte51)   
- [Aula 51: JSF e HTML5 pt 02 Passthrough elementos](#parte52)   
- [Aula 52: JSF e HTML5 pt 03 Bean Validation](#parte53)   
- [Aula 53: Upload de Arquivos pt 01](#parte54)   
- [Aula 54: Upload de Arquivos pt 02 Validações básicas](#parte55)   
- [Aula 55: Gerenciamento de estados das views](#parte56)   
- [Aula 56: Views lógicas e físicas](#parte57)   
- [Aula 57: Tratando ViewExpiredException](#parte58)   
- [Aula 58: Gerenciando recursos estáticos CSS, JS e Imagens](#parte59)   
- [Aula 59: Adicionando comportamento JS a componentes](#parte60)   
- [Aula 60: Custom facelets taglib functions](#parte61)   
- [Aula 61: Criando templates com Facelets](#parte61)   



---

## <a name="parte1">Aula 00 Introdução ao Curso</a>


[Voltar ao Índice](#indice)

---

## <a name="parte2">Aula 01 Visão panorâmica sobre o JEE</a>

- Servidores: https://www.oracle.com/technetwork/java/javaee/overview/compatibility-jsp-136984.html

![componentes javaee](https://github.com/josemalcher/devdojo-maratona-jsf/blob/master/readme-img/componentes-javaee.png?raw=true)

- Componentes: https://www.primefaces.org/showcase/index.xhtml


[Voltar ao Índice](#indice)

---

## <a name="parte3">Aula 02 Configurando o ambiente de desenvolvimento</a>

- pom.xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>groupId</groupId>
    <artifactId>devdojo-maratona-jsf</artifactId>
    <version>1.0-SNAPSHOT</version>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.3</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
    
</project>
```

[Voltar ao Índice](#indice)

---

## <a name="parte4">Aula 03 Configurando container e o hot deploy</a>

```xml
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <groupId>groupId</groupId>
    <artifactId>devdojo-maratona-jsf</artifactId>
    <version>1.0-SNAPSHOT</version>
    <build>
        <plugins>
            <plugin>
                <groupId>org.apache.maven.plugins</groupId>
                <artifactId>maven-compiler-plugin</artifactId>
                <version>3.3</version>
                <configuration>
                    <source>1.8</source>
                    <target>1.8</target>
                </configuration>
            </plugin>
        </plugins>
    </build>
    <dependencies>
        <!-- https://mvnrepository.com/artifact/com.sun.faces/jsf-api -->
        <dependency>
            <groupId>com.sun.faces</groupId>
            <artifactId>jsf-api</artifactId>
            <version>2.2.18</version>
        </dependency>
    </dependencies>
    
</project>
```

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns="http://xmlns.jcp.org/xml/ns/javaee"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
         version="4.0">
    <servlet>
        <servlet-name>Faces Servlet</servlet-name>
        <servlet-class>javax.faces.webapp.FacesServlet</servlet-class>
        <load-on-startup>1</load-on-startup>
    </servlet>
    <welcome-file-list>
        <welcome-file>index.xhtml</welcome-file>
    </welcome-file-list>
    <servlet-mapping>
        <servlet-name>Faces Servlet</servlet-name>
        <url-pattern>*.xhtml</url-pattern>
    </servlet-mapping>
</web-app>
```

[Voltar ao Índice](#indice)

---

## <a name="parte5"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte6"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte7"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte8"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte9"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte10"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte11"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte12"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte13"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte14"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte15"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte16"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte17"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte18"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte19"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte20"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte21"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte22"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte23"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte24"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte25"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte26"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte27"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte28"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte29"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte30"></a>


[Voltar ao Índice](#indice)

---

## <a name="parte31"></a>


[Voltar ao Índice](#indice)

---
