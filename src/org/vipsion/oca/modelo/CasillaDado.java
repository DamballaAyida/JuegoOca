
package org.vipsion.oca.modelo;


public class CasillaDado extends Casilla{
    
    private final int turnosExtra;
     /**
     * Establece la <code>posición</code> recibida y otorga un turno extra al jugador.
     *
     * @param posicion <code>posicion</code> que ocupara la <code>ficha</code>
     * en el {@link org.vipsion.oca.modelo.Tablero}
     */
    public CasillaDado(int posicion) {
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
        ficha.setTurnosExtra(turnosExtra);
        ficha.setPosicion(posicion);

    }
    
}
