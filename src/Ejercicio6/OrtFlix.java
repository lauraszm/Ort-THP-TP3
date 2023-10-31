package Ejercicio6;

import java.util.ArrayList;

public class OrtFlix {
	private ArrayList<Cliente> clientes;
	private ArrayList<Pelicula> peliculas;
	private ArrayList<Cliente> deudores;
	
	public OrtFlix() {
		this.clientes = new ArrayList<>();
		this.peliculas = new ArrayList<>();
		this.deudores = new ArrayList<>();
	}
	
	public ResultadoVerPelicula verPelicula(String dni, String titulo) {
		ResultadoVerPelicula resultado = ResultadoVerPelicula.OK;
		Cliente cliente = this.buscarClientePorDni(dni);
		if (cliente != null) {			
			Pelicula pelicula = this.buscarPeliculaPorTitulo(titulo);
			if (pelicula != null) {
				boolean esDeudor = cliente.esDeudor();
				if (!esDeudor) {
					if (cliente.getServicio().equals(Servicio.PREMIUM) || pelicula.getServicio().equals(Servicio.STANDARD)) {
						resultado = ResultadoVerPelicula.OK;
					} else {
						resultado = ResultadoVerPelicula.CONTENIDO_NO_DISPONIBLE;
					}
				} else {
					resultado = ResultadoVerPelicula.CLIENTE_DEUDOR;
				}
			} else {				
				resultado = ResultadoVerPelicula.CONTENIDO_INEXISTENTE;
			}
		} else {
			resultado = ResultadoVerPelicula.CLIENTE_INEXISTENTE;			
		}
		return resultado;
	}
	
	private Cliente buscarClientePorDni(String dni) {
		Cliente clienteBuscado = null;
		Cliente clienteActual;
		int index = 0;
		int cantClientes = this.clientes.size();
		
		while(index < cantClientes && clienteBuscado == null) {
			clienteActual = this.clientes.get(index);
			if(clienteActual.getDni().equals(dni)) {
				clienteBuscado = clienteActual;
			} else {
				index++;
			}
		}
		return clienteBuscado;
	}
	
	private boolean buscarDeudor(Cliente cliente) {
		boolean enListaDeudores = false;
		Cliente deudorBuscado = null;
		Cliente deudorActual;
		int index = 0;
		int cantDeudores = this.deudores.size();
		
		while(index < cantDeudores && deudorBuscado == null) {
			deudorActual = this.deudores.get(index);
			if(deudorActual.equals(cliente)) {
				deudorBuscado = deudorActual;
				enListaDeudores = true;
			} else {
				index++;
			}
		}
		return enListaDeudores;
	}
	
	private void agregarDeudor(Cliente cliente) {
		if (cliente.esDeudor()) {
			this.deudores.add(cliente);
		}
	}
	
	private Pelicula buscarPeliculaPorTitulo(String titulo) {
		Pelicula peliculaBuscada = null;
		Pelicula peliculaActual;
		int index = 0;
		int cantPeliculas = this.peliculas.size();
		
		while(index < cantPeliculas && peliculaBuscada == null) {
			peliculaActual = this.peliculas.get(index);
			if(peliculaActual.getNombre().equals(titulo)) {
				peliculaBuscada = peliculaActual;
			} else {
				index++;
			}
		}
		return peliculaBuscada;
	}
	
	
	
	/*
	 * Desarrollá la explotación del método darDeBaja(...). Este método recibe un DNI y
	elimina de la lista al cliente con el mismo DNI. Si al darlo de baja el cliente es deudor
	se lo agregará a una lista negra (por ejemplo, para no volver a asociarlo sin cancelar
	la deuda previa).
	 */
	public boolean darDeBaja (String dni) {
		boolean dadoDeBaja = false;
		Cliente clienteBuscado = this.buscarClientePorDni(dni);
		
		if (clienteBuscado != null) {
			this.clientes.remove(clienteBuscado);
			this.agregarDeudor(clienteBuscado);
			dadoDeBaja = true;
		}
		
		return dadoDeBaja;
	}
	
	/*
	 * Desarrollá el método darDeAlta(...). Este método recibe un DNI y la categoría y
agrega al cliente en su lista de clientes. Debe devolver alguno de los siguientes
resultados:
● CLIENTE_EXISTENTE: Dni ya encontrado.
● CLIENTE_DEUDOR: El cliente posee deuda previa y se encuentra en la lista
negra.
● ALTA_OK: Están dadas las condiciones para dar de alta al cliente.
*/
	
	public ResultadoAlta darDeAlta(String dni, Servicio servicio) {
		ResultadoAlta resultado = ResultadoAlta.ALTA_OK;
		Cliente clienteABuscar = this.buscarClientePorDni(dni);
		boolean enListaDeudores = this.buscarDeudor(clienteABuscar);
		if (clienteABuscar != null) {
			if (enListaDeudores) {
				resultado = ResultadoAlta.CLIENTE_DEUDOR;
			} else {				
				resultado = ResultadoAlta.CLIENTE_EXISTENTE;
			}
		} else {
			this.clientes.add(clienteABuscar);
		}
		
		return resultado;
	}
	
	/*
	 * Desarrollá el método depurarListaNegra(...) que recibe un importe tope y
elimina de la lista negra todos los ex-deudores con un importe de deuda menor o
igual al recibido por parámetro.*/
	
	public void depurarListaDeudores(double tope) {
		for(Cliente deudor: deudores) {
			if(deudor.getSaldo() <= tope) {
				this.deudores.remove(deudor);
			}
		}
	}
}
