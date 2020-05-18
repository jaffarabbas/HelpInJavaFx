package sample;

import javafx.scene.control.TextArea;

import java.sql.*;

public class dataconnection {
    private Connection con;
    private Statement sc;
    private ResultSet res;

    public dataconnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javacon?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","");
            sc = con.createStatement();
            System.out.println("Database Connection Succesfull");
        }
        catch (Exception e){
            System.out.println("Error : "+e);
        }
    }
    public String  showdata() throws Exception{
        String a,b,c;
        try {
            String query = "select * from conect";
            res = sc.executeQuery(query);
            System.out.println("Record from database");
            while(res.next()){
                String id = res.getString("id");
                String name = res.getString("Name");
                String password = res.getString("Password");
                a = id;
                b = name;
                c =password;
                return "Id : "+a+"\nName : "+b+"\nPassword : "+c;
            }
        }
        catch (Exception e){
            System.out.println("Error : "+e);
        }
        return null;
    }
//    public static void main(String[] args) {
////
//    }
}
