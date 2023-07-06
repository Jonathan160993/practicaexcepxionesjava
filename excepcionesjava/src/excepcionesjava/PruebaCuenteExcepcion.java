package excepcionesjava;

public class PruebaCuenteExcepcion {
 
	public static void main (String[] args)
	{
		Cuenta cuenta = new Cuenta();
		try {
			cuenta.depositar();
		} catch (MiException e) {
			e.printStackTrace();
		}
	}
	 
}
