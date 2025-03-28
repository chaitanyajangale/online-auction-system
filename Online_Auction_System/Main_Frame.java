package Online_Auction_System;
import Online_Auction_System.Panels.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Main_Frame extends JFrame implements ActionListener{
	public JPanel main_page_panel,sub_page_panel;
	public ImageIcon application_icon; 
	public JLabel Online_Auction_System_Label;
	public JLabel  Hello_User_Label;
	public JPanel DefaultButtonPanel;
	public DefaultButtonPanel Default_Button_Panel;
	public CustomerButtonPanel Customer_Button_Panel;
	public SellerButtonPanel Seller_Button_Panel;
	public AdminButtonPanel Admin_Button_Panel;
	public Main_Frame(){
		setTitle("Online Auction System");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application_icon=new ImageIcon("auction_icon.jpg");
		setIconImage(application_icon.getImage());
		setLayout(null);
		setBounds(170,0,1000,750);
		setMinimumSize(new Dimension(1000,750));
		main_page_panel = new JPanel();
		main_page_panel.setBounds(0,0,1000,700);
		getContentPane().setBackground(new Color(157, 168, 50));
		main_page_panel.setBackground(new Color(157, 168, 50));
		main_page_panel.setLayout(null);
		Online_Auction_System_Label = new JLabel("Online Auction System");
		Online_Auction_System_Label.setFont(new Font("Times New Roman", Font.BOLD, 30));
		Online_Auction_System_Label.setForeground(Color.WHITE);   
		Online_Auction_System_Label.setBounds(300,10,500,32);
		Hello_User_Label= new JLabel("Hello User",JLabel.CENTER);
		Hello_User_Label.setBounds(600,35,500,20);
		main_page_panel.add(Online_Auction_System_Label);
		main_page_panel.add(Hello_User_Label);
		add(main_page_panel);
		sub_page_panel = new JPanel();
		sub_page_panel.setBounds(0,60,1000,690);
		sub_page_panel.setLayout(null);
		sub_page_panel.setBackground(new Color(157, 168, 50));
		main_page_panel.add(sub_page_panel);
	}
	public void addDefaultButtonPanel(){
		Default_Button_Panel = new DefaultButtonPanel();
		sub_page_panel.add(Default_Button_Panel);
	}
	public void addCustomerButtonPanel(){
		Customer_Button_Panel = new CustomerButtonPanel();
		Customer_Button_Panel.setBounds(0,60,1000,40);
		main_page_panel.add(Customer_Button_Panel);
	}
	public void addSellerButtonPanel(){
		Seller_Button_Panel = new SellerButtonPanel();
		Seller_Button_Panel.setBounds(0,60,1000,40);
		main_page_panel.add(Seller_Button_Panel);
	}
	public void addAdminButtonPanel(){
		Admin_Button_Panel = new AdminButtonPanel();
		Admin_Button_Panel.setBounds(0,60,1000,40);
		main_page_panel.add(Admin_Button_Panel);
		Admin_Button_Panel.Admin_Home_Panel_buttons[4].addActionListener(this);
		Admin_Button_Panel.Admin_Home_Panel_buttons[3].addActionListener(this);
	}
	public void actionPerformed(ActionEvent e){
        if(e.getSource()==Admin_Button_Panel.Admin_Home_Panel_buttons[4]){
            add(Admin_Button_Panel.reports);
			System.out.println(Admin_Button_Panel.Admin_Home_Panel_buttons[4].getBounds());
            Admin_Button_Panel.reports.show(Admin_Button_Panel,530,34);
        }
		if(e.getSource()==Admin_Button_Panel.Admin_Home_Panel_buttons[3]){
            add(Admin_Button_Panel.add_new);
			System.out.println(Admin_Button_Panel.Admin_Home_Panel_buttons[3].getBounds());
            Admin_Button_Panel.add_new.show(Admin_Button_Panel,425,34);
        }

    }
	
}