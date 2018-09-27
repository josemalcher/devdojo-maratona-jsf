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
