/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class tarta extends postres{
        private int cantidad =1;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public tarta(){
        this.setDescripcion("tarta");
        this.setPrecio(18.0);
    }
    
}
