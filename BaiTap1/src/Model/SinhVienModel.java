/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Vip
 */
public class SinhVienModel {
    public String STT;
    public String MSSV;
    public String HoTen;
    public String GioiTinh;
    public String CMND;
    public void SinhVienModel(String STT,String MSSV,String HoTen,String GioiTinh,String CMND){
        this.STT=STT;
        this.MSSV=MSSV;
        this.HoTen=HoTen;
        this.GioiTinh = GioiTinh;
        this.CMND=CMND;
    }  
}
