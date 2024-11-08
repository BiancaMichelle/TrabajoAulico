package com.poo;

import com.poo.modelo.Proyecto;
import com.poo.modelo.SubTarea;
import com.poo.modelo.Tarea;

/**
 * La clase {@code Main} contiene el punto de entrada principal del programa.
 * En esta clase se crea un proyecto, se agregan tareas, se asignan subtareas y se evalúa el progreso de las tareas y el proyecto.
 * Sirve como ejemplo práctico de uso para las clases {@link Proyecto}, {@link Tarea} y {@link SubTarea}.
 */
public class Main {
    /**
     * El punto de entrada del programa.
     * Este método crea un proyecto, agrega tareas, asigna subtareas, asigna progresos y evalúa el progreso de las tareas y del proyecto.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        // Crear un proyecto
        Proyecto proyectoPrincipal = new Proyecto("Proyecto Principal");

        // Agregar tareas al proyecto
        proyectoPrincipal.agregarTarea("Tarea 1");
        proyectoPrincipal.agregarTarea("Tarea 2");

        // Crear y agregar subtareas a "Tarea 1"
        Tarea tarea1 = (Tarea) proyectoPrincipal.listaTareas.get(0);
        Tarea tarea2 = (Tarea) proyectoPrincipal.listaTareas.get(1);
        tarea1.agregarTarea("Subtarea 1.1");
        tarea1.agregarTarea("Subtarea 1.2");

        // Asignar progreso a las subtareas
        SubTarea subtarea1_1 = (SubTarea) tarea1.listaSubtareas.get(0);
        subtarea1_1.setProgreso(0.5); // 50% de progreso

        SubTarea subtarea1_2 = (SubTarea) tarea1.listaSubtareas.get(1);
        subtarea1_2.setProgreso(1.0); // 100% de progreso

        // Evaluar progreso total del proyecto
        System.out.println("Progreso del proyecto: " + proyectoPrincipal.evaluarProgreso() * 100 + "%");
        System.out.println("Progreso de Tarea 1: " + tarea1.evaluarProgreso() * 100 + "%");
        System.out.println("Progreso de la subtarea 1.1: " + subtarea1_1.evaluarProgreso() * 100 + "%");
        System.out.println("Progreso de la subtarea 1.2: " + subtarea1_2.evaluarProgreso() * 100 + "%");
        System.out.println("Progreso de la tarea 2: " + tarea2.evaluarProgreso() * 100 + "%");
    }
}
