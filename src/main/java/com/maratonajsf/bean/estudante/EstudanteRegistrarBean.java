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
