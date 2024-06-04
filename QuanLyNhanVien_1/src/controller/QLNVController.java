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
        switch (s) {
            case "New File" -> this.view.createFiles();
            case "Open File" -> this.view.openFile();
            case "Save" -> this.view.saveFile();
            case "Close" -> this.view.closeFile();
            case "Exit" -> this.view.THOAT();
            case "Search Staff By ID" -> {
                String maNV = JOptionPane.showInputDialog(view,
                        "Nhập mã nhân viên cần tìm:",
                        "Search By ID",
                        JOptionPane.PLAIN_MESSAGE);
                if (!maNV.equals("")) {    
                    this.view.timNVByID(Integer.parseInt(maNV));
                }
            }
            case "Search Staff By Name" -> {
                String tenNV = JOptionPane.showInputDialog(view,
                        "Nhập tên nhân viên cần tìm:",
                        "Search By Name",
                        JOptionPane.PLAIN_MESSAGE);
                if (!tenNV.equals("")) {
                    this.view.timNVByName(tenNV);
                }
            }
            case "Search Staff By Division" -> {
                String maBP = JOptionPane.showInputDialog(view,
                        "Nhập mã bộ phận cần tìm:",
                        "Search By Division",
                        JOptionPane.PLAIN_MESSAGE);
                if (!maBP.equals("")) {
                    this.view.timNVByDivision(maBP);
                }
            }
            case "Search Department By ID" -> {
                String maPB = JOptionPane.showInputDialog(view,
                        "Nhập mã phòng ban cần tìm:",
                        "Search By ID",
                        JOptionPane.PLAIN_MESSAGE);
                if (!maPB.equals("")) {
                    this.view.timPBByID(maPB);
                }
            }
            case "Search Department By Name" -> {
                String tenPB = JOptionPane.showInputDialog(view,
                        "Nhập tên phòng ban cần tìm:",
                        "Search By Name",
                        JOptionPane.PLAIN_MESSAGE);
                if (!tenPB.equals("")) {
                    this.view.timPBByName(tenPB);
                }
            }
            case "Show Saff" -> {
                this. view.DisplayNV(this.view.model.getDsNV());
                this.view.menuItem_ShowSaff.setEnabled(false);
                this.view.menuItem_ShowDepartment.setEnabled(true);
            }
            case "Show Department" -> {
                this. view.DisplayPB(this.view.dsPhongBan.getDsPB());
                this.view.menuItem_ShowSaff.setEnabled(true);
                this.view.menuItem_ShowDepartment.setEnabled(false);
            }
            case "About" -> this.view.showHelp();
            case "Thêm phòng ban" -> {
                this.luaChon = s;
                this.view.xoaForm(1);
                this.view.setEnable(false, true);
            }
            case "Thêm nhân viên" -> {
                this.luaChon = s;
                this.view.xoaForm(-1);
                this.view.setEnable(true, false);
            }
            case "Lưu" -> {
                try {
                    switch (this.luaChon) {
                        case "Thêm nhân viên" -> {
                            boolean thnv = this.view.themNV(this.selectNV());
                            if(!thnv)  {
                                JOptionPane.showMessageDialog(view, "Mã nhân viên đã tồn tại",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        case "Thêm phòng ban" -> {
                            boolean thpb = this.view.themPB(this.selectPB());
                            if(!thpb)  {
                                JOptionPane.showMessageDialog(view, "Mã phòng ban đã tồn tại",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        case "Chỉnh sửa" -> {
                            if(tmpStatus) {
                                boolean csnv = this.view.capNhatNV(this.selectNV());
                                if(!csnv)  {
                                JOptionPane.showMessageDialog(view, "Mã nhân viên đã tồn tại",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            else {
                                boolean cspb = this.view.capNhatPB(this.selectPB());
                                if(!cspb)  {
                                JOptionPane.showMessageDialog(view, "Mã phòng ban đã tồn tại",
                                        "Error", JOptionPane.ERROR_MESSAGE);
                                }                             
                            }
                        }
                        default -> {
                        }
                    }
                } catch (NumberFormatException e2) {
                    System.out.println("Lỗi lấy thông tin - dòng 138");
                }
            }
            case "Hủy bỏ" -> {
                this.view.xoaForm(0);
                this.view.setEnable(false, false);
            }
            case "Xóa" -> {
                if(this.view.trangThai) {
                    this.view.xoaNV();
                }
                else {
                    this.view.xoaPB();
                }
            }
            case "Chỉnh sửa" -> {
                this.luaChon = s;
                this.tmpStatus = this.view.trangThai;
                if(this.view.trangThai) {
                    this.view.hienThiNV();
                }
                else {
                    this.view.hienThiPB();
                }
            }
            default -> {
            }
        }
    }
    
    private NhanVien selectNV() {
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
                    
        return new NhanVien(maNV, tenNV, ngaySinh, gioiTinh, tinh, phongBan, chucVu, ngayVaoLam, luongCB);
    }
    
    private PhongBan selectPB() {
        String maBP = this.view.textField_MBP.getText();
        String tenBP = this.view.textField_NameBP.getText();
        Date ngayThanhLap = new Date(this.view.textField_Found.getText());
                    
        return new PhongBan(maBP, tenBP, ngayThanhLap);
    }
    
}