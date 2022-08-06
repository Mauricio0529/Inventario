package conectar_bd;

import clases.Entrada;
import clases.Salida;
import java.sql.Connection;
import java.sql.DriverManager;  
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
//import com.mysql.jdbc.Connection;

/**28
 *
 * @author Home 
 */
public class Conexion_consulta {
    static Connection conect = null;
    static Statement sentencia;
    public static ResultSet resultado;  
    
    public Connection conexion(){ 
        try {
            Class.forName("com.mysql.jdbc.Driver");  // 192.168.1.7
            conect = DriverManager.getConnection("jdbc:mysql://localhost/bd_inventario", "root", "");
            sentencia = conect.createStatement(); // SENTENCIA
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el servidor "+e);
        }
        return conect;
    }
    
 /*   public static void guardar(Entrada x){ 
        String q = "insert into entrada values('"+x.getReferencia()+"','"+x.getCategoria()+"','"+x.getProveedor()+"','"+x.getProducto()+
                                         "','"+x.getCantidad()+"','"+x.getFecha()+"','"+x.getPrecio_unidad()+"','"+x.getTotal()+"');";
        
        //String g = "INSERT INTO datos VALUES('"+x.getNombre()+"','"+x.getApellido()+"');";
        try {
            sentencia.executeUpdate(q);
        } catch (Exception e) {
        }
    }*/
    
    public static Entrada buscar_reg(String Nombre){
        Entrada r = null;
        String q = "SELECT * FROM entrada" + " WHERE encategoria='"+Nombre+"'";
        try {
            resultado = sentencia.executeQuery(q);
        } catch (Exception e) {
            System.out.println("NO CORRECTO");
        }
        r = asignar();
        return r;
    } 
    
    public static Entrada asignar(){
        Entrada r = null;
     //   String catego; // categoria
        String product; // producto
        try {
            if(resultado.first()){
        //        catego= resultado.getString("encategoria");
                product= resultado.getString("enproducto");
                r = new Entrada ("", product);
            }
        } catch (Exception e) {
        }
        return r;   
    }
    
    
    
    public static Salida buscarProducto(String referencia){
        Salida s = null;
        String sql = "Select * From salida" + " WHERE referencia_salida = '"+referencia+"'";
        try {
            resultado = sentencia.executeQuery(sql);
        } catch (Exception e) {
            System.out.println("Error busqueda");
        }
        s = asignarProducto();
        return s;
    }
    
     public static Salida asignarProducto(){
        Salida s = null;
     //   String catego; // categoria
        String nombre; // producto
        try {
            if(resultado.first()){
                nombre = resultado.getString("saproducto");
                s = new Salida ("", nombre);
            }
        } catch (Exception e) {
        }
        return s;   
    }
    
    
    
}