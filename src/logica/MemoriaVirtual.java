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
public class MemoriaVirtual {

    private int tamMemoriaP; //tamaño de la memoria principal establecido por el usuario
    private int tamMemoriaS; //tamano de la memoria secundaria establecido por el usuario
    private int tamPagina; //tamano de la pagina establecido por el usuario
    private int cantMarcos; //cantidad de marcos en memoria principal
    private int cantMaxPagMS; //cantidad maxima de paginas que pueden existir en almacenamiento secundario
    private Pagina memoriaS[]; //vector de paginas que corresponde a la memoria secundaria
    private Pagina memoriaP[]; //vector de paginas que corresponde a la memoria principal
    private int marcos[];//un vector de enteros que me indica los marcos de paginas disponibles y ocupados en memoria principal
    private int espacios[];//vector de enteros para conocer los espacios disponibles y ocupados en la memoria secundaria
    private int maxCantPag; // entero que indica la maxima cantidad de paginas que puede administrar la memoria virtual

    public MemoriaVirtual(int tamMemoriaP, int tamMemoriaS, int tamPagina) {
        this.tamMemoriaP = tamMemoriaP;
        this.tamMemoriaS = tamMemoriaS;
        this.tamPagina = tamPagina;
        this.cantMarcos = tamMemoriaP / tamPagina;
        this.cantMaxPagMS = tamMemoriaS / tamPagina;
        this.memoriaP = new Pagina[this.cantMarcos];
        this.memoriaS = new Pagina[this.cantMaxPagMS];
        this.marcos = new int[this.cantMarcos];
        this.espacios = new int[this.cantMaxPagMS];
        this.maxCantPag = this.cantMarcos + this.cantMaxPagMS;
        this.vaciarMarcos();
        this.vaciarEspacios();
        this.paginarMemoriaPrincipal();
        this.paginarMemoriaSecundaria();
    }
//Funcion que me permite inicialmente establecer que todos los marcos de la memoria principal se encuentran vacios

    public void vaciarMarcos() {
        for (int i = 0; i < this.cantMarcos; i++) {
            this.marcos[i] = 0;
        }
    }
//Funcion que me permite inicialmente establecer que todos los espacios de tamano correspondiente a una pagina se encuentran vacios

    public void vaciarEspacios() {
        for (int i = 0; i < this.cantMaxPagMS; i++) {
            this.espacios[i] = 0;
        }
    }
//Funcion que me permite generar las paginas correspondientes a cada marco de la memoria principal, sin asignarle ningun proceso

    public void paginarMemoriaPrincipal() {
        for (int i = 0; i < this.cantMarcos; i++) {
            this.memoriaP[i] = new Pagina(i);
        }
    }
    
    public void paginarMemoriaPrincipalCP(int cantPNP, Pagina[] tp ){
        for (int i = 0; i < this.cantMarcos; i++) {
            if(this.memoriaP[i].getIdProceso() == null){
                for(int j = i; j < (i + tp.length); j++){
                    
                }
            }
        }
    }

    public void paginarMemoriaSecundaria() {
        for (int i = 0; i < this.cantMaxPagMS; i++) {
            this.memoriaS[i] = new Pagina(i);
        }
    }

    public int getMaxCantPag() {
        return maxCantPag;
    }

    public int getCantMarcos() {
        return cantMarcos;
    }

    public Pagina[] getMemoriaP() {
        return memoriaP;
    }

    public int getTamPagina() {
        return tamPagina;
    }

    public Pagina[] getMemoriaS() {
        return memoriaS;
    }
    
    

}
