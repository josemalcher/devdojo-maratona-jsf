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

## <a name="parte5">Aula 04 Expression Language pt 01   Introdução</a>

![Namespace jsf](https://github.com/josemalcher/devdojo-maratona-jsf/blob/master/readme-img/namesspaces.png?raw=true)

```xml
<dependency>
    <groupId>javax</groupId>
    <artifactId>javaee-api</artifactId>
    <version>7.0</version>
    <scope>provided</scope>
</dependency>
```

```java

package bean.estudante;

import javax.inject.Named;
import java.io.Serializable;

//@ManagedBean vai ser depreciado em breve!
@Named
public class EstudanteRegistrarBean implements Serializable {
    private String nome = "José";
    private String sobrenome = "Malcher Jr.";

    private double nota1  = 7.5;
    private double nota2  = 3.5;
    private double nota3  = 9.5;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}


```

```xhtml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core">

   <f:view> <!-- tag bom para internacionalização -->
      <h:outputLabel value="Hello, world!"/><br></br>

      <h:outputLabel value="#{estudanteRegistrarBean.nome} #{estudanteRegistrarBean.sobrenome}"></h:outputLabel>
   </f:view>


</html>

```

[Voltar ao Índice](#indice)

---

## <a name="parte6">Aula 05 Expression Language pt 02, Operações lógicas</a>

- WEB-INF/web.xml

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
    <context-param><!-- não renderizar comentários -->
        <param-name>javax.faces.FACELETS_SKIP_COMMENTS</param-name>
        <param-value>true</param-value>
    </context-param>
</web-app>

```

```java
package bean.estudante;

import javax.inject.Named;
import java.io.Serializable;

//@ManagedBean vai ser depreciado em breve!
//@Named("OutroNomeDeumBean")
@Named
public class EstudanteRegistrarBean implements Serializable {
    private String nome = "José";
    private String sobrenome = "Malcher Jr.";

    private double nota1  = 7.5;
    private double nota2  = 3.5;
    private double nota3  = 9.5;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}

```

```xhtml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
<h:body>

    <h:outputLabel value="Hello, world!"/><br></br>

    <h:outputLabel value="#{estudanteRegistrarBean.nome} #{estudanteRegistrarBean.sobrenome}"></h:outputLabel>
    <h:outputLabel value="#{estudanteRegistrarBean.nome}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean['sobrenome']}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nota1 eq estudanteRegistrarBean.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nota1 == estudanteRegistrarBean.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nota1 eq estudanteRegistrarBean.nota2 and
    estudanteRegistrarBean.nome.equals('William')}"/><br/>

    <h:outputText value="Comparacao notas"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nota1 le estudanteRegistrarBean.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nota1 eq 0 ? 'ZERO' : 'NAO ZERO' }"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nota1 = 40}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nota1}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nome += ' sobrenonealgumacoisa'}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nome}"/><br/>
    <!--
        Palavras reservadas:
        and, or, not , eq, ne, lt, gt, le, ge, true, false
        null, instanceof, empty, div e mod
    -->
</h:body>
</html>

```

```
Hello, world!
José Malcher Jr.José
Malcher Jr.
false
false
false
Comparacao notas
false
NAO ZERO
40
7.5
José sobrenonealgumacoisa
José
```

[Voltar ao Índice](#indice)

---

## <a name="parte7">Aula 06 Expression Language pt 03, Objetos e enumerações</a>

```xml
        <dependency>
            <groupId>org.primefaces</groupId>
            <artifactId>primefaces</artifactId>
            <version>6.0</version>
        </dependency>
```

```java
package com.maratonajsf.model.enums;

public enum Turno {
    MATUTINO, VESPERTINO, NOTURNO
}

```

```java
package com.maratonajsf.model;

import com.maratonajsf.model.enums.Turno;

public class Estudante {
    private String nome = "José";
    private String sobrenome = "Malcher Jr.";

    private double nota1  = 7.5;
    private double nota2  = 3.5;
    private double nota3  = 9.5;

    private Turno turno = Turno.MATUTINO;

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }
}

```

```java
package com.maratonajsf.bean.estudante;

import com.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;

//@ManagedBean vai ser depreciado em breve!
//@Named("OutroNomeDeumBean")
@Named
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}

```

```xhtml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core"
      xmlns:p="http://primefaces.org/ui"
>
<h:body>
    <p:importEnum type="com.maratonajsf.model.enums.Turno"
                  var="Turno" allSuffix="ALL_ENUM_VALUES"/>

    <h:outputLabel value="Hello, world!"/><br></br>

    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome} #{estudanteRegistrarBean.estudante.sobrenome}"></h:outputLabel>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante['sobrenome']}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 == estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2 and
    estudanteRegistrarBean.estudante.nome.equals('William')}"/><br/>

    <h:outputText value="Comparacao notas"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 le estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq 0 ? 'ZERO' : 'NAO ZERO' }"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 = 40}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome += ' sobrenonealgumacoisa'}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/><br/>
    <!--
        Palavras reservadas:
        and, or, not , eq, ne, lt, gt, le, ge, true, false
        null, instanceof, empty, div e mod
    -->
    <h:outputLabel value="EMUMs:"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.turno eq Turno.MATUTINO}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.turno.equals(Turno.MATUTINO)}"/><br/>
