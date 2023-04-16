package com.bezkoder.spring.jpa.h2;

import com.bezkoder.spring.jpa.h2.model.Pet;
import com.bezkoder.spring.jpa.h2.repository.PetRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;
import java.util.Objects;

@DataJpaTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SpringBootJpaH2ApplicationTests {
	@Autowired
	private PetRepository petRepository;
	
	@Test
	@Order(1)
	@Rollback(value = false)
	void createPet() {
		Pet pet =new Pet(10,10,"male","strong");
		petRepository.save(pet);
		Assertions.assertThat(pet.getId()).isGreaterThan(0);
	}
	
	@Test
	@Order(2)
	public void getPetByIdTest(){
		Pet pet =new Pet(10,10,"male","strong");
		Pet pet2=petRepository.save(pet);
		Assertions.assertThat(pet.getId()).isEqualTo(pet2.getId());
	}

	@Test
	@Order(3)
	public void getListOfPetsTest(){
		Pet pet =new Pet(10,10,"male","strong");
		petRepository.save(pet);
		Assertions.assertThat(pet.getId()).isGreaterThan(0);
		List<Pet> pets = petRepository.findAll();
		Assertions.assertThat(pets.size()).isGreaterThan(0);
	}
	
	@Test
	@Order(4)
	@Rollback(value = false)
	public void updatePetTest(){
		Pet pet =new Pet(10,20,"male","strong");
		pet.setPrice(30);
		Pet petUpdated =  petRepository.save(pet);
		Assertions.assertThat(petUpdated.getPrice()).isEqualTo(30);
	}

	@Test
	@Order(5)
	@Rollback(value = false)
	public void deletePetTest(){
		Pet pet =new Pet(10,20,"male","health");
		petRepository.save(pet);
		petRepository.deleteById(pet.getId());
		Assertions.assertThat(pet.getId()).isNull();
	}

}






