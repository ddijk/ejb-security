package nl.ejb;

import javax.ejb.Stateless;

@Stateless
public class MyBean {

    public String greeting() {
        return "hallo";
    }
}
