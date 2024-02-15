import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame {
	
	public Ventana()
	{
		JFrame ventana=new JFrame();
		ventana.setVisible(true);
		ventana.setSize(300, 300);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setTitle("Mi ventana");
		ventana.setMinimumSize(new Dimension(250,250));
		ventana.setMaximumSize(new Dimension(750,750));
		ventana.setResizable(true);
		ventana.setLocation(200, 200);
		ventana.setLocationRelativeTo(null);
		
		this.iniciarComponentes();
		
	}
	public void iniciarComponentes()
	{
		JPanel login= new JPanel();
		login.setSize(this.getWidth(),this.getHeight());
		login.setBackground(Color.RED);
		this.add(login);
		
	}
	
	
	
	

}
