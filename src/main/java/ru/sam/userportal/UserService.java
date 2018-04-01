package ru.sam.userportal;

import java.util.List;

public interface UserService {

    User create(User user);


    User delete(long id);


    List findAll();


    User findById(long id);


    User update(User user);

}
