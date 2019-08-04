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
import SinhVien.SinhVien;
/**
 *
 * @author Vip
 */
public class BaiTap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        boolean giaoVu=false;
        String user="";
        String pass="";
        boolean sinhVien =false;
        System.out.println("Vui lòng nhập user:");
        user = ob.readLine(); 
        System.out.println("Vui lòng nhập password:");
        pass = ob.readLine();
        if(user.equals("1842001")&&pass.equals("1842001")){
            
        }else if(user.equals("giaovu")&&pass.equals("giaovu")){
            
        }else{
            System.out.println("Tài khoản và mật khẩu không đúng .");
        }
        String s; 
        System.out.println("Nhập đường dẫn chứa danh sách lớp");
        ImportData data = new ImportData();
        LopModel lop = data.ImportSinhVien(s);
        System.out.println("Nhập đường dẫn chứa bảng điểm");
        s = ob.readLine();
        BangDiemModel bangDiem=data.ImportBangDiem(s);
        SinhVien sv = new SinhVien();
        SinhVienModel svModel=sv.NhapSinhVien();
        List<SinhVienModel> listSV = lop.SinhVien;
        listSV.add(svModel);
        lop.SinhVien=listSV;
        sv.XemDiemSinhVien("mSSV", bangDiem);
        
    }
    
}
