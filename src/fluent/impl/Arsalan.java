package fluent.impl;

import fluent.contract.IMenu;
import fluent.contract.IRestaurant;

public class Arsalan implements IRestaurant {
    String name;
    String IMenu;
    @Override
    public IRestaurant name(String name) {
        this.name = name;
        System.out.println("Enter to hotel ::"+name);
        return this;
    }

    @Override
    public IMenu show() {
        ArsalanMenuHandler handler=new ArsalanMenuHandler();
        handler.showMenu();
        return handler;
    }
}
