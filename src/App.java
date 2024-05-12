public class App {
    public static void main(String[] args) throws Exception {
        // TODO: implement your application here
       Personaje DD = new Personaje("King Dededee", 10,1);
       Personaje kirby = new Personaje("Kirby", 10,10);
       PersonajeEspadachin metaKinght = new PersonajeEspadachin("MetaKnight", 10,5,"Espada del Caos");

       Espectador waddledee = new Espectador("Waddledee");
       Espectador hada = new Espectador("Hada o Algo asi");
       Espectador pintor = new Espectador("Pintor");

       RingPelea ringPelea = new RingPelea(DD,metaKinght);


     /*  enemigo.atacar(personaje, enemigo.getAtaque());
       personaje.atacar(enemigo, personaje.getAtaque());
       PersonajeEspadachin personajeEspadachin = new PersonajeEspadachin("MetaKnight", 10,5,"Espada del Caos");
       personajeEspadachin.atacar(personaje, personajeEspadachin.getAtaque());
       personaje.atacar(personajeEspadachin, personaje.getAtaque());*/
    }
}
