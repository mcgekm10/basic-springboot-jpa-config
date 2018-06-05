package io.springconfig.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.springconfig.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

}
