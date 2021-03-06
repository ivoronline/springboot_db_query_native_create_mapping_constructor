package com.ivoronline.springboot_db_query_native_create_mapping_constructor.entities;

import com.ivoronline.springboot_db_query_native_create_mapping_constructor.dto.PersonDTO;

import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;

@SqlResultSetMapping(
  name    = "PersonViewMapping",
  classes = @ConstructorResult(
    targetClass = PersonDTO.class,
    columns     = {
      @ColumnResult(name = "name"),
      @ColumnResult(name = "age" )
    }
  )
)
@Entity
public class Person {

  //PROPERTIES
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  public Integer id;
  public String  name;
  public Integer age;

}
