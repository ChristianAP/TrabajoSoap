package upeu.edu.pe.casos;

import javax.jws.WebService;

@WebService(endpointInterface= "upeu.edu.pe.casos.sueldosDao")
public class sueldoImp implements sueldosDao {

	@Override
	public double sueldo(double hora, double precio) {
		// TODO Auto-generated method stub
		double prS = precio * 1.5;
		double pagoF = 0;
		double horaMax = 0;
		if (hora > 40) {
			horaMax = hora -40;
			pagoF = (horaMax * prS) + (precio * 40);
		}else {
			pagoF = hora * precio;
		}
		return pagoF;
		
	}

}
