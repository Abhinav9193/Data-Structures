package com.abhinav.Quizzz.Repository;

import com.abhinav.Quizzz.Entity.Questions;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionsRepository extends JpaRepository<Questions,Long>
{
    List<Questions> findByCategory(String category);
}
