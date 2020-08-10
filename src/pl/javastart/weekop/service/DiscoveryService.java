package pl.javastart.weekop.service;

import pl.javastart.weekop.dao.DAOFactory;
import pl.javastart.weekop.dao.DiscoveryDAO;
import pl.javastart.weekop.model.Discovery;
import pl.javastart.weekop.model.User;

import java.sql.Timestamp;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

public class DiscoveryService {
    public void addDiscovery(String name, String desc, String url, User user) {
        Discovery discovery = createDiscoveryObject(name, desc, url, user);
        DAOFactory factory = DAOFactory.getDAOFactory();
        DiscoveryDAO discoveryDao = factory.getDiscoveryDao();
        discoveryDao.create(discovery);
    }

    private Discovery createDiscoveryObject(String name, String desc, String url, User user) {
        Discovery discovery = new Discovery();
        discovery.setName(name);
        discovery.setDescription(desc);
        discovery.setUrl(url);
        User userCopy = new User(user);
        discovery.setUser(userCopy);
        discovery.setTimestamp(new Timestamp(new Date().getTime()));
        return discovery;
    }

    public List<Discovery> getAllDiscoveries() {
        return getAllDiscoveries(null);
    }

    public List<Discovery> getAllDiscoveries(Comparator<Discovery> comparator) {
        DAOFactory factory = DAOFactory.getDAOFactory();
        DiscoveryDAO discoveryDao = factory.getDiscoveryDao();
        List<Discovery> discoveries = discoveryDao.getAll();
        if(comparator != null && discoveries != null) {
            discoveries.sort(comparator);
        }
        return discoveries;
    }

    public Discovery getDiscoveryById(long discoveryId) {
        DAOFactory factory = DAOFactory.getDAOFactory();
        DiscoveryDAO discoveryDao = factory.getDiscoveryDao();
        Discovery discovery = discoveryDao.read(discoveryId);
        return discovery;
    }

    public boolean updateDiscovery(Discovery discovery) {
        DAOFactory factory = DAOFactory.getDAOFactory();
        DiscoveryDAO discoveryDao = factory.getDiscoveryDao();
        boolean result = discoveryDao.update(discovery);
        return result;
    }
}

