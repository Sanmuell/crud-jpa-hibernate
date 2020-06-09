package com.crudjpa.main;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crudjpa.modelo.Cliente;

public class ConsultandoVariosObjetos {

	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();
		

		// Consulta e devolve lista de cliente 
		List<Cliente> todosClientes = em.createQuery("from Cliente where sexo = 'M' ", Cliente.class) 
								  .getResultList(); // para ele devolver a lista, precisa do getResult
		
		for (Cliente cliente: todosClientes) {
			System.out.println("Codigo: " + cliente.getCodigo());
			System.out.println("Nome: " + cliente.getNome());
			System.out.println("Sexo: " + cliente.getSexo());
			System.out.println("------------------------------------");
			
		}
	}

}
