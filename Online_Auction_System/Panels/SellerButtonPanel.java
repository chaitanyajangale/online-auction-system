package Online_Auction_System.Panels;
import javax.swing.*;
import java.awt.*;
public class SellerButtonPanel extends JPanel {
    JButton Seller_Home_Panel_buttons[];
    public SellerButtonPanel(){
        setLayout(new FlowLayout(FlowLayout.CENTER,20,6));
        Seller_Home_Panel_buttons = new JButton[7];
        Seller_Home_Panel_buttons[0] = new JButton("HOME");
        Seller_Home_Panel_buttons[1]=new JButton("MY DASHBOARD");
        Seller_Home_Panel_buttons[2]=new JButton("ADD PRODUCTS");
        Seller_Home_Panel_buttons[3]=new JButton("PRODUCT BIDS");
        Seller_Home_Panel_buttons[4]=new JButton("PRODUCT REPORT");
        Seller_Home_Panel_buttons[5]=new JButton("MY ACCOUNT");
        Seller_Home_Panel_buttons[6]=new JButton("LOGOUT");
        for(int i=0;i<7;i++){
			add(Seller_Home_Panel_buttons[i]);
		}
    }
}
