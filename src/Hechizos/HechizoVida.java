package Hechizos;

import Magos.MagoAbs;

public class HechizoVida extends Hechizo {
	
    public HechizoVida(Poder ataque) {
	super(ataque);
    }

    @Override
    public void utilizar(MagoAbs a, MagoAbs b){
    	
    	if(a.getTipo().equals(a.getHez().getAtaque().getClass().getSimpleName())) {
    		a.aumentarHp(20);
    	}else if((a.getTipo().equals("Agua") & a.getHez().getAtaque().getClass().getSimpleName().equals("Fuego"))  ||  (a.getTipo().equals("Fuego") & a.getHez().getAtaque().getClass().getSimpleName().equals("Agua")) ||
    			(a.getTipo().equals("Aire") & a.getHez().getAtaque().getClass().getSimpleName().equals("Tierra")) ||  (a.getTipo().equals("Tierra") & a.getHez().getAtaque().getClass().getSimpleName().equals("Aire")) ) {
    		a.aumentarHp(5);
    	}else {
    		a.aumentarHp(10);
    	}
    }
	
}