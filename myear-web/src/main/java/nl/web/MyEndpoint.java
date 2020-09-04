package nl.web;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("war")
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
