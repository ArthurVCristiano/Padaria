
import Padaria.entity.Cliente;
import Padaria.entity.Pessoa;
import connection.Conexao;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author andre
 */

public class main {
    public static void main(String[] args) throws SQLException {
    Pessoa pessoa = new Pessoa() {
        @Override
        public Pessoa edit(int id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
    Pessoa pessoa2  = new Pessoa() {
        @Override
        public Pessoa edit(int id) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    };
        System.out.println(pessoa.getId());
        System.out.println(pessoa2.getId());

    }
    
}
