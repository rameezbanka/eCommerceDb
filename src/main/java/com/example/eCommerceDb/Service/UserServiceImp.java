package com.example.eCommerceDb.Service;

import com.example.eCommerceDb.Entity.User;
import com.example.eCommerceDb.Repository.UserRepository;
import com.example.eCommerceDb.UserDTO.LoginDTO;
import com.example.eCommerceDb.UserDTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{


    @Autowired
    private UserRepository userRepository;


    @Override
    public void registerUser(UserDTO userDTO) {
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());

        userRepository.save(user);

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User authenticateUSer(LoginDTO loginDTO) {
        User user = userRepository.findByEmail(loginDTO.getEmail());
        if(user!= null && user.getPassword().equals(loginDTO.getPassword())){
            return  user;
        }
        return null;
    }


}
