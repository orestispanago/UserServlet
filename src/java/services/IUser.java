/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import entities.User;
import java.util.List;

/**
 *
 * @author mac
 */
public interface IUser {
    User findById(int id);
    List<User> findAll();
    boolean deleteById(int id);
    
}