</h:body>


</html>

```

```
Hello, world!
José Malcher Jr.José
Malcher Jr.
false
false
false
Comparacao notas
false
NAO ZERO
40
7.5
José sobrenonealgumacoisa
José
EMUMs:
true
true
```


[Voltar ao Índice](#indice)

---

## <a name="parte8">Aula 07 Expression Language pt 04, Coleções</a>

```java
package com.maratonajsf.bean.estudante;

import com.maratonajsf.model.Estudante;

import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

//@ManagedBean vai ser depreciado em breve!
//@Named("OutroNomeDeumBean")
@Named
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();

    /*Coleções*/
    private String[] nomesArray = {"DevDojo", "é ", "Muito Foda!"};
    private List<String> nomesList = asList("José", "Junior", "Ronaldo");
    private Set<String> nomesSet = new HashSet<>(asList("José Malcher", "Roberto Junior", "Ronaldo Vieira"));
    private Map<String, String> nomesMap = new HashMap<>();

    {
        nomesMap.put("Opt1", "Opção 01");
        nomesMap.put("Opt2", "Opção 02");
        nomesMap.put("Opt3", "Opção 03");

        //recaptulando - imprimit MAP
        for(Map.Entry<String,String> entry : nomesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}

```

```xhtml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core"
      xmlns:p="http://primefaces.org/ui"
>
<h:body>
    <p:importEnum type="com.maratonajsf.model.enums.Turno"
                  var="Turno" allSuffix="ALL_ENUM_VALUES"/>

    <h:outputLabel value="Hello, world!"/><br></br>

    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome} #{estudanteRegistrarBean.estudante.sobrenome}"></h:outputLabel>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante['sobrenome']}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 == estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2 and
    estudanteRegistrarBean.estudante.nome.equals('William')}"/><br/>

    <h:outputText value="Comparacao notas"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 le estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq 0 ? 'ZERO' : 'NAO ZERO' }"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 = 40}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome += ' sobrenonealgumacoisa'}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/><br/>
    <!--
        Palavras reservadas:
        and, or, not , eq, ne, lt, gt, le, ge, true, false
        null, instanceof, empty, div e mod
    -->
    <h:outputLabel value="EMUMs:"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.turno eq Turno.MATUTINO}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.turno.equals(Turno.MATUTINO)}"/><br/>

    <br/>

    <b><h:outputLabel value=" ----- Arrays ------" /></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesArray[0]}
                          #{estudanteRegistrarBean.nomesArray[1]}
                          #{estudanteRegistrarBean.nomesArray[2]}" />
    <br/>
    <!-- ui:repeat array -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesArray}" var="nome">
        <h:outputLabel value="#{nome}" />
    </ui:repeat>
    <br/>
    <!-- LIST-->
    <b><h:outputLabel value=" ----- LIST ----- " /></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesList.get(0)}
                          #{estudanteRegistrarBean.nomesList.get(1)}
                          #{estudanteRegistrarBean.nomesList.get(2)}"/>;
    <br/>
    <!-- ui: repeat List -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesList}" var="nome">
        <h:outputLabel value="#{nome}" />
    </ui:repeat>

    <br/>
    <b><h:outputLabel value=" ----- SET ----- " /></b><br/>
    <!-- ui: repeat SET -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesSet.toArray()}" var="nome">
        <h:outputLabel value="#{nome}"/>
    </ui:repeat>

    <br/>
    <b><h:outputLabel value=" ----- MAP ----- " /></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesMap.get('opt1')}"/>
    <br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesMap}"/>
    <br/>
    <ui:repeat value="#{estudanteRegistrarBean.nomesMap.entrySet().toArray()}" var="nome">
        <h:outputLabel value="#{nome.key} - #{nome.value}"/>
    </ui:repeat>
    
</h:body>

</html>

```

[Voltar ao Índice](#indice)

---

## <a name="parte9">Aula 08 Expression Language pt 05, Executando métodos</a>


- com/maratonajsf/bean/estudante/EstudanteRegistrarBean.java

```java

    public void executar(){
        System.out.println("Fazendo uma busca ");
        System.out.println("Processando ");
        System.out.println("Exibindo os dados ");
    }

    public void executar(String param){
        System.out.println("Fazendo uma busca com parametros " + param);
        System.out.println("Processando " + param);
        System.out.println("Exibindo os dados "+ param);
    }
    public String executarRetorno(String nome){
        return "ALUNO: "+ nome;
    }

    public String irParaIndex2(){
        return "index2?faces-redirect=true";
    }
