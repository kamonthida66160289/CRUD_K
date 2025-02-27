/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.database_dao.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Asus
 */
public class User {
    private int ID;
    private String Name;
    private String Password;
    private int Role;
    private String Gender;
    private String Login;

    public User() {
        this.ID=-1;
        this.Gender = "M";
        this.Role = 0;
        this.Name = "";
        this.Login = ""; 
        this.Password = "";
    }

    public User(String Name, String Password, int Role, String Gender, String Login) {
        this.ID=-1;
        this.Name = Name;
        this.Password = Password;
        this.Role = Role;
        this.Gender = Gender;
        this.Login = Login;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", Name=" + Name + ", Password=" + Password + ", Role=" + Role + ", Gender=" + Gender + ", Login=" + Login + '}';
    }


    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int Role) {
        this.Role = Role;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public User(int ID, String Name, String Password, int Role, String Gender,String Login) {
        this.ID = ID;
        this.Name = Name;
        this.Password = Password;
        this.Role = Role;
        this.Gender = Gender;
        this.Login = Login;
    }
    
    public void fromRS(ResultSet rs){
        try {
            this.setID(rs.getInt("User_ID"));
            this.setName(rs.getString("User_Name"));
            this.setRole(rs.getInt("User_Role"));
            this.setGender(rs.getString("User_Gender"));
            this.setPassword(rs.getString("User_Password"));
            this.setLogin(rs.getString("User_Login"));
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
