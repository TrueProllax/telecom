
package telecom.desk.mainFrames.panel;

import java.util.List;
import javax.persistence.EntityManager;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import telecom.desk.mainFrames.mainFrame;
import telecom.desk.swing.LMessage;
import telecom.desk.swing.table.LTable;
import telecom.entity.Equipment;
import telecom.entity.Equipmentabonent;
//import static telecom.session.Session.*;
import telecom.web_api.controllers.EquipmentController;
import static telecom.desk.mainFrames.mainFrame.em;


public class controll extends javax.swing.JPanel {

    //private static EntityManager em = getEm();
    private LMessage lm;
    private EquipmentController eqController;
    
    
    private List listAbonentEq;
    private List listConnectEq;
    private List listMagisEq;
 
    public controll() {

        initComponents();
        lm = new LMessage();
        eqController = new EquipmentController();
        
        initLists();
        initTable();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lButton1 = new telecom.desk.swing.LButton();
        lButton2 = new telecom.desk.swing.LButton();
        lButton3 = new telecom.desk.swing.LButton();
        switchPanel = new javax.swing.JLayeredPane();
        lPanel1 = new telecom.desk.swing.LPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableMagis = new telecom.desk.swing.table.LTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableConnect = new telecom.desk.swing.table.LTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableAbonent = new telecom.desk.swing.table.LTable();
        lTextField1 = new telecom.desk.swing.LTextField();
        lTextField2 = new telecom.desk.swing.LTextField();
        lTextField3 = new telecom.desk.swing.LTextField();
        lPanel2 = new telecom.desk.swing.LPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        lTable3 = new telecom.desk.swing.table.LTable();
        jComboBox1 = new javax.swing.JComboBox<>();

        setMinimumSize(new java.awt.Dimension(850, 700));
        setPreferredSize(new java.awt.Dimension(850, 700));

        jPanel1.setBackground(new java.awt.Color(236, 238, 248));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 700));

        lButton1.setText("Контроль состояния");
        lButton1.setPreferredSize(new java.awt.Dimension(100, 25));
        lButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButton1ActionPerformed(evt);
            }
        });

        lButton2.setText("Настройка оборудования");
        lButton2.setPreferredSize(new java.awt.Dimension(100, 25));
        lButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lButton2ActionPerformed(evt);
            }
        });

        lButton3.setText("Расчёт количества базовых станций");
        lButton3.setToolTipText("");
        lButton3.setPreferredSize(new java.awt.Dimension(100, 25));

        switchPanel.setLayout(new java.awt.CardLayout());

        lPanel1.setBackground(new java.awt.Color(236, 238, 248));

        tableMagis.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Название"
            }
        ));
        tableMagis.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tableMagis.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMagisMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableMagis);

        tableConnect.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Название"
            }
        ));
        tableConnect.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tableConnect.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableConnectMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tableConnect);

        tableAbonent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Название"
            }
        ));
        tableAbonent.setIntercellSpacing(new java.awt.Dimension(10, 10));
        tableAbonent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableAbonentMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableAbonent);

        lTextField1.setEditable(false);
        lTextField1.setBackground(new java.awt.Color(236, 238, 248));
        lTextField1.setText("Оборудование магистральных сетей");
        lTextField1.setBorderLineRightAdd(true);

        lTextField2.setEditable(false);
        lTextField2.setBackground(new java.awt.Color(236, 238, 248));
        lTextField2.setText("Оборудование сетей доступа");
        lTextField2.setBorderLineRightAdd(true);

        lTextField3.setEditable(false);
        lTextField3.setBackground(new java.awt.Color(236, 238, 248));
        lTextField3.setText("Оборудование абонента");
        lTextField3.setBorderLineRightAdd(true);

        javax.swing.GroupLayout lPanel1Layout = new javax.swing.GroupLayout(lPanel1);
        lPanel1.setLayout(lPanel1Layout);
        lPanel1Layout.setHorizontalGroup(
            lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanel1Layout.createSequentialGroup()
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(lTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                    .addComponent(lTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        lPanel1Layout.setVerticalGroup(
            lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(lPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        switchPanel.add(lPanel1, "card2");

        lTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(lTable3);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout lPanel2Layout = new javax.swing.GroupLayout(lPanel2);
        lPanel2.setLayout(lPanel2Layout);
        lPanel2Layout.setHorizontalGroup(
            lPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(lPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        lPanel2Layout.setVerticalGroup(
            lPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        switchPanel.add(lPanel2, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(switchPanel)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(lButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(switchPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 575, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void lButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButton1ActionPerformed
        switchPanel.removeAll();
        switchPanel.add(lPanel1);
        switchPanel.revalidate();
        switchPanel.repaint();
    }//GEN-LAST:event_lButton1ActionPerformed

    private void lButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lButton2ActionPerformed
        switchPanel.removeAll();
        switchPanel.add(lPanel2);
        switchPanel.revalidate();
        switchPanel.repaint();
    }//GEN-LAST:event_lButton2ActionPerformed

    private void tableAbonentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableAbonentMouseClicked
        int row = tableAbonent.getSelectedRow();
        String eq = (String) tableAbonent.getValueAt(row, 0);
        String status = mes(eq);
        lm.showMessage(status);
    }//GEN-LAST:event_tableAbonentMouseClicked

    private void tableMagisMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMagisMouseClicked
        int row = tableMagis.getSelectedRow();
        String eq = (String) tableMagis.getValueAt(row, 0);
        String status = mes(eq);
        lm.showMessage(status);
    }//GEN-LAST:event_tableMagisMouseClicked

    private void tableConnectMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableConnectMouseClicked
        int row = tableConnect.getSelectedRow();
        String eq = (String) tableConnect.getValueAt(row, 0);
        String status = mes(eq);
        lm.showMessage(status);
    }//GEN-LAST:event_tableConnectMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private telecom.desk.swing.LButton lButton1;
    private telecom.desk.swing.LButton lButton2;
    private telecom.desk.swing.LButton lButton3;
    private telecom.desk.swing.LPanel lPanel1;
    private telecom.desk.swing.LPanel lPanel2;
    private telecom.desk.swing.table.LTable lTable3;
    private telecom.desk.swing.LTextField lTextField1;
    private telecom.desk.swing.LTextField lTextField2;
    private telecom.desk.swing.LTextField lTextField3;
    private javax.swing.JLayeredPane switchPanel;
    private telecom.desk.swing.table.LTable tableAbonent;
    private telecom.desk.swing.table.LTable tableConnect;
    private telecom.desk.swing.table.LTable tableMagis;
    // End of variables declaration//GEN-END:variables

    private void initTable() {
        clearJTable(tableMagis);
        clearJTable(tableConnect);
        clearJTable(tableAbonent);
        
        getDataTableAbonent(tableAbonent,listAbonentEq);
        getDataTableAbonent(tableConnect,listConnectEq);
        getDataTableAbonent(tableMagis,listMagisEq);
    }
    
    private void initLists () {
        listAbonentEq = em.createNamedQuery("Equipment.findByType")
                .setParameter("title", "abonent")
                .getResultList();  
        listConnectEq = em.createNamedQuery("Equipment.findByType")
                .setParameter("title", "magistral")
                .getResultList(); 
        listMagisEq = em.createNamedQuery("Equipment.findByType")
                .setParameter("title", "connect")
                .getResultList();
    }
    
    private void getDataTableAbonent (LTable table, List list) {
        for (int i = 0; i < list.size(); i++) {
            Equipment abonentEq = (Equipment) list.get(i);
            
            Object [] ob  = {abonentEq.getName()};
            table.addRow(ob);
        }
    }
    
    private String mes (String name) {

        Object ob = eqController.routeGetName(name);
        
        if ("1".equals(ob.toString())) {
            return "работает";
        } else {
            return "не работает";
        }
        
    }
    
    private enum typeTable {
        MAGIS, CONNECT, ABONENT;
    }
    
    public void clearJTable(JTable table) {
        DefaultTableModel dm = (DefaultTableModel) table.getModel();
        dm.getDataVector().removeAllElements();
        table.setModel(dm);
    }
   
}
