package com.example.eCommerceDb.Repository;

import com.example.eCommerceDb.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository <User,String>{


    User findByEmail(String email);
}