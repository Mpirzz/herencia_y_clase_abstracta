package org.mpiriz.pooclaseabstractas.form.elementos;

// para declarar una clase abstracta, le tendremos que añadir la palabra 'abstract' a la clase
abstract public class ElementoForm {

    protected String valor;
    protected String nombre;


    public ElementoForm(){}

    public ElementoForm( String nombre){
        this();
        this.nombre = nombre;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    // Los methods en las clases abstractas no tienen que llevar los corchetes
    public abstract String dibujarHtml();




}
