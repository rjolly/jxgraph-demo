/*
 * ColorButton.java
 *
 * Created on 16 mars 2006, 15:33
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package org.jdesktop.swingx.demo;

import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 *
 * @author gfx
 */
class ColorButton extends JPanel {
    public ColorButton() {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        setBorder(BorderFactory.createEtchedBorder());
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintBorder(g);
        
        Insets insets = getBorder().getBorderInsets(this);
        
        g.setColor(getBackground());
        g.fillRect(insets.left, insets.top,
            getWidth() - insets.left - insets.right,
            getHeight() - insets.top - insets.bottom);
    }
}
