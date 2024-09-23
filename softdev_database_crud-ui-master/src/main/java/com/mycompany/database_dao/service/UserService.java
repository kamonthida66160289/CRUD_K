/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.database_dao.service;

import com.mycompany.database_dao.DAO.UserDao;
import com.mycompany.database_dao.model.User;
import java.util.List;

/**
 *
 * @author Asus
 */
public class UserService {
    public User login(String name,String Password){
        UserDao userdao = new UserDao();
        User user = userdao.getByName(name);
        if(user != null && user.getPassword().equals(Password)){
            return user;
        }
        return null;
    }
    public List<User> getUser(){
        UserDao userdao = new UserDao();
        return userdao.getAll("User_Login asc");
    }

    public User addnew(User editedUser) {
       UserDao userdao = new UserDao();
       return userdao.save(editedUser);
    }

    public User update(User editedUser) {
      UserDao userdao = new UserDao();
      return userdao.update(editedUser);
    }

    public int delete(User editedUser) {
      UserDao userdao = new UserDao();
      return userdao.delete(editedUser);
    }
}
