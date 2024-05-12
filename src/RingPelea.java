public class RingPelea {
    RingPelea(Personaje peleador1, Personaje peleador2) {
        System.out.println("El combate entre " + peleador1.getNombre() + " y " + peleador2.getNombre() + " ha comenzado");
        
        while (peleador1.getVida() > 0 && peleador2.getVida() > 0) {
            peleador1.atacar(peleador2, peleador1.getAtaque());
            peleador2.atacar(peleador1, peleador2.getAtaque());
            System.out.println("Vida de " + peleador1.getNombre() + ": " + peleador1.getVida());
            System.out.println("Vida de " + peleador2.getNombre() + ": " + peleador2.getVida());
        }
            
    
    }

}