```

- index.xhtml

```xhtml
    <h:form>
        <!--<h:commandButton value="Ir para Proxima Página" action="retorno" />-->
        <!--<h:commandButton value="Ir para Proxima Página" actionListener="void" />-->
        <h:commandButton value="Ir para Proxima Página" action="#{estudanteRegistrarBean.irParaIndex2}" />
    </h:form>
```

[Voltar ao Índice](#indice)

---

## <a name="parte10">Aula 09 Expression Language pt 06, EL com JS e CSS</a>

```java
 <br/>
    <br/>

    <!-- EL com JS e CSS -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesSet.toArray()}" varStatus="status" var="nome" >
        #{status.index} -
        <h:outputLabel value="#{nome}" style="color:#{status.index mod 2 == 0 ? 'red' : 'green'}"/><br/>
    </ui:repeat>
    <br/>
    <br/>
    <h:commandButton value="Fazer Mágica!" onclick="fazMagica('Hadukkeeen')"/><br/><br/>
    <h:commandButton value="Alert Nome" onclick="fazMagica('#{estudanteRegistrarBean.estudante.nome}')"/><br/>

</h:body>
    <script type="text/javascript">
        function fazMagica(magica) {
            alert(magica);
        }

        function alertNome(nome) {
            alert(nome);
        }
    </script>
```

[Voltar ao Índice](#indice)

---

## <a name="parte11">Aula 10 Expression Language pt 07, EL Manipulando exibição com rendered e ajax</a>

```java
package com.maratonajsf.bean.estudante;

import com.maratonajsf.model.Estudante;

import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

