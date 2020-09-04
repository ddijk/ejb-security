package nl.web;

import nl.ejb.MyBean;
import nl.ejb.MySecurityBean;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Path("war")
public class MyEndpoint {

    @Inject
    MyBean myBean;

    @Inject
    MySecurityBean mySecurityBean;

    @Context
    SecurityContext securityContext;

    @GET
    public String hai() {
        return "zeg maar: " + myBean.greeting();
    }

    @GET
    @Path("2")
    public String hai2() {
        return "zeg maar: " + myBean.greeting2();
    }

    @GET
    @Path("sec")
    public String checkSecurity() {
        return "in role Pearl? " + mySecurityBean.isUserInRole();

    }


}
