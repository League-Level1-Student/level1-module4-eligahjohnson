import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TrickorTreat  implements ActionListener{ 
	//Trickor
	private void showPictureFromTheInternet(String imageUrl) {
	    try {
	        URL url = new URL(imageUrl);
	        Icon icon = new ImageIcon(url);
	        JLabel imageLabel = new JLabel(icon);
	        JFrame frame = new JFrame();
	        frame.add(imageLabel);
	        frame.setVisible(true);
	        frame.pack();  
	        

     
	    } catch (MalformedURLException e) {
	        e.printStackTrace();
	    }
	}
	   
	
	public static void main(String[] args) {
		TrickorTreat
}
TrickorTreat(){ 
	 JButton trick = new JButton ("Trick");
     JButton treat = new JButton ("Treat"); 
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}