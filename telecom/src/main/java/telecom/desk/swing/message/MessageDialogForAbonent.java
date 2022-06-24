package telecom.desk.swing.message;

import java.awt.Color;
import java.awt.event.MouseEvent;
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
        setBackground(new Color(0, 0, 0,0));
        StyledDocument doc = txtArend.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        doc.setParagraphAttributes(0, doc.getLength(), center, false);
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
        lbNumber.setText(message);
        setLocationRelativeTo(fram);
        startAnimator(true);
        setVisible(true);
    }
    
    public void showMessage(String title, String numberAbonent, 
            String numberAccount, String fullname,
            String passportNumber, String passportSeria,
            String dateIssue, String contractNumber, String dateBegin, String typeContract, String dateEnd,
            String dateReasonEnd, String adress, String service, String dataEquipment, String aboutArent, String history) {
        fram.setGlassPane(glass);
        glass.setVisible(true);
        lbTitle.setText(title);
        lbNumber.setText("Н/А: " + numberAbonent);
        lbNumberAccount.setText("Н/C: " + numberAccount);
        lbFullname.setText("ФИО: " + fullname);
        lbPassportNumber.setText("Номер: " + passportNumber);
        lbPassportSeria.setText("Серия: " + passportSeria);
        lbDateIssue.setText("Дата выдачи: " + dateIssue);
        lbContractNumber.setText("Н/Д: " + contractNumber);
        lbDateBegin.setText("Дата заключения: " + dateBegin);
        lbDateEnd.setText("Дата расторжения: " + dateEnd);
        lbTypeContract.setText("Тип договора: " + typeContract);
        lbNoteReasonEnd.setText(dateReasonEnd);
        lbAddress.setText("Адрес: " + adress);
        lbService.setText(service);
        lbDataEquipment.setText("Название: " + dataEquipment);
        txtArend.setText(aboutArent);
        lbHistory.setText(history);
        
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

        scroll = new javax.swing.JScrollPane();
        mainPanel = new telecom.desk.swing.LPanel();
        lbService = new javax.swing.JLabel();
        lbAddress = new javax.swing.JLabel();
        lbFullname = new javax.swing.JLabel();
        lbNumber = new javax.swing.JLabel();
        lbTitle = new javax.swing.JLabel();
        lbNumberAccount = new javax.swing.JLabel();
        lbHistory = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHistory = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        panelPassport = new telecom.desk.swing.LPanel();
        lbPassportSeria = new javax.swing.JLabel();
        lbPassportNumber = new javax.swing.JLabel();
        lbDateIssue = new javax.swing.JLabel();
        lTextField1 = new telecom.desk.swing.LTextField();
        panelContract = new telecom.desk.swing.LPanel();
        lTextField2 = new telecom.desk.swing.LTextField();
        lbContractNumber = new javax.swing.JLabel();
        lbDateBegin = new javax.swing.JLabel();
        lbTypeContract = new javax.swing.JLabel();
        lbDateEnd = new javax.swing.JLabel();
        lbNoteReasonEnd = new javax.swing.JLabel();
        lPanel2 = new telecom.desk.swing.LPanel();
        lTextField3 = new telecom.desk.swing.LTextField();
        lbDataEquipment = new javax.swing.JLabel();
        lbDataAboutArend = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtArend = new javax.swing.JTextPane();
        lButton1 = new telecom.desk.swing.LButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(2147483647, 700));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(810, 700));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowDeactivated(java.awt.event.WindowEvent evt) {
                formWindowDeactivated(evt);
            }
        });

        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        lbService.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbService.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbService.setText("Подключенные услуги:");

        lbAddress.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbAddress.setText("Адрес: ");

        lbFullname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbFullname.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbFullname.setText("ФИО:");
        lbFullname.setMaximumSize(new java.awt.Dimension(0, 0));
        lbFullname.setMinimumSize(new java.awt.Dimension(141, 25));
        lbFullname.setPreferredSize(new java.awt.Dimension(141, 25));

        lbNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumber.setText("Номер абонента:");
        lbNumber.setMaximumSize(new java.awt.Dimension(0, 0));

        lbTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitle.setText("Информация об абоненте");

        lbNumberAccount.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNumberAccount.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNumberAccount.setText("Номер счета:");
        lbNumberAccount.setMaximumSize(new java.awt.Dimension(0, 0));
        lbNumberAccount.setMinimumSize(new java.awt.Dimension(141, 25));
        lbNumberAccount.setPreferredSize(new java.awt.Dimension(141, 25));

        lbHistory.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbHistory.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbHistory.setText("История обращений");

        txtHistory.setBorder(null);
        jScrollPane2.setViewportView(txtHistory);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/notification/info.png"))); // NOI18N

        panelPassport.setBorderAdd(true);

        lbPassportSeria.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPassportSeria.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPassportSeria.setText("Серия паспорта: ");
        lbPassportSeria.setMaximumSize(new java.awt.Dimension(0, 0));
        lbPassportSeria.setMinimumSize(new java.awt.Dimension(141, 25));
        lbPassportSeria.setPreferredSize(new java.awt.Dimension(141, 25));

        lbPassportNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbPassportNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbPassportNumber.setText("Номер паспорта:");
        lbPassportNumber.setMaximumSize(new java.awt.Dimension(0, 0));

        lbDateIssue.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDateIssue.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDateIssue.setText("Дата выдачи: ");

        lTextField1.setText("Паспорт");
        lTextField1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelPassportLayout = new javax.swing.GroupLayout(panelPassport);
        panelPassport.setLayout(panelPassportLayout);
        panelPassportLayout.setHorizontalGroup(
            panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPassportLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDateIssue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPassportLayout.createSequentialGroup()
                        .addComponent(lbPassportSeria, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbPassportNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelPassportLayout.setVerticalGroup(
            panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPassportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPassportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassportSeria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPassportNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbDateIssue)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelContract.setBorderAdd(true);

        lTextField2.setText("Договор");
        lTextField2.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        lbContractNumber.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbContractNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbContractNumber.setText("Номер договора:");

        lbDateBegin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDateBegin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDateBegin.setText("Дата заключения договора: ");

        lbTypeContract.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbTypeContract.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTypeContract.setText("Тип договора");

        lbDateEnd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDateEnd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDateEnd.setText("Дата расторжения: ");

        lbNoteReasonEnd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbNoteReasonEnd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbNoteReasonEnd.setText("Причина: ");

        javax.swing.GroupLayout panelContractLayout = new javax.swing.GroupLayout(panelContract);
        panelContract.setLayout(panelContractLayout);
        panelContractLayout.setHorizontalGroup(
            panelContractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContractLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelContractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbNoteReasonEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelContractLayout.createSequentialGroup()
                        .addGroup(panelContractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelContractLayout.createSequentialGroup()
                                .addGroup(panelContractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lbTypeContract, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbContractNumber, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(panelContractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lbDateBegin, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(lbDateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelContractLayout.setVerticalGroup(
            panelContractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContractLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelContractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbContractNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbDateBegin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelContractLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTypeContract, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDateEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNoteReasonEnd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lPanel2.setBorderAdd(true);

        lTextField3.setText("Оборудование");
        lTextField3.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N

        lbDataEquipment.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDataEquipment.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDataEquipment.setText("Название: ");

        lbDataAboutArend.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbDataAboutArend.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbDataAboutArend.setText("Данные об аренде");

        txtArend.setBorder(null);
        jScrollPane1.setViewportView(txtArend);

        javax.swing.GroupLayout lPanel2Layout = new javax.swing.GroupLayout(lPanel2);
        lPanel2.setLayout(lPanel2Layout);
        lPanel2Layout.setHorizontalGroup(
            lPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lPanel2Layout.createSequentialGroup()
                        .addComponent(lTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(93, 93, 93))
                    .addGroup(lPanel2Layout.createSequentialGroup()
                        .addComponent(lbDataAboutArend, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 566, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbDataEquipment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        lPanel2Layout.setVerticalGroup(
            lPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbDataEquipment)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(lPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lPanel2Layout.createSequentialGroup()
                        .addComponent(lbDataAboutArend)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(lPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(10, 10, 10))))
        );

        lButton1.setBackground(new java.awt.Color(102, 102, 255));
        lButton1.setForeground(new java.awt.Color(255, 255, 255));
        lButton1.setText("OK");
        lButton1.setShadowAdd(true);
        lButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, mainPanelLayout.createSequentialGroup()
                                .addComponent(lbFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbTitle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(mainPanelLayout.createSequentialGroup()
                                .addComponent(lbNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lbNumberAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelContract, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(panelPassport, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbService, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbHistory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(lButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbNumberAccount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbAddress))
                .addGap(10, 10, 10)
                .addComponent(panelPassport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(panelContract, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(lPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbService)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbHistory)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        scroll.setViewportView(mainPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(scroll)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(scroll)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonOKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonOKMouseClicked
        closeMessage();
    }//GEN-LAST:event_buttonOKMouseClicked

    private void buttonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonOKActionPerformed

    private void lButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lButton1MouseClicked
        closeMessage();
    }//GEN-LAST:event_lButton1MouseClicked

    private void formWindowDeactivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowDeactivated
        
    }//GEN-LAST:event_formWindowDeactivated

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
        
    }//GEN-LAST:event_formFocusLost

    public static enum MessageType {
        CANCEL, OK
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private telecom.desk.swing.LButton lButton1;
    private telecom.desk.swing.LPanel lPanel2;
    private telecom.desk.swing.LTextField lTextField1;
    private telecom.desk.swing.LTextField lTextField2;
    private telecom.desk.swing.LTextField lTextField3;
    private javax.swing.JLabel lbAddress;
    private javax.swing.JLabel lbContractNumber;
    private javax.swing.JLabel lbDataAboutArend;
    private javax.swing.JLabel lbDataEquipment;
    private javax.swing.JLabel lbDateBegin;
    private javax.swing.JLabel lbDateEnd;
    private javax.swing.JLabel lbDateIssue;
    private javax.swing.JLabel lbFullname;
    private javax.swing.JLabel lbHistory;
    private javax.swing.JLabel lbNoteReasonEnd;
    private javax.swing.JLabel lbNumber;
    private javax.swing.JLabel lbNumberAccount;
    private javax.swing.JLabel lbPassportNumber;
    private javax.swing.JLabel lbPassportSeria;
    private javax.swing.JLabel lbService;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JLabel lbTypeContract;
    private telecom.desk.swing.LPanel mainPanel;
    private telecom.desk.swing.LPanel panelContract;
    private telecom.desk.swing.LPanel panelPassport;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTextPane txtArend;
    private javax.swing.JTextPane txtHistory;
    // End of variables declaration//GEN-END:variables
}
