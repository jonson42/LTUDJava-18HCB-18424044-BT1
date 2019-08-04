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
import Query.Query;
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
        SinhVien sv = new SinhVien();
        BangDiemModel bangDiem =new BangDiemModel();
        List<LopModel> listLop=new ArrayList<LopModel>();
        List<TKBModel> listTKB=new ArrayList<TKBModel>();
        List<BangDiemModel> listBangDiem= new ArrayList<BangDiemModel>();
        Query query = new Query();
        ImportData data = new ImportData();
        LopModel lop=new LopModel();
        String s; 
        BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
        boolean giaoVu=false;
        String user="";
        String pass="";
        boolean sinhVien =false;
        while(true){
            //Cau 11 : Dang nhap
        System.out.println("Vui long nhap user:");
        user = ob.readLine(); 
        System.out.println("Vui long nhap password:");
        pass = ob.readLine();
        if(user.equals("1842001")&&pass.equals("1842001")){
            //Cau 10: sinh vien chi duoc xem diem cua minh
            while(true){
                boolean giaoVuSession=true;
                
                sv.XemDiemSinhVien("1742005", bangDiem);
               System.out.println("1.Logout!");
                s = ob.readLine();
                if(s=="1"){
                    break;
                }
            }
            
        }else if(user.equals("giaovu")&&pass.equals("giaovu")){
            while(true){
               boolean giaoVuSession=true;
               System.out.println("1.Import danh sach lop");
               System.out.println("2.Them 1 sinh vien");
               System.out.println("3.Import thoi khoa bieu.");
               System.out.println("4.Import danh sach lop theo mon.");
               System.out.println("5.Xem danh sach lop.");
               System.out.println("6.Xem thoi khoa bieu.");
               System.out.println("7.Import bang diem.");
               System.out.println("8.Xem bang diem.");
               System.out.println("9.Sua diem 1 sinh vien.");
               System.out.println("10.Logout");
               s = ob.readLine();
               switch(s){
                   case "1":
                       //Cau 1 : import danh sach lop
                        System.out.println("Nhap duong dan chua danh sach lop");
                        s = ob.readLine();
                        lop = data.ImportSinhVien(s);
                        listLop.add(lop);
                       break;
                   case "2":
                       //Cau 2 : them 1 sinh vien
                        SinhVienModel svModel=sv.NhapSinhVien();
                        List<SinhVienModel> listSV = lop.SinhVien;
                        listSV.add(svModel);
                        lop.SinhVien=listSV;
                       break;
                   case "3":
                       //Cau 3 : import thoi khoa bieu
                        System.out.println("Nhap đuong dan chua Thoi khoa bieu");
                        s = ob.readLine();
                        TKBModel tkb =data.ImportThoiKhoaBieu(s);
                        listTKB.add(tkb);
                       break;
                   case "4":
                       //Cau 4: Import danh sach lop theo mon
                       System.out.println("Nhap duong dan chua danh sach lop");
                        s = ob.readLine();
                        lop = data.ImportSinhVien(s);
                        listLop.add(lop);
                       break;
                   case "5":
                       // Cau 5: Xem danh sach lop:
                        
                        System.out.println("Nhap ma lop can xem :");
                         s = ob.readLine();
                        query.XemDanhSachLop(s,listLop);
                       break;
                   case "6":
                       //cau 6: Xem thoi khoa bieu:
                        System.out.println("Nhap lop muon xem thoi khoa bieu");
                        s = ob.readLine();
                        query.XemThoiKhoaBieu(s, listTKB);
                       break;
                   case "7":
                       //Cau 7: Import bang diem
                        System.out.println("Nhap đuong dan chua bang diem");
                         s = ob.readLine();
                        bangDiem=data.ImportBangDiem(s);
                        listBangDiem.add(bangDiem);
                       break;
                   case "8":
                        //Cau 8 : Xem bang diem 
                        System.out.println("Nhap ten lop can xem bang diem");
                         s = ob.readLine();
                        query.XemBangDiem(s,listBangDiem );
                       break;
                   case "9":
                       //cau 9 : Sua diem 1 sinh vien 
            //-------------------
                        System.out.println("Nhap ma so sinh vien");
                         String mSSV = ob.readLine();
                        System.out.println("Nhap diem giua ky");
                         String diemGK = ob.readLine();
                         System.out.println("Nhap diem cuoi ky");
                         String diemCK = ob.readLine();
                         System.out.println("Nhap diem khac");
                         String diemKhac = ob.readLine();
                         System.out.println("Nhap diem tong");
                         String diemTong = ob.readLine();
                         sv.SuaDiemSinhVien(mSSV,listBangDiem,diemGK,diemCK,diemKhac,diemTong);
                       break;    
                   case "10":
                       giaoVuSession=false;
                       break;
               }
               if(!giaoVuSession){
                   break;
               }
            }            
        }else{
            System.out.println("Tai khoan va mat khau khong dung .");
        }
        }
        
    }
    
}
