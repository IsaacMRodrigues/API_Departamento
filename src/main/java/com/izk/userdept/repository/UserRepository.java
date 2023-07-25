package com.izk.userdept.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izk.userdept.entities.User;

// acessar dados do usuario
													// informa o tipo da entidade e qual é o ID dela, no caso do nosso é LONG
public interface UserRepository extends JpaRepository<User, Long> {

}
