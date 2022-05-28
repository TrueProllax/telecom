
package telecom.desk.swing;

import java.awt.Color;


public class field extends javax.swing.JPanel {


    public field() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        text = new javax.swing.JTextField();
        icon_clear = new javax.swing.JLabel();
        background_color = new javax.swing.JPanel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setMinimumSize(new java.awt.Dimension(336, 34));
        setPreferredSize(new java.awt.Dimension(336, 34));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        text.setText("Text");
        text.setBorder(null);
        text.setMinimumSize(new java.awt.Dimension(60, 32));
        text.setOpaque(false);
        text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                textFocusLost(evt);
            }
        });
        text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                textMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                textMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                textMouseReleased(evt);
            }
        });
        text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textKeyReleased(evt);
            }
        });

        icon_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/clear_move.png"))); // NOI18N
        icon_clear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                icon_clearMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                icon_clearMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                icon_clearMouseExited(evt);
            }
        });

        background_color.setBackground(new java.awt.Color(153, 153, 255));
        background_color.setMinimumSize(new java.awt.Dimension(312, 2));
        background_color.setPreferredSize(new java.awt.Dimension(312, 8));

        javax.swing.GroupLayout background_colorLayout = new javax.swing.GroupLayout(background_color);
        background_color.setLayout(background_colorLayout);
        background_colorLayout.setHorizontalGroup(
            background_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        background_colorLayout.setVerticalGroup(
            background_colorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(background_color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(icon_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(icon_clear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(background_color, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void icon_clearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_clearMouseClicked
        text.setText("");
    }//GEN-LAST:event_icon_clearMouseClicked

    private void icon_clearMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_clearMouseEntered
        icon_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/clear_move.png")));
    }//GEN-LAST:event_icon_clearMouseEntered

    private void icon_clearMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_icon_clearMouseExited
        icon_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/icons/clear_origin.png")));                            
    }//GEN-LAST:event_icon_clearMouseExited

    private void textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMouseEntered
        background_color.setBackground(new Color (0,0,0,0));
    }//GEN-LAST:event_textMouseEntered

    private void textMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMouseExited
        background_color.setBackground(new Color (0,102,153));
    }//GEN-LAST:event_textMouseExited

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        
    }//GEN-LAST:event_formMouseExited

    private void textKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyPressed
        background_color.setBackground(new Color(0,102,255));
    }//GEN-LAST:event_textKeyPressed

    private void textMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_textMouseReleased

    private void textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textKeyReleased
        background_color.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_textKeyReleased

    private void textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_textFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_textFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel background_color;
    public javax.swing.JLabel icon_clear;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JTextField text;
    // End of variables declaration//GEN-END:variables
}
