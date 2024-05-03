//•	Haga un algoritmo que imprima cual es el mayor de 2 números.

package guia3;

import javax.swing.JOptionPane;

public class ejercice2 {

	public static void  main(String[]args){
		
		String primero = JOptionPane.showInputDialog(null, "Ingrese el primer valor");
		int numero1 = Integer.parseInt(primero);

		String segundo = JOptionPane.showInputDialog(null, "Ingrese el segundo valor");
		int numero2 = Integer.parseInt(segundo);
		
		if (numero1 > numero2) {
			
			JOptionPane.showConfirmDialog(null, "EL numero mayo es numero 1");
		
		}else if (numero1<numero2) { 
					
			JOptionPane.showConfirmDialog(null,"El numero mayor es el segundo valor ");
		
		}else {
				
			JOptionPane.showConfirmDialog(null, "Los numeros son iguales");
		}
			
	}
}

