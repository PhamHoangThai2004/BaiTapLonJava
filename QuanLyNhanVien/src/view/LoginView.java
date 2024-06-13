package view;

import controller.LoginListen;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import model.DSTaiKhoan;
import model.TaiKhoan;

public class LoginView extends javax.swing.JFrame {
    public DSTaiKhoan dsTaiKhoan;
    
    public LoginView() {
        this.dsTaiKhoan = new  DSTaiKhoan();
        initComponents();
        this.setProperty();
        this.setVisible(true);
    }

    private void setProperty() {
        this.ReadFileTK();
        LoginListen lis = new LoginListen(this);
        button_Login.addActionListener(lis);
        
        ImageIcon img = new ImageIcon(getClass().getResource("/icon/QLNV24px.png"));
        this.setIconImage(img.getImage());
        this.setTitle("Employee Manager");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_UserName = new javax.swing.JLabel();
        label_Password = new javax.swing.JLabel();
        textField_UserName = new javax.swing.JTextField();
        passwordField_Password = new javax.swing.JPasswordField();
        label_Title = new javax.swing.JLabel();
        button_Login = new javax.swing.JButton();
        label_Error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        label_UserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_UserName.setText("Tài Khoản:");

        label_Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_Password.setText("Mật Khẩu:");

        textField_UserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        passwordField_Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        label_Title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        label_Title.setText("Quản Lý Nhân Viên");

        button_Login.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        button_Login.setText("Đăng Nhập");

        label_Error.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(label_Title))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_UserName)
                                .addGap(18, 18, 18)
                                .addComponent(textField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Password)
                                .addGap(18, 18, 18)
                                .addComponent(passwordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(label_Error, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(button_Login)))))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_Title)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_UserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_UserName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_Password)
                    .addComponent(passwordField_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Error)
                    .addComponent(button_Login))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Login;
    public javax.swing.JLabel label_Error;
    private javax.swing.JLabel label_Password;
    private javax.swing.JLabel label_Title;
    private javax.swing.JLabel label_UserName;
    public javax.swing.JPasswordField passwordField_Password;
    public javax.swing.JTextField textField_UserName;
    // End of variables declaration//GEN-END:variables

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
 
    public TaiKhoan checkLogin(TaiKhoan TK) {
        for (TaiKhoan tk : this.dsTaiKhoan.getDsTK()) {
            if(TK.getTenTK().equals(tk.getTenTK()) 
                    && TK.getMatKhau().equals(tk.getMatKhau())) return tk;   
        }
        return null;       
    }
}
