package com.docker.implementaciones;

import com.docker.interfaces.ConexionREST;

public class ConexionRESTFacturas implements ConexionREST{

	@Override
	public void leerURL(String url) {
		System.out.println("Datos facturas: "+url);
	}
}
