package com.example.eCommerceDb.Service;


import com.example.eCommerceDb.Entity.User;
import com.example.eCommerceDb.UserDTO.LoginDTO;
import com.example.eCommerceDb.UserDTO.UserDTO;


import java.util.List;

public interface UserService {

    void registerUser(UserDTO userDTO);

    List<User> getAllUsers();

    User authenticateUSer(LoginDTO loginDTO);
}
