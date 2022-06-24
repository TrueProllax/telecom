
package telecom.desk.swing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Point;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class LMessage extends javax.swing.JFrame {
    
    public LMessage() {
        initComponents();
        
        setLocation(getX() + 100,getY());
        setBackground(new Color(0,0,0,0));
        setOpacity(.8f);
    }
    
    public void showMessage(String mess) {
        message.setText(mess);
        setVisible(true);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mianPanel = new telecom.desk.swing.LPanel();
        lTextField1 = new telecom.desk.swing.LTextField();
        lTextField2 = new telecom.desk.swing.LTextField();
        message = new telecom.desk.swing.LTextField();
        exit = new telecom.desk.swing.LButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        mianPanel.setBorderAdd(true);
        mianPanel.setBorderColor(new java.awt.Color(51, 153, 255));
        mianPanel.setBorderSize(5);

        lTextField1.setText("Сообщение ");
        lTextField1.setBorderLineLeftColor(new java.awt.Color(51, 153, 255));
        lTextField1.setBorderLineRightAdd(true);
        lTextField1.setBorderLineRightColor(new java.awt.Color(51, 153, 255));
        lTextField1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        lTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        lTextField2.setText("Статус оборудования:");
        lTextField2.setBorderLineLeftAdd(false);
        lTextField2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        message.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        message.setBorderLineLeftAdd(false);
        message.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        exit.setBackground(new java.awt.Color(51, 153, 255));
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setText("OK");
        exit.setBorderAdd(true);
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mianPanelLayout = new javax.swing.GroupLayout(mianPanel);
        mianPanel.setLayout(mianPanelLayout);
        mianPanelLayout.setHorizontalGroup(
            mianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mianPanelLayout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(lTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mianPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(mianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mianPanelLayout.createSequentialGroup()
                        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mianPanelLayout.createSequentialGroup()
                        .addComponent(lTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))))
        );
        mianPanelLayout.setVerticalGroup(
            mianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mianPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mianPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mianPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        setVisible(false);
    }//GEN-LAST:event_exitMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new LMessage();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private telecom.desk.swing.LButton exit;
    private telecom.desk.swing.LTextField lTextField1;
    private telecom.desk.swing.LTextField lTextField2;
    private telecom.desk.swing.LTextField message;
    private telecom.desk.swing.LPanel mianPanel;
    // End of variables declaration//GEN-END:variables
}
