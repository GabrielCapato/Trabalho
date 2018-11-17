package br.com.grupointegrado.dao;

import static br.com.grupointegrado.dao.Conexao.getConexaoMySQL;
import br.com.grupointegrado.model.Anuncio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AnuncioDao extends Conexao{

    private PreparedStatement ps;
    private ResultSet rs;
    
      
    Connection c = getConexaoMySQL();
    
    public void inserir(Anuncio obj){
        try {
            
        String sql ="INSERT INTO VeiculoAPS.anuncio(ID_anuncio,titulo_anuncio,anoFabricacao,anoModelo,KM,valor,combustivel,categoria,descr,CaminhoIMG)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?)";
        
        ps = getConexaoMySQL().prepareStatement(sql);
        
            ps.setInt       (1  ,        obj.getId());
            ps.setString    (2  ,        obj.getTituloAnuncio());
            ps.setDate      (3  , (Date) obj.getAnoFabric());
            ps.setDate      (4  , (Date) obj.getAnoModelo());
            ps.setDouble    (5  ,        obj.getKM());
            ps.setDouble    (6  ,        obj.getValor());
            ps.setString    (7  ,        obj.getTipoCombustivel());
            ps.setString    (8  ,        obj.getCategoria());
            ps.setString    (9  ,        obj.getDescricao());
            ps.setString    (10 ,        obj.getCaminho());
        
        ps.execute();
        ps.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        
    }
    
    public Anuncio getAnuncio(Integer ID){
        try {
          String sql = "SELECT * FROM VeiculoAPS.anuncio WHERE ID_anuncio = ?";  
          
          ps = getConexaoMySQL().prepareStatement(sql);
          ps.setInt(1,ID);
          
          ps.execute();
          
          if(rs.next()){
              return new Anuncio(rs.getInt      ("ID_anuncio")      ,
                                 rs.getString   ("titulo_anuncio")  ,
                                 rs.getDate     ("anoFabricacao")   ,
                                 rs.getDate     ("anoModelo")       ,
                                 rs.getDouble   ("KM")              ,
                                 rs.getDouble   ("valor")           ,
                                 rs.getString   ("combustivel")     ,
                                 rs.getString   ("categoria")       ,
                                 rs.getString   ("descr")           ,
                                 rs.getString   ("CaminhoIMG")      
                                );
          }  
            
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;     
    }
    
    public List<Anuncio> getAllAnuncio(Integer ID){
        try {
          String sql = "SELECT * FROM VeiculoAPS.anuncio";  
          
          ps = getConexaoMySQL().prepareStatement(sql);
          
          ps.execute();
          
          List<Anuncio> Lista = new ArrayList<>();
          
          while(rs.next()){
          Anuncio obj = new Anuncio();
          
           rs.getInt      ("ID_anuncio")      ;
           rs.getString   ("titulo_anuncio")  ;
           rs.getDate     ("anoFabricacao")   ;
           rs.getDate     ("anoModelo")       ;
           rs.getDouble   ("KM")              ;
           rs.getDouble   ("valor")           ;
           rs.getString   ("combustivel")     ;
           rs.getString   ("categoria")       ;
           rs.getString   ("descr")           ;
           rs.getString   ("CaminhoIMG")      ;
           
           Lista.add(obj);
                                
          }  
          
         return Lista;   
            
        } catch (SQLException ex){
            ex.printStackTrace();
        }
        return null;     
    }
}