package mce.depurar;

import javax.swing.JOptionPane;

public class Email_Correcto {
	
	public static void main(String[] args) {
		
		boolean valido=false;
		
		
		do {
			
			String email=JOptionPane.showInputDialog("Introduce tu email, por favor");
		
			if((controlArroba(email))==1 && (controlPunto(email))==true && email.length()>=4) valido=true;
			
			else JOptionPane.showInputDialog(null, "Email no valido. Introduce de nuevo:");
		}while(!valido);
		
		JOptionPane.showMessageDialog(null, "Email correcto","Éxito", 1);
	}
	
	public static int controlArroba(String email) {
		
	
		int arroba=0;
		
		for(int i=0;i<email.length(); i++) {
			
			if(email.charAt(i)=='@') arroba++;
		}
		
		return arroba;
		
	}
	
	public static boolean controlPunto(String email) {
		
		boolean punto=false;
		
		for(int i=0;i<email.length(); i++) {
			
			if(email.charAt(i)=='.') punto=true;
		}
		
		return punto;
		
	}
	}
