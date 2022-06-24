
package telecom.desk.mainFrames;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Random;
import java.util.Vector;
import javax.lang.model.type.NoType;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import static org.apache.logging.log4j.spi.ThreadContextMapFactory.init;
import telecom.custControllerEntity.custControllerAbonent;
import telecom.desk.authorization.authorization;
import telecom.desk.constants.SystemColor;
import static telecom.desk.constants.SystemColor.Theme;
import static telecom.desk.constants.SystemColor.*;
import telecom.desk.mainFrames.menu.MenuEvent;
import telecom.desk.mainFrames.panel.controll;
import telecom.desk.swing.message.MessageDialogForAbonent;
import telecom.desk.swing.notification.Notification;
import telecom.desk.swing.notification.Notification.LocationNotify;
import telecom.desk.swing.notification.Notification.TypeNotify;
import static telecom.desk.swing.notification.Notification.TypeNotify.*;
import static telecom.desk.swing.notification.Notification.LocationNotify.*;
import telecom.desk.swing.table.StatusType;
import telecom.entity.Abonent;
import telecom.entity.Address;
import telecom.entity.Contract;
import telecom.entity.Datapassport;
import telecom.entity.Equipment;
import telecom.entity.Equipmentabonent;
import telecom.entity.User;
import telecom.repository.ReposetoryAbonent;
import static telecom.session.Session.*;

public class mainFrame extends javax.swing.JFrame {
    
    public static EntityManager em = getEm();
    private Random random;
    public SystemColor systemColor = new SystemColor();
    private custControllerAbonent custAbonent = new custControllerAbonent();
    private MessageDialogForAbonent messageDiaolg;
    
