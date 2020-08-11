package pl.javastart.weekop.service;

import org.apache.commons.codec.digest.DigestUtils;
import pl.javastart.weekop.dao.DAOFactory;
import pl.javastart.weekop.dao.UserDAO;
import pl.javastart.weekop.model.User;

public class UserService {

        public void addUser(String username, String email, String password) {
            User user = new User();
            user.setUsername(username);
            String md5Pass = encryptPassword(password);
            user.setPassword(md5Pass);
            user.setEmail(email);
            user.setIs_active(true);
            DAOFactory factory = DAOFactory.getDAOFactory();
            UserDAO userDao = factory.getUserDao();
            userDao.create(user);
        }

    public User getUserById(long userId) {
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDao = factory.getUserDao();
        User user = userDao.read(userId);
        return user;
    }

    public User getUserByUsername(String username) {
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO userDao = factory.getUserDao();
        User user = userDao.getUserByUsername(username);
        return user;
    }

    private String encryptPassword(String password){
        String md5Pass = DigestUtils.md5Hex(password);
        return md5Pass;
    }
}
