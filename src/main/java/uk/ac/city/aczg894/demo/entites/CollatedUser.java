package uk.ac.city.aczg894.demo.entites;

import java.util.List;

/**
 * An Entity class representing all of the information relevant to a specific websiteUser including
 * their login history.
 *
 * */
public class CollatedUser{

    private WebsiteUser websiteUser;
    private List<LoginHistory> logins;

    public WebsiteUser getwebsiteUser() {
        return websiteUser;
    }

    public void setwebsiteUser(WebsiteUser websiteUser) {
        this.websiteUser = websiteUser;
    }



    public List<LoginHistory> getLogins() {
        return logins;
    }

    public void setLogins(List<LoginHistory> logins) {
        this.logins = logins;
    }
}

