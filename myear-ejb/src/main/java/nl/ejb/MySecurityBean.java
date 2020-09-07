package nl.ejb;

import javax.ejb.Stateless;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.SecurityContext;

@Stateless
public class MySecurityBean {
    @Context
    SecurityContext securityContext;

    public String isUserInRole() {
        return "is user in role Pearl?" + securityContext.isUserInRole("PEARL");
    }
}
