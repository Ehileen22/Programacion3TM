import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ventana extends JFrame{

	public Ventana()
	{
		
		this.setVisible(true);
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Mi ventana");
		this.setMinimumSize(new Dimension(250,250));
		this.setMaximumSize(new Dimension(750,750));
		this.setResizable(true);
		this.setLocation(200, 200);
		this.setLocationRelativeTo(null);
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
