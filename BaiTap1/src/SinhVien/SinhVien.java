/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinhVien;
import Model.BangDiemModel;
import Model.DiemDetails;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import Model.SinhVienModel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Vip
 */
public class SinhVien {
    public SinhVienModel NhapSinhVien(){
        SinhVienModel sv=new SinhVienModel();
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Nhập MSSV:");
        try {
            sv.MSSV=ob.readLine();
            System.out.println("Nhập HoTen:");
            sv.HoTen = ob.readLine();
            System.out.println("Nhập GioiTinh:");
            sv.GioiTinh = ob.readLine();
            System.out.println("Nhập CMND:");
            sv.CMND = ob.readLine();
        } catch (IOException ex) {
            Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
       return sv;
    }
    public DiemDetails XemDiemSinhVien(String mSSV,BangDiemModel bangDiem){
        DiemDetails diemDetails = new DiemDetails();
        for(DiemDetails diem:bangDiem.diemDetail){
            if(diem.MSSV==mSSV){
                diemDetails = diem;
                break;
            }
        }
        return diemDetails;
    }
}
