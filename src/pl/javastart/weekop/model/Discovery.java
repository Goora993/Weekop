package pl.javastart.weekop.model;

import java.sql.Timestamp;
import java.util.Objects;

public class Discovery {
    private long id;
    private String name;
    private String description;
    private String url;
    private User user;
    private Timestamp timestamp;
    private Vote upVote;
    private Vote downVote;

    public Discovery() {
    }

    public Discovery(long id, String name, String description, String url,
                     User user, Timestamp timestamp, Vote upVote, Vote downVote) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.user = user;
        this.timestamp = timestamp;
        this.upVote = upVote;
        this.downVote = downVote;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public Vote getUpVote() {
        return upVote;
    }

    public void setUpVote(Vote upVote) {
        this.upVote = upVote;
    }

    public Vote getDownVote() {
        return downVote;
    }

    public void setDownVote(Vote downVote) {
        this.downVote = downVote;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discovery discovery = (Discovery) o;
        return id == discovery.id &&
                Objects.equals(name, discovery.name) &&
                Objects.equals(description, discovery.description) &&
                Objects.equals(url, discovery.url) &&
                Objects.equals(user, discovery.user) &&
                Objects.equals(timestamp, discovery.timestamp) &&
                Objects.equals(upVote, discovery.upVote) &&
                Objects.equals(downVote, discovery.downVote);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, url, user, timestamp, upVote, downVote);
    }

    @Override
    public String toString() {
        return "Discovery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", user=" + user +
                ", timestamp=" + timestamp +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                '}';
    }
}
