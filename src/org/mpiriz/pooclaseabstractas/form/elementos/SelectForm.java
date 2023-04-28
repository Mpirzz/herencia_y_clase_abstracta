package org.mpiriz.pooclaseabstractas.form.elementos;

import org.mpiriz.pooclaseabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.List;

public class SelectForm extends ElementoForm{

    // List --> inteface (lista< 'Opcion' --> es una  clase>)
    private List<Opcion> opciones;

    public SelectForm(String nombre) {
        super(nombre);
        this.opciones = new ArrayList<Opcion>();
    }

    public SelectForm(String nombre, List<Opcion> opciones) {
        super(nombre);
        this.opciones = opciones;
    }

    public SelectForm addOpcion(Opcion opcion){
        this.opciones.add(opcion);
        return this;
    }

    /**
     * Debes especificar explícitamente cómo acceder a cada elemento de la colección. En este caso, estás trabajando con una
     * lista de objetos Opcion, por lo que necesitas acceder a cada objeto de la lista mediante su índice utilizando el método
     * get() de la lista.
     * @return
     */

    @Override
    public String dibujarHtml() {
        StringBuilder sb = new StringBuilder("<select ");
        sb.append("name='")
                .append(this.nombre)
                .append("'>");

        for (int i = 0; i < this.opciones.size(); i++){
            Opcion opcion = this.opciones.get(i);
            sb.append("\n<option value='")
                    .append(opcion.getValor())
                    .append("'");
            if (opcion.isSelected()){
                sb.append(" selected");
                this.valor = opcion.getValor();
            }
            sb.append(">")
                    .append(opcion.getNombre())
                    .append("</option>");
        }
        sb.append("</select>");
        return sb.toString();
    }
}
