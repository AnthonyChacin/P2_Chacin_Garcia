/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Aran_
 */
public class Proceso {

    private Pagina tablaPaginas[];
    private String nombre;
    private int tamaño;
    private int cantidadPaginas;
    private String estado;
    private int paginasMemoriaPrincipal;
    private int paginasMemoriaSecundaria;
    private int idProceso;
    private int tamañoTotal;

    public Proceso(int idProceso, String nombre, int tamaño, int tamañoPagina) {
        this.idProceso = idProceso;
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.cantidadPaginas = this.cantidadPaginas(tamaño, tamañoPagina);
        this.tamañoTotal = cantidadPaginas * tamañoPagina;
        this.tablaPaginas = new Pagina[this.cantidadPaginas];
        this.crearPaginas();
    }

    public void crearPaginas() {
        for (int i = 0; i < this.cantidadPaginas; i++) {
            this.tablaPaginas[i] = new Pagina(this.idProceso, this.nombre, i, null);
        }
    }
    
    public int cantidadPaginas(int tamaño, int tamañoPagina) {
        if (tamaño % tamañoPagina != 0)
            return ((int)(tamaño / tamañoPagina) + 1);
        return tamaño / tamañoPagina;
    }

}
