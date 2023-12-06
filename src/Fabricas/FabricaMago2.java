package Fabricas;

import Hechizos.Fuego;
import Hechizos.Hechizo;
import Hechizos.HechizoPoder;
import Magos.Mago2;
import Magos.MagoAbs;

public class FabricaMago2 extends FabricaAbs {
    @Override
    public MagoAbs crearMago() {
        return new Mago2(100, null, "Fuego");
    }  
}