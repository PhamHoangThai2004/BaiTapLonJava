package execute;

import java.awt.BorderLayout;
import view.QLNV_Admin;

public class QLNVMain extends javax.swing.JFrame {

    
    public QLNVMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout());
        this.add(new QLNV_Admin(), BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menu_Edit = new javax.swing.JMenu();
        menuItem_CreateAccount = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        menuItem_ShowStaff = new javax.swing.JMenuItem();
        menuItem_ShowDepartment = new javax.swing.JMenuItem();
        menuItem_ShowAccount = new javax.swing.JMenuItem();
        menu_Help = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_Edit.setText("Edit");

        menuItem_CreateAccount.setText("Tạo Tài Khoản");
        menu_Edit.add(menuItem_CreateAccount);

        menuBar.add(menu_Edit);

        menuView.setText("View");

        menuItem_ShowStaff.setText("Show Staff");
        menuView.add(menuItem_ShowStaff);

        menuItem_ShowDepartment.setText("Show Department");
        menuView.add(menuItem_ShowDepartment);

        menuItem_ShowAccount.setText("Show Account");
        menuView.add(menuItem_ShowAccount);

        menuBar.add(menuView);

        menu_Help.setText("Help");
        menuBar.add(menu_Help);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuItem_CreateAccount;
    private javax.swing.JMenuItem menuItem_ShowAccount;
    private javax.swing.JMenuItem menuItem_ShowDepartment;
    private javax.swing.JMenuItem menuItem_ShowStaff;
    private javax.swing.JMenu menuView;
    private javax.swing.JMenu menu_Edit;
    private javax.swing.JMenu menu_Help;
    // End of variables declaration//GEN-END:variables
}