//@ManagedBean vai ser depreciado em breve!
//@Named("OutroNomeDeumBean")
@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();

    /*Coleções*/
    private String[] nomesArray = {"DevDojo", "é ", "Muito Foda!"};
    private List<String> nomesList = asList("José", "Junior", "Ronaldo");
    private Set<String> nomesSet = new HashSet<>(asList("José Malcher", "Roberto Junior", "Ronaldo Vieira"));
    private Map<String, String> nomesMap = new HashMap<>();

    private boolean mostrarNotas;
    private boolean mostrarLink;

    {
        nomesMap.put("Opt1", "Opção 01");
        nomesMap.put("Opt2", "Opção 02");
        nomesMap.put("Opt3", "Opção 03");

        //recaptulando - imprimit MAP
       /* for(Map.Entry<String,String> entry : nomesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }

    public void esconderNotas() {
        this.mostrarNotas = false;
    }

    public void exibirLink(){
        this.mostrarLink = true;
    }

    public void esconderLink(){
        this.mostrarLink = false;
    }

    public void executar() {
        System.out.println("Fazendo uma busca ");
        System.out.println("Processando ");
        System.out.println("Exibindo os dados ");
    }

    public void executar(String param) {
        System.out.println("Fazendo uma busca com parametros " + param);
        System.out.println("Processando " + param);
        System.out.println("Exibindo os dados " + param);
    }

    public String executarRetorno(String nome) {
        return "ALUNO: " + nome;
    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}

```

```xhtml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core"
      xmlns:p="http://primefaces.org/ui"
>
<h:head>

</h:head>
<h:body>
    <p:importEnum type="com.maratonajsf.model.enums.Turno"
                  var="Turno" allSuffix="ALL_ENUM_VALUES"/>

    <h:outputLabel value="Hello, world!"/><br></br>

    <h:outputLabel
            value="#{estudanteRegistrarBean.estudante.nome} #{estudanteRegistrarBean.estudante.sobrenome}"></h:outputLabel>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante['sobrenome']}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 == estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2 and
    estudanteRegistrarBean.estudante.nome.equals('William')}"/><br/>

    <h:outputText value="Comparacao notas"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 le estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq 0 ? 'ZERO' : 'NAO ZERO' }"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 = 40}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome += ' sobrenonealgumacoisa'}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/><br/>
    <!--
        Palavras reservadas:
        and, or, not , eq, ne, lt, gt, le, ge, true, false
        null, instanceof, empty, div e mod
    -->
    <h:outputLabel value="EMUMs:"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.turno eq Turno.MATUTINO}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.turno.equals(Turno.MATUTINO)}"/><br/>

    <br/>

    <b><h:outputLabel value=" ----- Arrays ------"/></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesArray[0]}
                          #{estudanteRegistrarBean.nomesArray[1]}
                          #{estudanteRegistrarBean.nomesArray[2]}"/>
    <br/>
    <!-- ui:repeat array -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesArray}" var="nome">
        <h:outputLabel value="#{nome}"/>
    </ui:repeat>
    <br/>
    <!-- LIST-->
    <b><h:outputLabel value=" ----- LIST ----- "/></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesList.get(0)}
                          #{estudanteRegistrarBean.nomesList.get(1)}
                          #{estudanteRegistrarBean.nomesList.get(2)}"/>;
    <br/>
    <!-- ui: repeat List -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesList}" var="nome">
        <h:outputLabel value="#{nome}"/>
    </ui:repeat>

    <br/>
    <b><h:outputLabel value=" ----- SET ----- "/></b><br/>
    <!-- ui: repeat SET -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesSet.toArray()}" var="nome">
        <h:outputLabel value="#{nome}"/>
    </ui:repeat>

    <br/>
    <b><h:outputLabel value=" ----- MAP ----- "/></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesMap.get('opt1')}"/>
    <br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesMap}"/>
    <br/>
    <ui:repeat value="#{estudanteRegistrarBean.nomesMap.entrySet().toArray()}" var="nome">
        <h:outputLabel value="#{nome.key} - #{nome.value}"/>
    </ui:repeat>

    <br/>
    <b><h:outputLabel value=" ----- Testando métodos ----- "/></b><br/>
    #{estudanteRegistrarBean.executar()}
    #{estudanteRegistrarBean.executar(' Parametros 1')}
    #{estudanteRegistrarBean.executar(estudanteRegistrarBean.estudante.nome)}
    #{estudanteRegistrarBean.executarRetorno("José Malcher")}

    <h:form>
        <!--<h:commandButton value="Ir para Proxima Página" action="retorno" />-->
        <!--<h:commandButton value="Ir para Proxima Página" actionListener="void" />-->
        <h:commandButton value="Ir para Proxima Página" action="#{estudanteRegistrarBean.irParaIndex2}"/>
    </h:form>
    <br/>
    <br/>

    <!-- EL com JS e CSS -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesSet.toArray()}" varStatus="status" var="nome">
        #{status.index} -
        <h:outputLabel value="#{nome}" style="color:#{status.index mod 2 == 0 ? 'red' : 'green'}"/><br/>
    </ui:repeat>
    <br/>
    <br/>
    <h:commandButton value="Fazer Mágica!" onclick="fazMagica('Hadukkeeen')"/><br/><br/>
    <h:commandButton value="Alert Nome" onclick="fazMagica('#{estudanteRegistrarBean.estudante.nome}')"/><br/>

    <br/>
    <br/>

    <h:form id="form">
        <h:commandButton value="Exibir Notas">
            <f:ajax listener="#{estudanteRegistrarBean.exibirNotas()}" render="notasGrid"/>
        </h:commandButton>
        <h:commandButton value="Esconder Notas">
            <f:ajax listener="#{estudanteRegistrarBean.esconderNotas()}" render="notasGrid"/>
        </h:commandButton>
        <br/>
        <h:panelGrid id="notasGrid">
            <h:outputText value="#{estudanteRegistrarBean.estudante.nome}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.sobrenome}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.turno}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.nota1}"
                          rendered="#{estudanteRegistrarBean.mostrarNotas}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.nota2}"
                          rendered="#{estudanteRegistrarBean.mostrarNotas}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.nota3}"
                          rendered="#{estudanteRegistrarBean.mostrarNotas}"/>
        </h:panelGrid>

    </h:form>
    <br/>
    <br/>
    <h:form>
        <h:commandButton value="Exibir Link">
            <f:ajax listener="#{estudanteRegistrarBean.exibirLink()}" render="pgLink"/>
        </h:commandButton>
        <h:commandButton value="Esconder Link">
            <f:ajax listener="#{estudanteRegistrarBean.esconderLink}" render="pgLink"/>
        </h:commandButton>
        <h:panelGrid id="pgLink">
            <ui:fragment id="fragmentLink" rendered="#{estudanteRegistrarBean.mostrarLink}">
                <a href="http://josemalcher.net" target="_black">www.josemalcher.net</a>
            </ui:fragment>
        </h:panelGrid>
    </h:form>
</h:body>
<script type="text/javascript">
    function fazMagica(magica) {
        alert(magica);
    }

    function alertNome(nome) {
        alert(nome);
    }
</script>


</html>

```

[Voltar ao Índice](#indice)

---

## <a name="parte12">Aula 11 Expression Language pt 08, EL lambdas e streams</a>

```xhtml
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core"
      xmlns:p="http://primefaces.org/ui"
      xmlns:c="http://xmlns.jcp.org/jsp/jstl/core"
>
<h:head>

</h:head>
<h:body>
    <p:importEnum type="com.maratonajsf.model.enums.Turno"
                  var="Turno" allSuffix="ALL_ENUM_VALUES"/>

    <h:outputLabel value="Hello, world!"/><br></br>

    <h:outputLabel
            value="#{estudanteRegistrarBean.estudante.nome} #{estudanteRegistrarBean.estudante.sobrenome}"></h:outputLabel>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante['sobrenome']}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 == estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq estudanteRegistrarBean.estudante.nota2 and
    estudanteRegistrarBean.estudante.nome.equals('William')}"/><br/>

    <h:outputText value="Comparacao notas"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 le estudanteRegistrarBean.estudante.nota2}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 eq 0 ? 'ZERO' : 'NAO ZERO' }"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1 = 40}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nota1}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome += ' sobrenonealgumacoisa'}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.nome}"/><br/>
    <!--
        Palavras reservadas:
        and, or, not , eq, ne, lt, gt, le, ge, true, false
        null, instanceof, empty, div e mod
    -->
    <h:outputLabel value="EMUMs:"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.turno eq Turno.MATUTINO}"/><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.estudante.turno.equals(Turno.MATUTINO)}"/><br/>

    <br/>

    <b><h:outputLabel value=" ----- Arrays ------"/></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesArray[0]}
                          #{estudanteRegistrarBean.nomesArray[1]}
                          #{estudanteRegistrarBean.nomesArray[2]}"/>
    <br/>
    <!-- ui:repeat array -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesArray}" var="nome">
        <h:outputLabel value="#{nome}"/>
    </ui:repeat>
    <br/>
    <!-- LIST-->
    <b><h:outputLabel value=" ----- LIST ----- "/></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesList.get(0)}
                          #{estudanteRegistrarBean.nomesList.get(1)}
                          #{estudanteRegistrarBean.nomesList.get(2)}"/>;
    <br/>
    <!-- ui: repeat List -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesList}" var="nome">
        <h:outputLabel value="#{nome}"/>
    </ui:repeat>

    <br/>
    <b><h:outputLabel value=" ----- SET ----- "/></b><br/>
    <!-- ui: repeat SET -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesSet.toArray()}" var="nome">
        <h:outputLabel value="#{nome}"/>
    </ui:repeat>

    <br/>
    <b><h:outputLabel value=" ----- MAP ----- "/></b><br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesMap.get('opt1')}"/>
    <br/>
    <h:outputLabel value="#{estudanteRegistrarBean.nomesMap}"/>
    <br/>
    <ui:repeat value="#{estudanteRegistrarBean.nomesMap.entrySet().toArray()}" var="nome">
        <h:outputLabel value="#{nome.key} - #{nome.value}"/>
    </ui:repeat>

    <br/>
    <b><h:outputLabel value=" ----- Testando métodos ----- "/></b><br/>
    #{estudanteRegistrarBean.executar()}
    #{estudanteRegistrarBean.executar(' Parametros 1')}
    #{estudanteRegistrarBean.executar(estudanteRegistrarBean.estudante.nome)}
    #{estudanteRegistrarBean.executarRetorno("José Malcher")}

    <h:form>
        <!--<h:commandButton value="Ir para Proxima Página" action="retorno" />-->
        <!--<h:commandButton value="Ir para Proxima Página" actionListener="void" />-->
        <h:commandButton value="Ir para Proxima Página" action="#{estudanteRegistrarBean.irParaIndex2}"/>
    </h:form>
    <br/>
    <br/>

    <!-- EL com JS e CSS -->
    <ui:repeat value="#{estudanteRegistrarBean.nomesSet.toArray()}" varStatus="status" var="nome">
        #{status.index} -
        <h:outputLabel value="#{nome}" style="color:#{status.index mod 2 == 0 ? 'red' : 'green'}"/><br/>
    </ui:repeat>
    <br/>
    <br/>
    <h:commandButton value="Fazer Mágica!" onclick="fazMagica('Hadukkeeen')"/><br/><br/>
    <h:commandButton value="Alert Nome" onclick="fazMagica('#{estudanteRegistrarBean.estudante.nome}')"/><br/>

    <br/>
    <br/>

    <h:form id="form">
        <h:commandButton value="Exibir Notas">
            <f:ajax listener="#{estudanteRegistrarBean.exibirNotas()}" render="notasGrid"/>
        </h:commandButton>
        <h:commandButton value="Esconder Notas">
            <f:ajax listener="#{estudanteRegistrarBean.esconderNotas()}" render="notasGrid"/>
        </h:commandButton>
        <br/>
        <h:panelGrid id="notasGrid">
            <h:outputText value="#{estudanteRegistrarBean.estudante.nome}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.sobrenome}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.turno}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.nota1}"
                          rendered="#{estudanteRegistrarBean.mostrarNotas}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.nota2}"
                          rendered="#{estudanteRegistrarBean.mostrarNotas}"/>
            <h:outputText value="#{estudanteRegistrarBean.estudante.nota3}"
                          rendered="#{estudanteRegistrarBean.mostrarNotas}"/>
        </h:panelGrid>

    </h:form>
    <br/>
    <br/>
    <h:form>
        <h:commandButton value="Exibir Link">
            <f:ajax listener="#{estudanteRegistrarBean.exibirLink()}" render="pgLink"/>
        </h:commandButton>
        <h:commandButton value="Esconder Link">
            <f:ajax listener="#{estudanteRegistrarBean.esconderLink}" render="pgLink"/>
        </h:commandButton>
        <h:panelGrid id="pgLink">
            <ui:fragment id="fragmentLink" rendered="#{estudanteRegistrarBean.mostrarLink}">
                <a href="http://josemalcher.net" target="_black">www.josemalcher.net</a>
            </ui:fragment>
        </h:panelGrid>
    </h:form>

    <br/>
            <!-- LAMBDAS 3.0 EL-->
    #{(soma -> soma + num)(10)}
    <br/>
    #{((v1,v2,v3)->v1*v2*v3)(1,5,10)}
    <br/>
    #{(x -> x*x*x)(2)}
    <br/>
    #{cubo=( x -> x*x*x); cubo(10)}
    <br/>
    <br/>


    <c:set var="numerosList" value="#{[1,2,3,4,5,6,7,8,9,10]}"/>

    <!--Lists-->
    <b><h:outputLabel value=" ----- LIST ----- "/></b><br/>
    <ui:repeat value="#{['DevDojo','e','foda']}" var="fodeza">
        #{fodeza}
    </ui:repeat>
    <br/>
    <!--Set-->
    <b><h:outputLabel value=" ----- SET ----- "/></b><br/>
    <ui:repeat value="#{{'DevDojo','É','Foda','Foda'}}" var="fodeza">
        #{fodeza}
    </ui:repeat>
    <br/>


    <!--Map-->
    <b><h:outputLabel value=" ----- MAP ----- "/></b><br/>
    <ui:repeat value="#{{'Melhor Lugar':'Devdojo','Melhor curso': 'Maratonas'}}" var="fodezaMap">
        <ui:repeat value="#{fodezaMap}" var="entry">
            #{entry.key} - #{entry.value}
        </ui:repeat>
    </ui:repeat>
    <br/>

    <ui:repeat value="#{numerosList.stream().filter(v-> v>5)
    .toList()}" var="result">
        #{result}
    </ui:repeat>
    <br/>
    #{numerosList.stream().average().get()}
    <br/>
    #{numerosList.stream().sum()}
    <br/>
    #{numerosList.stream().filter(v-> v>5).sum()}

</h:body>
<script type="text/javascript">
    function fazMagica(magica) {
        alert(magica);
    }

    function alertNome(nome) {
        alert(nome);
    }
</script>


</html>

```

```java
package com.maratonajsf.bean.estudante;

import com.maratonajsf.model.Estudante;

import javax.el.LambdaExpression;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.*;

import static java.util.Arrays.asList;

//@ManagedBean vai ser depreciado em breve!
//@Named("OutroNomeDeumBean")
@Named
@ViewScoped
public class EstudanteRegistrarBean implements Serializable {
    private Estudante estudante = new Estudante();

    /*Coleções*/
    private String[] nomesArray = {"DevDojo", "é ", "Muito Foda!"};
    private List<String> nomesList = asList("José", "Junior", "Ronaldo");
    private Set<String> nomesSet = new HashSet<>(asList("José Malcher", "Roberto Junior", "Ronaldo Vieira"));
    private Map<String, String> nomesMap = new HashMap<>();

    private boolean mostrarNotas;
    private boolean mostrarLink;

    {
        nomesMap.put("Opt1", "Opção 01");
        nomesMap.put("Opt2", "Opção 02");
        nomesMap.put("Opt3", "Opção 03");

        //recaptulando - imprimit MAP
       /* for(Map.Entry<String,String> entry : nomesMap.entrySet()){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }*/
    }

    public void calculaCubo(LambdaExpression le, long value){
        long result = (long) le.invoke(FacesContext.getCurrentInstance().getELContext(), value);
        System.out.println(result);
    }

    public void exibirNotas() {
        this.mostrarNotas = true;
    }

    public void esconderNotas() {
        this.mostrarNotas = false;
    }

    public void exibirLink(){
        this.mostrarLink = true;
    }

    public void esconderLink(){
        this.mostrarLink = false;
    }

    public void executar() {
        System.out.println("Fazendo uma busca ");
        System.out.println("Processando ");
        System.out.println("Exibindo os dados ");
    }

    public void executar(String param) {
        System.out.println("Fazendo uma busca com parametros " + param);
        System.out.println("Processando " + param);
        System.out.println("Exibindo os dados " + param);
    }

    public String executarRetorno(String nome) {
        return "ALUNO: " + nome;
    }

    public String irParaIndex2() {
        return "index2?faces-redirect=true";
    }

    public boolean isMostrarLink() {
        return mostrarLink;
    }

    public void setMostrarLink(boolean mostrarLink) {
        this.mostrarLink = mostrarLink;
    }

    public boolean isMostrarNotas() {
        return mostrarNotas;
    }

    public void setMostrarNotas(boolean mostrarNotas) {
        this.mostrarNotas = mostrarNotas;
    }

    public Map<String, String> getNomesMap() {
        return nomesMap;
    }

    public void setNomesMap(Map<String, String> nomesMap) {
        this.nomesMap = nomesMap;
    }

    public Set<String> getNomesSet() {
        return nomesSet;
    }

    public void setNomesSet(Set<String> nomesSet) {
        this.nomesSet = nomesSet;
    }

    public List<String> getNomesList() {
        return nomesList;
    }

    public void setNomesList(List<String> nomesList) {
        this.nomesList = nomesList;
    }

    public String[] getNomesArray() {
        return nomesArray;
    }

    public void setNomesArray(String[] nomesArray) {
        this.nomesArray = nomesArray;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }
}

