public class App {
    public static void main(String[] args) throws Exception {
        // TODO: implement your application here
       Personaje enemigo = new Personaje("King Dededee", 10,1);
       Personaje personaje = new Personaje("Kirby", 10,10);
       enemigo.atacar(personaje, enemigo.getAtaque());
       personaje.atacar(enemigo, personaje.getAtaque());
       PersonajeEspadachin personajeEspadachin = new PersonajeEspadachin("MetaKnight", 10,5,"Espada del Caos");
       personajeEspadachin.atacar(personaje, personajeEspadachin.getAtaque());
       personaje.atacar(personajeEspadachin, personaje.getAtaque());
    }
}
