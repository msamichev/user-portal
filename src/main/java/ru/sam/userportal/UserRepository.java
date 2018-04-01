package ru.sam.userportal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    void delete(User user);

    List findAll();

    User findOne(int id);

    User save(User user);
}