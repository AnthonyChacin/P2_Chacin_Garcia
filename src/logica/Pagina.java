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
public class Pagina {

    private Integer idProceso; //id del proceso que se encuentra en la pagina
    private String nombreProceso;//nombre asignado al proceso
    private int idMarco;//cada marco en memoria principal tiene un id, la pagina va a tener asociada un id de marco si la pagina se encuentra cargada en memoria principal
    private Integer idPagina;
    private boolean principal;//un boolean para saber si la pagina se encuentra en memoria principal o no

    public Pagina(int idMarco) {
        this.idMarco = idMarco;
        this.principal = true;//si se utiliza este constructor de pagina, quiere decir que corresponde a una pagina cargada en memoria principal
        this.idProceso = null;//Como se esta creando la pagina y todavia no se le esta asignando ningun proceso, el idProceso es null
        this.nombreProceso = "";//inicialmente no tiene proceso asignado
        this.idPagina = null;
    }

    public Pagina(int idProceso, String nombreProceso, int idPagina, Boolean principal) {
        this.idProceso = idProceso;
        this.nombreProceso = nombreProceso;
        this.idPagina = idPagina;
        this.principal = principal;
    }

    public int getIdMarco() {
        return idMarco;
    }

    public Integer getIdProceso() {
        return idProceso;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public Integer getIdPagina() {
        return idPagina;
    }
    
    
    
    
}
