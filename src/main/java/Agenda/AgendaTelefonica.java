/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gabriela
 */
public class AgendaTelefonica implements AgendaInterface{
    
    private Map<String, Contato> contatos = new HashMap();

    @Override
    public Contato buscarContatoNome(String nome) {
        
        for(String s : contatos.keySet()) {
            if(contatos.get(s).getNome().equalsIgnoreCase(nome)) {
                return contatos.get(s);
            }
        }
        
        return null;
    }
    
    @Override
    public Contato buscarContatoTelefone(String telefone) {
        for (String s : contatos.keySet()){
            if(contatos.get(s).getTelefone().equals(telefone)){
                return contatos.get(s);
    }
       }
        return null;
           }
    
    @Override
    public void addContato(Contato contato) {
       contatos.put(contato.getNome(), contato);
    }

    @Override
     public void removerContato(Contato contato) throws ContatoInexistenteException {
        boolean removido = false;
        
        for(String s : contatos.keySet()) {
            if(contato.getNome().equals(contatos.get(s).getNome()) || contato.getTelefone().equals(contatos.get(s).getTelefone())) {
                contatos.remove(s);
                removido = true;
            }
        }
        
        if(removido == false) {
            throw new ContatoInexistenteException();
        }
    }

    @Override
    public Map<String, Contato> getContato() {
       return contatos;
    }
    
}
