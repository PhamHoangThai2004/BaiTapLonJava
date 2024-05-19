/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import view.QLNVView;



public class QLNVMouseListen implements MouseListener{
    private QLNVView view;

    public QLNVMouseListen(QLNVView view) {
        this.view = view;
    }
    
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        if (SwingUtilities.isRightMouseButton(e)) {
                    int r = this.view.table.rowAtPoint(e.getPoint());
                    if (r >= 0 && r < this.view.table.getRowCount()) {
                        this.view.table.setRowSelectionInterval(r, r);
                    } else {
                        this.view.table.clearSelection();
                    }
                    int rowindex = this.view.table.getSelectedRow();
                    if (rowindex < 0)
                        return;
                    if (e.isPopupTrigger() && e.getComponent() instanceof JTable) {
                        this.view.popupMenu.show(e.getComponent(), e.getX(), e.getY());
                    }
                }
//            }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
}
