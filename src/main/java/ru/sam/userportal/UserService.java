package ru.sam.userportal;

import java.util.List;

public interface UserService {

    User create(User user);


    User delete(int id);


    List findAll();


    User findById(int id);


    User update(User user);

}
