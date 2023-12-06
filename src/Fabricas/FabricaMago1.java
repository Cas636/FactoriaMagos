package Fabricas;

import Hechizos.Agua;
import Hechizos.Hechizo;
import Hechizos.HechizoPoder;
import Hechizos.Poder;
import Magos.Mago1;
import Magos.MagoAbs;

public class FabricaMago1 extends FabricaAbs {
    @Override
    public MagoAbs crearMago(){
        return new Mago1(100, null, "Agua");
    }   
}