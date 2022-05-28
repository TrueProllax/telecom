package telecom.desk.swing.message;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class MessageDialogForAbonent extends javax.swing.JDialog {

    private final JFrame fram;
    private Animator animator;
    private Glass glass;
    private boolean show;
    private MessageType messageType = MessageType.CANCEL;

    public MessageDialogForAbonent(JFrame fram) {
        super(fram, true);
        this.fram = fram;
        initComponents();
        init();
    }

    private void init() {
        setBackground(new Color(0, 0, 0, 0));
        StyledDocument doc = txt.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
        txt.setOpaque(false);
        txt.setBackground(new Color(0, 0, 0, 0));
        setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                closeMessage();
            }
        });
        animator = new Animator(350, new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                float f = show ? fraction : 1f - fraction;
                glass.setAlpha(f - f * 0.3f);
                setOpacity(f);
            }

            @Override
            public void end() {
                if (show == false) {
                    dispose();
                    glass.setVisible(false);
                }
            }
        });
        animator.setResolution(0);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        setOpacity(0f);
        glass = new Glass();
    }

    private void startAnimator(boolean show) {
        if (animator.isRunning()) {
            float f = animator.getTimingFraction();
            animator.stop();
            animator.setStartFraction(1f - f);
        } else {
            animator.setStartFraction(0f);
        }
        this.show = show;
        animator.start();
    }

    public void showMessage(String title, String message) {
        fram.setGlassPane(glass);
        glass.setVisible(true);
        lbTitle.setText(title);
        txt.setText(message);
        setLocationRelativeTo(fram);
        startAnimator(true);
        setVisible(true);
    }

    public void closeMessage() {
        startAnimator(false);
    }

    public MessageType getMessageType() {
        return messageType;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lPanel1 = new telecom.desk.swing.LPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt = new javax.swing.JTextPane();
        lbTitle16 = new javax.swing.JLabel();
        lbTitle15 = new javax.swing.JLabel();
        lbTitle14 = new javax.swing.JLabel();
        lbTitle13 = new javax.swing.JLabel();
        lbTitle11 = new javax.swing.JLabel();
        lbTitle9 = new javax.swing.JLabel();
        lbTitle7 = new javax.swing.JLabel();
        lbTitle5 = new javax.swing.JLabel();
        lbTitle3 = new javax.swing.JLabel();
        lbTitle2 = new javax.swing.JLabel();
        lbTitle1 = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbTitle10 = new javax.swing.JLabel();
        lbTitle4 = new javax.swing.JLabel();
        lbTitle6 = new javax.swing.JLabel();
        lbTitle8 = new javax.swing.JLabel();
        lbTitle12 = new javax.swing.JLabel();
        lbTitle17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt1 = new javax.swing.JTextPane();
        lButton1 = new telecom.desk.swing.LButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        txt.setBorder(null);
        txt.setText("GG\ngg");
        jScrollPane1.setViewportView(txt);

        lbTitle16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle16.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle16.setText("Данные об аренде");

        lbTitle15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle15.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle15.setText("Данные об оборудовании: ");

        lbTitle14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle14.setText("Подключенные услуги:");

        lbTitle13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle13.setText("Адрес: ");

        lbTitle11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle11.setText("Дата расторжения: ");

        lbTitle9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle9.setText("Тип договора");

        lbTitle7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle7.setText("Номер договора:");

        lbTitle5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle5.setText("Дата выдачи:");

        lbTitle3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle3.setText("Серия паспорта: ");

        lbTitle2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle2.setText("ФИО:");

        lbTitle1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle1.setText("Номер абонента:");

        lbTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Информация об абоненте");

        lbTitle10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle10.setText("Номер счета:");

        lbTitle4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle4.setText("Номер паспорта:");

        lbTitle6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle6.setText("Дата выдачи:");

        lbTitle8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle8.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle8.setText("Дата заключения договора: ");

        lbTitle12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle12.setText("Причина: ");

        lbTitle17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTitle17.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTitle17.setText("История обращений");

        txt1.setBorder(null);
        txt1.setText("GG\ngg");
        jScrollPane2.setViewportView(txt1);

        lButton1.setBackground(new java.awt.Color(102, 102, 255));
        lButton1.setForeground(new java.awt.Color(255, 255, 255));
        lButton1.setShadowAdd(true);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/notification/info.png"))); // NOI18N

        javax.swing.GroupLayout lPanel1Layout = new javax.swing.GroupLayout(lPanel1);
        lPanel1.setLayout(lPanel1Layout);
        lPanel1Layout.setHorizontalGroup(
            lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lPanel1Layout.createSequentialGroup()
                        .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTitle7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTitle5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTitle3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbTitle8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lbTitle13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lPanel1Layout.createSequentialGroup()
                        .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTitle9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTitle11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(lbTitle12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTitle10, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, lPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitle16, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addComponent(lbTitle17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(43, 43, 43))
            .addGroup(lPanel1Layout.createSequentialGroup()
                .addGap(365, 365, 365)
                .addComponent(lButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        lPanel1Layout.setVerticalGroup(
            lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(lbTitle2, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(4, 4, 4)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(lbTitle9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTitle11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTitle12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(3, 3, 3)
                .addComponent(lbTitle13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitle15, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitle17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lPanel1Layout.createSequentialGroup()
                        .addComponent(lbTitle16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(lButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOKMouseClicked
        closeMessage();
    }//GEN-LAST:event_buttonOKMouseClicked

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOKActionPerformed

    public static enum MessageType {
        CANCEL, OK
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private telecom.desk.swing.LButton lButton1;
    private telecom.desk.swing.LPanel lPanel1;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTitle1;
    private javax.swing.JLabel lbTitle10;
    private javax.swing.JLabel lbTitle11;
    private javax.swing.JLabel lbTitle12;
    private javax.swing.JLabel lbTitle13;
    private javax.swing.JLabel lbTitle14;
    private javax.swing.JLabel lbTitle15;
    private javax.swing.JLabel lbTitle16;
    private javax.swing.JLabel lbTitle17;
    private javax.swing.JLabel lbTitle2;
    private javax.swing.JLabel lbTitle3;
    private javax.swing.JLabel lbTitle4;
    private javax.swing.JLabel lbTitle5;
    private javax.swing.JLabel lbTitle6;
    private javax.swing.JLabel lbTitle7;
    private javax.swing.JLabel lbTitle8;
    private javax.swing.JLabel lbTitle9;
    private javax.swing.JTextPane txt;
    private javax.swing.JTextPane txt1;
    // End of variables declaration//GEN-END:variables
}
