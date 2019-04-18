
package org.vipsion.oca.modelo;

/**
 * <h1>CasillaPosada</h1>
 * <p>
 * Penalizará al jugador que caiga en ella con un turno sin jugar {@link org.vipsion.oca.modelo.Tablero}</p>
 *
 * @see #posicion
 * @see Ficha
 * @see #posaFicha(org.vipsion.oca.modelo.Ficha)
 */
public class CasillaPosada extends Casilla{
     /**
     * Establece la <code>posición</code> recibida.
     *
     * @param posicion <code>posicion</code> que ocupara la <code>ficha</code>
     * en el {@link org.vipsion.oca.modelo.Tablero}
     */
    public CasillaPosada(int posicion) {
        super(posicion);
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
        ficha.setPosicion(posicion);

    }
    
}
