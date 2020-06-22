package takred;

import takred.character.Hero;
import takred.item.Armor;
import takred.item.Item;
import takred.item.Weapon;
import takred.store.BuyLog;
import takred.store.Store;

public class Main {
    public static Hero processPurchase(Hero hero, Store store, String productName) {
        int productPrice = store.getPriceByName(productName);
        if (hero.getGold() < productPrice) {
            System.out.println("Недостаточно золота для покупки.");
            return hero;
        }

        hero = new Hero(hero.minusGold(productPrice));
        BuyLog.getBuyLog().addLogList("Вы купили " + productName + " за " + productPrice + " золота. У вас осталось "
                + hero.getGold() + " золота.");

        return hero;
    }

    public static void main(String[] args) {
        Hero myHero = new Hero();
        myHero = new Hero(myHero.plusGold(500));
        Store store = new Store();
        store.addProduct("Стёганка", new Armor(150, "Стёганка"));
        store.addProduct("Поножи", new Armor(100, "Поножи"));
        store.addProduct("Сапоги", new Armor(50, "Сапоги"));
        store.addProduct("Меч", new Weapon(200, "Меч"));

        myHero = new Hero(processPurchase(myHero, store, "Меч"));
        BuyLog.getBuyLog().getLogList();
        System.out.println(myHero.getGold());

        myHero = new Hero(processPurchase(myHero, store, "Поножи"));
        BuyLog.getBuyLog().getLogList();
        System.out.println(myHero.getGold());

        myHero = new Hero(processPurchase(myHero, store, "Сапоги"));
        myHero = new Hero(processPurchase(myHero, store, "Стёганка"));
        BuyLog.getBuyLog().getLogList();
        System.out.println(myHero.getGold());
    }
}
