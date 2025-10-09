package entity;

import java.time.LocalDate;
import java.util.*;
public class Venda {
    
    private int id;
    private LocalDate data;
    private ArrayList<Venda> vendas;
    
    public Venda(int id, LocalDate data){
        this.id = id;
        this.data = data;
        this.vendas = new ArrayList<Venda>();
    }
    
    public void registrarVenda(int id, LocalDate data){
        Venda venda = new Venda(id,data);
        this.vendas.add(venda);
    }
    
    public void atualizarEstoque(int qtd){
        
    }
    
    public void acumulaPontos(Cliente cliente){
        // é int, void para n dar erro
    }
}
