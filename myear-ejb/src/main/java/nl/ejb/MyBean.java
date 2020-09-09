package nl.ejb;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Stateless
public class MyBean {

    @Context
    SecurityContext securityContext;

    @RolesAllowed({"Pearl"})
    public String greeting() {
        return "hallo2ejb-jar.xml";
    }

    public String greeting2() {
        return "hallo zonder RolesAllowed";
    }
}
