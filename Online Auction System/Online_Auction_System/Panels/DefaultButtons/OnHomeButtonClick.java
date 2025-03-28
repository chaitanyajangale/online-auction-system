package Online_Auction_System.Panels.DefaultButtons;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OnHomeButtonClick extends JPanel{
        public JPanel HOMEButtonPanel,Welcome_To_Auction_Panel;
        public ImageIcon home_page_image;
        public JLabel Auction_Label,Welcome_To_Label,home_page_image_label;
        public OnHomeButtonClick(){
            setVisible(true);
            setLayout(null);
            HOMEButtonPanel = new JPanel();
            JLayeredPane lpane = new JLayeredPane();
            HOMEButtonPanel.setLayout(new BorderLayout());
            HOMEButtonPanel.setBounds(0,0,990,520);
            home_page_image = new ImageIcon("auction_home_page.jpg");
            home_page_image_label=new JLabel(home_page_image);
            Welcome_To_Auction_Panel= new JPanel();
            lpane.setBounds(0,0,990,520);
            home_page_image_label.setBounds(0,0,990,520);
            Welcome_To_Label = new JLabel("");
            Auction_Label = new JLabel("");
            Welcome_To_Label.setFont(new Font("Times New Roman", Font.BOLD, 50));
            Auction_Label.setFont(new Font("Times New Roman", Font.BOLD, 70));
            Welcome_To_Auction_Panel.add(Welcome_To_Label);
            Welcome_To_Auction_Panel.add(Auction_Label);
            Welcome_To_Auction_Panel.setBounds(550,180,380,200);
            Welcome_To_Auction_Panel.setBackground(new Color(0,0,0,0));
            Welcome_To_Label.setForeground(new Color(245, 90, 66));
            Auction_Label.setForeground(new Color(245, 90, 66));
            lpane.add(home_page_image_label,new Integer(0),0);
            lpane.add(Welcome_To_Auction_Panel,new Integer(1),0);
            HOMEButtonPanel.add(lpane);
            add(HOMEButtonPanel);
            //WELCOME TO AUCTION Animation Start
            char Welcome_To_Label_String[] = new char[]{'W','E','L','C','O','M','E',' ','T','O'};
            char Auction_Label_String[] = new char[]{'A','U','C','T','I','O','N'};
            for(int i=0;i<Welcome_To_Label_String.length;i++){
                Welcome_To_Label.setText(Welcome_To_Label.getText()+Welcome_To_Label_String[i]);
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){

                }
            }
            for(int i=0;i<Auction_Label_String.length;i++){
                Auction_Label.setText(Auction_Label.getText()+Auction_Label_String[i]);
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){

                }
            }
        
            //WELCOME TO AUCTION Animation End
    }
}
		/*OnHomeButtonClick home_button_panel=new OnHomeButtonClick();
		home_button_panel.setBounds(0,150,1000,520);
		Main_Frame.home_page_panel.add(home_button_panel);
		OnAboutUsButtonClick about_us_button_panel = new OnAboutUsButtonClick();
		about_us_button_panel.setBounds(0,150,1000,420);
		Main_Frame.home_page_panel.add(about_us_button_panel);*/