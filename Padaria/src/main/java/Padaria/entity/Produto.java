/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Padaria.entity;

import java.util.*;

public class Produto {
    
    private int id;
    private String nome;
    private double preco;
    private String tipo;
    private int quantidadeEstoque;
    
    public Produto(int id, String nome, double preco, String tipo, int quantidadeEstoque){
        this.id = id; this.nome = nome; this.preco = preco; this.tipo = tipo; this.quantidadeEstoque = quantidadeEstoque;        
    }
    
    public Produto(){
        
    }
    
    public Produto editPrdouto(int id){
        Produto produto = new Produto();
        return produto;
    }

    public void removeProduto(int id){
     //remvoe produto
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }
}
