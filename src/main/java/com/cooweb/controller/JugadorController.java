package com.cooweb.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cooweb.dao.JugadorDao;
import com.cooweb.models.Jugador;

@RestController
public class JugadorController {
	@Autowired
	private JugadorDao jugadorDao;
	@RequestMapping(value="mensaje")
	public String mensaje() {
		return "¡Hola Campeones del Mundo!";
	}
	
	@RequestMapping(value="persona")
	public List<String> listarPersonas(){
		return List.of("Lionel","Ángel","Julian");
	}
	
	@RequestMapping(value="jugadores")
	public Jugador listarJugadores() {
		Jugador jugador=new Jugador();
		jugador.setNombre("Lionel");
		jugador.setApellido("Messi");
		jugador.setEmail("loinelmessi10@gmail.com");
		jugador.setTelefono("2611812022");
		return jugador;
	}
	
	@RequestMapping(value="jugadores/{id}")
	public Jugador getJugadores(@PathVariable Long id) {
		Jugador jugador=new Jugador();
		jugador.setId(id);
		jugador.setNombre("Lionel");
		jugador.setApellido("Messi");
		jugador.setEmail("loinelmessi10@gmail.com");
		jugador.setTelefono("2611812022");
		return jugador;
	}
	
	@RequestMapping(value="jugadores/lista_jugadores")
	public List<Jugador> listar_variosJugadores() {
		List<Jugador> jugadores=new ArrayList<>();
		Jugador jugador1=new Jugador();
		jugador1.setId(10L);
		jugador1.setNombre("Lionel");
		jugador1.setApellido("Messi");
		jugador1.setEmail("loinelmessi10@gmail.com");
		jugador1.setTelefono("2611812022");
		
		Jugador jugador2=new Jugador();
		jugador2.setId(7L);
		jugador2.setNombre("Ángel");
		jugador2.setApellido("Di María");
		jugador2.setEmail("angelito07@gmail.com");
		jugador2.setTelefono("2611007022");
		
		jugadores.add(jugador1);
		jugadores.add(jugador2);
		
		return jugadores;
	}
	
	@RequestMapping(value="api/jugador")
	public List<Jugador> getJugador(){
		List<Jugador> ejemplo=jugadorDao.getJugadores();
		
		return ejemplo;
	}
}