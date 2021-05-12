package upeu.edu.pe.casos;

import javax.xml.ws.Endpoint;

public class sueldoPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:2121/soap/sueldo", new sueldoImp());
	}

}
