package pl.javastart.weekop.dao;

public class MySqlDaoFactory extends DAOFactory {

    @Override
    public DiscoveryDAO getDiscoveryDao() {
        return new DiscoveryDAOImpl();
    }

    @Override
    public UserDAO getUserDao() {
        return new UserDAOImpl();
    }

    @Override
    public VoteDAO getVoteDao() {
        return new VoteDAOImpl();
    }
}
