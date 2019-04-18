
package org.vipsion.oca.modelo;

/**
 * <h1>CasillaCalavera</h1>
 * <p>
 * Penalizará al jugador que caiga en ella hasta la posición 1. {@link org.vipsion.oca.modelo.Tablero}</p>
 *
 * @see #posicion
 * @see Ficha
 * @see #posaFicha(org.vipsion.oca.modelo.Ficha)
 */
public class CasillaCalavera extends Casilla{
    
    private static int inicio=1;
     /**
     * Establece la <code>posición</code> recibida.
     *
     * @param posicion <code>posicion</code> que ocupara la <code>ficha</code>
     * en el {@link org.vipsion.oca.modelo.Tablero}
     */
    public CasillaCalavera(int posicion) {
        super(posicion);
    }
         /**
     * Establece la <code>posición</code> en inicio(1).
     *
     * @param ficha {@link org.vipsion.oca.modelo.Ficha}
     */
        @Override
    public void posaFicha(Ficha ficha) {
        ficha.setPosicion(inicio);

    }

}
