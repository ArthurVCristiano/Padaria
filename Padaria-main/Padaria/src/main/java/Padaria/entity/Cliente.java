package Padaria.entity;

import jakarta.persistence.Entity;

@Entity
public class Cliente extends Pessoa {
    private String cpf;
    private String telefone;
    private double totPontosAcumulados;

 
    public Cliente(int id, String nome, String cpf, String telefone, double totPontosAcumulados ) {
        super(id, nome);
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

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setTotPontosAcumulados(double totPontosAcumulados) {
        this.totPontosAcumulados = totPontosAcumulados;
    }

    public String getTelefone() {
        return telefone;
    }

    public double getTotPontosAcumulados() {
        return totPontosAcumulados;
    }
}
