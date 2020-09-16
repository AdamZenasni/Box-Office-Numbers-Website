package uk.ac.city.aczg894.demo.entites;

import java.nio.file.attribute.UserPrincipal;

/**
 * An WebsiteUserPricipal represents the current user in the user details service.
 */
public class WebsiteUserPrincipal implements UserPrincipal {

    private WebsiteUser websiteUser;

    public WebsiteUserPrincipal(WebsiteUser websiteUser){
        this.websiteUser = websiteUser;
    }

    @Override
    public String getName() {
        return websiteUser.getEmail();
    }


}
