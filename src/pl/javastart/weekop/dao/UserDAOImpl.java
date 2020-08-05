package pl.javastart.weekop.dao;

import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.javastart.weekop.model.User;
import pl.javastart.weekop.util.ConnectionProvider;

import java.util.List;

public class UserDAOImpl implements UserDAO{

    private static final String CREATE_USER =
            "INSERT INTO users(username, password, email, is_active) VALUES(:username, :password, :email, :is_active); ";

    private NamedParameterJdbcTemplate template;

    public UserDAOImpl(){
        template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
    }

    @Override
    public User create(User user) {
        User resultUser = new User(user);
        KeyHolder keyHolder = new GeneratedKeyHolder();
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(user);
        int update = template.update(CREATE_USER, parameterSource, keyHolder);
        if(update>0){
            resultUser.setId(keyHolder.getKey().longValue());
            setPrivileges(resultUser);
        }
        return resultUser;
    }

    private void setPrivileges(User resultUser) {
        final String userRoleQuery = "INSERT INTO user_role(username) VALUES(:username);";
        SqlParameterSource parameterSource = new BeanPropertySqlParameterSource(resultUser);
        template.update(userRoleQuery, parameterSource);
    }

    @Override
    public User read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(User updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }
}