    public mainFrame() {
        
        //Session();
        initComponents();
        messageDiaolg = new MessageDialogForAbonent(this);
        initMouseEvent();
        initElements();
        initMenuEvent();
        
        // init table info
        initInfoTableAbonent(typeSelectAbonent.ALL, "");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        switchPanel = new javax.swing.JLayeredPane();
        support = new telecom.desk.mainFrames.panel.support();
        crm = new telecom.desk.mainFrames.panel.crm();
        abonent = new telecom.desk.mainFrames.panel.abonent();
        panelMenu = new telecom.desk.swing.LPanel();
        menu = new telecom.desk.mainFrames.menu.Menu();
        jLabel1 = new javax.swing.JLabel();
        panel_side = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        switchPanel.setBackground(new java.awt.Color(255, 255, 255));
        switchPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                switchPanelMouseDragged(evt);
            }
        });
        switchPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchPanelMousePressed(evt);
            }
        });
        switchPanel.setLayout(new java.awt.CardLayout());
        switchPanel.add(support, "card7");
        switchPanel.add(crm, "card7");
        switchPanel.add(abonent, "card7");

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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );

        panel_side.setBackground(new java.awt.Color(160, 193, 243));

        exit.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        exit.setForeground(new java.awt.Color(255, 255, 255));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("x");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        exit1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        exit1.setForeground(new java.awt.Color(255, 255, 255));
        exit1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit1.setText("-");
        exit1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exit1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panel_sideLayout = new javax.swing.GroupLayout(panel_side);
        panel_side.setLayout(panel_sideLayout);
        panel_sideLayout.setHorizontalGroup(
            panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panel_sideLayout.createSequentialGroup()
                .addComponent(exit1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_sideLayout.setVerticalGroup(
            panel_sideLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_sideLayout.createSequentialGroup()
                .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(exit1)
                .addGap(0, 0, Short.MAX_VALUE))
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
                .addComponent(panel_side, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(switchPanel)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_side, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitMouseClicked

    private void exit1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exit1MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_exit1MouseClicked

    
    private void controllMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controllMousePressed

    }//GEN-LAST:event_controllMousePressed

    private void controllMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_controllMouseDragged

    }//GEN-LAST:event_controllMouseDragged

    int locationX;
    int locationY;
    
    private void switchPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchPanelMousePressed

    }//GEN-LAST:event_switchPanelMousePressed

    private void switchPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchPanelMouseDragged

    }//GEN-LAST:event_switchPanelMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        locationX = evt.getX() - panelMenu.getWidth();
        locationY = evt.getY();
        
        this.setOpacity(0.7f);
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen() - panelMenu.getWidth();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - locationX, y - locationY);
    }//GEN-LAST:event_formMouseDragged

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        this.setOpacity(1f);
    }//GEN-LAST:event_formMouseReleased


    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private telecom.desk.mainFrames.panel.abonent abonent;
    private telecom.desk.mainFrames.panel.crm crm;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel1;
    private telecom.desk.mainFrames.menu.Menu menu;
    private telecom.desk.swing.LPanel panelMenu;
    private javax.swing.JPanel panel_side;
    private telecom.desk.mainFrames.panel.support support;
    private javax.swing.JLayeredPane switchPanel;
    // End of variables declaration//GEN-END:variables

    // notification
    
    public Notification notify; 
    
    // INFO, SUCCESS, WARNING 
    public void showNotify(TypeNotify typeNotify, String message) {
        notify = new Notification(this, typeNotify, LocationNotify.BOTTOM_RIGHT, message);
        notify.showNotification();
    }
    
    // menu event

    private void initMenuEvent() {
        MenuEvent event = new MenuEvent() {
            @Override
            public void menuSelected(int index) {
                switch (index) {
                    case 0:
                        showPanel(abonent);
                        break;
                    case 1:
                        showPanel(new controll());
                        break;
                    case 2:
                        //showPanel(active);
                        break;
                    case 3:
                        //showPanel(billing);
                        break;
                    case 4:
                        showPanel(support);
                        break;
                    case 5:
                        showPanel(crm);
                        break;
                    case 7:
                        new authorization().setVisible(true);
                        dispose();
                        break;
                }
            }
        };
        menu.initMenu(event);
        menu.setSelected(0);
    }

    private void showPanel(JPanel panel){
        switchPanel.removeAll();
        switchPanel.add(panel);
        switchPanel.revalidate();
        switchPanel.repaint();
    }

    private void initInfoTableAbonent(typeSelectAbonent typeSelect, String status) {
        
        
        if (typeSelect == typeSelect.ALL){
            List listAbonent = em.createNamedQuery("Abonent.findAll").getResultList();
            ouputTableAbonent(listAbonent);
        } else if (typeSelect == typeSelect.STATUS) {
            
            List listAbonent = custAbonent.selectByStatus(status, em);
            ouputTableAbonent(listAbonent);
        }
        
    }
    
    private boolean statusActive = false;
    private boolean statusInactive = false;
    
    public void switchStatus(boolean status) {
        
    }
    
    private StatusType type (String t) {
        
        switch (t) {
            case "active":
                return StatusType.ACTIVE;
            case "inactive":
                return StatusType.INACTIVE;
            default:
                return null;
        }
    }


    
    public void selectByActiveTableAbonent () {
        initInfoTableAbonent(typeSelectAbonent.ALL, "");
        
        if (statusInactive && statusActive) {
            initInfoTableAbonent(typeSelectAbonent.ALL, "");
        } else if (!statusInactive && statusActive) {
            initElements();
            initInfoTableAbonent(typeSelectAbonent.STATUS, "active");
        } else if (statusInactive && !statusActive) {
            initInfoTableAbonent(typeSelectAbonent.STATUS, "inactive");
        }
        
    }

    private enum typeSelectAbonent {
        ALL, STATUS;
    }
    
    public void clearJTable(JTable table, String delete) {
        if ("all".equals(delete)) {
            DefaultTableModel dm = (DefaultTableModel) table.getModel();
        
            dm.getDataVector().removeAllElements();
            table.setModel(dm);
        }
    }
    
    
    private void initMouseEvent() {
        
        abonent.button_active.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_activeMouseEvent(evt);
            }
        });
        
        abonent.button_inactive.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button_inactiveMouseEvent(evt);
            }
        });
        
        abonent.comboBoxSelectAbonent.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxSelectAbonentMouseEvent(evt);
            }
        });
        
        abonent.textFieldSearchAbonent.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldSearchAbonentKeyPressed(evt);
            }
        });
        
        abonent.buttonSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSearchMouseClicked(evt);
            }
        });
        
        abonent.comboBoxHouse.addItemListener(new java.awt.event.ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboBoxHouseItemStateChanged(evt);
            }
        });
        
        abonent.table.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });

    }
    
    public void initElements() {
        random = new Random();
        abonent.comboBoxHouse.setVisible(false);
    }
    
    // mouse 
   
    
    private void button_activeMouseEvent(java.awt.event.MouseEvent evt) {
        if (statusActive) {
            abonent.button_active.setBackground(new Color(255, 255, 255));
            abonent.button_active.setForeground(new Color(0, 0, 0));
            statusActive = false;
        } else {
            abonent.button_active.setBackground(new Color(51, 102, 255));
            abonent.button_active.setForeground(new Color(255, 255, 255));
            statusActive = true;
        }
        
        selectByActiveTableAbonent();
    }
    
    private void button_inactiveMouseEvent(java.awt.event.MouseEvent evt) {
        if (statusInactive) {
            abonent.button_inactive.setBackground(new Color(255, 255, 255));
            abonent.button_inactive.setForeground(new Color(0, 0, 0));
            statusInactive = false;
        } else {
            abonent.button_inactive.setBackground(new Color(51, 102, 255));
            abonent.button_inactive.setForeground(new Color(255, 255, 255));
            statusInactive = true;
        }
        
        selectByActiveTableAbonent();
    }
    
    private void comboBoxSelectAbonentMouseEvent(java.awt.event.ItemEvent evt) {
        int choice = abonent.comboBoxSelectAbonent.getSelectedIndex();
        abonent.comboBoxHouse.setVisible(false);
        switch (choice) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                abonent.comboBoxHouse.setVisible(true);
                break;
            case 3:
                break;
            default:
                break;
        }
        
    }
    
    private void comboBoxHouseItemStateChanged(ItemEvent evt) {
        String search = abonent.textFieldSearchAbonent.getText();
        
        int intChoice = abonent.comboBoxHouse.getSelectedIndex();
        String choice = abonent.comboBoxHouse.getItemAt(intChoice);
        
        List listStreet =  em.createNamedQuery("Abonent.findByUserStreetHouse")
                        .setParameter("street", search)
                        .setParameter("house", choice)
                        .getResultList();
        if (listStreet != null){
            ouputTableAbonent(listStreet);       
        }
    }
    
    // по нажатию на клавиши
    
    private void textFieldSearchAbonentKeyPressed(KeyEvent evt) {
        String search = abonent.textFieldSearchAbonent.getText();

        int choice = abonent.comboBoxSelectAbonent.getSelectedIndex();
        abonent.comboBoxHouse.setVisible(false);
        
        switch (choice) {
            case 0:
                List listSurname = em.createNamedQuery("Abonent.findByUserSurname")
                        .setParameter("surname", "%" + search + "%")
                        .getResultList();
                if (listSurname != null){
                    ouputTableAbonent(listSurname);
                }  
                break;
            case 1:
                
            case 2:
                abonent.comboBoxHouse.setVisible(true);
                List listStreet =  em.createNamedQuery("Abonent.findByUserStreet")
                        .setParameter("street", search)
                        .getResultList();
                if (listStreet != null){
                    ouputTableAbonent(listStreet);
                    abonent.comboBoxHouse.removeAllItems();
                    for (int i = 0; i < listStreet.size(); i++) {
                        Abonent abonent = (Abonent) listStreet.get(i);
                        this.abonent.comboBoxHouse.addItem(abonent.getAddress().getHouse());
                    }
                }  
                break;
            case 3:
                List listPersonalAccounter = em.createNamedQuery("Abonent.findByPersonalAccountLike")
                        .setParameter("personalAccount", "%" + search + "%")
                        .getResultList();
                if (listPersonalAccounter != null){
                    ouputTableAbonent(listPersonalAccounter);
                } 
                break;
            default:
                
                break;
        }
    }
    
    // при нажатии по кнопке
    
    private void buttonSearchMouseClicked(java.awt.event.MouseEvent evt) {   
        String search = abonent.textFieldSearchAbonent.getText();
        
        showNotify(TypeNotify.INFO, "Поиск по " + search);
        
        int choice = abonent.comboBoxSelectAbonent.getSelectedIndex();
        abonent.comboBoxHouse.setVisible(false);
        
        switch (choice) {
            case 0:
                List list = em.createNamedQuery("Abonent.findByUserSurname")
                        .setParameter("surname", "%" + search + "%")
                        .getResultList();
                ouputTableAbonent(list);
                break;
            case 1:
                
                break;
            case 2:
                
                abonent.comboBoxHouse.setVisible(true);
                List listStreet =  em.createNamedQuery("Abonent.findByUserStreet")
                        .setParameter("street", search)
                        .getResultList();
                if (listStreet != null){
                    ouputTableAbonent(listStreet);
                    abonent.comboBoxHouse.removeAllItems();
                    for (int i = 0; i < listStreet.size(); i++) {
                        Abonent abonent = (Abonent) listStreet.get(i);
                        this.abonent.comboBoxHouse.addItem(abonent.getAddress().getHouse());
                    }
                }  
                break;
            case 3:
                List listPersonalAccounter = em.createNamedQuery("Abonent.findByPersonalAccountLike")
                        .setParameter("personalAccount", "%" + search + "%")
                        .getResultList();
                if (listPersonalAccounter != null){
                    ouputTableAbonent(listPersonalAccounter);
                } 
                break;
            default:
                
                break;
        }
    } 
    
    private void tableMouseClicked(MouseEvent evt) {
        
        int row = abonent.table.getSelectedRow();
        String number = (String) abonent.table.getValueAt(row, 0);
        
        List list = em.createNamedQuery("Abonent.findByNumber")
                .setParameter("number", number)
                .getResultList();
        Abonent ab = (Abonent) list.get(0);
        String fullname = ab.getIdUser().getSurname() + " " + ab.getIdUser().getName() + " " + ab.getIdUser().getPatronymic();
        
        List listEq = em.createNamedQuery("Equipmentabonent.findByIdAbonent")
                .setParameter("idAbonent", ab)
                .getResultList();
        Equipmentabonent eqAb = (Equipmentabonent) listEq.get(0);
        
        Equipment eq = eqAb.getIdEquipment();
        Contract con = ab.getContact();

        Address ad = ab.getAddress();
        String address = ad.getCity() + " " + ad.getStreet() + " " + ad.getHouse();
        
        DateFormat df = new SimpleDateFormat("dd MMM yyy"); // formatter
        
        String reason = "";
        if (con.getNoteReasonEnd() != null)
            reason = "Причина: " + con.getNoteReasonEnd();
        
        String dateEnd = "Не расторжено";
        if (con.getDateEnd() != null)
            dateEnd = df.format(con.getDateEnd());
          
        String dateBegin = df.format(con.getDateBegin());
        
        Datapassport passport = ab.getPassport();
        
        String passportNumber = passport.getNumber();
        String passportSeria = passport.getSeria();
        String passportDateIssue = df.format(passport.getDataIssue());
        
        //messageDiaolg.showMessage("Title", "1234");
        messageDiaolg.showMessage("Информация об абоненте", ab.getNumber(), ab.getPersonalAccount() + "", fullname, 
                passportNumber, passportSeria,
                passportDateIssue, con.getNumber(),
                dateBegin, con.getTypeContract().getName(), dateEnd, reason, address, "", "", "", "");
    }
    
    
    private void ouputTableAbonent (List list) {
        
        clearJTable(abonent.table, "all");
            for (int i = 0; i < list.size(); i++) {
                String number, Full_name, personalAccount, numberContract, statusContract;
                Abonent abonent = (Abonent) list.get(i);

                number = abonent.getNumber();
                Full_name = abonent.getIdUser().getSurname() + " " + abonent.getIdUser().getName() + " " + abonent.getIdUser().getPatronymic();
                personalAccount = abonent.getPersonalAccount() + "";
                numberContract = abonent.getContact().getNumber();
                statusContract = abonent.getContact().getStatus();

                Object[] o = {number, Full_name,  personalAccount, numberContract , type(statusContract)};

                this.abonent.table.addRow(o);
        }
    } 
         
}

