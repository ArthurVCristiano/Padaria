package daos;

import Padaria.entity.Cliente;
import connection.Conexao;
import interfaces.ICrud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author andre
 */
public class ClienteDao implements ICrud<Cliente> {

    @Override
    public Cliente salvar(Cliente obj) {
        Connection con = null;
        try{
              con = Conexao.getConnection();
             
             String sql = "insert into clientes(nome,cpf,telefone,pontos)values(?,?,?,?)";
             
             PreparedStatement smt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             smt.setString(1,obj.getNome());
             smt.setString(2,obj.getCpf());
             smt.setString(3,obj.getTelefone());
             smt.setDouble(4,obj.getTotPontosAcumulados());
             
             smt.execute();
             
             try(ResultSet rs = smt.getGeneratedKeys()){
                 if(rs.next()){
                     int idGerado = rs.getInt(1);
                     obj.setId(idGerado);
                 }
             }
            }
              catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        finally{
        Conexao.fecharConexao();
    }
        return obj;
        }

    @Override
    public Cliente update(Cliente obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Cliente> consultar() {
        List<Cliente> clientes = new ArrayList<>();
       Connection con = null;
      
       try{
        con = Conexao.getConnection();
        PreparedStatement smt = con.prepareStatement("select * from clientes");
        
        ResultSet rs = smt.executeQuery();
        
        
        while(rs.next()){
            Cliente prod = new Cliente(rs.getInt("id_cliente"),rs.getString("nome"),rs.getString("cpf"),rs.getString("telefone"),rs.getDouble("pontos"));
            clientes.add(prod);
        }
       }catch(SQLException ex){
           throw new RuntimeException(ex.getMessage());
       }
       finally{
           Conexao.fecharConexao();
       }
       return clientes;
    }

    @Override
    public void delete(Cliente t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente consultarPeloId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    } 
}
