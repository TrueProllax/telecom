
package telecom.desk.mainFrames.menu;


import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Menu extends javax.swing.JPanel {

    public MenuButton selectedMenu;
    public MenuButton unSelectedMenu;
    private Animator animator;
    private MenuEvent event;
    
    public Menu() {
        initComponents();
        setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.getViewport().setOpaque(false);
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        scroll.setBorder(null);
        panelMenu.setLayout(new MigLayout("wrap, fillx, inset 0","[fill]"));
        TimingTarget target = new TimingTargetAdapter(){
            @Override
            public void timingEvent(float fraction) {
                selectedMenu.setAnimate(fraction);
                if(unSelectedMenu!=null){
                    unSelectedMenu.setAnimate(1f-fraction);
                }
            }
        };
        animator = new Animator(300,target);
        animator.setAcceleration(.5f);
        animator.setDeceleration(.5f);
        animator.setResolution(0);
    }

    public void initMenu(MenuEvent event){
        this.event = event;
        addMenu("1", "Абоненты", 0);
        addMenu("2", "Управление", 1);
        addMenu("3", "Активы", 2);
        //split("Report");
        addMenu("4", "Биллинг", 3);
        addMenu("5", "Поддержка", 4);
        addMenu("6", "CRM", 5);
        space();
        addMenu("key", "Выход", 7);
    }
    
    private void addMenu(String icon, String text, int index){
        MenuButton menu = new MenuButton(index);
        setFont(menu.getFont().deriveFont(Font.PLAIN,14));
        menu.setIcon(new ImageIcon(getClass().getResource("/res/icons/"+icon+".png")));
        menu.setText(" " + text);
        menu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!animator.isRunning()){
                    if(menu!=selectedMenu){
                        unSelectedMenu=selectedMenu;
                        selectedMenu=menu;
                        animator.start();
                        event.menuSelected(index);
                    }
                }
            }
        });
        panelMenu.add(menu);
    }
    
    private void split(String name){
        panelMenu.add(new Split(name), "h 30");
    }
    
    private void space(){
        panelMenu.add(new JLabel(),"push");      
    }
    
    public void setSelected(int index){
        for(Component com:panelMenu.getComponents()){
            MenuButton menu = (MenuButton) com;
            if(menu.getIndex()==index){
                if(menu!=selectedMenu){
                    unSelectedMenu=selectedMenu;
                    selectedMenu=menu;
                    animator.start();
                    event.menuSelected(index);
                }
                break;
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroll = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();

        panelMenu.setOpaque(false);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 213, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 544, Short.MAX_VALUE)
        );

        scroll.setViewportView(panelMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelMenu;
    private javax.swing.JScrollPane scroll;
    // End of variables declaration//GEN-END:variables
}
