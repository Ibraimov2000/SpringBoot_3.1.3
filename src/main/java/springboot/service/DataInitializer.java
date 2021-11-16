package springboot.service;

import org.springframework.stereotype.Component;
import springboot.model.Role;
import springboot.model.User;


import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;

    public DataInitializer(UserService userService, RoleService roleService) {
        this.userService = userService;
        this.roleService = roleService;
    }

    @PostConstruct
    public void Init() {
        roleService.addRole(new Role("ADMIN"));
        roleService.addRole(new Role("USER"));

        User admin = new User();
        admin.setName("Name");
        admin.setLastName("Last Name");
        admin.setAge(32);
        admin.setEmail("admin@email.com");
        admin.setPassword("admin");
        admin.setRoles(Set.of(new Role("ADMIN")));
        userService.createUser(admin);

        User user = new User();
        user.setName("UserName");
        user.setLastName("UserLastName");
        user.setAge(20);
        user.setEmail("user@email.com");
        user.setPassword("user");
        user.setRoles(Set.of(new Role("USER")));
        userService.createUser(user);
    }
}
