package ua.edu.ucu.apps.flowerstore.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.ucu.apps.flowerstore.model.users.AppUser;
import ua.edu.ucu.apps.flowerstore.repository.AppUserRepository;
@Service
public class AppUserService {
    
    private final AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getFlowers() {
        return appUserRepository.findAll();
    }

    public AppUser addFlower(AppUser user) {
        return appUserRepository.save(user);
    }
    public AppUser getUserByEmail(String email){
        return appUserRepository.findUserByEmail(email);
    }
}
