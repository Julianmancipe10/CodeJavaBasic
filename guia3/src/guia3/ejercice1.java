package guia3;
import javax.swing.JOptionPane;

public class ejercice1 {

	public static void main(String[]args) {
		

		String input = JOptionPane.showInputDialog(null, "Introduce el valor de su compra");
		int precioCompra = Integer.parseInt(input);

	
		double descuento = precioCompra*0.1;
		
		double precioFinal = precioCompra - descuento;		
		
		if (precioCompra > 50000) {
			
			JOptionPane.showMessageDialog(null,"Su precio con descuento es " + precioFinal);
		}else {
			JOptionPane.showMessageDialog(null, "Su compra no tiene descuento");
		}	
		
	}
	
}
