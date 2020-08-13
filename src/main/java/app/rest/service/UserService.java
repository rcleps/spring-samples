package app.rest.service;

import app.dao.mongodb.UserDao;
import app.rest.model.User;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.UUID;

@Service
public class UserService {
    @Inject
    private UserDao userDao;

    public void createUser(User user){
        user.setUserId(UUID.randomUUID().toString());
        userDao.save(user);
    }

}