```

[Voltar ao Índice](#indice)

---

## <a name="parte13">Aula 12 Escopos pt 01, RequestScoped</a>

![Escopos](https://github.com/josemalcher/devdojo-maratona-jsf/blob/master/readme-img/escopos.png?raw=true)

```java
package com.maratonajsf.bean.request;


import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@RequestScoped
public class TesteRequestBean implements Serializable {

    private List<String> personagens = asList("Personagem 1","Personagem 2", "Persona 3");
    private List<String> personagemSelecionado = new ArrayList<>();

    public void selecionarPersonagem(){
        int index =ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }
}

```

```xhtml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
<h:head>

</h:head>
<h:body>
    <h:form>
        <h:outputText value="#{testeRequestBean.personagemSelecionado}"/><br/>

        <h:commandButton value="Selecionar Personagem" actionListener="#{testeRequestBean.selecionarPersonagem()}"/>
        <h:commandButton value="Selecionar Personagem Forward" actionListener="#{testeRequestBean.selecionarPersonagem()}" action="index2"/>
        <h:commandButton value="Selecionar Personagem Redirect" actionListener="#{testeRequestBean.selecionarPersonagem()}" action="index2?faces-redirect=true"/>

    </h:form>
</h:body>

</html>

```

```xhtml
<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://xmlns.jcp.org/jsf/html"
      xmlns:ui="http://xmlns.jcp.org/jsf/facelets"
      xmlns:f="http://xmlns.jcp.org/jsf/core">
