package guia2;
import javax.swing.JOptionPane;
public class ejercice4 {
	public static void main(String[]args) {
	
	    String sueldoTrabajador = JOptionPane.showInputDialog(null, "Ingrese su sueldo:");
	
		int sueldo=Integer.parseInt(sueldoTrabajador); 
	
	 	double operacion= sueldo*0.3;
	
	 	double total= sueldo+operacion;
	
	 	JOptionPane.showMessageDialog(null, "Su sueldo total con un 30% de aumento es: " + total);		
		
		
	} 
	
}
