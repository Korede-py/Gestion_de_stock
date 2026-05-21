package controller;
import model.Personne;
import dataBase.DBManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.mindrot.jbcrypt.BCrypt;


public class PersonneController {
    public PersonneController(){
        
    }
    public boolean  seConnecter(String email, String Mdp, int nMat){
       String sql = "SELECT * Personne WHERE email = ? OR id = ?";
        try (Connection conn = DBManager.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setString(1,email);
            pstm.setInt(2,nMat);
            try(ResultSet rs = pstm.executeQuery()){
                Personne p = new Personne();
                if(rs.next())
                    if(BCrypt.checkpw(Mdp,rs.getString("motDePasse"))){
                    p.setNom(rs.getString("nom"));
                    p.setPrenom(rs.getString("prenom"));
                    p.setNumMatricule(rs.getInt("id"));
                    p.setRole(rs.getString("role").charAt(0));
                    return true;
                }
                else
                     System.out.println("L'email ou le numero matricule n'existe pas");
            }
            
        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
            return false;
        }     
        return false;
    }
    
    public boolean sInscrire(int numMatricule, String nom, String prenom, int age, String mail, String motDePass, char role){
        Personne p = new Personne(numMatricule, nom,  prenom, age, mail, motDePass, role); 
        String sql = "INSERT INTO * Personne VALUE(?,?,?,?,?,?,?) ";
        try (Connection conn = DBManager.getConnection();
            PreparedStatement pstm = conn.prepareStatement(sql)){
            pstm.setInt(1,p.getNumMatricule());
            pstm.setString(2, p.getNom());
            pstm.setString(3, p.getPrenom());
            pstm.setInt(4,p.getAge());
            pstm.setString(5, p.getMail());
            String hash = BCrypt.hashpw(p.getMotDePass(),BCrypt.gensalt());
            pstm.setString(6, hash);
            pstm.setString(2, p.getRole() +"");
            int nbrinsere = pstm.executeUpdate();
            if(nbrinsere == 7){
                return true;
            }
            
          }catch(SQLException e){
            System.out.println("");
            return false;
    }
        return false;
   }
}