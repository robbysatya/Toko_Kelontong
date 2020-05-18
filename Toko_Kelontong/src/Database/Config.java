/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Database;

/**
 *
 * @author robby
 */

import java.sql.Connection;
import java.sql.Driver;
import java.sql.SQLException;


public class Config {
    private static Connection MysqlConfig;
    public static Connection configDB() throws SQLException{
        try{
            String url = "";
            String user = "root";
            String pass = "";
    }catch(SQLException e){
        System.out.println("Koneksi ke database Gagal " + e.getMessage());
    }
}
