package com.ndaho.rhapi.repository;

import com.ndaho.rhapi.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/*
Repository :Communiquer avec la source de données
 @Repository est une annotation Spring pour indiquer que la classe est un bean, et que son rôle est de communiquer avec une source de données (en l'occurrence la base de données).
 */

@Repository
public interface EmployeeRepositoryInterface extends CrudRepository<Employee,Long> {

}
