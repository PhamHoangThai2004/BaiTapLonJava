/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package execute;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import view.QLNVView;

public class MAIN {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            QLNVView qlnvView = new QLNVView();
        }
        catch(ClassNotFoundException | IllegalAccessException | InstantiationException 
                | UnsupportedLookAndFeelException e) {
            System.err.println("Lỗi hiển thị frame - dòng 19");
        }
    }
}
