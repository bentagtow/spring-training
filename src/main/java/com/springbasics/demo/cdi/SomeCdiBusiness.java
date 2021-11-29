package com.springbasics.demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {

    @Inject
    SomeCDIDAU someCDIDAO;

    public SomeCDIDAU getSomeCDIDAO() {
        return someCDIDAO;
    }

    public void setSomeCDIDAO(SomeCDIDAU someCDIDAO) {
        this.someCDIDAO = someCDIDAO;
    }
}
