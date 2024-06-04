package ru.netology.daowithhibernate;

import ru.netology.daowithhibernate.entity.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class DaOwithHibernateApplication implements CommandLineRunner {
	@PersistenceContext
	private EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(DaOwithHibernateApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) {
		System.out.println(entityManager.createQuery("from Person", Person.class).getResultList());
	}
}