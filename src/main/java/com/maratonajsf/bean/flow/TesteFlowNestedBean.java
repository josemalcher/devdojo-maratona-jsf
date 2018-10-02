package com.maratonajsf.bean.flow;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.flow.FlowScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@FlowScoped(value = "pendencies")
public class TesteFlowNestedBean implements Serializable {
    private String userName;
    private String userSurname;

    public String validarUser(){
        System.out.println("Fazendo consulta no SPC");
        System.out.println("Fazendo consulta no SERASA");
        System.out.println("Fazendo consulta no DEUS");
        System.out.println("Fazendo consulta ETC...");

        if(true){
            FacesContext context = FacesContext.getCurrentInstance();
            context.addMessage(null,new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Usuário não pssou nas pendencias", "Outros Detalhes com administrador!" ));
            return null;
        }

        return "proceedToRegistration3";
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}
