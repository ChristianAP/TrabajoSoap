package upeu.edu.pe.casos;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface sueldosDao {
		@WebMethod
		public double sueldo(double hora, double precio);	
}
