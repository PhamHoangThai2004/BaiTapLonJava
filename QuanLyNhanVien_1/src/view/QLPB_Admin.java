package view;

import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import controller.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.*;

public class QLPB_Admin extends javax.swing.JPanel {
    public JPopupMenu popupMenu;
    public JMenuItem menuItem_Delete;
    public JMenuItem menuItem_Detaild;
    private String MPB;
    private DSPhongBan dsPhongBan;
    private DSNhanVien dsNhanVien;
    
    public QLPB_Admin() {
        initComponents();
        this.setProperty();
    }
    
    private void setProperty() { 
        this.dsPhongBan = new DSPhongBan();
        this.dsNhanVien = new DSNhanVien();
        
        popupMenu = new JPopupMenu();
        menuItem_Delete = new JMenuItem("Xóa");
        menuItem_Detaild = new JMenuItem("Chi Tiết");
        popupMenu.add(menuItem_Delete);
        popupMenu.add(menuItem_Detaild);
        this.add(popupMenu);
        
        QLPBMouseListen_Admin mouse = new QLPBMouseListen_Admin(this);
        this.table_Department.addMouseListener(mouse);
        
        QLPBListen_Admin lis = new QLPBListen_Admin(this);
        button_Add.addActionListener(lis);
        button_Search.addActionListener(lis);
        button_SearchCancel.addActionListener(lis);
        button_Save.addActionListener(lis);
        button_Cancel.addActionListener(lis);
        menuItem_Delete.addActionListener(lis);
        menuItem_Detaild.addActionListener(lis);
        
//        Date date = new Date("12/1/2021");
//        PhongBan pb1 = new PhongBan("PB01", "Admin", date);
//        PhongBan pb2 = new PhongBan("PB02", "Sale", date);
//        dsPhongBan.ThemPB(pb1);
//        dsPhongBan.ThemPB(pb2);
        this.ReadFilePB();
        this.ReadFileNV();
        DisplayPB(this.dsPhongBan.getDsPB());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_Department = new javax.swing.JTable();
        label_DepartmentList = new javax.swing.JLabel();
        label_MPB = new javax.swing.JLabel();
        label_Found = new javax.swing.JLabel();
        textField_MPB = new javax.swing.JTextField();
        textField_Name = new javax.swing.JTextField();
        textField_Found = new javax.swing.JTextField();
        label_Employes = new javax.swing.JLabel();
        label_Name = new javax.swing.JLabel();
        textField_Employes = new javax.swing.JTextField();
        button_Save = new javax.swing.JButton();
        button_Cancel = new javax.swing.JButton();
        separator_Button = new javax.swing.JSeparator();
        button_Add = new javax.swing.JButton();
        label_MPBSearch = new javax.swing.JLabel();
        textField_MPBSearch = new javax.swing.JTextField();
        button_Search = new javax.swing.JButton();
        button_SearchCancel = new javax.swing.JButton();
        separator_Search = new javax.swing.JSeparator();

        table_Department.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_Department.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã Phòng Ban", "Tên Phòng  Ban", "Ngày Thành Lập"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Department.setRowHeight(25);
        jScrollPane1.setViewportView(table_Department);

        label_DepartmentList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_DepartmentList.setText("Danh sách phòng ban:");

        label_MPB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_MPB.setText("Mã Phòng Ban:");

        label_Found.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_Found.setText("Ngày Thành Lập:");

        textField_MPB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textField_MPB.setEnabled(false);

        textField_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textField_Name.setEnabled(false);

        textField_Found.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textField_Found.setEnabled(false);

        label_Employes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_Employes.setText("Số Nhân Viên:");

        label_Name.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_Name.setText("Tên Phòng Ban:");

        textField_Employes.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textField_Employes.setEnabled(false);

        button_Save.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Save.setText("Lưu");

        button_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Cancel.setText("Hủy Bỏ");

        button_Add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Add.setText("Thêm");

        label_MPBSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_MPBSearch.setText("Mã Phòng Ban:");

        textField_MPBSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        button_Search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Search.setText("Tìm Kiếm");

        button_SearchCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_SearchCancel.setText("Hủy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_MPB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(textField_MPB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Found)
                    .addComponent(label_Employes, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textField_Found, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                    .addComponent(textField_Employes))
                .addGap(113, 113, 113))
            .addComponent(separator_Search)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_MPBSearch)
                        .addGap(18, 18, 18)
                        .addComponent(textField_MPBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addComponent(button_Search)
                        .addGap(52, 52, 52)
                        .addComponent(button_SearchCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(label_DepartmentList))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(separator_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_MPBSearch)
                    .addComponent(textField_MPBSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Search)
                    .addComponent(button_SearchCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_DepartmentList, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(separator_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField_Employes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Employes)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_MPB)
                                .addComponent(textField_MPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_Found)
                                .addComponent(textField_Found, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Name)
                            .addComponent(textField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Add;
    private javax.swing.JButton button_Cancel;
    private javax.swing.JButton button_Save;
    private javax.swing.JButton button_Search;
    private javax.swing.JButton button_SearchCancel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_DepartmentList;
    private javax.swing.JLabel label_Employes;
    private javax.swing.JLabel label_Found;
    private javax.swing.JLabel label_MPB;
    private javax.swing.JLabel label_MPBSearch;
    private javax.swing.JLabel label_Name;
    private javax.swing.JSeparator separator_Button;
    private javax.swing.JSeparator separator_Search;
    public javax.swing.JTable table_Department;
    private javax.swing.JTextField textField_Employes;
    public javax.swing.JTextField textField_Found;
    public javax.swing.JTextField textField_MPB;
    private javax.swing.JTextField textField_MPBSearch;
    public javax.swing.JTextField textField_Name;
    // End of variables declaration//GEN-END:variables

    public void setEnable(boolean b) {
        textField_MPB.setEnabled(b);
        textField_Name.setEnabled(b);
        textField_Found.setEnabled(b);
    }
    
    public void xoaForm() {
        textField_Name.setText("");
        textField_MPB.setText("");
        textField_Found.setText("");
        textField_Employes.setText("");
    }
    
    private void DisplayPB(ArrayList<PhongBan> DSPB) {
        DefaultTableModel modelTable = new DefaultTableModel();
        table_Department.setModel(modelTable);
        modelTable.addColumn("Mã Phòng Ban");
	modelTable.addColumn("Tên Phòng Ban");
        modelTable.addColumn("Ngày Thành Lập");
        try {
            for(PhongBan PB:DSPB) {
            modelTable.addRow(
                                new Object[] {
                                        PB.getMaPB()+"",
					PB.getTenPB()+"",					
					(PB.getNgayTL().getMonth()+1)+"/"+PB.getNgayTL().getDate()+
                                                "/"+(PB.getNgayTL().getYear()+1900)});
                            }
        } catch (Exception e) {
            System.err.println("Danh sách phòng ban null - dòng 772");
        }
    }
    
    public void xoaPB() {
        DefaultTableModel modelTable = (DefaultTableModel) table_Department.getModel();
        int row = table_Department.getSelectedRow();
        
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa!",
                "Confirm", JOptionPane.ERROR_MESSAGE);
        
        if(luaChon == JOptionPane.YES_OPTION) {
            this.MPB = modelTable.getValueAt(row, 0)+"";
            for(int i = 0; i < this.dsPhongBan.getDsPB().size(); i++) {
                if(this.MPB.equals(this.dsPhongBan.getDsPB().get(i).getMaPB())) {
                    this.dsPhongBan.XoaPB(this.dsPhongBan.getDsPB().get(i));
                }
            }
            modelTable.removeRow(row);
        }
        this.WriteFilePB();
    }
    
    public void hienThiChiTiet() {
        this.setEnable(true);
        DefaultTableModel modeltable = (DefaultTableModel) table_Department.getModel();
        int row = table_Department.getSelectedRow();
        
        String maPB = modeltable.getValueAt(row, 0)+"";
        String tenPB = modeltable.getValueAt(row, 1)+"";
        String ngayTL = modeltable.getValueAt(row,2)+"";
        
        textField_MPB.setText(maPB);
        textField_Name.setText(tenPB);
        textField_Found.setText(ngayTL);
        
        int count = 0;
        for (NhanVien NV : this.dsNhanVien.getDsNV()) {
            if(tenPB.equals(NV.getPhongBan().getTenPB()))  count++;
        }
        
        textField_Employes.setText(count+"");
        this.MPB = maPB;
    }

    public boolean themPB(PhongBan PB) {
        this.setEnable(false);
        for (PhongBan pb : this.dsPhongBan.getDsPB()) {
            if(PB.getMaPB().equals(pb.getMaPB()))  return false;
        }
        dsPhongBan.ThemPB(PB);
        this.xoaForm();
        DisplayPB(this.dsPhongBan.getDsPB());
        this.WriteFilePB();
        return true;
    }

    public boolean capNhatPB(PhongBan PB) {
        for (PhongBan pb : this.dsPhongBan.getDsPB()) {
            if(PB.getMaPB().equals(pb.getMaPB()) && !PB.getMaPB().equals(this.MPB))  
                return false;
        }
        this.dsPhongBan.CapNhatPB(this.MPB, PB);
        DisplayPB(this.dsPhongBan.getDsPB());
        this.xoaForm();     
        this.setEnable(false);
        this.WriteFilePB();
        return true;
    }

    public void timKiemPB() {
        DisplayPB(this.dsPhongBan.getDsPB());
        DefaultTableModel modelTable = (DefaultTableModel) table_Department.getModel();
        int countRow = modelTable.getRowCount();
        String maPB = this.textField_MPBSearch.getText();
        ArrayList<String> idCanXoa = new ArrayList<>();
        
        if(maPB.length() > 0) {
            for(int i = 0; i < countRow; i++) {
                String id = modelTable.getValueAt(i, 0)+"";
                if(!id.equals(maPB)) {
                    idCanXoa.add(id);
                }
            }
        }
           
        for(String id: idCanXoa) {
            countRow = modelTable.getRowCount();
            for(int i =0; i < countRow; i++) {
                String idTrongBang = modelTable.getValueAt(i, 0)+"";
                if(idTrongBang.equals(id)) {                   
                    try{
                        modelTable.removeRow(i);
                    }
                    catch(Exception e) {
                        e.printStackTrace();
                    }
                    break;
                }
            }
        }
    }

    public void huyTimKiem() {
        this.textField_MPBSearch.setText("");
        DisplayPB(this.dsPhongBan.getDsPB());
    }
    
    private void ReadFilePB() {
        ArrayList<PhongBan> phongBan = new ArrayList<>();

        try {          
            FileInputStream fis = new FileInputStream("phongban.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true) {
                try {
                    Object oj = ois.readObject();
                    if(oj!=null) {
                        PhongBan pb = (PhongBan) oj;
                        phongBan.add(pb);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    break;
                }  
            }
            ois.close();
        } catch (IOException e) {
            System.err.println("Không tìm thấy file Phòng Ban - dòng 685");
        }
        this.dsPhongBan.setDsPB(phongBan);
    }
    
    private void WriteFilePB() {
         try {          
            FileOutputStream fos = new FileOutputStream("phongban.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(PhongBan pb:this.dsPhongBan.getDsPB()) {
                oos.writeObject(pb);
            }
            oos.close();
        } catch (IOException e) {
             System.err.println("Không tìm thấy file Phong Ban - dòng 699");
        }
    }
    
    private void ReadFileNV() {
        ArrayList<NhanVien> nhanVien = new ArrayList<>();
        try {                     
            FileInputStream fis = new FileInputStream("nhanvien.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true) {
                try {
                    Object oj = ois.readObject();
                    if(oj!=null) {
                        NhanVien nv = (NhanVien) oj;
                        nhanVien.add(nv);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    break;
                }  
            }
            ois.close();
        } catch (IOException e) {
            System.err.println("Lỗi đọc file - dòng 1071");
        }
        this.dsNhanVien.setDsNV(nhanVien);       
    }

}
