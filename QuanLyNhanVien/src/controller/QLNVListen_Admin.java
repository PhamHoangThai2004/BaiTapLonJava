package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import model.NhanVien;
import model.PhongBan;
import model.Tinh;
import view.QLNV_Admin;

public class QLNVListen_Admin implements ActionListener{
    private final QLNV_Admin view;
    private String status;

    public QLNVListen_Admin(QLNV_Admin view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
        
        switch (s) {
            case "Thêm":
                this.view.setEnable(true);
                this.status = s;
                break;
            case "Lưu":
                int maNV = Integer.parseInt(this.view.textField_MNV.getText());
                String tenNV = this.view.textField_Name.getText();
                Date ngaySinh = new Date(this.view.textField_DoB.getText());
                String chucVu = this.view.comboBox_Position.getSelectedItem()+"";
                boolean gioiTinh = true;
                if(this.view.radioButton_Male.isSelected())         gioiTinh = true;
                else if(this.view.radioButton_Female.isSelected())  gioiTinh = false;
                int queQuan = this.view.comboBox_Address.getSelectedIndex();
                Tinh tinh = Tinh.getTinhByID(queQuan);
                Date ngayVaoLam = new Date(this.view.textField_StartDay.getText());
                double luongCB = Double.parseDouble(this.view.textField_BasicSalary.getText());
                int sttPB = this.view.comboBox_Department.getSelectedIndex();
                PhongBan phongBan = this.view.dsPhongBan.TimPBBySTT(sttPB);
                NhanVien NV = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, tinh, phongBan, chucVu, ngayVaoLam, luongCB);
                if(this.status.equals("Thêm")){
                    boolean b = this.view.themNV(NV);
                    if(!b) JOptionPane.showMessageDialog(view,
                            "Mã nhân viên đã tồn tại", "Eror", JOptionPane.ERROR_MESSAGE);
                }
                else if(this.status.equals("Chi Tiết")){
                    boolean b = this.view.capNhatNV(NV);
                    if(!b) JOptionPane.showMessageDialog(view,
                            "Mã nhân viên đã tồn tại", "Eror", JOptionPane.ERROR_MESSAGE);
                    else   this.status = "";
                }   break;
            case "Hủy Bỏ":
                this.view.xoaForm();
                this.view.setEnable(false);
                break;
            case "Xóa":
                this.view.xoaNV();
                break;
            case "Chi Tiết":
                this.view.hienThiChiTiet();
                this.status = s;
                break;
            case "Tìm Kiếm":
                this.view.timKiemNV();
                break;
            case "Hủy":
                this.view.huyTimKiem();
                break;
            case "OK":
                this.view.DisplayNV(this.view.model.getDsNV());
                break;
            default:
                break;
        }
        
    }
    
}
