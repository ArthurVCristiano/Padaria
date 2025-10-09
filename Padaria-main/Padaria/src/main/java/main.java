
import entity.Cliente;
import entity.Pessoa;
import connection.Conexao;
import java.sql.SQLException;

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
