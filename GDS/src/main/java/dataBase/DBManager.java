package dataBase;

import java.io.IOException;
import java.sql.*;
import java.nio.file.*;

public class DBManager {
    public DBManager(){
        
    }
    public static final String URL = "jdbc:sqlite:data/stock.db";
    
    public static final String modele = "modele.sql";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(URL);
    }
    
    public static void initialiser(){
       try { String sql = Files.readString(Path.of(modele));
        String[] instructions = sql.split(";");
        try(Connection conn = getConnection();
             Statement stm = conn.createStatement()){
            for(String instruction : instructions){
              String trimmed = instruction.trim();
              if(trimmed.isEmpty()){
                  stm.execute(trimmed);
              }
                System.out.println("Base initialiser avec succes");  
            }
        }
       }catch(IOException e){
           System.out.println("Fichier schema.sql introuvable : " + e.getMessage());
       } catch(SQLException e){
           System.out.println("Erreur SQL : " + e.getMessage());
       } 
    } 
}
