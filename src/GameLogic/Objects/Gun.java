package GameLogic.Objects;

import GameUI.GameWindow.GameInterface;
import GameUI.GameWindow.GameInterfaceComponentManager;

import java.awt.*;

/**
 * Created by ATroskan on 1/13/2015.
 */
public abstract class Gun implements GameInterfaceComponentManager,GameInterface,Moving {
    private Point location;
    private int damage;
    private int ammo;
    private int pushBack;
    public Gun(int damage,int ammo,int pushBack)
    {
        this.damage = damage;
        this.ammo = ammo;
        this.pushBack = pushBack;
    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getAmmo() {
        return ammo;
    }

    public void setAmmo(int ammo) {
        this.ammo = ammo;
    }

    public int getPushBack() {
        return pushBack;
    }

    public void setPushBack(int pushBack) {
        this.pushBack = pushBack;
    }

    @Override
    public void draw(Graphics g) {

    }

    @Override
    public void move() {

    }
}
//halle dge
