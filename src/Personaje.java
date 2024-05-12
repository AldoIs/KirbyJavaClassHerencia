public class Personaje {
    private String nombre;
    protected int vida;
    private int ataque;

    public Personaje(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        System.out.println("El Personaje " + nombre + " ha llegado al pueblo");
    }
    public String getNombre() {
        return nombre;
    }
    public int getVida() {
        return vida;
        
    }
    public int getAtaque() {
        return ataque;
    }
    public void setVida(int vida) {
        this.vida = vida;   
    }
    //Funcion de ataque pero debe de utilizarse apartir de un atributo que sea el daño del ataque
    public void atacar(Personaje enemigo, int ataque) {
        enemigo.vida -= ataque;
        System.out.println("El Personaje " + enemigo.getNombre() + " ha recibido un ataque de " + ataque + " puntos de daño");
        if (enemigo.vida <= 0) {
            System.out.println("El Personaje " + enemigo.getNombre() + " ha sido derribado");
        }
    }
    // Funcion recibir daño
    public void recibirDanio(int danio) {
        vida -= danio;
    }   
}
