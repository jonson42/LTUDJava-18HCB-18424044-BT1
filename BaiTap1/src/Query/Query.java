/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Query;

import Model.BangDiemModel;
import Model.LopModel;
import Model.TKBDetails;
import Model.TKBModel;
import java.util.List;

/**
 *
 * @author longdnh
 */
public class Query {
    
    public LopModel XemDanhSachLop(String nameLop,List<LopModel> list){
        LopModel lop = new LopModel();
        for(LopModel lopModel:list){
            if(lop.Name.equals(nameLop)){
                lop = lopModel;
                break;
            }
        }
        return lop;
    }
    public TKBModel XemThoiKhoaBieu(String nameLop,List<TKBModel> list){
        TKBModel tkb = new TKBModel();
        for(TKBModel tkbModel: list){
            if(tkbModel.Lop.equals(nameLop)){
                tkb=tkbModel;
                break;
            }
        }
        return tkb;
    }
    public BangDiemModel XemBangDiem(String tenLop,List<BangDiemModel> list){
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
