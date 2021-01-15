package ru.vsu.pet.tester.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import ru.vsu.pet.tester.entity.User;
import ru.vsu.pet.tester.repository.RoleRepository;
import ru.vsu.pet.tester.repository.UserRepository;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    public UserService(BCryptPasswordEncoder passwordEncoder,
                       UserRepository userRepository,
                       RoleRepository roleRepository)
    {
        this.passwordEncoder = passwordEncoder;
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        User user = userRepository.findByName(s);

        if (user == null){
            throw new UsernameNotFoundException("User with name \'" +
                    s + "\' not found.");
        } else {
            return user;
        }
    }

    private UserRepository userRepository;
    private RoleRepository roleRepository;
    private BCryptPasswordEncoder passwordEncoder;
}
