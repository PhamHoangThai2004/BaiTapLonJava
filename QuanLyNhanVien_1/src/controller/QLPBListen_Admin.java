package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import model.PhongBan;
import view.QLPB_Admin;

public class QLPBListen_Admin implements ActionListener{
    private QLPB_Admin view;
    private String status;

    public QLPBListen_Admin(QLPB_Admin view) {
        this.view = view;
        this.status = "";
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
//        JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào " + s);
        
        if(s.equals("Thêm")) {
            this.view.setEnable(true);
            this.status = s;
        }
        else if(s.equals("Lưu")) {
            String maBP = this.view.textField_MPB.getText();
            String tenBP = this.view.textField_Name.getText();
            Date ngayThanhLap = new Date(this.view.textField_Found.getText());
            
            PhongBan PB = new PhongBan(maBP, tenBP, ngayThanhLap);
            if(this.status.equals("Thêm")){                
                boolean b = this.view.themPB(PB);
                if(!b) JOptionPane.showMessageDialog(view, 
                        "Mã phòng ban đã tồn tại", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else if(this.status.equals("Chi Tiết")){
                boolean b = this.view.capNhatPB(PB);
                if(!b) JOptionPane.showMessageDialog(view, 
                        "Mã phòng ban đã tồn tại", "Error", JOptionPane.ERROR_MESSAGE);
                else   this.status = "";
            }
        }
        else if(s.equals("Hủy Bỏ")) {
            this.view.xoaForm();
            this.view.setEnable(false);
        }
        else if(s.equals("Xóa")) {
            this.view.xoaPB();
        }
        else if(s.equals("Chi Tiết")) {
            this.view.hienThiChiTiet();
            this.status = s;
        }
        else if(s.equals("Tìm Kiếm")) {
            this.view.timKiemPB();
        }
        else if(s.equals("Hủy")) {
            this.view.huyTimKiem();
        }
    }
    
}
