package excepcionesjava;

public class PruebaConexion2 {

	public static void main(String[] args) throws Exception
	{
		try(Conexion con = new Conexion()){
			con.leerDatos();
		}catch(IllegalStateException ex){	
			System.out.println("Ejecutando catch");
			ex.printStackTrace();
		}
	}
}
