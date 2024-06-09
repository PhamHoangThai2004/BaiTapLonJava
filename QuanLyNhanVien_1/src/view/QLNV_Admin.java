package view;

import controller.QLNVListen_Admin;
import controller.QLNVMouseListen_Admin;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ButtonGroup;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import model.DSPhongBan;
import model.NhanVien;
import model.PhongBan;
import model.DSNhanVien;
import model.Tinh;

public class QLNV_Admin extends javax.swing.JPanel {
    public ButtonGroup buttonGroup;
    public JPopupMenu popupMenu;
    public JMenuItem menuItem_Delete;
    public JMenuItem menuItem_Detaild;
    private int MNV;
    public DSNhanVien model;
    public DSPhongBan dsPhongBan;
    
    public QLNV_Admin() {
        initComponents();
        this.setProperty();
    }
    
    private void setProperty() {
        this.model = new DSNhanVien();
        this.dsPhongBan = new DSPhongBan();
        
        ArrayList<Tinh> TinhList = Tinh.getDSTinh();
        for (Tinh t : TinhList) {
            comboBox_Address.addItem(t.getTenTinh());
        }
        comboBox_Address.setSelectedIndex(-1);
        
        String[] listPosition = {"Giám Đốc","Thư Ký", "Trưởng Phòng", "Phó Phòng",
                                    "Nhân Viên", "Thực Tập", "Khác..."};
        for (String vt : listPosition) {
            comboBox_Position.addItem(vt);
        }
        this.comboBox_Position.setSelectedIndex(-1);
        
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton_Male);
        buttonGroup.add(radioButton_Female);
        
        popupMenu = new JPopupMenu();
        menuItem_Delete = new JMenuItem("Xóa");
        menuItem_Detaild = new JMenuItem("Chi Tiết");
        popupMenu.add(menuItem_Delete);
        popupMenu.add(menuItem_Detaild);
        this.add(popupMenu);
        
        QLNVMouseListen_Admin mouse = new QLNVMouseListen_Admin(this);
        this.table_Staff.addMouseListener(mouse);
        
        QLNVListen_Admin con = new QLNVListen_Admin(this);
        button_Save.addActionListener(con);
        button_Cancel.addActionListener(con);
        button_Add.addActionListener(con);
        button_Search.addActionListener(con);
        button_SearchCancel.addActionListener(con);
        button_OK.addActionListener(con);
        menuItem_Delete.addActionListener(con);
        menuItem_Detaild.addActionListener(con);
        
//        Date date = new Date("12/1/2021");       
//        PhongBan pb1 = new PhongBan("PB01", "Human Resource", date);
//        PhongBan pb2 = new PhongBan("PB02", "CNTT", date);
//        PhongBan pb3 = new PhongBan("PB03", "Sale", date);        
//        dsPhongBan.ThemPB(pb1);
//        dsPhongBan.ThemPB(pb2);
//        dsPhongBan.ThemPB(pb3);    
//        NhanVien nv1 = new NhanVien(1, "NV01", date, true,
//                Tinh.getTinhByID(23), pb1, "Nhân Viên"
//                        + "", date, 20000);
//        NhanVien nv2 = new NhanVien(2, "NV02", date, false,
//                Tinh.getTinhByID(3), pb1, "Thư Ký"
//                        + "", date, 45000);
//        model.ThemNV(nv1);
//        model.ThemNV(nv2);
        this.ReadFilePB();
        this.ReadFileNV();
        this.checkDepartment();
        for (PhongBan pb : this.dsPhongBan.getDsPB()) {
            comboBox_Department.addItem(pb.getTenPB());
        }
        comboBox_Department.addItem("Không Có Phòng Ban");
        comboBox_Department.setSelectedIndex(-1);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_Staff = new javax.swing.JTable();
        label_MNVSearch = new javax.swing.JLabel();
        textField_MNVSearch = new javax.swing.JTextField();
        label_DepartmentSearch = new javax.swing.JLabel();
        comboBox_Department = new javax.swing.JComboBox<>();
        separator_Staff = new javax.swing.JSeparator();
        label_StaffList = new javax.swing.JLabel();
        button_Search = new javax.swing.JButton();
        label_MNV = new javax.swing.JLabel();
        label_DoB = new javax.swing.JLabel();
        textField_MNV = new javax.swing.JTextField();
        label_Gender = new javax.swing.JLabel();
        textField_Name = new javax.swing.JTextField();
        textField_DoB = new javax.swing.JTextField();
        radioButton_Male = new javax.swing.JRadioButton();
        radioButton_Female = new javax.swing.JRadioButton();
        label_Address = new javax.swing.JLabel();
        comboBox_Address = new javax.swing.JComboBox<>();
        label_Position = new javax.swing.JLabel();
        label_StartDay = new javax.swing.JLabel();
        label_BasicSalary = new javax.swing.JLabel();
        comboBox_Position = new javax.swing.JComboBox<>();
        textField_StartDay = new javax.swing.JTextField();
        textField_BasicSalary = new javax.swing.JTextField();
        label_Name = new javax.swing.JLabel();
        label_Salary = new javax.swing.JLabel();
        textField_Salary = new javax.swing.JTextField();
        button_Save = new javax.swing.JButton();
        button_Cancel = new javax.swing.JButton();
        button_Add = new javax.swing.JButton();
        separator_Button = new javax.swing.JSeparator();
        button_OK = new javax.swing.JButton();
        button_SearchCancel = new javax.swing.JButton();