<h:head>

</h:head>
<f:view>
    <h:outputLabel value="INDEX 2!"/>
</f:view>
<h:outputText value="#{testeRequestBean.personagemSelecionado}"></h:outputText>
</html>

```

![redirect](https://github.com/josemalcher/devdojo-maratona-jsf/blob/master/readme-img/Java%20Servlet%20HTTP%20Redirect.jpeg?raw=true)

![forwarding](https://github.com/josemalcher/devdojo-maratona-jsf/blob/master/readme-img/Java%20Servlet%20HTTP%20Forward.jpeg?raw=true)

[Voltar ao Índice](#indice)

---

## <a name="parte14">Aula 13  Escopos pt 02, SessionScoped</a>


[Voltar ao Índice](#indice)

---

## <a name="parte15">Aula 14 Escopos pt 03, ViewScoped</a>


[Voltar ao Índice](#indice)

---

## <a name="parte16">Aula 15 Escopos pt 04, ApplicationScoped</a>


[Voltar ao Índice](#indice)

---

## <a name="parte17">Aula 16 Escopos pt 05, ConversationScoped</a>


[Voltar ao Índice](#indice)

---

## <a name="parte18">Aula 17 Escopos pt 06, FlowScoped pt 01, Introdução e funcionamento</a>


[Voltar ao Índice](#indice)

---

## <a name="parte19">Aula 18 Escopos pt 07, FlowScoped pt 02, Configuração do flowxml</a>


[Voltar ao Índice](#indice)

---

## <a name="parte20">Aula 19 Escopos pt 08, FlowScoped pt 03, Nested FlowScoped (FlowScope Aninhado)</a>


[Voltar ao Índice](#indice)

---

## <a name="parte21">Aula 20 Escopos pt 09, FlowScoped pt 04, FlowBuilder, Flows com anotações</a>


[Voltar ao Índice](#indice)

---

## <a name="parte22">Aula 21 Escopos pt 10, Dependent</a>


[Voltar ao Índice](#indice)

---

## <a name="parte23">Aula 22 Escopos pt 11, Injeção de Beans</a>


[Voltar ao Índice](#indice)

---

## <a name="parte24">Aula 23 Escopos pt 12, Filtro e login com SessionScoped</a>


[Voltar ao Índice](#indice)

---

## <a name="parte25">Aula 24 Comunicação pt 01, parâmetros com f param</a>


[Voltar ao Índice](#indice)

---

## <a name="parte26">Aula 25 Comunicação pt 02, parâmetros com viewParam pt 01</a>


[Voltar ao Índice](#indice)

---

## <a name="parte27">Aula 26 Comunicação pt 03, parâmetros com viewParam pt 02</a>


[Voltar ao Índice](#indice)

---

## <a name="parte28">Aula 27 Comunicação pt 04, parâmetros com viewParam pt 03</a>


[Voltar ao Índice](#indice)

---

## <a name="parte29">Aula 28 Comunicação pt 05, Adicionando atributos aos componentes com fattribute</a>


[Voltar ao Índice](#indice)

---

## <a name="parte30">Aula 29 Comunicação pt 06, Executando os métodos set com setPropertyActionListener</a>


[Voltar ao Índice](#indice)

---

## <a name="parte31">Aula 30 Comunicação pt 07, Passando atributos entre beans com FlashScope</a>


[Voltar ao Índice](#indice)

---

## <a name="parte32">Aula 31 Comunicação pt 08, Cookies</a>


[Voltar ao Índice](#indice)

---

## <a name="parte33">Aula 32 Comunicação pt 09, InputSecret e chamada de métodos com argumentos</a>


[Voltar ao Índice](#indice)

---

## <a name="parte34">Aula 33 Comunicação pt 10, Adicionando objetos na sessão dinamicamente</a>


[Voltar ao Índice](#indice)

---

## <a name="parte35">Aula 34 Ciclo de vida do JSF pt 01, Fases do ciclo de vida</a>


[Voltar ao Índice](#indice)

---

## <a name="parte36">Aula 35 Ciclo de vida do JSF pt 02, Exemplo do immediate=true</a>


[Voltar ao Índice](#indice)

---

## <a name="parte37">Aula 36 Internacionalização com Resource Bundles</a>


[Voltar ao Índice](#indice)

---

## <a name="parte38">Aula 37 Validação customizada com Validators</a>


[Voltar ao Índice](#indice)

---

## <a name="parte39">Aula 38 Conversão customizada com Converters</a>


[Voltar ao Índice](#indice)

---

## <a name="parte40">Aula 39  Validando igualdade dos valores dos componentes</a>


[Voltar ao Índice](#indice)

---

## <a name="parte41">Aula 40 Datatables pt 01</a>


[Voltar ao Índice](#indice)

---

## <a name="parte42">Aula 41 Datatables pt 02, Ordenando dados</a>


[Voltar ao Índice](#indice)

---

## <a name="parte43">Aula 42 Datatables pt 03, Editando e removendo dados</a>


[Voltar ao Índice](#indice)

---

## <a name="parte44">Aula 43 Ajax pt 01, Introdução, execute e render</a>


[Voltar ao Índice](#indice)

---

## <a name="parte45">Aula 44 Ajax pt 02, @form @none @this @all</a>


[Voltar ao Índice](#indice)

---

## <a name="parte46">Aula 45 Ajax pt 03, Atributo listener</a>


[Voltar ao Índice](#indice)

---

## <a name="parte47">Aula 46 Ajax pt 04, eventos</a>


[Voltar ao Índice](#indice)

---

## <a name="parte48">Aula 47 Ajax pt 05, Agrupando componentes</a>


[Voltar ao Índice](#indice)

---

## <a name="parte49">Aula 48 Ajax pt 06, Postback</a>


[Voltar ao Índice](#indice)

---

## <a name="parte50">Aula 49 Ajax pt 07, Colocando requisições Ajax em fila</a>


[Voltar ao Índice](#indice)

---

## <a name="parte51">Aula 50 JSF e HTML5 pt 01 Passthrough atributos</a>


[Voltar ao Índice](#indice)

---

## <a name="parte52">Aula 51 JSF e HTML5 pt 02 Passthrough elementos</a>


[Voltar ao Índice](#indice)

---

## <a name="parte53">Aula 52 JSF e HTML5 pt 03 Bean Validation</a>


[Voltar ao Índice](#indice)

---

## <a name="parte54">Aula 53 Upload de Arquivos pt 01</a>


[Voltar ao Índice](#indice)

---

## <a name="parte55">Aula 54 Upload de Arquivos pt 02   Validações básicas</a>


[Voltar ao Índice](#indice)

---

## <a name="parte56">Aula 55 Gerenciamento de estados das views</a>


[Voltar ao Índice](#indice)

---

## <a name="parte57">Aula 56 Views lógicas e físicas</a>


[Voltar ao Índice](#indice)

---

## <a name="parte58">Aula 57 Tratando ViewExpiredException</a>


[Voltar ao Índice](#indice)

---

## <a name="parte59">Aula 58 Gerenciando recursos estáticos CSS, JS e Imagens</a>


[Voltar ao Índice](#indice)

---

## <a name="parte60">Aula 59 Adicionando comportamento JS a componentes</a>


[Voltar ao Índice](#indice)

---

## <a name="parte61">Aula 60 Custom facelets taglib functions</a>


[Voltar ao Índice](#indice)

---

## <a name="parte62">Aula 61 Criando templates com Facelets</a>


[Voltar ao Índice](#indice)

---

## <a name="parte63"></a>


[Voltar ao Índice](#indice)

---
