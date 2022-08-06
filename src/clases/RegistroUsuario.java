package clases;

import static clases.login.privilegio;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class RegistroUsuario extends login{
 
    public void registrarUsuario(String Cedula, String Usuario, String Nombre, String Pass){
        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_inventario", "root", "");
            PreparedStatement pst = cn.prepareStatement("insert into ejemplo values(?,?,?,?,?,?)");
            pst.setString(1, "0");
            pst.setString(2, privilegio.trim());
            pst.setString(3, Cedula);   
            pst.setString(4, Usuario);  
            pst.setString(5, Nombre);
            pst.setString(6, Pass);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Registro Exitoso!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Upps, hay un error en el servidor", "Alerta!", JOptionPane.ERROR_MESSAGE);
        }
    }
}