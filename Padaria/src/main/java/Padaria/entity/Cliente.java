/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Padaria.entity;



public class Cliente extends Pessoa {
    private String cpf;
    private String telefone;
    private double totPontosAcumulados;

    public Cliente(int id, String nome, String cpf, String telefone, double totPontosAcumulados) {
        super(id,nome);
        this.cpf = cpf;
        this.telefone = telefone;
        this.totPontosAcumulados = totPontosAcumulados;
    }

    public Cliente() {
        
    }

     @Override
    public Pessoa edit(int id) {
       Pessoa pessoa = new Cliente();
       return pessoa;
    }
    
    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getTotPontosAcumulados() {
        return totPontosAcumulados;
    }

   
    
    
}
