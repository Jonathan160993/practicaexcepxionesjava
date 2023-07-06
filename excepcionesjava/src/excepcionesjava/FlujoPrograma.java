package excepcionesjava;

public class FlujoPrograma {
  
	public static void main (String[]args) 
	{
			System.out.println("inicio main");
			metodo1();
			System.out.println("Fin de main");
		
	}
	
	private static void metodo1()
	{
		System.out.println("inicio metodo 1");
		
		try {
			metodo2();
		} catch (MiException ex) {
			String msg = ex.getMessage();
			System.out.println("Exception" + msg);
			ex.printStackTrace();
		}
	}
	
	private static void metodo2() throws MiException
	{
		System.out.println("Inicio de metodo 2");
		throw new ArithmeticException("Dio error ");
			
	}
	
	
	
	
	
}
