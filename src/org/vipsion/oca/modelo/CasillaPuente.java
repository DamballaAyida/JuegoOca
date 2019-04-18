
package org.vipsion.oca.modelo;

/**
 * <h1>CasillaPosada</h1>
 * <p>
 * Penalizará al jugador que caiga en ella moviendo hasta <code>CasillaPosada</code> y con un turno sin jugar {@link org.vipsion.oca.modelo.Tablero}</p>
 *
 * @see #posicion
 * @see Ficha
 * @see #posaFicha(org.vipsion.oca.modelo.Ficha)
 */
public class CasillaPuente extends Casilla{
       
    private static int posada=19;
    
     /**
     * Establece la <code>posición</code> recibida y otorga un turno extra al jugador.
     *
     * @param posicion <code>posicion</code> que ocupara la <code>ficha</code>
     * en el {@link org.vipsion.oca.modelo.Tablero}
     */
    
    public CasillaPuente(int posicion) {
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
        ficha.setPosicion(posada);
    }
    
}
