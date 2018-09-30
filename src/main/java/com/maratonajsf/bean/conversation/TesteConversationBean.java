package com.maratonajsf.bean.conversation;

import javax.enterprise.context.Conversation;
import javax.enterprise.context.ConversationScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import static java.util.Arrays.asList;

@Named
@ConversationScoped
public class TesteConversationBean implements Serializable {

    private List<String> personagens;
    private List<String> personagemSelecionado = new ArrayList<>();

    @Inject
    private Conversation conversation;

    //@PostConstruct
    public void init(){
        System.out.println(" ---->>> Entrou no PostConstruct do SessionScoped <<<---- ");
        personagens = asList("GOKU", "Kuririn", "Vegeta");

        if(conversation.isTransient()){
            // Long Running
            conversation.begin();
            System.out.println("Iniciando conversation scoped ID: "+ conversation.getId() );
        }
    }

    public String endConversation(){
        if(!conversation.isTransient()){
            conversation.end();
            System.out.println("Finalizando conversation");
        }
        return "conversartion?faces-redirect=true";
    }

    public void selecionarPersonagem() {
        int index = ThreadLocalRandom.current().nextInt(3);
        String personagem = personagens.get(index);
        personagemSelecionado.add(personagem);
    }

    public List<String> getPersonagemSelecionado() {
        return personagemSelecionado;
    }

    public void setPersonagemSelecionado(List<String> personagemSelecionado) {
        this.personagemSelecionado = personagemSelecionado;
    }

    public Conversation getConversation() {
        return conversation;
    }

    public void setConversation(Conversation conversation) {
        this.conversation = conversation;
    }
}
