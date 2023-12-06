package Magos;

import Hechizos.Hechizo;

public class Mago1 extends MagoAbs{

    public Mago1(double hp, Hechizo hez, String tipo) {
        super(hp, hez, tipo);
    }

    @Override
    public void aumentarHp(double a) {
        this.hp = this.hp + a;
    }
    
    @Override
    public void disminuirHp(double a){
        this.hp = this.hp - a;
    }
}