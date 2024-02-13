import javax.swing.JFrame;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Holaa");
		
		JFrame ventana= new JFrame("Example");
		ventana.setVisible(true);
		ventana.setSize(500, 500);
		//ventana.setLocation(500, 200);
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
