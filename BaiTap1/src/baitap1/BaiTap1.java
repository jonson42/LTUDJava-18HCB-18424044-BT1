/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap1;
import Model.*;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.lang.String;
import Import.ImportData;
/**
 *
 * @author Vip
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        String s; 
	BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhập đường dẫn chứa danh sách lớp");
        s = ob.readLine();  
	System.out.println("You entered String "+s);
        ImportData data = new ImportData();
        LopModel lop = data.ImportSinhVien(s);
    }
    
}
