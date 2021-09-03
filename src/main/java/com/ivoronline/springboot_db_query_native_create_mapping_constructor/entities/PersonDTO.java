package com.ivoronline.springboot_db_query_native_create_mapping_constructor.entities;

public class PersonDTO {

  //PROPERTIES
  public String  name;
  public Integer age;

  //CONSTRUCTORS
  public PersonDTO() {}
  public PersonDTO(String  name, Integer age) {
    this.name = name;
    this.age  = age;
  }

}
