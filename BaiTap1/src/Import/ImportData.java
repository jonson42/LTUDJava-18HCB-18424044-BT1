/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Import;

import Model.BangDiemModel;
import Model.*;
import Model.LopModel;
import Model.SinhVienModel;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vip
 */
public class ImportData {
    
    public LopModel ImportSinhVien(String s) throws IOException{
        LopModel lop = new LopModel();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(s));
        
         String thisLine;
         List<SinhVienModel> listSinhVien=new ArrayList<SinhVienModel>();
         while ((thisLine = br.readLine()) != null) {
            String[] firstValue = thisLine.split(",");
            if(firstValue.length==1){
                lop.Name=thisLine.split(",")[0].trim();
            }else if(firstValue[1].trim()!="MSSV"){
              SinhVienModel sv = new SinhVienModel();
              sv.STT=thisLine.split(",")[0].trim();
              sv.MSSV=thisLine.split(",")[1].trim();
              sv.HoTen=thisLine.split(",")[2].trim();
              sv.GioiTinh=thisLine.split(",")[3].trim();
              sv.CMND=thisLine.split(",")[4].trim();
              listSinhVien.add(sv);
            }
         }     
         lop.SinhVien=listSinhVien;
         } catch (FileNotFoundException ex) {

        }
        return lop;
    }
    
    public BangDiemModel ImportBangDiem(String s) throws IOException{
        BangDiemModel bangDiem = new BangDiemModel();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(s));
        
         String thisLine;
         List<DiemDetails> listDiem=new ArrayList<DiemDetails>();
         while ((thisLine = br.readLine()) != null) {
            String[] firstValue = thisLine.split(",");
            if(firstValue.length==1){
                bangDiem.tenLop=thisLine.split(",")[0].trim();
            }else if(firstValue[1].trim()!="MSSV"){
              DiemDetails diem = new DiemDetails();
              diem.STT=thisLine.split(",")[0].trim();
              diem.MSSV=thisLine.split(",")[1].trim();
              diem.HoTen=thisLine.split(",")[2].trim();
              diem.ÐiemGK=thisLine.split(",")[3].trim();
              diem.ÐiemCK=thisLine.split(",")[4].trim();
              diem.ÐiemKhac=thisLine.split(",")[5].trim();
              diem.ÐiemTong=thisLine.split(",")[6].trim();
              listDiem.add(diem);
            }
         }     
         bangDiem.diemDetail=listDiem;
         } catch (FileNotFoundException ex) {

        }
        return bangDiem;
    }
    
    public TKBModel ImportThoiKhoaBieu(String s) throws IOException{
        TKBModel tkb = new TKBModel();
        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(s));
        
         String thisLine;
         List<TKBDetails> listTKBDetails=new ArrayList<TKBDetails>();
         while ((thisLine = br.readLine()) != null) {
            String[] firstValue = thisLine.split(",");
            if(firstValue.length==1){
                tkb.Lop=thisLine.split(",")[0].trim();
            }else if(thisLine.split(",")[0].trim()!="STT"){
              TKBDetails tkbDetails = new TKBDetails();
              tkbDetails.STT=thisLine.split(",")[0].trim();
              tkbDetails.MaMon=thisLine.split(",")[1].trim();
              tkbDetails.TenMon=thisLine.split(",")[2].trim();
              tkbDetails.PhongHoc=thisLine.split(",")[3].trim();
              listTKBDetails.add(tkbDetails);
            }
         }     
         tkb.Details=listTKBDetails;
         } catch (FileNotFoundException ex) {

        }
        return tkb;
    }
    
}
