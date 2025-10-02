/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Padaria.entity;

import jakarta.persistence.*;
import static jakarta.persistence.DiscriminatorType.INTEGER;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public abstract class  Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    private String nome;
    private ArrayList<Pessoa> pessoas;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.pessoas = new ArrayList<Pessoa>();
    }
    
     public Pessoa() {
       
    }
    public abstract Pessoa edit(int id);
    
    public  void remove(int id){
        
    }
    
    public void addPessoa(Pessoa pessoa){
        this.pessoas.add(pessoa);
    }
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
    
    
}
