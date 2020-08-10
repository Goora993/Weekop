package pl.javastart.weekop.service;

import pl.javastart.weekop.dao.DAOFactory;
import pl.javastart.weekop.dao.VoteDAO;
import pl.javastart.weekop.model.Vote;
import pl.javastart.weekop.model.VoteType;

import java.sql.Timestamp;
import java.util.Date;

public class VoteService {
    public Vote addVote(long discoveryId, long userId, VoteType voteType) {
        Vote vote = new Vote();
        vote.setDiscovery_id(discoveryId);
        vote.setUser_id(userId);
        vote.setTimestamp(new Timestamp(new Date().getTime()));
        vote.setVoteType(voteType);
        DAOFactory factory = DAOFactory.getDAOFactory();
        VoteDAO voteDao = factory.getVoteDao();
        vote = voteDao.create(vote);
        return vote;
    }

    public Vote updateVote(long discoveryId, long userId, VoteType voteType) {
        DAOFactory factory = DAOFactory.getDAOFactory();
        VoteDAO voteDao = factory.getVoteDao();
        Vote voteToUpdate = voteDao.getVoteByUserIdDiscoveryId(userId, discoveryId);
        if(voteToUpdate != null) {
            voteToUpdate.setVoteType(voteType);
            voteDao.update(voteToUpdate);
        }
        return voteToUpdate;
    }

    public Vote addOrUpdateVote(long discoveryId, long userId, VoteType voteType) {
        DAOFactory factory = DAOFactory.getDAOFactory();
        VoteDAO voteDao = factory.getVoteDao();
        Vote vote = voteDao.getVoteByUserIdDiscoveryId(userId, discoveryId);
        Vote resultVote = null;
        if(vote == null) {
            resultVote = addVote(discoveryId, userId, voteType);
        } else {
            resultVote = updateVote(discoveryId, userId, voteType);
        }
        return resultVote;
    }

    public Vote getVoteByDiscoveryUserId(long discoveryId, long userId) {
        DAOFactory factory = DAOFactory.getDAOFactory();
        VoteDAO voteDao = factory.getVoteDao();
        Vote vote = voteDao.getVoteByUserIdDiscoveryId(userId, discoveryId);
        return vote;
    }
}
