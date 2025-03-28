package Online_Auction_System.Panels;
import javax.swing.*;
import java.awt.*;
public class CustomerButtonPanel extends JPanel {
    JButton Customer_Home_Panel_buttons[];
    public CustomerButtonPanel(){
        setLayout(new FlowLayout(FlowLayout.CENTER,20,6));
        Customer_Home_Panel_buttons = new JButton[7];
        Customer_Home_Panel_buttons[0] = new JButton("HOME");
        Customer_Home_Panel_buttons[1]=new JButton("SELLER");
        Customer_Home_Panel_buttons[2]=new JButton("ALL PRODUCTS");
        Customer_Home_Panel_buttons[3]=new JButton("MY BIDS");
        Customer_Home_Panel_buttons[4]=new JButton("MY ACCOUNT");
        Customer_Home_Panel_buttons[5]=new JButton("CONTACT US");
        Customer_Home_Panel_buttons[6]=new JButton("LOGOUT");
        for(int i=0;i<7;i++){
			add(Customer_Home_Panel_buttons[i]);
		}
    }
}
