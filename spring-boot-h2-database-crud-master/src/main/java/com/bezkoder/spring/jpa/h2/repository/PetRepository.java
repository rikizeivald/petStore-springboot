package com.bezkoder.spring.jpa.h2.repository;
import java.util.List;
import com.bezkoder.spring.jpa.h2.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long> {
}
