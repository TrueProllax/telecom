
package telecom.desk.mainFrames;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import telecom.desk.constants.SystemColor;
import static telecom.desk.constants.SystemColor.Theme;
import static telecom.desk.constants.SystemColor.*;
import telecom.desk.mainFrames.menu.MenuEvent;
import telecom.desk.swing.notification.Notification;
import telecom.desk.swing.notification.Notification.LocationNotify;
import telecom.desk.swing.notification.Notification.TypeNotify;
import static telecom.desk.swing.notification.Notification.TypeNotify.*;
import static telecom.desk.swing.notification.Notification.LocationNotify.*;

public class mainFrame extends javax.swing.JFrame {

    public SystemColor systemColor = new SystemColor();
    public Notification notify;
    
    public mainFrame() {
        initComponents();
        
        MenuEvent event = new MenuEvent() {
            @Override
            public void menuSelected(int index) {
                switch (index) {
                    case 0:
                        showPanel(abonent);
                        break;
                    case 1:
                        showPanel(controll);
                        break;
                    case 2:
                        showPanel(active);
                        break;
                    case 3:
                        showPanel(billing);
                        break;
                    case 4:
                        showPanel(support);
                        break;
                    case 5:
                        showPanel(crm);
                        break;
                }
            }
        };
        menu.initMenu(event);
        menu.setSelected(0);
    }
    
    public void shiftPanel(TypeNotify typeNotify) {
        notify = new Notification(this, typeNotify, LocationNotify.BOTTOM_RIGHT, "Message");
        notify.showNotification();
    }
    
    private void showPanel(JPanel panel){
        switchPanel.removeAll();
        switchPanel.add(panel);
        switchPanel.revalidate();
        switchPanel.repaint();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        switchPanel = new javax.swing.JLayeredPane();
        abonent = new telecom.desk.mainFrames.panel.abonent();
        active = new telecom.desk.mainFrames.panel.active();
        crm = new telecom.desk.mainFrames.panel.crm();
        billing = new telecom.desk.mainFrames.panel.billing();
        controll = new telecom.desk.mainFrames.panel.controll();
        support = new telecom.desk.mainFrames.panel.support();
        panelMenu = new telecom.desk.swing.LPanel();
        menu = new telecom.desk.mainFrames.menu.Menu();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1100, 700));

        switchPanel.setBackground(new java.awt.Color(255, 255, 255));
        switchPanel.setLayout(new java.awt.CardLayout());
        switchPanel.add(abonent, "card7");
        switchPanel.add(active, "card4");
        switchPanel.add(crm, "card7");
        switchPanel.add(billing, "card7");
        switchPanel.add(controll, "card6");
        switchPanel.add(support, "card7");

        panelMenu.setPreferredSize(new java.awt.Dimension(250, 700));

        menu.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/logo.png"))); // NOI18N

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(switchPanel)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(switchPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 775, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private telecom.desk.mainFrames.panel.abonent abonent;
    private telecom.desk.mainFrames.panel.active active;
    private telecom.desk.mainFrames.panel.billing billing;
    private telecom.desk.mainFrames.panel.controll controll;
    private telecom.desk.mainFrames.panel.crm crm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private telecom.desk.mainFrames.menu.Menu menu;
    private telecom.desk.swing.LPanel panelMenu;
    private telecom.desk.mainFrames.panel.support support;
    private javax.swing.JLayeredPane switchPanel;
    // End of variables declaration//GEN-END:variables

}
