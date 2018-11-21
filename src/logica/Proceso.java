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

    public Pagina[] getTablaPaginas() {
        return tablaPaginas;
    }

    public void setTablaPaginas(Pagina[] tablaPaginas) {
        this.tablaPaginas = tablaPaginas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getCantidadPaginas() {
        return cantidadPaginas;
    }

    public void setCantidadPaginas(int cantidadPaginas) {
        this.cantidadPaginas = cantidadPaginas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPaginasMemoriaPrincipal() {
        return paginasMemoriaPrincipal;
    }

    public void setPaginasMemoriaPrincipal(int paginasMemoriaPrincipal) {
        this.paginasMemoriaPrincipal = paginasMemoriaPrincipal;
    }

    public int getPaginasMemoriaSecundaria() {
        return paginasMemoriaSecundaria;
    }

    public void setPaginasMemoriaSecundaria(int paginasMemoriaSecundaria) {
        this.paginasMemoriaSecundaria = paginasMemoriaSecundaria;
    }

    public int getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(int idProceso) {
        this.idProceso = idProceso;
    }

    public int getTamañoTotal() {
        return tamañoTotal;
    }

    public void setTamañoTotal(int tamañoTotal) {
        this.tamañoTotal = tamañoTotal;
    }

    
}
