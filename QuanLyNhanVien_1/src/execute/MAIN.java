package execute;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class MAIN {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            QLNVMain QLNVMain = new QLNVMain();
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException 
                | UnsupportedLookAndFeelException e) {
            System.err.println("Lỗi hiển thị frame - dòng 19");
        }
    }
}
