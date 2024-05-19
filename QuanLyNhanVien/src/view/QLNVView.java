/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.*;
import java.awt.HeadlessException;
import java.io.File;
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
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import javax.swing.table.DefaultTableModel;
import model.*;

public class QLNVView extends javax.swing.JFrame {

    public ButtonGroup buttonGroup;
    public JPopupMenu popupMenu;
    public JMenuItem menuItem_Delete;
    public JMenuItem menuItem_Update;
    public DSPhongBan dsPhongBan;
    public QLNVModel model;
    public boolean trangThai;
    private int MNV;
    private String MPB;
    private String tenFile;

    public String getTenFile() {
        return tenFile;
    }

    public void setTenFile(String tenFile) {
        this.tenFile = tenFile;
    }
  
    
    public QLNVView() {
        this.trangThai = true; 
        this.tenFile = "";
        initComponents();
        this.setLocationRelativeTo(null);
        dsPhongBan = new DSPhongBan();
        this.model = new QLNVModel();
        this.ReadFilePB();
        this.setProperty();
        this.setVisible(true);
        DisplayPB(dsPhongBan.getDsPB());
    }
    
    public void setProperty() {
        ArrayList<Tinh> listTinh = Tinh.getDSTinh();
        for (Tinh t : listTinh) {
            comboBox_Address.addItem(t.getTenTinh());
        }
        this.comboBox_Address.setSelectedIndex(-1);     

        this.EditComboBox();
        
        String[] listPosition = {"Giám Đốc","Thư kí", "Trưởng Phòng", "Phó Phòng",
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
        menuItem_Update = new JMenuItem("Chỉnh sửa");
        popupMenu.add(menuItem_Delete);
        popupMenu.add(menuItem_Update);      
        this.add(popupMenu);
        
        QLNVMouseListen molis = new QLNVMouseListen(this);
        this.table.addMouseListener(molis);
        
        QLNVController act = new QLNVController(this);
        menuItem_NewFile.addActionListener(act);
        menuItem_OpenFile.addActionListener(act);
        menuItem_Save.addActionListener(act);
        menuItem_Close.addActionListener(act);
        menuItem_Exit.addActionListener(act);
        menuItem_SearchStaffByID.addActionListener(act);
        menuItem_SearchStaffByName.addActionListener(act);
        menuItem_SearchStaffByDivision.addActionListener(act);
        menuItem_SearchDepartmentByID.addActionListener(act);
        menuItem_SearchDepartmentByName.addActionListener(act);
        menuItem_ShowSaff.addActionListener(act);
        menuItem_ShowDepartment.addActionListener(act);
        menuItem_Help.addActionListener(act);
        button_AddBP.addActionListener(act);
        button_AddSaff.addActionListener(act);
        button_Save.addActionListener(act);
        button_Cancel.addActionListener(act);
        menuItem_Delete.addActionListener(act);
        menuItem_Update.addActionListener(act);
        
        this.table.setRowHeight(25);
        
        QLNVWindowListener Wl = new QLNVWindowListener(this);
//        this.addWindowListener(Wl);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        panel_Infor = new javax.swing.JPanel();
        label_Name = new javax.swing.JLabel();
        label_Bod = new javax.swing.JLabel();
        label_MNV = new javax.swing.JLabel();
        textField_DayStartWork = new javax.swing.JTextField();
        textField_Name = new javax.swing.JTextField();
        textField_MNV = new javax.swing.JTextField();
        label_Department = new javax.swing.JLabel();
        textField_MBP = new javax.swing.JTextField();
        label_Position = new javax.swing.JLabel();
        label_Sex = new javax.swing.JLabel();
        label_Address = new javax.swing.JLabel();
        label_DayStartWork = new javax.swing.JLabel();
        label_Salary = new javax.swing.JLabel();
        label_BasicSalary = new javax.swing.JLabel();
        radioButton_Male = new javax.swing.JRadioButton();
        radioButton_Female = new javax.swing.JRadioButton();
        comboBox_Address = new javax.swing.JComboBox<>();
        textField_BasicSalary = new javax.swing.JTextField();
        textField_Salary = new javax.swing.JTextField();
        textField_Dob = new javax.swing.JTextField();
        label_MBP = new javax.swing.JLabel();
        textField_NameBP = new javax.swing.JTextField();
        label_NameBP = new javax.swing.JLabel();
        label_Found = new javax.swing.JLabel();
        textField_Found = new javax.swing.JTextField();
        comboBox_MPB = new javax.swing.JComboBox<>();
        comboBox_Position = new javax.swing.JComboBox<>();
        panel_Button = new javax.swing.JPanel();
        button_AddSaff = new javax.swing.JButton();
        button_Cancel = new javax.swing.JButton();
        separator_button = new javax.swing.JSeparator();
        button_Save = new javax.swing.JButton();
        button_AddBP = new javax.swing.JButton();
        label_FileName = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menu_File = new javax.swing.JMenu();
        menuItem_NewFile = new javax.swing.JMenuItem();
        menuItem_OpenFile = new javax.swing.JMenuItem();
        separator_Menu1 = new javax.swing.JPopupMenu.Separator();
        menuItem_Save = new javax.swing.JMenuItem();
        menuItem_Close = new javax.swing.JMenuItem();
        separator_Menu2 = new javax.swing.JPopupMenu.Separator();
        menuItem_Exit = new javax.swing.JMenuItem();
        menuSearch = new javax.swing.JMenu();
        menuFindStaff = new javax.swing.JMenu();
        menuItem_SearchStaffByID = new javax.swing.JMenuItem();
        menuItem_SearchStaffByName = new javax.swing.JMenuItem();
        menuItem_SearchStaffByDivision = new javax.swing.JMenuItem();
        menu_Finđepảtment = new javax.swing.JMenu();
        menuItem_SearchDepartmentByID = new javax.swing.JMenuItem();
        menuItem_SearchDepartmentByName = new javax.swing.JMenuItem();
        menu_View = new javax.swing.JMenu();
        menuItem_ShowSaff = new javax.swing.JMenuItem();
        menuItem_ShowDepartment = new javax.swing.JMenuItem();
        menu_About = new javax.swing.JMenu();
        menuItem_Help = new javax.swing.JMenuItem();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Emplyee Manager");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        table.setEnabled(false);
        jScrollPane1.setViewportView(table);

        label_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Name.setText("Họ và tên:");

        label_Bod.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Bod.setText("Ngày sinh:");

        label_MNV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_MNV.setText("Mã nhân viên:");

        textField_DayStartWork.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_DayStartWork.setEnabled(false);

        textField_Name.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_Name.setEnabled(false);

        textField_MNV.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_MNV.setEnabled(false);

        label_Department.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Department.setText("Phòng ban:");

        textField_MBP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textField_MBP.setEnabled(false);

        label_Position.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Position.setText("Chức vụ:");

        label_Sex.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Sex.setText("Giới Tính:");

        label_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Address.setText("Địa chỉ:");

        label_DayStartWork.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_DayStartWork.setText("Ngày vào làm:");

        label_Salary.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_Salary.setText("Tổng lương:");

        label_BasicSalary.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_BasicSalary.setText("Lương cơ bản:");

        radioButton_Male.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioButton_Male.setText("Nam");
        radioButton_Male.setEnabled(false);

        radioButton_Female.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        radioButton_Female.setText("Nữ");
        radioButton_Female.setEnabled(false);

        comboBox_Address.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboBox_Address.setEnabled(false);

        textField_BasicSalary.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_BasicSalary.setEnabled(false);

        textField_Salary.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_Salary.setEnabled(false);

        textField_Dob.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        textField_Dob.setEnabled(false);

        label_MBP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        label_MBP.setText("Mã bộ phận:");

        textField_NameBP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textField_NameBP.setEnabled(false);

        label_NameBP.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        label_NameBP.setText("Tên bộ phận:");

        label_Found.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        label_Found.setText("Ngày thành lập:");

        textField_Found.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        textField_Found.setEnabled(false);

        comboBox_MPB.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboBox_MPB.setEnabled(false);

        comboBox_Position.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        comboBox_Position.setEnabled(false);

        javax.swing.GroupLayout panel_InforLayout = new javax.swing.GroupLayout(panel_Infor);
        panel_Infor.setLayout(panel_InforLayout);
        panel_InforLayout.setHorizontalGroup(
            panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InforLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(label_MNV, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(label_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(label_Bod, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(label_Position, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                    .addComponent(label_Department, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(textField_Name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(textField_Dob, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                        .addComponent(textField_MNV, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(comboBox_MPB, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_Position, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_BasicSalary)
                    .addComponent(label_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_DayStartWork, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_InforLayout.createSequentialGroup()
                        .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_InforLayout.createSequentialGroup()
                                .addComponent(radioButton_Male)
                                .addGap(18, 18, 18)
                                .addComponent(radioButton_Female))
                            .addComponent(textField_BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_DayStartWork, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(panel_InforLayout.createSequentialGroup()
                                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(label_NameBP, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_Found))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textField_NameBP)
                                    .addComponent(textField_Found)))
                            .addGroup(panel_InforLayout.createSequentialGroup()
                                .addComponent(label_MBP, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textField_MBP, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 44, Short.MAX_VALUE))
                    .addGroup(panel_InforLayout.createSequentialGroup()
                        .addComponent(comboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(141, 141, 141))))
        );
        panel_InforLayout.setVerticalGroup(
            panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_InforLayout.createSequentialGroup()
                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_InforLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radioButton_Male)
                            .addComponent(radioButton_Female))
                        .addGap(18, 18, 18)
                        .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Bod, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Dob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_NameBP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_NameBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_DayStartWork, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_DayStartWork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_InforLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_MBP, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_MBP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_MPB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_InforLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_Position, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(comboBox_Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(label_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_InforLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_InforLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_Found, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField_Found, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))))
        );

        button_AddSaff.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_AddSaff.setText("Thêm nhân viên");

        button_Cancel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_Cancel.setText("Hủy bỏ");

        button_Save.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_Save.setText("Lưu");

        button_AddBP.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        button_AddBP.setText("Thêm phòng ban");

        javax.swing.GroupLayout panel_ButtonLayout = new javax.swing.GroupLayout(panel_Button);
        panel_Button.setLayout(panel_ButtonLayout);
        panel_ButtonLayout.setHorizontalGroup(
            panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ButtonLayout.createSequentialGroup()
                .addGroup(panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(separator_button)
                    .addGroup(panel_ButtonLayout.createSequentialGroup()
                        .addGroup(panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_AddSaff, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(panel_ButtonLayout.createSequentialGroup()
                                    .addGap(36, 36, 36)
                                    .addGroup(panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(panel_ButtonLayout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(button_AddBP))))
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_ButtonLayout.setVerticalGroup(
            panel_ButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_ButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_AddSaff, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_AddBP, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(separator_button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(button_Cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        label_FileName.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        label_FileName.setText("Not file");

        menu_File.setText("File");
        menu_File.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuItem_NewFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItem_NewFile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_NewFile.setText("New File");
        menu_File.add(menuItem_NewFile);

        menuItem_OpenFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItem_OpenFile.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_OpenFile.setText("Open File");
        menu_File.add(menuItem_OpenFile);
        menu_File.add(separator_Menu1);

        menuItem_Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItem_Save.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_Save.setText("Save");
        menu_File.add(menuItem_Save);

        menuItem_Close.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_W, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        menuItem_Close.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_Close.setText("Close");
        menu_File.add(menuItem_Close);
        menu_File.add(separator_Menu2);

        menuItem_Exit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_DOWN_MASK));
        menuItem_Exit.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_Exit.setText("Exit");
        menu_File.add(menuItem_Exit);

        menuBar.add(menu_File);

        menuSearch.setText("Search");
        menuSearch.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuFindStaff.setText("Find Staff");
        menuFindStaff.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuItem_SearchStaffByID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_SearchStaffByID.setText("Search Staff By ID");
        menuFindStaff.add(menuItem_SearchStaffByID);

        menuItem_SearchStaffByName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_SearchStaffByName.setText("Search Staff By Name");
        menuFindStaff.add(menuItem_SearchStaffByName);

        menuItem_SearchStaffByDivision.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_SearchStaffByDivision.setText("Search Staff By Division");
        menuFindStaff.add(menuItem_SearchStaffByDivision);

        menuSearch.add(menuFindStaff);

        menu_Finđepảtment.setText("Find Department");
        menu_Finđepảtment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuItem_SearchDepartmentByID.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_SearchDepartmentByID.setText("Search Department By ID");
        menu_Finđepảtment.add(menuItem_SearchDepartmentByID);

        menuItem_SearchDepartmentByName.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_SearchDepartmentByName.setText("Search Department By Name");
        menu_Finđepảtment.add(menuItem_SearchDepartmentByName);

        menuSearch.add(menu_Finđepảtment);

        menuBar.add(menuSearch);

        menu_View.setText("View");
        menu_View.setDoubleBuffered(true);
        menu_View.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuItem_ShowSaff.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_ShowSaff.setText("Show Saff");
        menu_View.add(menuItem_ShowSaff);

        menuItem_ShowDepartment.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_ShowDepartment.setText("Show Department");
        menuItem_ShowDepartment.setEnabled(false);
        menu_View.add(menuItem_ShowDepartment);

        menuBar.add(menu_View);

        menu_About.setText("About");
        menu_About.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N

        menuItem_Help.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        menuItem_Help.setText("Help");
        menu_About.add(menuItem_Help);

        menuBar.add(menu_About);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_FileName, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel_Button, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_Infor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(label_FileName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel_Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Infor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton button_AddBP;
    public javax.swing.JButton button_AddSaff;
    public javax.swing.JButton button_Cancel;
    public javax.swing.JButton button_Save;
    public javax.swing.JComboBox<String> comboBox_Address;
    public javax.swing.JComboBox<String> comboBox_MPB;
    public javax.swing.JComboBox<String> comboBox_Position;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Address;
    private javax.swing.JLabel label_BasicSalary;
    private javax.swing.JLabel label_Bod;
    private javax.swing.JLabel label_DayStartWork;
    private javax.swing.JLabel label_Department;
    public javax.swing.JLabel label_FileName;
    private javax.swing.JLabel label_Found;
    private javax.swing.JLabel label_MBP;
    private javax.swing.JLabel label_MNV;
    private javax.swing.JLabel label_Name;
    private javax.swing.JLabel label_NameBP;
    private javax.swing.JLabel label_Position;
    private javax.swing.JLabel label_Salary;
    private javax.swing.JLabel label_Sex;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFindStaff;
    public javax.swing.JMenuItem menuItem_Close;
    public javax.swing.JMenuItem menuItem_Exit;
    public javax.swing.JMenuItem menuItem_Help;
    public javax.swing.JMenuItem menuItem_NewFile;
    public javax.swing.JMenuItem menuItem_OpenFile;
    public javax.swing.JMenuItem menuItem_Save;
    public javax.swing.JMenuItem menuItem_SearchDepartmentByID;
    public javax.swing.JMenuItem menuItem_SearchDepartmentByName;
    public javax.swing.JMenuItem menuItem_SearchStaffByDivision;
    public javax.swing.JMenuItem menuItem_SearchStaffByID;
    public javax.swing.JMenuItem menuItem_SearchStaffByName;
    public javax.swing.JMenuItem menuItem_ShowDepartment;
    public javax.swing.JMenuItem menuItem_ShowSaff;
    private javax.swing.JMenu menuSearch;
    private javax.swing.JMenu menu_About;
    private javax.swing.JMenu menu_File;
    private javax.swing.JMenu menu_Finđepảtment;
    private javax.swing.JMenu menu_View;
    private javax.swing.JPanel panel_Button;
    private javax.swing.JPanel panel_Infor;
    public javax.swing.JRadioButton radioButton_Female;
    public javax.swing.JRadioButton radioButton_Male;
    private javax.swing.JPopupMenu.Separator separator_Menu1;
    private javax.swing.JPopupMenu.Separator separator_Menu2;
    private javax.swing.JSeparator separator_button;
    public javax.swing.JTable table;
    public javax.swing.JTextField textField_BasicSalary;
    public javax.swing.JTextField textField_DayStartWork;
    public javax.swing.JTextField textField_Dob;
    public javax.swing.JTextField textField_Found;
    public javax.swing.JTextField textField_MBP;
    public javax.swing.JTextField textField_MNV;
    public javax.swing.JTextField textField_Name;
    public javax.swing.JTextField textField_NameBP;
    public javax.swing.JTextField textField_Salary;
    // End of variables declaration//GEN-END:variables

    private void EditList(ArrayList<NhanVien> list) {
        int j = 0;
        for (NhanVien NV : list) {
            j++;
            int i = 0;
            for (PhongBan PB : this.dsPhongBan.getDsPB()) {
                if(NV.getPhongBan().getTenPB().equals(PB.getTenPB())) {
                    i = 1;
                    break;
                }
            }
            if(i == 0)  {
                Date date = new Date(1, 1, 1);
                PhongBan phongBan = new PhongBan("Not", "Không có PB", date);
                NV.setPhongBan(phongBan);
            }
            System.out.println("Số j = " + j);
        }
    }
    
    public void EditComboBox() {
       this.comboBox_MPB.removeAllItems();
       for (PhongBan pb : dsPhongBan.getDsPB()) {
            comboBox_MPB.addItem(pb.getTenPB());
        }
        comboBox_MPB.addItem("Không có PB");
        comboBox_MPB.setSelectedIndex(-1);
    }  
    
    private void ReadFilePB() {
        ArrayList<PhongBan> phongBan = new ArrayList<>();

        try {          
            FileInputStream fis = new FileInputStream("data.dat");
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
            System.err.println(e.getMessage());
        }
        this.dsPhongBan.setDsPB(phongBan);
    }
    
    private void WriteFilePB() {
         try {          
            FileOutputStream fos = new FileOutputStream("data.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(PhongBan pb:this.dsPhongBan.getDsPB()) {
                oos.writeObject(pb);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private double HeSoLuong(String position, int year) {
        double heSo;      
        heSo = switch (position) {
            case "Giám Đốc" -> 2;
            case "Thư kí" -> 1.5;
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
    
    public final void DisplayNV(ArrayList<NhanVien> DSNV) {
        DefaultTableModel modelTable = new DefaultTableModel();
        table.setModel(modelTable);
        modelTable.addColumn("ID");
	modelTable.addColumn("Họ và tên");
        modelTable.addColumn("Ngày sinh");
        modelTable.addColumn("Giới tính");
        modelTable.addColumn("Địa chỉ");
        modelTable.addColumn("Phòng ban");
        modelTable.addColumn("Chức vụ");
        modelTable.addColumn("Ngày vào làm");
        modelTable.addColumn("Lương cơ bản");
	try {
            for(NhanVien NV:DSNV) {
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
            this.trangThai = true;
        } catch (Exception e) {
            System.err.println("Danh sách null");
        }
    }
    
    public void DisplayPB(ArrayList<PhongBan> DSPB) {
        DefaultTableModel modelTable = new DefaultTableModel();
        table.setModel(modelTable);
        modelTable.addColumn("Mã phòng ban");
	modelTable.addColumn("Tên phòng ban");
        modelTable.addColumn("Ngày thành lập");
        try {
            for(PhongBan PB:DSPB) {
            modelTable.addRow(
                                new Object[] {
                                        PB.getMaPB()+"",
					PB.getTenPB()+"",					
					(PB.getNgayTL().getMonth()+1)+"/"+PB.getNgayTL().getDate()+
                                                "/"+(PB.getNgayTL().getYear()+1900)});
                            }
            this.trangThai = false;
        } catch (Exception e) {
            System.err.println("Danh sách null");
        }
    }
    
    public void THOAT() {
        int confirm = JOptionPane.showConfirmDialog(this,
                "Bạn có chắc chắn muốn thoát!", "THOÁT", JOptionPane.ERROR_MESSAGE);
        if(confirm == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void showHelp() {
        JOptionPane.showMessageDialog(this, "Phần mềm quản lý nhân viên 1.0.0");
    }

    public void setEnable(boolean b1, boolean b2) {
        textField_MNV.setEnabled(b1);
        textField_Name.setEnabled(b1);
        textField_Dob.setEnabled(b1);
        comboBox_MPB.setEnabled(b1);
        comboBox_Position.setEnabled(b1);
        radioButton_Male.setEnabled(b1);
        radioButton_Female.setEnabled(b1);
        comboBox_Address.setEnabled(b1);
        textField_DayStartWork.setEnabled(b1);
        textField_BasicSalary.setEnabled(b1);
        
        textField_MBP.setEnabled(b2);
        textField_NameBP.setEnabled(b2);
        textField_Found.setEnabled(b2);
    }

    public void xoaForm(int i) {
        if(i == 0) {
            textField_MNV.setText("");
            textField_Name.setText("");
            textField_Dob.setText("");
            comboBox_MPB.setSelectedIndex(-1);
            comboBox_Position.setSelectedIndex(-1);
            buttonGroup.clearSelection();
            comboBox_Address.setSelectedIndex(-1);
            textField_DayStartWork.setText("");
            textField_BasicSalary.setText("");
            textField_MBP.setText("");
            textField_NameBP.setText("");
            textField_Found.setText("");
            textField_Salary.setText("");
        }
        else {
            if(i == -1) {
                textField_MBP.setText("");
                textField_NameBP.setText("");
                textField_Found.setText("");
            }
            else if(i == 1) {
                textField_MNV.setText("");
                textField_Name.setText("");
                textField_Dob.setText("");
                comboBox_MPB.setSelectedIndex(-1);
                comboBox_Position.setSelectedIndex(-1);
                buttonGroup.clearSelection();
                comboBox_Address.setSelectedIndex(-1);
                textField_DayStartWork.setText("");
                textField_BasicSalary.setText("");
                textField_Salary.setText("");
            }
        }    
    }

    public void themNV(NhanVien NV) {
        model.ThemNV(NV);
        model.In();
        DisplayNV(this.model.getDsNV());
    }

    public void themPB(PhongBan PB) {
        dsPhongBan.ThemPB(PB);
        dsPhongBan.In();
        this.EditComboBox();
        WriteFilePB();
        DisplayPB(this.dsPhongBan.getDsPB());
    }

    public void xoaNV() {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa!",
                "Confirm", JOptionPane.ERROR_MESSAGE);
        if(luaChon == JOptionPane.YES_OPTION) {
            this.MNV = Integer.parseInt(modelTable.getValueAt(row, 0)+"");
            for(int i = 0; i < this.model.getDsNV().size(); i++) {
                if(this.model.getDsNV().get(i).getMaNV() == this.MNV) {
                    this.model.XoaNV(this.model.getDsNV().get(i));
                }
            }
            this.model.In();
            modelTable.removeRow(row);
        }
    }

    public void xoaPB() {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        int luaChon = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn xóa!",
                "Confirm", JOptionPane.ERROR_MESSAGE);
        if(luaChon == JOptionPane.YES_OPTION) {
            this.MPB = modelTable.getValueAt(row, 0)+"";
            for(int i = 0; i < this.dsPhongBan.getDsPB().size(); i++) {
                if(this.MPB.equals(this.dsPhongBan.getDsPB().get(i).getMaPB())) {
                    this.dsPhongBan.XoaPB(this.dsPhongBan.getDsPB().get(i));
                }
            }
            this.EditComboBox();
            this.dsPhongBan.In();
            modelTable.removeRow(row);
        }
        WriteFilePB();
        this.EditList(this.model.getDsNV());
    }

    public void hienThiNV() {
        this.xoaForm(-1);
        this.setEnable(true, false);
        DefaultTableModel modeltable = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        
        int maNV = Integer.parseInt(modeltable.getValueAt(row, 0)+"");
        String tenNV = modeltable.getValueAt(row, 1)+"";
        String ngaySinh = modeltable.getValueAt(row, 2)+"";
        String chonGT = modeltable.getValueAt(row, 3)+"";
        Tinh tinh = Tinh.getTinhByName(modeltable.getValueAt(row, 4)+"");
        PhongBan phongBan = this.dsPhongBan.TimPBByName(modeltable.getValueAt(row, 5)+"");
        String chucVu = modeltable.getValueAt(row, 6)+"";
        String ngayVaoLam = modeltable.getValueAt(row, 7)+"";
        double luongCB = Double.parseDouble(modeltable.getValueAt(row, 8)+"");
        
        textField_MNV.setText(maNV+"");
        textField_Name.setText(tenNV);
        textField_Dob.setText(ngaySinh);       
        comboBox_MPB.setSelectedItem(phongBan.getTenPB());
        comboBox_Position.setSelectedItem(chucVu);
        if(chonGT.equals("Nam"))  radioButton_Male.setSelected(true);
        else  radioButton_Female.setSelected(true);
        comboBox_Address.setSelectedItem(tinh.getTenTinh()                                                                                                                                  );
        textField_DayStartWork.setText(ngayVaoLam);
        textField_BasicSalary.setText(luongCB+"");
        
        Date dateOfWork = new Date(ngayVaoLam);
        int workYear = dateOfWork.getYear()+1900;
        
        LocalDate persentDate = LocalDate.now();
        int nowYear = persentDate.getYear();
              
        double tongLuong = luongCB * HeSoLuong(chucVu, nowYear-workYear);       
        
        DecimalFormat df = new DecimalFormat("#.##"); 
        String formattedNumber = df.format(tongLuong);   
        this.textField_Salary.setText(formattedNumber.replace(',', '.'));
        
        this.MNV = maNV;
    }

    public void hienThiPB() {
        this.xoaForm(1);
        this.setEnable(false, true);
        DefaultTableModel modeltable = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        
        String maPB = modeltable.getValueAt(row, 0)+"";
        String tenPB = modeltable.getValueAt(row, 1)+"";
        String ngayTL = modeltable.getValueAt(row, 2)+"";
        
        textField_MBP.setText(maPB);
        textField_NameBP.setText(tenPB);
        textField_Found.setText(ngayTL);
        
        this.MPB = maPB;
    }

    public void capNhatNV(NhanVien nv) {
        this.model.CapNhatNV(this.MNV, nv);
        DisplayNV(this.model.getDsNV());
        this.xoaForm(1);
    }

    public void capNhatPB(PhongBan pb) {
        this.dsPhongBan.CapNhatPB(this.MPB, pb);
        DisplayPB(this.dsPhongBan.getDsPB());
        this.xoaForm(-1);     
        this.EditList(this.model.getDsNV());
        WriteFilePB();
        this.EditComboBox();
    }

    public void timNVByID(int maNV) {              
        ArrayList<NhanVien> dsID = new ArrayList<>();      
        for (NhanVien NV : this.model.getDsNV()) {
            if(maNV == NV.getMaNV())  dsID.add(NV);
        }
        DisplayNV(dsID);
    }

    public void timNVByName(String tenNV) {
        ArrayList<NhanVien> dsName = new ArrayList<>();      
        for (NhanVien NV : this.model.getDsNV()) {
            if(tenNV.equals(NV.getTenNV()))  dsName.add(NV);
        }
        DisplayNV(dsName);
    }

    public void timNVByDivision(String maBP) {
        ArrayList<NhanVien> dsBP = new ArrayList<>();      
        for (NhanVien NV : this.model.getDsNV()) {
            if(maBP.equals(NV.getPhongBan().getMaPB()))  dsBP.add(NV);
        }
        DisplayNV(dsBP);
    }

    public void timPBByID(String maPB) {
        ArrayList<PhongBan> dsPB = new ArrayList<>();      
        for (PhongBan PB : this.dsPhongBan.getDsPB()) {
            if(maPB.equals(PB.getMaPB()))  dsPB.add(PB);
        }
        DisplayPB(dsPB);
    }

    public void timPBByName(String tenPB) {
        ArrayList<PhongBan> dsPB = new ArrayList<>();      
        for (PhongBan PB : this.dsPhongBan.getDsPB()) {
            if(tenPB.equals(PB.getTenPB()))  dsPB.add(PB);
        }
        DisplayPB(dsPB);
    }

    public void createFiles() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("New File");
        int choose = fileChooser.showSaveDialog(this);
        
        if(choose == JFileChooser.APPROVE_OPTION) {
            File fileToCreate = fileChooser.getSelectedFile();
            try {
                if(fileToCreate.exists()) {
                    JOptionPane.showMessageDialog(this, "File này đã tồn tại",
                            "Error", JOptionPane.ERROR_MESSAGE);
                }
                else {
                    fileToCreate.createNewFile();
                    this.setTenFile(fileToCreate.getAbsolutePath());
                    this.label_FileName.setText(fileToCreate.getAbsolutePath());
                    DisplayNV(this.model.getDsNV());
                    this.menuItem_ShowSaff.setEnabled(false);
                    this.menuItem_ShowDepartment.setEnabled(true); 
                }
            } catch (HeadlessException | IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Open File");
        int choose = fileChooser.showOpenDialog(this);
        if(choose == JFileChooser.APPROVE_OPTION) {
            File fileToOpen = fileChooser.getSelectedFile();
            ReadFileNV(fileToOpen.getAbsolutePath());
            DisplayNV(this.model.getDsNV());
            this.menuItem_ShowSaff.setEnabled(false);
            this.menuItem_ShowDepartment.setEnabled(true);
        }
    }

    private void ReadFileNV(String tenFile) {
        System.out.println("Có tìm thấy file nv");
        this.label_FileName.setText(tenFile);
        ArrayList<NhanVien> nhanVien = new ArrayList<>();
        this.setTenFile(tenFile);
        try {                     
            FileInputStream fis = new FileInputStream(tenFile);
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
            System.err.println(e.getMessage());
        }
        this.EditList(nhanVien);
        this.model.setDsNV(nhanVien);       
    }

    public void saveFile() {
        if(this.getTenFile().length() > 0) {
            WriteFileNV(this.getTenFile());
        }
        else {
            JFileChooser fileChooser = new JFileChooser();
            int choose = fileChooser.showSaveDialog(this);
            if(choose == JFileChooser.APPROVE_OPTION) {
                
                File file = fileChooser.getSelectedFile();
                WriteFileNV(file.getAbsolutePath());
            }
        }
    }

    private void WriteFileNV(String tenFile) {
        this.setTenFile(tenFile);
        try {       
            FileOutputStream fos = new FileOutputStream(tenFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(NhanVien nv:this.model.getDsNV()) {
                oos.writeObject(nv);
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void closeFile() {
        this.model.setDsNV(null);
        this.setTenFile("");
        this.label_FileName.setText("");
        DisplayNV(this.model.getDsNV());
    }
}
