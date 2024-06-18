package execute;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.PhongBan;
import view.LoginView;
import view.QLNV_Admin;

public class MAIN {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            LoginView loginView = new LoginView();    
//            PhongBan p = new PhongBan(maPB, tenPB, ngayTL);
//            QLNV_Admin d = new QLNV_Admin();
//            QLNVMain q = new QLNVMain(d);
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException 
                | UnsupportedLookAndFeelException e) {
            System.err.println("Lỗi hiển thị frame - dòng 15");
        }
    }
}