        table_Staff.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_Staff.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Họ Tên", "Ngày Sinh", "Giới Tính", "Địa Chỉ", "Phòng Ban", "Chức Vụ", "Ngày Vào Làm", "Lương Cơ Bản"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Staff.setRowHeight(25);
        jScrollPane1.setViewportView(table_Staff);
        if (table_Staff.getColumnModel().getColumnCount() > 0) {
            table_Staff.getColumnModel().getColumn(0).setResizable(false);
        }

        label_MNVSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_MNVSearch.setText("Mã Nhân Viên:");

        textField_MNVSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_DepartmentSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_DepartmentSearch.setText("Phòng Ban:");

        comboBox_Department.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_StaffList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_StaffList.setText("Danh sách nhân viên:");

        button_Search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Search.setText("Tìm Kiếm");

        label_MNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_MNV.setText("Mã Nhân Viên:");

        label_DoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_DoB.setText("Ngày Sinh:");

        textField_MNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_MNV.setEnabled(false);

        label_Gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Gender.setText("Giới Tính: ");

        textField_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_Name.setEnabled(false);

        textField_DoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_DoB.setEnabled(false);

        radioButton_Male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioButton_Male.setText("Nam");
        radioButton_Male.setEnabled(false);

        radioButton_Female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioButton_Female.setText("Nữ");
        radioButton_Female.setEnabled(false);

        label_Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Address.setText("Địa Chỉ:");

        comboBox_Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBox_Address.setEnabled(false);

        label_Position.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Position.setText("Chức Vụ:");

        label_StartDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_StartDay.setText("Ngày Vào Làm:");

        label_BasicSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_BasicSalary.setText("Lương Cơ Bản:");

        comboBox_Position.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBox_Position.setEnabled(false);

        textField_StartDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_StartDay.setEnabled(false);

        textField_BasicSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_BasicSalary.setEnabled(false);

        label_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Name.setText("Họ và Tên:");

        label_Salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Salary.setText("Tổng Lương:");

        textField_Salary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField_Salary.setEnabled(false);

        button_Save.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_Save.setText("Lưu");

        button_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_Cancel.setText("Hủy Bỏ");

        button_Add.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_Add.setText("Thêm");

        button_OK.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        button_OK.setText("OK");

