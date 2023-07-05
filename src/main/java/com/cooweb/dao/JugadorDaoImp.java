package com.cooweb.dao;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cooweb.models.Jugador;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

public class JugadorDaoImp implements JugadorDao{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override   
	@Transactional
	public List<Jugador> getJugadores() {	
		
		String query="FROM Jugador";
		List<Jugador> resultado=entityManager.createQuery(query).getResultList();
		
		return resultado;
	}
}
