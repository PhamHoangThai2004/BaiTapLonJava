package view;

import controller.QLTKListen_Admin;
import controller.QLTKMouseListen_Admin;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import model.DSPhongBan;
import model.DSTaiKhoan;
import model.PhongBan;
import model.TaiKhoan;

public class QLTK_Admin extends javax.swing.JPanel {
    public JPopupMenu popupMenu;
    public JMenuItem menuItem_Delete;
    public JMenuItem menuItem_Detaild;
    private DSTaiKhoan dsTaiKhoan;
    public DSPhongBan dsPhongBan;
    private String TTK;
    
    public QLTK_Admin() {
        initComponents();
        this.setProperty();

    }
    
    private void setProperty() {    
        this.dsTaiKhoan = new DSTaiKhoan();
        this.dsPhongBan = new DSPhongBan();
                
        popupMenu = new JPopupMenu();
        menuItem_Delete = new JMenuItem("Xóa");
        menuItem_Detaild = new JMenuItem("Chi Tiết");
        popupMenu.add(menuItem_Delete);
        popupMenu.add(menuItem_Detaild);
        this.add(popupMenu);
        
        QLTKMouseListen_Admin mouse = new QLTKMouseListen_Admin(this);
        this.table_Account.addMouseListener(mouse);
        
        QLTKListen_Admin lis = new QLTKListen_Admin(this);
        button_Create.addActionListener(lis);
        button_Save.addActionListener(lis);
        button_Cancel.addActionListener(lis);
        menuItem_Delete.addActionListener(lis);
        menuItem_Detaild.addActionListener(lis);
        button_Search.addActionListener(lis);
        button_SearchCancel.addActionListener(lis);
        
//        Date date = new Date("12/1/2021");
//        
//        PhongBan pb1 = new PhongBan("PB01", "Human Resource", date);
//        PhongBan pb2 = new PhongBan("PB02", "CNTT", date);
//        PhongBan pb3 = new PhongBan("PB03", "Sale", date);        
//        dsPhongBan.ThemPB(pb1);
//        dsPhongBan.ThemPB(pb2);
//        dsPhongBan.ThemPB(pb3);
//        TaiKhoan tk1 = new TaiKhoan("abc", "123", pb1.getTenPB(), date);
//        TaiKhoan tk2 = new TaiKhoan("def", "456", pb2.getTenPB(), date);
//        TaiKhoan tk3 = new TaiKhoan("ghi", "789", pb3.getTenPB(), date);
//        TaiKhoan tk4 = new TaiKhoan("kln", "054", "ADMIN", date);
//        dsTaiKhoan.ThemTK(tk1);
//        dsTaiKhoan.ThemTK(tk2);
//        dsTaiKhoan.ThemTK(tk3);
//        dsTaiKhoan.ThemTK(tk4);
        this.ReadFilePB();
        this.ReadFileTK();
        this.checkAuthority();
        for (PhongBan pb : this.dsPhongBan.getDsPB()) {
            comboBox_Authority.addItem(pb.getTenPB());
        }
        comboBox_Authority.addItem("ADMIN");
        comboBox_Authority.addItem("Không Có Quyền");;
        comboBox_Authority.setSelectedIndex(-1);
        
        this.DisplayTK(this.dsTaiKhoan.getDsTK());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_Account = new javax.swing.JTable();
        label_AccountList = new javax.swing.JLabel();
        label_UserName = new javax.swing.JLabel();
        label_Password = new javax.swing.JLabel();
        textField_UserName = new javax.swing.JTextField();
        textField_Pasword = new javax.swing.JTextField();
        label_Authority = new javax.swing.JLabel();
        comboBox_Authority = new javax.swing.JComboBox<>();
        button_Create = new javax.swing.JButton();
        button_Save = new javax.swing.JButton();
        button_Cancel = new javax.swing.JButton();
        label_UerNameSearch = new javax.swing.JLabel();
        textField_UserNameSearch = new javax.swing.JTextField();
        label_CreateDay = new javax.swing.JLabel();
        textField_CreateDay = new javax.swing.JTextField();
        separator_Search = new javax.swing.JSeparator();
        separator_Button = new javax.swing.JSeparator();
        button_Search = new javax.swing.JButton();
        button_SearchCancel = new javax.swing.JButton();

        table_Account.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_Account.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tài Khoản", "Mật Khẩu", "Quyền", "Ngày Tạo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Account.setRowHeight(25);
        jScrollPane1.setViewportView(table_Account);

        label_AccountList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_AccountList.setText("Danh sách tài khoản:");

        label_UserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_UserName.setText("Tên Tài Khoản:");

        label_Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_Password.setText("Mật Khẩu:");

        textField_UserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textField_UserName.setEnabled(false);

        textField_Pasword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textField_Pasword.setEnabled(false);

        label_Authority.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_Authority.setText("Quyền:");

        comboBox_Authority.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        comboBox_Authority.setEnabled(false);

        button_Create.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Create.setText("Tạo");

        button_Save.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Save.setText("Lưu");

        button_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Cancel.setText("Hủy Bỏ");

        label_UerNameSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_UerNameSearch.setText("Tài Khoản:");

        textField_UserNameSearch.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        label_CreateDay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_CreateDay.setText("Ngày Tạo:");

        textField_CreateDay.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textField_CreateDay.setEnabled(false);

        button_Search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Search.setText("Tìm Kiếm");

        button_SearchCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_SearchCancel.setText("Hủy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_AccountList))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_UerNameSearch)
                        .addGap(18, 18, 18)
                        .addComponent(textField_UserNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(button_Search)
                        .addGap(18, 18, 18)
                        .addComponent(button_SearchCancel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_UserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_Password, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField_UserName, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addComponent(textField_Pasword))
                        .addGap(189, 189, 189)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_CreateDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_Authority, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBox_Authority, 0, 230, Short.MAX_VALUE)
                            .addComponent(textField_CreateDay))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(separator_Search, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(separator_Button))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(button_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                .addComponent(button_Save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(button_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 16, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_UerNameSearch)
                    .addComponent(textField_UserNameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Search)
                    .addComponent(button_SearchCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(separator_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(button_Create, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_AccountList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_UserName)
                            .addComponent(textField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Authority)
                            .addComponent(comboBox_Authority, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Password)
                    .addComponent(textField_Pasword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_CreateDay)
                    .addComponent(textField_CreateDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancel;
    private javax.swing.JButton button_Create;
    private javax.swing.JButton button_Save;
    private javax.swing.JButton button_Search;
    private javax.swing.JButton button_SearchCancel;
    public javax.swing.JComboBox<String> comboBox_Authority;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_AccountList;
    private javax.swing.JLabel label_Authority;
    private javax.swing.JLabel label_CreateDay;
    private javax.swing.JLabel label_Password;
    private javax.swing.JLabel label_UerNameSearch;
    private javax.swing.JLabel label_UserName;
    private javax.swing.JSeparator separator_Button;
    private javax.swing.JSeparator separator_Search;
    public javax.swing.JTable table_Account;
    public javax.swing.JTextField textField_CreateDay;
    public javax.swing.JTextField textField_Pasword;
    public javax.swing.JTextField textField_UserName;
    private javax.swing.JTextField textField_UserNameSearch;
    // End of variables declaration//GEN-END:variables

    public void setEnable(boolean b) {
        textField_UserName.setEnabled(b);
        textField_Pasword.setEnabled(b);
        comboBox_Authority.setEnabled(b);
    }

    public void xoaForm() {
        textField_UserName.setText("");
        textField_Pasword.setText("");
        comboBox_Authority.setSelectedIndex(-1);
        textField_CreateDay.setText("");
    }
    
    private void checkAuthority() {
        for (TaiKhoan TK : this.dsTaiKhoan.getDsTK()) {
            if(TK.getAuthority().equals("Không Có Quyền") 
                    || TK.getAuthority().equals("ADMIN")) continue;
            boolean check = false;
            for (PhongBan PB : this.dsPhongBan.getDsPB()) {              
                if(TK.getAuthority().equals(PB.getTenPB())) {
                    check = true;
                    break;
                }
            }
            if(!check) TK.setAuthority("Không Có Quyền");
        }
    }
    
    private void DisplayTK(ArrayList<TaiKhoan> DSTK) {
        DefaultTableModel modelTable = new DefaultTableModel();
        table_Account.setModel(modelTable);
        modelTable.addColumn("Tên Tài Khoản");
	modelTable.addColumn("Mật Khẩu");
        modelTable.addColumn("Quyền");
        modelTable.addColumn("Ngày Tạo");
        try {
            for(TaiKhoan TK:DSTK) {
            modelTable.addRow(
                                new Object[] {
                                        TK.getTenTK()+"",
					TK.getMatKhau()+"",	
                                        TK.getAuthority()+"",
					(TK.getNgayTao().getMonth()+1)+"/"+TK.getNgayTao().getDate()+
                                                "/"+(TK.getNgayTao().getYear()+1900)});
                            }
        } catch (Exception e) {
            System.err.println("Danh sách phòng ban null - dòng 772");
        }
    }

    public boolean themTK(TaiKhoan TK) {
        for (TaiKhoan tk : this.dsTaiKhoan.getDsTK()) {
            if(TK.getTenTK().equals(tk.getTenTK()))  return false;
        }
        dsTaiKhoan.ThemTK(TK);
        this.xoaForm();
        this.setEnable(false);
        this.WriteFileTK();
        DisplayTK(this.dsTaiKhoan.getDsTK());
        return true;
    }

    public void capNhatTK(TaiKhoan TK) {     
        this.dsTaiKhoan.CapNhatTK(TK);
        DisplayTK(this.dsTaiKhoan.getDsTK());
        this.xoaForm();     
        this.setEnable(false);
        this.WriteFileTK();
    }

    public void xoaTK() {
        DefaultTableModel modelTable = (DefaultTableModel) table_Account.getModel();
        int row = table_Account.getSelectedRow();
        
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa!",
                "Confirm", JOptionPane.ERROR_MESSAGE);
        
        if(luaChon == JOptionPane.YES_OPTION) {
            this.TTK = modelTable.getValueAt(row, 0)+"";
            for(int i = 0; i < this.dsTaiKhoan.getDsTK().size(); i++) {
                if(this.TTK.equals(this.dsTaiKhoan.getDsTK().get(i).getTenTK())) {
                    this.dsTaiKhoan.XoaTK(this.dsTaiKhoan.getDsTK().get(i));
                }
            }
            modelTable.removeRow(row);
        }
        this.WriteFileTK();
    }

    public void hienThiChiTiet() {
        textField_Pasword.setEnabled(true);
        comboBox_Authority.setEnabled(true);
        
        DefaultTableModel modeltable = (DefaultTableModel) table_Account.getModel();
        int row = table_Account.getSelectedRow();
        
        String userName = modeltable.getValueAt(row, 0)+"";
        String passWord = modeltable.getValueAt(row, 1)+"";
        String authority = modeltable.getValueAt(row, 2)+"";
        String createDay = modeltable.getValueAt(row, 3)+"";
        
        textField_UserName.setText(userName);
        textField_Pasword.setText(passWord);
        comboBox_Authority.setSelectedItem(authority);
        textField_CreateDay.setText(createDay);
    }

    public void timkiemTK() {
        DisplayTK(this.dsTaiKhoan.getDsTK());
        DefaultTableModel modelTable = (DefaultTableModel) table_Account.getModel();
        int countRow = modelTable.getRowCount();
        String userName = this.textField_UserNameSearch.getText();
        ArrayList<String> idCanXoa = new ArrayList<>();
        
        if(userName.length() > 0) {
            for(int i = 0; i < countRow; i++) {
                String id = modelTable.getValueAt(i, 0)+"";
                if(!id.equals(userName)) {
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
        textField_UserNameSearch.setText("");
        DisplayTK(this.dsTaiKhoan.getDsTK());
    }
    
    private void ReadFileTK() {
        ArrayList<TaiKhoan> taiKhoan = new ArrayList<>();

        try {          
            FileInputStream fis = new FileInputStream("taikhoan.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true) {
                try {
                    Object oj = ois.readObject();
                    if(oj!=null) {
                        TaiKhoan tk = (TaiKhoan) oj;
                        taiKhoan.add(tk);
                    }
                } catch (IOException | ClassNotFoundException e) {
                    break;
                }  
            }
            ois.close();
        } catch (IOException e) {
            System.err.println("Không tìm thấy file Phòng Ban - dòng 685");
        }
        this.dsTaiKhoan.setDsTK(taiKhoan);
    }
    
    private void WriteFileTK() {
         try {          
            FileOutputStream fos = new FileOutputStream("taikhoan.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(TaiKhoan tk:this.dsTaiKhoan.getDsTK()) {
                oos.writeObject(tk);
            }
            oos.close();
        } catch (IOException e) {
             System.err.println("Không tìm thấy file Tài Khoản - dòng 458");
        }
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
}
