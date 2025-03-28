package Online_Auction_System.Panels.DefaultButtons;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class OnAboutUsButtonClick extends JPanel{
	public JPanel line,paragraph1_panel;
	public JLabel heading;
	public JTextArea paragraph1;
	public OnAboutUsButtonClick(){
		setLayout(null);
		heading = new JLabel("About Online Auction System");
		heading.setFont(new Font("Times New Roman", Font.PLAIN, 26));
		heading.setBounds(5,5,400,30);
		line = new JPanel();
		line.setBounds(0,50,1000,2);
		line.setBackground(Color.BLACK);
		paragraph1 = new JTextArea("		An online auction is an auction which is held over the internet. Online auctions come in many different formats, but most popularly they are ascending English auctions, descending Dutch auctions, first-price sealed-hid, Vickrey auctions, or sometimes even a combination of multiple auctions, taking elements of one and forging them with another. The scope and reach of these auctions have been propelled by the Internet to a level beyond what the initial purveyors had anticipated. This is mainly because online auctions break down and remove the physical limitations of traditional auctions such as geography, presence, time, space, and a small target audience. This affix in reachability has also made it easier to commit unlawful actions within an auction. In 2002, on auctions were projected to account for 30% of all online e-commerce due to the rapid expansion of the popularity of the form of electronic commerce. 			                    Online auctions were taking place even before the release of the first web browser for personal computers, NCSA Mosaic. Instead of users selling items through the Web they were instead trading through text based newsgroups and email discussion lists. However, the first Web-based commercial activity regarding online auctions that made significant sales began in May 1995 with the company Onsale. In September that same year eBay also began trading. Both of these companies used ascending bid. The Web offered new advantages such as the use of automated bids via electronic forms, a search engine to be able to quickly find iterns and the ability to allow users to view items by categories." );	
		paragraph1.setWrapStyleWord(true);
		paragraph1.setLineWrap(true);
		paragraph1.setEditable(false);
		paragraph1.setBounds(0,50,980,100);
		paragraph1.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		paragraph1_panel = new JPanel();
		paragraph1_panel.setLayout(new FlowLayout());
		paragraph1_panel.add(paragraph1);
		paragraph1_panel.setBounds(5,60,980,400);
	
		add(heading);
		add(line);
		add(paragraph1_panel);
	}
}