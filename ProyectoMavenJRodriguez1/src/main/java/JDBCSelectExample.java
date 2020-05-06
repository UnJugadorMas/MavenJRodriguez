import java.sql.*;

public class JDBCSelectExample
{
  public static void main(String[] args) {

    try {
      // Creamos conexión
      String myDriver = "com.mysql.cj.jdbc.Driver";
      String myUrl = "jdbc:mysql://localhost:3306/ejercicio26";
      Class.forName(myDriver);
      Connection conn = DriverManager.getConnection(myUrl,"root","");

      String query = "SELECT * FROM clientes";

      // Creamos java statement
      Statement st = conn.createStatement();

      // Ejecutamos query y obtenemos resultset
      ResultSet rs = st.executeQuery(query);

      // Iterar por los resultados obtenidos
      while (rs.next()) {
        int id = rs.getInt("id_cliente");
        String nombre = rs.getString("nombre");

        // Imprimir datos
        System.out.println(id+"  "+nombre);

      }
      }catch(Exception e) {e.printStackTrace();}
    }
}