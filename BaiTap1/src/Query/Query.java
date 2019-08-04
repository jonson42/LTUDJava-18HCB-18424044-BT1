/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

import Model.BangDiemModel;
import Model.DiemDetails;
import Model.LopModel;
import Model.SinhVienModel;
import Model.TKBDetails;
import Model.TKBModel;
import SinhVien.SinhVien;
import java.util.List;

/**
 *
 * @author longdnh
 */
public class Query {
    
    public void XemDanhSachLop(String nameLop,List<LopModel> list){
        LopModel lop = GetDanhSachLop(nameLop,list);
        System.out.println(lop.Name);
        for(SinhVienModel sv:lop.SinhVien){
            System.out.println(sv.CMND+" "+sv.GioiTinh+" "+sv.HoTen+" "+sv.MSSV+" "+sv.STT);
        }
    }
    public LopModel GetDanhSachLop(String nameLop,List<LopModel> list){
        LopModel lop = new LopModel();
        for(LopModel lopModel:list){
            if(lopModel.Name.equals(nameLop)){
                lop = lopModel;
                break;
            }
        }
        return lop;
    }
    public void XemThoiKhoaBieu(String nameLop,List<TKBModel> list){
        TKBModel tkb = GetThoiKhoaBieu(nameLop,list);
        System.out.println(tkb.Lop);
        for(TKBDetails tkbItem:tkb.Details){
            System.out.println(tkbItem.MaMon+" "+tkbItem.PhongHoc+" "+tkbItem.STT+" "+tkbItem.TenMon);
        }
    }
    public TKBModel GetThoiKhoaBieu(String nameLop,List<TKBModel> list){
        TKBModel tkb = new TKBModel();
        for(TKBModel tkbModel: list){
            if(tkbModel.Lop.equals(nameLop)){
                tkb=tkbModel;
                break;
            }
        }
        return tkb;
    }
    public void XemBangDiem(String tenLop,List<BangDiemModel> list){
        BangDiemModel bangDiem= GetBangDiem(tenLop,list);
        System.out.println(bangDiem.tenLop);
        for(DiemDetails diemItem:bangDiem.diemDetail){
            System.out.println(diemItem.HoTen+" "+diemItem.MSSV+" "+diemItem.STT+" "+diemItem.ÐiemCK+" "+diemItem.ÐiemGK+" "+diemItem.ÐiemKhac+" "+diemItem.ÐiemTong+" ");
        }
    }
    public BangDiemModel GetBangDiem(String tenLop,List<BangDiemModel> list){
        BangDiemModel bangDiem = new BangDiemModel();
        for(BangDiemModel bangDiemItem:list){
            if(bangDiemItem.tenLop.equals(tenLop)){
                bangDiem=bangDiemItem;
                break;
            }
        }
        return bangDiem;
    }
}
