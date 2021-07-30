package view;

//import library yang diperlukan
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//membuat koneksi ke database
public class Koneksi {

    //atribut
    private static Connection mysql;

    //method untuk membuat koneksi
    public static Connection configDB() throws SQLException {
        try {

            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver()); //inisialisasi driver
            mysql=DriverManager.getConnection("jdbc:mysql://localhost:3306/tubesgui", "root", ""); //driver melakukan koneksi ke database
            System.out.println("Koneksi sukses");
        } catch (SQLException e) {
            System.out.println("Koneksi gagal " + e.getMessage());
        }

        return mysql;
    }
    
//    public static void main(String[] args) {
//        try {
//            configDB();
//        } catch (Exception e) {
//        }
//    }
}
