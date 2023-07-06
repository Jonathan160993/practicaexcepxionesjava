package excepcionesjava;

public class PruebaConexion {

		public static void main(String[] args)
		{
			
			Conexion con = null;
			try
			{
				con = new Conexion();
				con.leerDatos();
			} catch (IllegalStateException ex) 
			  {
				System.out.println("Recibiendo la excepxion");
				ex.printStackTrace();	
			  } finally 
			    {
					System.out.println("Ejecutando finally");
					if (con != null) 
					{
					  con.cerrar();
			        }
			   }
		}
	
	
	
}
