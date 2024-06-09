/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import execute.QLNVMain;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import javax.swing.JOptionPane;
import model.*;
import view.QLNV_Admin;
import view.QLPB_Admin;
import view.QLTK_Admin;

public class MainListen implements ActionListener {
    private final QLNVMain view;

    public MainListen(QLNVMain view) {
        this.view = view;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();
//        JOptionPane.showMessageDialog(this.view, "Bạn vừa nhấn vào " + s);
        
        if(s.equals("Tạo Tài Khoản")) {
            
        }       
        else if(s.equals("Show Staff")) {
            this.view.editPanel(new QLNV_Admin());
        }
        else if(s.equals("Show Department")) {
            this.view.editPanel(new QLPB_Admin());
        }
        else if(s.equals("Show Account")) {
            this.view.editPanel(new QLTK_Admin());
        }
        else if(s.equals("About")) {
            JOptionPane.showMessageDialog(view, "Phần mềm quản lý nhân viên"
                    , "About", JOptionPane.INFORMATION_MESSAGE);
        }
        else if(s.equals("Exit")) {
            int Confirm = JOptionPane.showConfirmDialog(view, 
                    "Bạn có muốn thoát chương trình", "THOÁT",
                    JOptionPane.ERROR_MESSAGE);
            if(Confirm == JOptionPane.YES_OPTION) System.exit(0);
        }
    }
    
}