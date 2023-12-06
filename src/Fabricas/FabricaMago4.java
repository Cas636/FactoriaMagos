package Fabricas;

import Hechizos.Hechizo;
import Hechizos.HechizoPoder;
import Hechizos.Tierra;
import Magos.Mago4;
import Magos.MagoAbs;

public class FabricaMago4 extends FabricaAbs {
    @Override
    public MagoAbs crearMago() {
        return new Mago4(100, null, "Tierra");
    }   
}