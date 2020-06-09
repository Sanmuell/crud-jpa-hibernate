package com.crudjpa.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.crudjpa.modelo.Cliente;

public class AtualizandoPrimeiroObjeto {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = em.find(Cliente.class, 2L);

		em.getTransaction().begin();

		cliente.setNome("Maria da Silva Oliveira barros Maia");
		cliente.setProfissao("Advogada");

		em.getTransaction().commit();

		System.out.println("Atualizado com sucesso");

	}

}
