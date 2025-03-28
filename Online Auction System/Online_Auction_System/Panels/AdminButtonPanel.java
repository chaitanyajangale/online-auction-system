package Online_Auction_System.Panels;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class AdminButtonPanel extends JPanel{
    public JButton Admin_Home_Panel_buttons[];
    public JPopupMenu reports;
    public JPopupMenu add_new;
    JMenuItem system_user_report,customer_report,product_report,seller_report,product_bids;
    JMenuItem add_customer,add_system_user,add_product,add_seller;
    public AdminButtonPanel(){
        Admin_Home_Panel_buttons = new JButton[7];
        setLayout(new FlowLayout(FlowLayout.CENTER,20,6));
        Admin_Home_Panel_buttons[0] = new JButton("HOME");
        Admin_Home_Panel_buttons[1]=new JButton("SELLERS");
        Admin_Home_Panel_buttons[2]=new JButton("ADD PRODUCTS");
        Admin_Home_Panel_buttons[3]=new JButton("ADD NEW");
        Admin_Home_Panel_buttons[4]=new JButton("REPORTS");
        Admin_Home_Panel_buttons[5]=new JButton("CHANGE PASSWORD");
        Admin_Home_Panel_buttons[6]=new JButton("LOGOUT");
        //Reports button jpopup code start
        system_user_report = new JMenuItem("System User Report");
        customer_report = new JMenuItem("Customer Report");
        product_report = new JMenuItem("Product Report");
        seller_report = new JMenuItem("Seller Report");
        product_bids = new JMenuItem("Product Bids");
        reports = new JPopupMenu();
        reports.add(system_user_report);
        reports.add(customer_report);
        reports.add(product_report);
        reports.add(seller_report);
        reports.add(product_bids);
        //Reports button jpopup code end
        //ADD NEW button jpopup code start
        add_new = new JPopupMenu();
        add_customer = new JMenuItem("Add Customer");
        add_system_user = new JMenuItem("Add System User");
        add_product = new JMenuItem("Add Product");
        add_seller = new JMenuItem("Add Seller");
        add_new.add(add_customer);
        add_new.add(add_system_user);
        add_new.add(add_product);
        add_new.add(add_seller);
        //ADD NEW button jpopup code end
        for(int i=0;i<7;i++){
			add(Admin_Home_Panel_buttons[i]);
		}
    }
}
