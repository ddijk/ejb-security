package nl.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.annotation.security.RolesAllowed;
@Path("war")
@RolesAllowed({"Pearlx"})
public class MyEndpoint {

//    @Inject
//    MyBean myBean;

//    @GET
//    public String hai() {
//        return "zeg maar: "+ myBean.greeting();
//    }

    @GET
    public String hai() {
        return "zeg maar: ";
    }
}
