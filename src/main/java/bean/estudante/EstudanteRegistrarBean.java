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
