package Magos;

import Hechizos.Hechizo;

public abstract class MagoAbs {
    protected double hp;
    protected Hechizo hez;
    protected String tipo; 

    public MagoAbs(double hp, Hechizo hez, String tipo){
        this.hp = hp;
        this.hez = hez;
        this.tipo = tipo;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public Hechizo getHez() {
        return hez;
    }

    public void setHez(Hechizo hez) {
        this.hez = hez;
    }

    public String getTipo() {
        return tipo;
    }
    
    public abstract void aumentarHp(double a);
    public abstract void disminuirHp(double b); 
}
