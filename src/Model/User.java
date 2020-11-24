/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author JpMurcia
 */
public class User {

    private int id;
    private String name;

    private String lastname;

    private String age;

    private String email;

    private String password;

    public  User(int id, String name, String lastname, String age, String email, String password) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        
        this.email = email;
        this.password = password;
    }

    public User() {
        this.id = 0;
        this.name = "";
        this.lastname = "";
        this.age = "";
        
        this.email = "";
        this.password = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void Registror(int id, String name, String lastname, String age,  String email, String password) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.id = id;
        this.email = email;
        this.password = password;
    }

}
