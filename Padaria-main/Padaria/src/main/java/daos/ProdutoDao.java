package daos;

import connection.Conexao;
import entity.Produto;
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
 * @author Professor
 */
public class ProdutoDao implements ICrud<Produto> {

    @Override
    public Produto salvar(Produto obj) {
        Connection conexao = null;
        try{
            conexao = Conexao.getConnection();
            String sql = "insert into produtos (nome,preco,tipo,quantidade) values(?,?,?,?)";
            
             PreparedStatement smt = conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
             
             smt.setString(1,obj.getNome());
             smt.setDouble(2,obj.getPreco());
             smt.setString(3,obj.getTipo());
             smt.setInt(4,obj.getQuantidadeEstoque());
             
             smt.execute();
             
             try(ResultSet rs = smt.getGeneratedKeys()){
                 if(rs.next()){
                     int idGerado = rs.getInt(1);
                     obj.setId(idGerado);
                 }
             }
            
            
        } catch (SQLException ex) {
            System.getLogger(ProdutoDao.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return obj;
    }

    @Override
    public Produto update(Produto obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Produto> consultar() {
        List<Produto> produtos = new ArrayList<>();
       Connection con = null;
      
       try{
        con = Conexao.getConnection();
        PreparedStatement smt = con.prepareStatement("select * from produtos");
        
        ResultSet rs = smt.executeQuery();
        
        
        while(rs.next()){
            Produto prod = new Produto(rs.getInt("id_produto"),rs.getString("nome"),rs.getDouble("preco"),rs.getString("tipo"),rs.getInt("quantidade"));
            produtos.add(prod);
        }
       }catch(SQLException ex){
           throw new RuntimeException(ex.getMessage());
       }
       finally{
           Conexao.fecharConexao();
       }
       return produtos;
    }

    @Override
    public void delete(Produto t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(int id) {
         Connection con = null;
       
       try{
        con = Conexao.getConnection();
        PreparedStatement smt = con.prepareStatement("delete from produtos where id_produto = " + id);
        
        ResultSet rs = smt.executeQuery();
        
        rs.next();

       }catch(SQLException ex){
           throw new RuntimeException(ex.getMessage());
       }
       finally{
           Conexao.fecharConexao();
       }
    }

    @Override
    public Produto consultarPeloId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
