package Fabricas;

import Hechizos.Aire;
import Hechizos.Hechizo;
import Hechizos.HechizoPoder;
import Magos.Mago3;
import Magos.MagoAbs;

public class FabricaMago3 extends FabricaAbs {
    @Override
    public MagoAbs crearMago() {
        return new Mago3(100, null, "Aire");
    }   
}