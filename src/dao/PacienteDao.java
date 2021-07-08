/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Paciente;
import persistencia.Conexao;

/**
 *
 * @author user
 */
public class PacienteDao {
    public void cadastrarPaciente(Paciente p) throws SQLException{
        Connection con = Conexao.getConexao();
        
        Statement stat  = con.createStatement();
        
        try{
          String sql;
          sql="insert into paciente(cod_paciente,nome,inicio_isolamento,medicacao,cod_usuario,febre,tosse_seca,dor_de_cabeca,cansaco,dif_respirar,sem_sintomas)" 
                  +"values(null,'"+p.getNome()+"','"+p.getInicioIsolamento()+"','"+p.getMedicacao()+"',"+p.getCod_usuario()+","+p.getFebre()+","+p.getTosse()+","
                  +p.getDorDeCabeca()+","+p.getCansaco()+","+p.getDifRespirar()+","+p.getSemSintomas()+")";
                 
                  
                  stat.execute(sql);
          
        }
        catch(SQLException e){
            throw new SQLException("Erro ao inserir Paciente"+e.getMessage());
        }finally{
            //Serve para fechar as conexões
            stat.close();
            con.close();
        }
}
    
    public ResultSet buscarResponsavel() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        String sql = "SELECT * from usuario ORDER BY nome";
        
        try{
           return stat.executeQuery(sql);
        }
        catch (SQLException e){
            throw new SQLException("Erro ao inserir Usuário"+e.getMessage());
        }
    }
    
    public ArrayList <Paciente> buscar() throws SQLException{
        Connection con = Conexao.getConexao();
        
        Statement stat = con.createStatement();
        
        try{
          String sql;
          sql = "select * from paciente";
          ResultSet rs = stat.executeQuery(sql);
          ArrayList <Paciente> paciente = new ArrayList<>();
          
          while (rs.next()){
              Paciente p = new Paciente();
              p.setCod_paciente(rs.getInt("cod_paciente"));
              p.setNome(rs.getString("nome"));
              p.setInicioIsolamento(rs.getString("inicio_isolamento"));
              p.setCansaco(rs.getInt("cansaco"));
              p.setDifRespirar(rs.getInt("dif_respirar"));
              p.setDorDeCabeca(rs.getInt("dif_respirar"));
              p.setDorDeCabeca(rs.getInt("dor_de_cabeca"));
              p.setFebre(rs.getInt("febre"));
              p.setTosse(rs.getInt("tosse"));
              p.setSemSintomas(rs.getInt("sem_sintomas"));
              p.setMedicacao(rs.getString("medicacao"));
          }
          
          return paciente;
        }
        catch (SQLException e){
            throw new SQLException("Erro ao realizar busca"+e.getMessage());
        }
        finally{
          stat.close();
          con.close();  
        }
        
    }
    
    public ResultSet buscarPaciente() throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        String sql = "SELECT * from paciente ORDER BY nome";
        
        try{
           return stat.executeQuery(sql);
        }
        catch (SQLException e){
            throw new SQLException("Erro ao buscar paciente"+e.getMessage());
        }
        
    }
    
    public ArrayList <Paciente> fltrar (String query) throws SQLException{
        
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try{
           String sql;
           sql = "select * from paciente"+query;
           ResultSet rs = stat.executeQuery(sql);
           ArrayList <Paciente> paciente = new ArrayList<>();
           
           while (rs.next()){
              Paciente p = new Paciente();
              p.setCod_paciente(rs.getInt("cod_paciente"));
              p.setNome(rs.getString("nome"));
              p.setInicioIsolamento(rs.getString("inicio_isolamento"));
              p.setCansaco(rs.getInt("cansaco"));
              p.setDifRespirar(rs.getInt("dif_respirar"));
              p.setDorDeCabeca(rs.getInt("dif_respirar"));
              p.setDorDeCabeca(rs.getInt("dor_de_cabeca"));
              p.setFebre(rs.getInt("febre"));
              p.setTosse(rs.getInt("tosse"));
              p.setSemSintomas(rs.getInt("sem_sintomas"));
              p.setMedicacao(rs.getString("medicacao"));
              
              paciente.add(p);
          }
           
           return paciente;
        }
        catch (SQLException e){
            throw new SQLException("Erro ao pesquisar paciente"+e.getMessage());
        }
        finally{
          stat.close();
          con.close();  
        }
    }
    
    public void deletarPaciente(int codPaciente) throws SQLException{
       Connection con = Conexao.getConexao();
       Statement stat = con.createStatement();
       try{
           String sql;
           sql="delete from paciente where cod_paciente= "+codPaciente;
           stat.execute(sql);
       } catch (SQLException e){
            throw new SQLException("Erro ao excluir dados no banco"+e.getMessage());
       }finally{
           stat.close();
           con.close();
       }
   }
   
    public void alterarDadosPaciente (Paciente p) throws SQLException{
        Connection con = Conexao.getConexao();
        Statement stat = con.createStatement();
        
        try{
            String sql;
            sql = "update paciente set febre= "+p.getFebre()+",tosse_seca= "+p.getTosse()+",dor_de_cabeca= "+p.getDorDeCabeca()+",cansaco= "+p.getCansaco()+",dif_respirar= "+p.getDifRespirar()+",sem_sintomas= "+p.getSemSintomas()+",medicacao= '"+p.getMedicacao()+"' where cod_paciente= "+p.getCod_paciente();
            stat.execute(sql);
 
        } catch (SQLException e){
            throw new SQLException("Erro ao alterar dados "+e.getMessage());
        }
    }
   
}
