package prueba_lunes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class App {
  public static void main(String[] args) {

    Connection conn = null;

    try {
      conn =
         DriverManager.getConnection("jdbc:mysql://localhost:8889/consulta_medica?user=usuario1&password=123456");
  
      // Do something with the Connection

      Statement stmt = null;
      ResultSet rs = null;
      
      try {
          stmt = conn.createStatement();
          rs = stmt.executeQuery("SELECT D.nombre FROM Doctor D");
      
          // or alternatively, if you don't know ahead of time that
          // the query will be a SELECT...
      
          /*if (stmt.execute("SELECT D.nombre FROM Doctor D")) {
              rs = stmt.getResultSet();
          }*/
      
          // Now do something with the ResultSet ....
          while(rs.next()){
            System.out.println(rs.getString(1));
          }
      }
      catch (SQLException ex){
          // handle any errors
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("VendorError: " + ex.getErrorCode());
      }
      finally {
          // it is a good idea to release
          // resources in a finally{} block
          // in reverse-order of their creation
          // if they are no-longer needed
      
          if (rs != null) {
              try {
                  rs.close();
              } catch (SQLException sqlEx) { } // ignore
      
              rs = null;
          }
      
          if (stmt != null) {
              try {
                  stmt.close();
              } catch (SQLException sqlEx) { } // ignore
      
              stmt = null;
          }
      }
  
  } catch (SQLException ex) {
      // handle any errors

      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("VendorError: " + ex.getErrorCode());
  }



 
  }
}
