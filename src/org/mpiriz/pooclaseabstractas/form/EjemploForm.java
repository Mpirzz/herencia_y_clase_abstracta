package org.mpiriz.pooclaseabstractas.form;

import org.mpiriz.pooclaseabstractas.form.elementos.ElementoForm;
import org.mpiriz.pooclaseabstractas.form.elementos.InputForm;
import org.mpiriz.pooclaseabstractas.form.elementos.SelectForm;
import org.mpiriz.pooclaseabstractas.form.elementos.TextareaForm;
import org.mpiriz.pooclaseabstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {


        InputForm user = new InputForm("username");
        InputForm pass = new InputForm("clave","password");
        InputForm email = new InputForm("email","email");
        InputForm edad = new InputForm("edad","number");


        TextareaForm experiencia = new TextareaForm("exp",5,9);

        SelectForm language = new SelectForm("lenguaje");

        Opcion java = new Opcion("1","java");
        language.addOpcion(java)
                .addOpcion(new Opcion("2","pyton"))
                .addOpcion(new Opcion("3","javascript"))
                .addOpcion(new Opcion("4","php"))
                .addOpcion(new Opcion("5","typescript"));

        user.setValor("jony.doe");
        pass.setValor("a1b2b3");
        email.setValor("jony@gmail.com");
        edad.setValor("24");
        experiencia.setValor(".... hago de todo, un tremendo maquina");
        java.setSelected(true);

        // es una forma de hacer el arrayList con --> Arrays.asList(...)
        List<ElementoForm> elementos = Arrays.asList(user,pass,email,edad,experiencia,language);


        for ( int i = 0; i < elementos.size(); i++ ){
            System.out.println( elementos.get( i ).dibujarHtml() );
            System.out.println("<br>");
        }


        // otra forma de hacer el for, se llama for lamda
        elementos.forEach(e -> {
            System.out.println( e.dibujarHtml());
            System.out.println("<br>");
        });


    }
}
