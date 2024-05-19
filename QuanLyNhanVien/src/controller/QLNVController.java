/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import view.QLNVView;
import model.*;

public class QLNVController implements ActionListener{
    private final QLNVView view;
    private String luaChon;
    private boolean tmpStatus;

    public QLNVController(QLNVView view) {
        this.view = view;
        this.luaChon = "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
//        JOptionPane.showMessageDialog(view, "Bạn vừa nhấn vào " + s);
        if(s.equals("New File")) {
            this.view.createFiles();
        }
        else if(s.equals("Open File")) {
            this.view.openFile();
        }
        else if(s.equals("Save")) {
            this.view.saveFile();
        }
        else if(s.equals("Close")) {
            this.view.closeFile();
        }
        else if(s.equals("Exit")) {
            this.view.THOAT();
        }
        else if(s.equals("Search Staff By ID")) {
            String maNV = JOptionPane.showInputDialog(view,
                    "Nhập mã nhân viên cần tìm:",
                    "Search By ID",
                    JOptionPane.PLAIN_MESSAGE);
            
            if (!maNV.equals("")) {
                
                this.view.timNVByID(Integer.parseInt(maNV));
            }
        }
        else if(s.equals("Search Staff By Name")) {
            String tenNV = JOptionPane.showInputDialog(view,
                    "Nhập tên nhân viên cần tìm:",
                    "Search By Name",
                    JOptionPane.PLAIN_MESSAGE);
            
            if (!tenNV.equals("")) {
                this.view.timNVByName(tenNV);
            }
        }
        else if(s.equals("Search Staff By Division")) {
            String maBP = JOptionPane.showInputDialog(view,
                    "Nhập mã bộ phận cần tìm:",
                    "Search By Division",
                    JOptionPane.PLAIN_MESSAGE);
            
            if (!maBP.equals("")) {
                this.view.timNVByDivision(maBP);
            }
        }
        else if(s.equals("Search Department By ID")) {
            String maPB = JOptionPane.showInputDialog(view,
                    "Nhập mã phòng ban cần tìm:",
                    "Search By ID",
                    JOptionPane.PLAIN_MESSAGE);
            
            if (!maPB.equals("")) {
                this.view.timPBByID(maPB);
            }
        }
        else if(s.equals("Search Department By Name")) {
            String tenPB = JOptionPane.showInputDialog(view,
                    "Nhập tên phòng ban cần tìm:",
                    "Search By Name",
                    JOptionPane.PLAIN_MESSAGE);
            
            if (!tenPB.equals("")) {
                this.view.timPBByName(tenPB);
            }
        }
        else if(s.equals("Show Saff")) {
            this. view.DisplayNV(this.view.model.getDsNV());
            this.view.menuItem_ShowSaff.setEnabled(false);
            this.view.menuItem_ShowDepartment.setEnabled(true);
        }
        else if(s.equals("Show Department")) {
            this. view.DisplayPB(this.view.dsPhongBan.getDsPB());           
            this.view.menuItem_ShowSaff.setEnabled(true);
            this.view.menuItem_ShowDepartment.setEnabled(false);
        }
        else if(s.equals("Help")) {
            this.view.showHelp();
        }
        else if(s.equals("Thêm phòng ban")) {
            this.luaChon = s;
            this.view.xoaForm(1);
            this.view.setEnable(false, true);
        }
        else if(s.equals("Thêm nhân viên")) {
            this.luaChon = s;
            this.view.xoaForm(-1);
            this.view.setEnable(true, false);
        }
        else if(s.equals("Lưu")) {
            try {
                if(this.luaChon.equals("Thêm nhân viên")) {
                    int maNV = Integer.parseInt(this.view.textField_MNV.getText());
                    String tenNV = this.view.textField_Name.getText();
                    Date ngaySinh = new Date(this.view.textField_Dob.getText());
                    int sttPB = this.view.comboBox_MPB.getSelectedIndex();
                    PhongBan phongBan = this.view.dsPhongBan.TimPBBySTT(sttPB);
                    String chucVu = this.view.comboBox_Position.getSelectedItem()+"";
                    boolean gioiTinh = true;
                    if(this.view.radioButton_Male.isSelected()) {
                        gioiTinh = true;
                    }
                    else if(this.view.radioButton_Female.isSelected()){
                        gioiTinh = false;
                    }
                    int queQuan = this.view.comboBox_Address.getSelectedIndex();
                    Tinh tinh = Tinh.getTinhByID(queQuan);
                    Date ngayVaoLam = new Date(this.view.textField_DayStartWork.getText());
                    double luongCB = Double.parseDouble(this.view.textField_BasicSalary.getText());
                    
                    NhanVien NV = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, tinh, phongBan, chucVu, ngayVaoLam, luongCB);
                    this.view.themNV(NV);
                    this.view.xoaForm(1);
                }
                else if(this.luaChon.equals("Thêm phòng ban")) {
                    String maBP = this.view.textField_MBP.getText();
                    String tenBP = this.view.textField_NameBP.getText();
                    Date ngayThanhLap = new Date(this.view.textField_Found.getText());
                    
                    PhongBan PB = new PhongBan(maBP, tenBP, ngayThanhLap);
                    this.view.themPB(PB);
                    this.view.xoaForm(-1);                
                }
                else if(this.luaChon.equals("Chỉnh sửa")) {                  
                    if(tmpStatus) {
                        int maNV = Integer.parseInt(this.view.textField_MNV.getText());
                        String tenNV = this.view.textField_Name.getText();
                        Date ngaySinh = new Date(this.view.textField_Dob.getText());
                        int sttPB = this.view.comboBox_MPB.getSelectedIndex();
                        PhongBan phongBan = this.view.dsPhongBan.TimPBBySTT(sttPB);
                        String chucVu = this.view.comboBox_Position.getSelectedItem()+"";
                        boolean gioiTinh = true;
                        if(this.view.radioButton_Male.isSelected()) {
                            gioiTinh = true;
                        }
                        else if(this.view.radioButton_Female.isSelected()){
                            gioiTinh = false;
                        }
                        int queQuan = this.view.comboBox_Address.getSelectedIndex();
                        Tinh tinh = Tinh.getTinhByID(queQuan);
                        Date ngayVaoLam = new Date(this.view.textField_DayStartWork.getText());
                        double luongCB = Double.parseDouble(this.view.textField_BasicSalary.getText());
                    
                        NhanVien NV = new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, tinh, phongBan, chucVu, ngayVaoLam, luongCB);
                        
                        this.view.capNhatNV(NV);
                        this.view.menuItem_ShowDepartment.setEnabled(true);
                        this.view.menuItem_ShowSaff.setEnabled(false);
                        this.view.setEnable(false, false);
                    }
                    else {
                        String maBP = this.view.textField_MBP.getText();
                        String tenBP = this.view.textField_NameBP.getText();
                        Date ngayThanhLap = new Date(this.view.textField_Found.getText());

                        PhongBan PB = new PhongBan(maBP, tenBP, ngayThanhLap);
                        this.view.capNhatPB(PB);
                        this.view.menuItem_ShowDepartment.setEnabled(false);
                        this.view.menuItem_ShowSaff.setEnabled(true);
                        this.view.setEnable(false, false);
                    }
                }
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
        }
        else if(s.equals("Hủy bỏ")) {
            this.view.xoaForm(0);
            this.view.setEnable(false, false);
        }
        else if(s.equals("Xóa")) {
            if(this.view.trangThai) {
                this.view.xoaNV();
            }
            else {
                this.view.xoaPB();             
            }
        }
        else if(s.equals("Chỉnh sửa")) {
            this.luaChon = s;
            this.tmpStatus = this.view.trangThai;
            if(this.view.trangThai) {
                this.view.hienThiNV();
            }
            else {
                this.view.hienThiPB();
            }
        }
    }
    
}
