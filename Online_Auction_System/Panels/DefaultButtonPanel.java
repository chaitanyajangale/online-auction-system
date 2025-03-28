package Online_Auction_System.Panels;
import Online_Auction_System.Panels.DefaultButtons.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class DefaultButtonPanel extends JPanel implements ActionListener{
    OnHomeButtonClick ohbc;
    public JPanel default_buttons_panel_box,default_buttons_show_panel_box;
    public JButton Default_Home_Panel_buttons[];
    public DefaultButtonPanel(){
        setLayout(null);
        setSize(990, 690);
        setBackground(new Color(157, 168, 50));
        default_buttons_panel_box = new JPanel();
        default_buttons_panel_box.setLayout(new FlowLayout(FlowLayout.CENTER,20,6));
        Default_Home_Panel_buttons = new JButton[7];
        Default_Home_Panel_buttons[0] = new JButton("HOME");
        Default_Home_Panel_buttons[1]=new JButton("ABOUT US");
        Default_Home_Panel_buttons[2]=new JButton("SELLER");
        Default_Home_Panel_buttons[3]=new JButton("ALL PRODUCTS");
        Default_Home_Panel_buttons[4]=new JButton("REGISTER");
        Default_Home_Panel_buttons[5]=new JButton("LOGIN");
        Default_Home_Panel_buttons[6]=new JButton("CONTACT US");
        default_buttons_panel_box.setBounds(0,0,990,40);
        for(int i=0;i<7;i++){
			default_buttons_panel_box.add(Default_Home_Panel_buttons[i]);
            Default_Home_Panel_buttons[i].addActionListener(this);
		}
        default_buttons_show_panel_box = new JPanel();
        default_buttons_show_panel_box.setLayout(null);
        default_buttons_show_panel_box.setBounds(0,80,990,520);
        add(default_buttons_panel_box);
        add(default_buttons_show_panel_box);
        default_buttons_show_panel_box.removeAll();
        ohbc = new OnHomeButtonClick();
        ohbc.setBounds(0,0,990,520);
        default_buttons_show_panel_box.add(ohbc);
        enable_disable_buttons(0);

    }
    public void enable_disable_buttons(int disable){
        for(int i=0;i<7;i++){
            if(disable==i){
                Default_Home_Panel_buttons[i].setEnabled(false);
            }
            else{
                Default_Home_Panel_buttons[i].setEnabled(true);
            }
        }
    }
    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
       if(e.getSource()==Default_Home_Panel_buttons[0]){
            default_buttons_show_panel_box.removeAll();
            default_buttons_show_panel_box.add(ohbc);
            enable_disable_buttons(0);
        } 
                                            
       if(e.getSource()==Default_Home_Panel_buttons[1]){
            default_buttons_show_panel_box.removeAll();
            OnAboutUsButtonClick oaubc = new OnAboutUsButtonClick();
            oaubc.setBounds(0,0,990,520);
            default_buttons_show_panel_box.add(oaubc);
            enable_disable_buttons(1);
        }
       if(e.getSource()==Default_Home_Panel_buttons[2]){
        default_buttons_show_panel_box.removeAll();
        OnSellerButtonClick osbc = new OnSellerButtonClick();
        osbc.setBounds(0,0,990,520);
        default_buttons_show_panel_box.add(osbc);
        enable_disable_buttons(2);
        }

        if(e.getSource()==Default_Home_Panel_buttons[3]){
            default_buttons_show_panel_box.removeAll();
            OnAllProductsButtonClick oapbc = new OnAllProductsButtonClick();
            oapbc.setBounds(0,0,990,520);
            default_buttons_show_panel_box.add(oapbc);
            enable_disable_buttons(3);
        } 

        if(e.getSource()==Default_Home_Panel_buttons[4]){
            default_buttons_show_panel_box.removeAll();
            OnRegisterButtonClick orbc = new OnRegisterButtonClick();
            orbc.setBounds(0,0,990,520);
            default_buttons_show_panel_box.add(orbc);
            enable_disable_buttons(4);
        }

        if(e.getSource()==Default_Home_Panel_buttons[5]){
            default_buttons_show_panel_box.removeAll();
            OnLoginButtonClick olbc = new OnLoginButtonClick();
            olbc.setBounds(0,0,990,520);
            default_buttons_show_panel_box.add(olbc);
            enable_disable_buttons(5);
        }

        if(e.getSource()==Default_Home_Panel_buttons[6]){
            default_buttons_show_panel_box.removeAll();
            OnContactUsButtonClick ocubc = new OnContactUsButtonClick();
            ocubc.setBounds(0,0,990,520);
            default_buttons_show_panel_box.add(ocubc);
            enable_disable_buttons(6);
        }
    }
}
