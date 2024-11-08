package com.poo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Tarea} representa una tarea que puede tener varias subtareas asociadas.
 * Implementa la interfaz {@link Gestor} para gestionar y evaluar el progreso de las tareas y sus subtareas.
 */
public class Tarea implements Gestor {
    private String nombre;
    private double progreso;

    /**
     * Lista de subtareas asociadas a la tarea.
     * Esta lista almacena objetos que implementan la interfaz {@link Gestor}.
     */
    public List<Gestor> listaSubtareas = new ArrayList<>();

    /**
     * Constructor que crea una nueva tarea con el nombre y el progreso especificado.
     *
     * @param nombre El nombre de la tarea.
     * @param progreso El progreso inicial de la tarea, representado como un número entre 0 y 100.
     */
    public Tarea(String nombre, double progreso) {
        this.nombre = nombre;
        this.progreso = progreso;
    }

    /**
     * Obtiene la lista de subtareas asociadas a esta tarea.
     *
     * @return Una lista de objetos {@link Gestor} que representan las subtareas.
     */
    private List<Gestor> getListaSubtareas() {
        return listaSubtareas;
    }

    /**
     * Agrega una nueva subtarea a la lista de subtareas con el progreso inicial de 0.0.
     *
     * @param nombre El nombre de la nueva subtarea.
     */
    public void agregarTarea(String nombre) {
        listaSubtareas.add(new SubTarea(nombre, 0.0)); // Añadir una nueva subtarea con progreso 0
    }

    /**
     * Evalúa el progreso total de la tarea sumando el progreso de todas las subtareas.
     * Si la tarea no tiene subtareas, retorna el progreso de la tarea actual.
     *
     * @return El progreso total de la tarea, como un valor entre 0 y 100.
     */
    @Override
    public double evaluarProgreso() {
        if (listaSubtareas.isEmpty()) {
            return progreso;
        } else {
            double progresoTotal = 0;
            for (Gestor subtarea : listaSubtareas) {
                progresoTotal += subtarea.evaluarProgreso();
            }
            return progresoTotal / listaSubtareas.size();
        }
    }

    /**
     * Elimina una subtarea de la lista de subtareas utilizando el nombre de la subtarea.
     *
     * @param nombre El nombre de la subtarea a eliminar.
     */
    public void removerTarea(String nombre) {
        listaSubtareas.removeIf(subtarea -> ((SubTarea) subtarea).getNombre().equals(nombre));
    }

    /**
     * Obtiene el nombre de la tarea.
     *
     * @return El nombre de la tarea.
     */
    public String getNombre() {
        return nombre;
    }
}

