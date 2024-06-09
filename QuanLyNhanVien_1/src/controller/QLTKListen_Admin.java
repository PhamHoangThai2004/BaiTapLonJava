package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import model.TaiKhoan;
import view.QLTK_Admin;

public class QLTKListen_Admin implements ActionListener{
    private QLTK_Admin view;
    private String status;

    public QLTKListen_Admin(QLTK_Admin view) {
        this.view = view;
        this.status = "";
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
//        JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào " + s);
        if(s.equals("Tạo")) {
            this.view.setEnable(true);
            this.status = s;
        }
        else if(s.equals("Lưu")) {
            String tenTK = this.view.textField_UserName.getText();
            String matKhau = this.view.textField_Pasword.getText();
            String quyen = this.view.comboBox_Authority.getSelectedItem()+"";
//            PhongBan quyen = this.view.dsPhongBan.TimPBBySTT(sttQuyen);
            
            
            if(this.status.equals("Tạo")){       
                Date ngayTao = new Date();
                TaiKhoan  TK = new TaiKhoan(tenTK, matKhau, quyen  , ngayTao);
                boolean b = this.view.themTK(TK);
                if(!b) JOptionPane.showMessageDialog(view, 
                        "Tài khoản đã tồn tại", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(this.status.equals("Chi Tiết")){
                Date ngayTao = new Date(this.view.textField_CreateDay.getText());
                TaiKhoan  TK = new TaiKhoan(tenTK, matKhau, quyen, ngayTao);
                this.view.capNhatTK(TK);
                this.status = "";               
            }
        }
        else if(s.equals("Hủy Bỏ")) {
            this.view.xoaForm();
            this.view.setEnable(false);
        }
        else if(s.equals("Xóa")) {
            this.view.xoaTK();
        }
        else if(s.equals("Chi Tiết")) {
            this.view.hienThiChiTiet();
            this.status = s;
        }
        else if(s.equals("Tìm Kiếm")) {
            this.view.timkiemTK();
        }
        else if(s.equals("Hủy")) {
            this.view.huyTimKiem();
        }
    }
    
}
