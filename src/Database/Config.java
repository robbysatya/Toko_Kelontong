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

import java.sql.*;


public class Config {
    private static Connection koneksi;
    public static Connection getKoneksi(){
        if (koneksi == null){
          try {
            String url = "jdbc:mysql://localhost:3306/toko_kelontong_jaya"; // nama databasenya login
            String user="root"; // username mysql root
            String pass=""; //passwordnya kosong

            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url , user, pass);

            }catch(SQLException t){
                    System.out.print("Gagal melakukan koneksi ke database");
                }
            }

            return koneksi;
        }
    } 
