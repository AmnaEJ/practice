package com.example.practice.Respository;

import com.example.practice.DTOS.EmployeeGetDto;
import com.example.practice.models.Employee;
import jakarta.transaction.Transactional;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface EmployeeRespository extends JpaRepository<Employee, Long> {
   @Query("SELECT e FROM Employee e WHERE (:name IS NULL OR e.name = :name)")

   List<Employee> findByName(@Param("name") String name);



     @Query("SELECT t FROM Employee t")
      List<Employee> findAll();


   @Query(value = "SELECT u From Employee u")
   List<Employee> findAlLUserSort(Sort sort);

   @Query(value = "SELECT u FROM Employee u WHERE u.name= ?1")
   Employee findByParameter(@Param("name") String name);


   @Query(value = "SELECT u FROM Employee u WHERE u.name IN :names")
    List<Employee> FindByNameIn  (@Param("names") List<String> names);


   @Transactional
    @Modifying
    @Query("update Employee u set u.name= :name where u.id = :id")
    Integer updateUserSetNameForId(@Param("name") String name,
                                   @Param("id") Long id);

}

