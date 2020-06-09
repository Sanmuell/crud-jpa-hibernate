package com.crudjpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crudjpa.modelo.Cliente;

public class SalvandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Ageu da Silva Oliveira");
		cliente.setIdade(50);
		cliente.setProfissao("Motorista");
		cliente.setSexo("M");

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();

		System.out.println("Cliente salvo com sucesso!");

	}

}
