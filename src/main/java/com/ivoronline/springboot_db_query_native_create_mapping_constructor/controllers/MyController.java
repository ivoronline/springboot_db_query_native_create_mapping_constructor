package com.ivoronline.springboot_db_query_native_create_mapping_constructor.controllers;

import com.ivoronline.springboot_db_query_native_create_mapping_constructor.entities.Person;
import com.ivoronline.springboot_db_query_native_create_mapping_constructor.entities.PersonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@RestController
public class MyController {

  @PersistenceContext EntityManager entityManager;

  //================================================================
  // SELECT PERSON
  //================================================================
  @RequestMapping("SelectPerson")
  PersonDTO selectPerson() {

    //CREATE QUERY
    String select = "SELECT name, age FROM Person WHERE name = :name AND age = :age";
    Query  query  = entityManager.createNativeQuery(select, "PersonDTOMapping");
           query.setParameter("name", "John");
           query.setParameter("age" , 20    );

    //SELECT PERSON
    PersonDTO personDTO = (PersonDTO) query.getSingleResult();

    //RETURN PERSON
    return personDTO;
  }

}


