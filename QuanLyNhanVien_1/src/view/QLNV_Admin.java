package view;

import javax.swing.ButtonGroup;


public class QLNV_Admin extends javax.swing.JPanel {
    public ButtonGroup buttonGroup;
    
    public QLNV_Admin() {
        initComponents();
        this.setProperty();
    }
    
    private void setProperty() {
        buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton_Male);
        buttonGroup.add(radioButton_Female);     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        table_Employe = new javax.swing.JTable();
        label_MNVSearch = new javax.swing.JLabel();
        label_NameSearch = new javax.swing.JLabel();
        textField_MNV = new javax.swing.JTextField();
        textField_NameSearch = new javax.swing.JTextField();
        label_AddressSearch = new javax.swing.JLabel();
        label_DepartmentSearch = new javax.swing.JLabel();
        comboBox_DepartmentSearch = new javax.swing.JComboBox<>();
        comboBox_AddressSearch = new javax.swing.JComboBox<>();
        separator_Employe = new javax.swing.JSeparator();
        label_EmployeList = new javax.swing.JLabel();
        button_Search = new javax.swing.JButton();
        button_Cancel = new javax.swing.JButton();
        label_MNV = new javax.swing.JLabel();
        label_DoB = new javax.swing.JLabel();
        textFiels_MNV = new javax.swing.JTextField();
        label_Gender = new javax.swing.JLabel();
        textField_Name = new javax.swing.JTextField();
        textField_DoB = new javax.swing.JTextField();
        radioButton_Male = new javax.swing.JRadioButton();
        radioButton_Female = new javax.swing.JRadioButton();
        label_Address = new javax.swing.JLabel();
        label_Department = new javax.swing.JLabel();
        comboBox_Address = new javax.swing.JComboBox<>();
        comboBox_Department = new javax.swing.JComboBox<>();
        label_Position = new javax.swing.JLabel();
        label_StartDay = new javax.swing.JLabel();
        label_BasicSalary = new javax.swing.JLabel();
        comboBox_Position = new javax.swing.JComboBox<>();
        textField_StartDay = new javax.swing.JTextField();
        textField_BasicSalary = new javax.swing.JTextField();
        label_Salary = new javax.swing.JLabel();
        textField_Salary = new javax.swing.JTextField();
        label_Name = new javax.swing.JLabel();

        table_Employe.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        table_Employe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_Employe.setRowHeight(25);
        jScrollPane1.setViewportView(table_Employe);

        label_MNVSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_MNVSearch.setText("Mã Nhân Viên:");

        label_NameSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_NameSearch.setText("Tên Nhân Viên");

        textField_MNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textField_NameSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_AddressSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_AddressSearch.setText("Địa Chỉ:");

        label_DepartmentSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_DepartmentSearch.setText("Tên Phòng Ban:");

        comboBox_DepartmentSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        comboBox_AddressSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_EmployeList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        label_EmployeList.setText("Danh sách nhân viên:");

        button_Search.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Search.setText("Tìm Kiếm");

        button_Cancel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Cancel.setText("Hủy Bỏ");

        label_MNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_MNV.setText("Mã Nhân Viên:");

        label_DoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_DoB.setText("Ngày Sinh:");

        textFiels_MNV.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_Gender.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Gender.setText("Giới Tính: ");

        textField_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textField_DoB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        radioButton_Male.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioButton_Male.setText("Nam");

        radioButton_Female.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        radioButton_Female.setText("Nữ");

        label_Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Address.setText("Địa Chỉ:");

        label_Department.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Department.setText("Phòng Ban:");

        comboBox_Address.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        comboBox_Department.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_Position.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Position.setText("Chức Vụ:");

        label_StartDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_StartDay.setText("Ngày Vào Làm:");

        label_BasicSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_BasicSalary.setText("Lương Cơ Bản:");

        comboBox_Position.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textField_StartDay.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textField_BasicSalary.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        label_Salary.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_Salary.setText("Tổng Lương:");

        textField_Salary.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        label_Name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        label_Name.setText("Họ và Tên:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(separator_Employe, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_MNVSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_NameSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textField_NameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_DepartmentSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_AddressSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(comboBox_DepartmentSearch, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comboBox_AddressSearch, 0, 150, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_Search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(button_Cancel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(173, 173, 173))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label_EmployeList))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(label_MNV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_DoB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_Name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField_Name, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(textFiels_MNV)
                            .addComponent(textField_DoB, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Salary)
                                .addGap(18, 18, 18)
                                .addComponent(textField_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_Address, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_Department, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_Gender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboBox_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioButton_Male)
                                        .addGap(47, 47, 47)
                                        .addComponent(radioButton_Female)))
                                .addGap(68, 68, 68)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_BasicSalary)
                                    .addComponent(label_StartDay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(label_Position, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboBox_Position, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_StartDay, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField_BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_MNVSearch)
                    .addComponent(textField_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_DepartmentSearch)
                    .addComponent(comboBox_DepartmentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_Search))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_NameSearch)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textField_NameSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_AddressSearch)
                        .addComponent(comboBox_AddressSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(button_Cancel)))
                .addGap(18, 18, 18)
                .addComponent(separator_Employe, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_EmployeList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_MNV)
                    .addComponent(textFiels_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Gender)
                    .addComponent(radioButton_Male)
                    .addComponent(radioButton_Female)
                    .addComponent(label_Position)
                    .addComponent(comboBox_Position, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Name)
                    .addComponent(textField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Address)
                    .addComponent(comboBox_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_StartDay)
                    .addComponent(textField_StartDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_DoB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textField_DoB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_Department)
                        .addComponent(comboBox_Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(label_BasicSalary)
                        .addComponent(textField_BasicSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Salary)
                    .addComponent(textField_Salary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Cancel;
    private javax.swing.JButton button_Search;
    private javax.swing.JComboBox<String> comboBox_Address;
    private javax.swing.JComboBox<String> comboBox_AddressSearch;
    private javax.swing.JComboBox<String> comboBox_Department;
    private javax.swing.JComboBox<String> comboBox_DepartmentSearch;
    private javax.swing.JComboBox<String> comboBox_Position;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_Address;
    private javax.swing.JLabel label_AddressSearch;
    private javax.swing.JLabel label_BasicSalary;
    private javax.swing.JLabel label_Department;
    private javax.swing.JLabel label_DepartmentSearch;
    private javax.swing.JLabel label_DoB;
    private javax.swing.JLabel label_EmployeList;
    private javax.swing.JLabel label_Gender;
    private javax.swing.JLabel label_MNV;
    private javax.swing.JLabel label_MNVSearch;
    private javax.swing.JLabel label_Name;
    private javax.swing.JLabel label_NameSearch;
    private javax.swing.JLabel label_Position;
    private javax.swing.JLabel label_Salary;
    private javax.swing.JLabel label_StartDay;
    private javax.swing.JRadioButton radioButton_Female;
    private javax.swing.JRadioButton radioButton_Male;
    private javax.swing.JSeparator separator_Employe;
    private javax.swing.JTable table_Employe;
    private javax.swing.JTextField textField_BasicSalary;
    private javax.swing.JTextField textField_DoB;
    private javax.swing.JTextField textField_MNV;
    private javax.swing.JTextField textField_Name;
    private javax.swing.JTextField textField_NameSearch;
    private javax.swing.JTextField textField_Salary;
    private javax.swing.JTextField textField_StartDay;
    private javax.swing.JTextField textFiels_MNV;
    // End of variables declaration//GEN-END:variables
}
