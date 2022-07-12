package Agenda;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Map;

public class Contato {
    
    private int id;
    private static int geradorId;
    protected String nome;
    protected String telefone;


    public Contato() {
        this.id = gerarId();
    }
    
    public static int gerarId(){
        return ++geradorId;
    }  

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Contato{" + "id=" + id + ", nome=" + nome + ", telefone=" + telefone + '}';
    }
}