        button_SearchCancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_SearchCancel.setText("Hủy");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator_Staff, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_MNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_DoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(textField_MNV)
                            .addComponent(textField_DoB, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_Gender, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                            .addComponent(label_Position, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_Position, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioButton_Male)
                                .addGap(40, 40, 40)
                                .addComponent(radioButton_Female)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(label_BasicSalary)
                                    .addComponent(label_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textField_BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_StartDay)
                                .addGap(18, 18, 18)
                                .addComponent(textField_StartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_StaffList)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 840, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Cancel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(button_Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(separator_Button)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(label_MNVSearch)
                .addGap(18, 18, 18)
                .addComponent(textField_MNVSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Search)
                .addGap(18, 18, 18)
                .addComponent(button_SearchCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_DepartmentSearch)
                .addGap(18, 18, 18)
                .addComponent(comboBox_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_OK)
                .addGap(71, 71, 71))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_MNVSearch)
                    .addComponent(textField_MNVSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_DepartmentSearch)
                    .addComponent(comboBox_Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Search)
                    .addComponent(button_OK)
                    .addComponent(button_SearchCancel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator_Staff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_StaffList)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Name)
                                .addGap(24, 24, 24)
                                .addComponent(label_DoB))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Gender)
                                    .addComponent(radioButton_Male)
                                    .addComponent(radioButton_Female)
                                    .addComponent(label_StartDay)
                                    .addComponent(textField_StartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_MNV))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Address)
                                    .addComponent(comboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_BasicSalary)
                                    .addComponent(textField_BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField_DoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Position)
                                    .addComponent(comboBox_Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Salary)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(separator_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Add;
    private javax.swing.JButton button_Cancel;
    private javax.swing.JButton button_OK;
    private javax.swing.JButton button_Save;
    private javax.swing.JButton button_Search;
    private javax.swing.JButton button_SearchCancel;
    public javax.swing.JComboBox<String> comboBox_Address;
    public javax.swing.JComboBox<String> comboBox_Department;
    public javax.swing.JComboBox<String> comboBox_Position;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Address;
    private javax.swing.JLabel label_BasicSalary;
    private javax.swing.JLabel label_DepartmentSearch;
    private javax.swing.JLabel label_DoB;
    private javax.swing.JLabel label_Gender;
    private javax.swing.JLabel label_MNV;
    private javax.swing.JLabel label_MNVSearch;
    private javax.swing.JLabel label_Name;
    private javax.swing.JLabel label_Position;
    private javax.swing.JLabel label_Salary;
    private javax.swing.JLabel label_StaffList;
    private javax.swing.JLabel label_StartDay;
    public javax.swing.JRadioButton radioButton_Female;
    public javax.swing.JRadioButton radioButton_Male;
    private javax.swing.JSeparator separator_Button;
    private javax.swing.JSeparator separator_Staff;
    public javax.swing.JTable table_Staff;
    public javax.swing.JTextField textField_BasicSalary;
    public javax.swing.JTextField textField_DoB;
    public javax.swing.JTextField textField_MNV;
    private javax.swing.JTextField textField_MNVSearch;
    public javax.swing.JTextField textField_Name;
    private javax.swing.JTextField textField_Salary;
    public javax.swing.JTextField textField_StartDay;
    // End of variables declaration//GEN-END:variables

    public void setEnable(boolean b) {
        textField_MNV.setEnabled(b);
        textField_Name.setEnabled(b);
        textField_DoB.setEnabled(b);
        radioButton_Male.setEnabled(b);
        radioButton_Female.setEnabled(b);
        comboBox_Address.setEnabled(b);
        comboBox_Position.setEnabled(b);
        textField_StartDay.setEnabled(b);
        textField_BasicSalary.setEnabled(b);
    }
    
    public void xoaForm()  {
        textField_MNV.setText("");
        textField_Name.setText("");
        textField_DoB.setText("");
        buttonGroup.clearSelection();
        comboBox_Address.setSelectedIndex(-1);
        comboBox_Position.setSelectedIndex(-1);
        textField_StartDay.setText("");
        textField_BasicSalary.setText("");      
        textField_Salary.setText("");
    }
    
    private void checkDepartment() {
        for (NhanVien NV : this.model.getDsNV()) {
            if(NV.getPhongBan().getTenPB().equals("Không Có Phòng Ban"))   continue;
            PhongBan pb = new PhongBan(null, "Không Có Phòng Ban", null);
            boolean check = false;
            for (PhongBan PB : this.dsPhongBan.getDsPB()) {
                if(NV.getPhongBan().getTenPB().equals(PB.getTenPB())) {
                    check = true;                    
                    break;
                }
            }
            if(!check) {
                NV.setPhongBan(pb);
                NV.setChucVu("Khác...");
            }
        }
    }
    
    public void DisplayNV(ArrayList<NhanVien> dsNV) {
        String tenPB = comboBox_Department.getSelectedItem()+"";
        DefaultTableModel modelTable = new DefaultTableModel();
        table_Staff.setModel(modelTable);
        modelTable.addColumn("ID");
	modelTable.addColumn("Họ Tên");
        modelTable.addColumn("Ngày Sinh");
        modelTable.addColumn("Giới Tính");
        modelTable.addColumn("Địa Chỉ");
        modelTable.addColumn("Phòng Ban");
        modelTable.addColumn("Chức Vụ");
        modelTable.addColumn("Ngày Vào Làm");
        modelTable.addColumn("Lương Cơ Bản");
	try {
            for(NhanVien NV:dsNV) {
               if(tenPB.equals(NV.getPhongBan().getTenPB())) {
                    modelTable.addRow(
                                new Object[] {
                                        NV.getMaNV()+"",
					NV.getTenNV()+"",					
					(NV.getNgaySinh().getMonth()+1)+"/"+NV.getNgaySinh().getDate()+
                                                "/"+(NV.getNgaySinh().getYear()+1900),			
                                        (NV.isGioiTinh()?"Nam":"Nữ"),
                                        NV.getDiaChi().getTenTinh(),
					NV.getPhongBan().getTenPB()+"",
					NV.getChucVu()+"",
					(NV.getNgayVaoLam().getMonth()+1)+"/"+NV.getNgayVaoLam().getDate()+
                                                "/"+(NV.getNgayVaoLam().getYear()+1900),			
                                        NV.getLuongCB()+""});
               }
            }
        } catch (Exception e) {
            System.err.println("Danh sách nhân viên null - dòng 751");
        }
    }
    
    public boolean themNV(NhanVien NV) {
        for (NhanVien nv : this.model.getDsNV()) {
            if(NV.getMaNV() == nv.getMaNV())  return false;
        }
        model.ThemNV(NV);
        this.xoaForm();
        this.setEnable(false);
        DisplayNV(this.model.getDsNV());
        this.WriteFileNV();
        return true;
    }

    public void xoaNV() {
        DefaultTableModel modelTable = (DefaultTableModel) table_Staff.getModel();
        int row = table_Staff.getSelectedRow();
        
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa!",
                "Confirm", JOptionPane.ERROR_MESSAGE);
        
        if(luaChon == JOptionPane.YES_OPTION) {
            this.MNV = Integer.parseInt(modelTable.getValueAt(row, 0)+"");
            for(int i = 0; i < this.model.getDsNV().size(); i++) {
                if(this.model.getDsNV().get(i).getMaNV() == this.MNV) {
                    this.model.XoaNV(this.model.getDsNV().get(i));
                }
            }
            modelTable.removeRow(row);
        }
        this.WriteFileNV();
    }

    public void hienThiChiTiet() {
        this.setEnable(true);
        DefaultTableModel modeltable = (DefaultTableModel) table_Staff.getModel();
        int row = table_Staff.getSelectedRow();
        
        int maNV = Integer.parseInt(modeltable.getValueAt(row, 0)+"");
        String tenNV = modeltable.getValueAt(row, 1)+"";
        String ngaySinh = modeltable.getValueAt(row, 2)+"";
        String chonGT = modeltable.getValueAt(row, 3)+"";
        Tinh tinh = Tinh.getTinhByName(modeltable.getValueAt(row, 4)+"");
        String chucVu = modeltable.getValueAt(row, 6)+"";
        String ngayVaoLam = modeltable.getValueAt(row, 7)+"";
        double luongCB = Double.parseDouble(modeltable.getValueAt(row, 8)+"");
        
        textField_MNV.setText(maNV+"");
        textField_Name.setText(tenNV);
        textField_DoB.setText(ngaySinh);   
        if(chonGT.equals("Nam"))  radioButton_Male.setSelected(true);
        else  radioButton_Female.setSelected(true);   
        comboBox_Address.setSelectedItem(tinh.getTenTinh());
        comboBox_Position.setSelectedItem(chucVu);
        textField_StartDay.setText(ngayVaoLam);
        textField_BasicSalary.setText(luongCB+"");
        
        Date dateOfWork = new Date(ngayVaoLam);
        int workYear = dateOfWork.getYear()+1900;
        
        LocalDate persentDate = LocalDate.now();
        int nowYear = persentDate.getYear();
              
        double heSoLuong = HeSoLuong(chucVu, nowYear-workYear);
        double tongLuong = luongCB * heSoLuong;       
        System.out.println(heSoLuong);
        DecimalFormat df = new DecimalFormat("#.##"); 
        String formattedNumber = df.format(tongLuong);   
        this.textField_Salary.setText(formattedNumber.replace(',', '.'));
        
        this.MNV = maNV;
//        System.out.println(this.MNV);
    }

    private double HeSoLuong(String position, int year) {
        double heSo;      
        heSo = switch (position) {
            case "Giám Đốc" -> 2;
            case "Thư Ký" -> 1.5;
            case "Trưởng Phòng" -> 1.7;
            case "Phó Phòng" -> 1.4;
            case "Nhân Viên" -> 1.2;
            case "Thực Tập" -> 0.8;
            default -> 1;
        };       
        if(year <= 0)   return heSo;
        else if(year > 0 && year <= 3)  return heSo*1.3;
        else if(year > 3 && year <= 7)  return heSo*1.5;
        else if(year > 7 && year <= 10) return heSo*1.7;
        else     return heSo*2;
    }

    public boolean capNhatNV(NhanVien NV) {
        DisplayNV(this.model.getDsNV());
        for (NhanVien nv : this.model.getDsNV()) {
            if(NV.getMaNV() == nv.getMaNV() && NV.getMaNV() != this.MNV )   return false;
        }
        this.model.CapNhatNV(this.MNV, NV);
        DisplayNV(this.model.getDsNV());
        this.xoaForm();
        this.setEnable(false);
        this.WriteFileNV();
        return true;
    }

    public void timKiemNV() {
        DisplayNV(this.model.getDsNV());
        DefaultTableModel modelTable = (DefaultTableModel) table_Staff.getModel();
        int countRow = modelTable.getRowCount();
        String maNV = this.textField_MNVSearch.getText();
        ArrayList<String> idCanXoa = new ArrayList<>();
        
        if(maNV.length() > 0) {
            for(int i = 0; i < countRow; i++) {
                String id = modelTable.getValueAt(i, 0)+"";
                if(!id.equals(maNV)) {
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
        textField_MNVSearch.setText("");
        DisplayNV(this.model.getDsNV());
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
        this.model.setDsNV(nhanVien);       
    }
    
    private void WriteFileNV() {
        try {       
            FileOutputStream fos = new FileOutputStream("nhanvien.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(NhanVien nv:this.model.getDsNV()) {
                oos.writeObject(nv);
            }
            oos.close();
        } catch (IOException e) {
            System.err.println("Lỗi ghi file - dòng 1102");
        }
    }
}
