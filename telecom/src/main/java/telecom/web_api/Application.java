package telecom.web_api;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.metal.MetalLookAndFeel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import telecom.desk.authorization.authorization;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        
        
        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
            //UIManager.setLookAndFeel(new MetalLookAndFeel());
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(authorization.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SpringApplication.run(Application.class, args);
            }
        });
        
        
        System.out.println("INFO SERVER RUNNED");
        System.out.println("INFO CONNECT URL: localhost:8080");
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new authorization().setVisible(true);
            }
        });
    }
    
}
