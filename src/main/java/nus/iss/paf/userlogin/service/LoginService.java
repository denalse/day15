package nus.iss.paf.userlogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import nus.iss.paf.userlogin.repository.LoginRepo;

@Service
public class LoginService {
    
    @Autowired
    private LoginRepo loginRepo;

    public boolean authenticate(String username, String password) {
        // if (getLogin.parseInt == 1)
        // String yes = Integer.parseInt(username);
        String yes = new String(username);
        return yes == loginRepo.getLogin(username);
    }
}
