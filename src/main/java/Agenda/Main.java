/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Agenda;

/**
 *
 * @author Gabriela
 */
public class Main {
    public static void main (String [] args){
        Contato c1 = new Contato();
        c1.setNome("A");
        c1.setTelefone("322323423523");
        
        Contato c2 = new Contato();
        c2.setNome("B");
        c2.setTelefone("23423523523");
        
        Contato c3 = new Contato();
        c3.setNome("C");
        c3.setTelefone("235252525353");
        
        AgendaInterface a1 = new AgendaTelefonica();
        
        a1.addContato(c2);
        a1.addContato(c1);
        
        System.out.println(a1.buscarContatoNome("A"));
        System.out.println(a1.buscarContatoTelefone("322323423523"));
        
        System.out.println(a1.buscarContatoNome("B"));
        System.out.println(a1.buscarContatoTelefone("23423523523"));
        try{
            a1.removerContato(c2);
            a1.removerContato(c1);
        }
        catch (ContatoInexistenteException ex){
            System.out.println(ex.getMessage());          
        }
        
        for(String s : a1.getContato().keySet()) {
            System.out.println(a1.getContato().get(s));
        }
        
        a1.addContato(c2);
        
        for(String s : a1.getContato().keySet()) {
            System.out.println(a1.getContato().get(s));
        }      
    }
}
