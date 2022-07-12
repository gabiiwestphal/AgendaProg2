package Agenda;

import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Gabriela
 */
public interface AgendaInterface {
    
    public Contato buscarContatoNome(String nome);
    public Contato buscarContatoTelefone(String telefone);
    public void addContato(Contato contato);
    public void removerContato (Contato contato)throws ContatoInexistenteException;
    public Map<String, Contato> getContato();
    
}
