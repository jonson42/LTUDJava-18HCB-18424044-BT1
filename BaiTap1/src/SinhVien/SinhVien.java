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
import java.util.List;
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
        System.out.println("Nhap MSSV:");
        try {
            sv.MSSV=ob.readLine();
            System.out.println("Nhap HoTen:");
            sv.HoTen = ob.readLine();
            System.out.println("Nhap GioiTinh:");
            sv.GioiTinh = ob.readLine();
            System.out.println("Nhap CMND:");
            sv.CMND = ob.readLine();
        } catch (IOException ex) {
            Logger.getLogger(SinhVien.class.getName()).log(Level.SEVERE, null, ex);
        }
       return sv;
    }
    public void SuaDiemSinhVien(String mSSV,List<BangDiemModel> listBD,String diemGK,String diemCK,String diemKhac,String diemTong){
        for(BangDiemModel itemBangDiem:listBD){
            for(DiemDetails itemDetails:itemBangDiem.diemDetail){
                if(itemDetails.MSSV.equals(mSSV)){
                  itemDetails.ÐiemCK=diemCK;
                  itemDetails.ÐiemGK=diemGK;
                  itemDetails.ÐiemKhac=diemKhac;
                  itemDetails.ÐiemTong=diemTong;
                }
            }
        }
    }
    public DiemDetails GetDiemSinhVien(String mSSV,BangDiemModel bangDiem){
        DiemDetails diemDetails = new DiemDetails();
        for(DiemDetails diem:bangDiem.diemDetail){
            if(diem.MSSV.equals(mSSV)){
                diemDetails = diem;
                break;
            }
        }
        return diemDetails;
    }
    public void XemDiemSinhVien(String mSSV,BangDiemModel bangDiem){
        DiemDetails diem=GetDiemSinhVien(mSSV,bangDiem);
        System.out.println(diem.HoTen+" "+diem.MSSV+" "+diem.ÐiemGK+" "+diem.ÐiemCK+" "+diem.ÐiemKhac+" "+diem.ÐiemTong);
    }
}
