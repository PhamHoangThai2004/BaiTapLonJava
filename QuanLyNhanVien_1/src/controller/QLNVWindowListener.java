/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import view.QLNVView;

public class QLNVWindowListener implements WindowListener{
    private final QLNVView view;

    public QLNVWindowListener(QLNVView view) {
        this.view = view;
    }
    
    @Override
    public void windowOpened(WindowEvent e) {
    }

    @Override
    public void windowClosing(WindowEvent e) {
        int choose = JOptionPane.showConfirmDialog(this.view, 
                "Bạn có muốn lưu files không?", "Save File",
                JOptionPane.YES_NO_CANCEL_OPTION);
        switch (choose) {
            case JOptionPane.YES_OPTION:
                this.view.saveFile();
                break;
            case JOptionPane.NO_OPTION:
                System.exit(0);
            default:
                this.view.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                break;
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {
    }

    @Override
    public void windowIconified(WindowEvent e) {
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
    }

    @Override
    public void windowActivated(WindowEvent e) {
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
    }
    
}
