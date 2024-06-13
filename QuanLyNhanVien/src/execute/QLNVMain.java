package execute;

import controller.MainListen;
import java.awt.BorderLayout;
import java.awt.Component;
import javax.swing.ImageIcon;

public class QLNVMain extends javax.swing.JFrame {
    public Component component;
    
    public QLNVMain(Component component) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setProperty();
        this.component = component;    
        this.setLayout(new BorderLayout());      
        this.add(this.component, BorderLayout.CENTER);
        this.setVisible(true);
    }
    
    private void setProperty() {
        MainListen mainListen = new MainListen(this);
        menuItem_Logout.addActionListener(mainListen);
        menuItem_ShowStaff.addActionListener(mainListen);
        menuItem_ShowDepartment.addActionListener(mainListen);
        menuItem_ShowAccount.addActionListener(mainListen);
        menuItem_About.addActionListener(mainListen);
        menuItem_Exit.addActionListener(mainListen);
        
        ImageIcon img = new ImageIcon(getClass().getResource("/icon/QLNV24px.png"));
        this.setIconImage(img.getImage());
        this.setTitle("Employee Manager");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        menu_Edit = new javax.swing.JMenu();
        menuItem_Logout = new javax.swing.JMenuItem();
        menuView = new javax.swing.JMenu();
        menuItem_ShowStaff = new javax.swing.JMenuItem();
        menuItem_ShowDepartment = new javax.swing.JMenuItem();
        menuItem_ShowAccount = new javax.swing.JMenuItem();
        menu_Help = new javax.swing.JMenu();
        menuItem_About = new javax.swing.JMenuItem();
        menuItem_Exit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu_Edit.setText("Edit");

        menuItem_Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/LogOut16px.png"))); // NOI18N
        menuItem_Logout.setText("Log Out");
        menu_Edit.add(menuItem_Logout);

        menuBar.add(menu_Edit);

        menuView.setText("View");

        menuItem_ShowStaff.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/showsaff16px.png"))); // NOI18N
        menuItem_ShowStaff.setText("Show Staff");
        menuView.add(menuItem_ShowStaff);

        menuItem_ShowDepartment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/department16px.png"))); // NOI18N
        menuItem_ShowDepartment.setText("Show Department");
        menuView.add(menuItem_ShowDepartment);

        menuItem_ShowAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/savefile16px.png"))); // NOI18N
        menuItem_ShowAccount.setText("Show Account");
        menuView.add(menuItem_ShowAccount);

        menuBar.add(menuView);

        menu_Help.setText("Help");

        menuItem_About.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/About16px.png"))); // NOI18N
        menuItem_About.setText("About");
        menu_Help.add(menuItem_About);

        menuItem_Exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/exit16px.png"))); // NOI18N
        menuItem_Exit.setText("Exit");
        menu_Help.add(menuItem_Exit);

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
    private javax.swing.JMenuItem menuItem_About;
    private javax.swing.JMenuItem menuItem_Exit;
    private javax.swing.JMenuItem menuItem_Logout;
    private javax.swing.JMenuItem menuItem_ShowAccount;
    private javax.swing.JMenuItem menuItem_ShowDepartment;
    private javax.swing.JMenuItem menuItem_ShowStaff;
    public javax.swing.JMenu menuView;
    private javax.swing.JMenu menu_Edit;
    private javax.swing.JMenu menu_Help;
    // End of variables declaration//GEN-END:variables

    public void editPanel(Component component) {
        if(component.getClass() != this.component.getClass()) {
            this.remove(this.component);
            this.add(component);
            this.component = component;
            this.revalidate();
            this.repaint();
        }
    }
}
