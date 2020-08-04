package pl.javastart.weekop.model;


import java.sql.Timestamp;
import java.util.Objects;

public class Vote {
    private long id;
    private long discovery_id;
    private long user_id;
    private Timestamp timestamp;
    private VoteType voteType;

    public Vote() {
    }

    public Vote(long id, long discovery_id, long user_id, Timestamp timestamp, VoteType voteType) {
        this.id = id;
        this.discovery_id = discovery_id;
        this.user_id = user_id;
        this.timestamp = timestamp;
        this.voteType = voteType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getDiscovery_id() {
        return discovery_id;
    }

    public void setDiscovery_id(long discovery_id) {
        this.discovery_id = discovery_id;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public VoteType getVoteType() {
        return voteType;
    }

    public void setVoteType(VoteType voteType) {
        this.voteType = voteType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vote vote = (Vote) o;
        return id == vote.id &&
                discovery_id == vote.discovery_id &&
                user_id == vote.user_id &&
                Objects.equals(timestamp, vote.timestamp) &&
                Objects.equals(voteType, vote.voteType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, discovery_id, user_id, timestamp, voteType);
    }

    @Override
    public String toString() {
        return "Vote{" +
                "id=" + id +
                ", discovery_id=" + discovery_id +
                ", user_id=" + user_id +
                ", timestamp=" + timestamp +
                ", voteType=" + voteType +
                '}';
    }
}
