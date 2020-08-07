package pl.javastart.weekop.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import pl.javastart.weekop.model.Discovery;
import pl.javastart.weekop.util.ConnectionProvider;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DiscoveryDAOImpl implements DiscoveryDAO {

    private NamedParameterJdbcTemplate template;

    public DiscoveryDAOImpl() {
        template = new NamedParameterJdbcTemplate(ConnectionProvider.getDataSource());
    };

    private static final String CREATE_DISCOVERY =
            "INSERT INTO discovery(name, description, url, user_id, date, up_vote, down_vote) " +
                    "VALUES(:name, :description, :url, :user_id, :date, :up_vote, :down_vote);";



    @Override
    public Discovery create(Discovery discovery) {
        Discovery resultDiscovery = new Discovery(discovery);
        KeyHolder keyHolder = new GeneratedKeyHolder();
        Map<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", discovery.getName());
        paramMap.put("description", discovery.getDescription());
        paramMap.put("url", discovery.getUrl());
        paramMap.put("user_id", discovery.getUser().getId());
        paramMap.put("date", discovery.getTimestamp());
        paramMap.put("up_vote", discovery.getUpVote());
        paramMap.put("down_vote", discovery.getDownVote());
        SqlParameterSource parameterSource = new MapSqlParameterSource(paramMap);
        int update = template.update(CREATE_DISCOVERY, parameterSource, keyHolder);
        if(update>0){
            resultDiscovery.setId(keyHolder.getKey().longValue());
        }
        return resultDiscovery;
    }

    @Override
    public Discovery read(Long primaryKey) {
        return null;
    }

    @Override
    public boolean update(Discovery updateObject) {
        return false;
    }

    @Override
    public boolean delete(Long key) {
        return false;
    }

    @Override
    public List<Discovery> getAll() {
        return null;
    }
}
