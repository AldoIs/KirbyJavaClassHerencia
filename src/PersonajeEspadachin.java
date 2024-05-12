public class PersonajeEspadachin extends Personaje {
    
    /**
     * Constructor for the `PersonajeEspadachin` class.
     * Initializes the `nombre` and `vida` fields.
     *
     * @param nombre the name of the character
     * @param vida the initial health of the character
     */
    private String arma;
    public PersonajeEspadachin(String nombre, int vida, int ataque, String arma) {
        super(nombre, vida, ataque);
        this.arma = arma;
        System.out.println("Y " + nombre + "tiene de arma: " + arma);
        
    }
    @Override
    public void atacar(Personaje enemigo, int ataque) {
        System.out.println("El Personaje " + getNombre() + " ha atacado a " + enemigo.getNombre() + " con su " + arma + " y ha causado " + ataque + " de danio");
    }
}