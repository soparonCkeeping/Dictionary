/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydictionary;
import java.io.BufferedReader;
import java.util.Scanner;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author TCC
 */
public class DictionaryManagement extends Dictionary{
//        static String eng;
//        static String spelling;
//        static String meaning;
    
//    public void takeDataWord(String w){
//
//        FileReader frd = null;
//        BufferedReader bufR = null;
//        
//        try{
//            frd = new FileReader(new File(w));
//            bufR = new BufferedReader(frd);
//            String line;
//            int i = 0;
//            
//            while((line = bufR.readLine()) != null){
//                String[] parts = line.split(";");
//                
//                eng = parts[0];
//                spelling = parts[1];
//                meaning = parts[2];
//                
//                System.out.println(eng + spelling + meaning);
//                Mydictionary dm = new Mydictionary(eng, spelling, meaning);
//                Dictionary.dat.add(dm);
//                i++;
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            try {
//                if (bufR != null) {
//                    bufR.close();
//                }
//            }catch (Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
    
    private static final String USERNAME = "root";
    private static final String PASSWORD = "huybohung";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/entries?";
    
    public void takeDataToArr () {
       Connection conn = null;
       try{
            conn = DriverManager.getConnection(CONN_STRING,USERNAME, PASSWORD);
            System.out.println("connected");
            Statement co = (Statement) conn.createStatement();
            String sql = "select * from entries";
            int count = 0;        
            ResultSet rs = co.executeQuery(sql);
            while (rs.next()) {
                String word = rs.getString("word");
                String definition = rs.getString("definition");
                String wordtype = rs.getString("wordtype");
                Mydictionary md  = new Mydictionary(word, wordtype, definition);
                dat.add(md);
                count++;
            }
            System.out.println(count);
            conn.close();
        } catch(SQLException e){
            System.err.println(e);
        }
    }
    
}
