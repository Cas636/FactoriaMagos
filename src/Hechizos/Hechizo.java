package Hechizos;

import Magos.MagoAbs;

public abstract class Hechizo {
	
    protected Poder ataque;
	
    public Hechizo (Poder ataque){
        this.ataque = ataque;
    }

    public Poder getAtaque(){
        return this.ataque;
    }

    public void setAtaque(Poder ataque){
        this.ataque = ataque;
    }

    public abstract void utilizar(MagoAbs a, MagoAbs b);
}