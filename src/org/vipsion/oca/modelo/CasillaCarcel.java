
package org.vipsion.oca.modelo;

/**
 * <h1>CasillaCarcel</h1>
 * <p>
 * Penalizará al jugador que caiga en ella con dos turnos sin jugar {@link org.vipsion.oca.modelo.Tablero}</p>
 *
 * @see #posicion
 * @see Ficha
 * @see #posaFicha(org.vipsion.oca.modelo.Ficha)
 */
public class CasillaCarcel extends Casilla{
    
    private final int turnosExtra;
     /**
     * Establece la <code>posición</code> recibida y otorga un turno extra al jugador.
     *
     * @param posicion <code>posicion</code> que ocupara la <code>ficha</code>
     * en el {@link org.vipsion.oca.modelo.Tablero}
     */
    public CasillaCarcel(int posicion) {
        super(posicion);
        this.turnosExtra = 1;
    }
     /**
     * Establece la <code>posición</code> del <code>Tablero</code> que ocupa la
     * <code>Ficha</code>
     *
     * @param ficha {@link org.vipsion.oca.modelo.Ficha}
     */
    @Override
    public void posaFicha(Ficha ficha) {
        ficha.turnoSinJugar();
        ficha.turnoSinJugar();
        ficha.setPosicion(posicion);

    }
    
}
