package fluent.impl;

import fluent.contract.IItem;
import fluent.contract.IMenu;

import java.util.ArrayList;
import java.util.List;

public class ArsalanMenuHandler implements IMenu {
    List<IItem> menuList = new ArrayList<IItem>();
    List<IItem> selectedList = new ArrayList<IItem>();

    public ArsalanMenuHandler() {
        IItem potatoes = new IItem() {
            @Override
            public IItem name() {
                System.out.println("Potatoes");
                return this;
            }

            @Override
            public Integer cost() {
                return 180;
            }
        };
        IItem fries = new IItem() {
            @Override
            public IItem name() {
                System.out.println("Fries");
                return this;
            }

            @Override
            public Integer cost() {
                return 1;
            }
        };
        IItem pizza = new IItem() {
            @Override
            public IItem name() {
                System.out.println("Pizza!");
                return this;
            }

            @Override
            public Integer cost() {
                return 30;
            }
        };
        menuList.add(potatoes);
        menuList.add(fries);
        menuList.add(pizza);
    }

    @Override
    public IMenu order(int index) {
        IItem item=menuList.get(index);
        selectedList.add(item);
        System.out.println("Ordered ::");
        item.name();
        return this;
    }

    @Override
    public IMenu eat() {
        for (IItem item : selectedList) {
            System.out.println("Eating:");
            item.name();
        }
        return this;
    }

    @Override
    public IMenu pay() {
        int cost = 0;
        for (IItem item : selectedList
                ) {
            cost = cost + item.cost();

        }
        System.out.println("Cost:");
        return this;
    }

    @Override
    public IItem get(int index) {
        if (index < 3) {
            return menuList.get(index);
        }
        return null;
    }

    public void showMenu() {
        System.out.println("------Menu:---------");
        for (IItem item:menuList
             ) {
            System.out.println(item);

        }
    }

    @Override
    public String toString() {
        return "ArsalanMenuHandler{" +
                "menuList=" + menuList +
                ", selectedList=" + selectedList +
                '}';
    }
}
