package com.poo.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase {@code Proyecto} representa un proyecto que puede contener varias tareas.
 * Implementa la interfaz {@link Gestor} para gestionar y evaluar el progreso de las tareas asociadas.
 */
public class Proyecto implements Gestor {
    private String nombre;
    private double progreso;
    
    /**
     * Lista de tareas asociadas al proyecto.
     * Esta lista almacena objetos que implementan la interfaz {@link Gestor}.
     */
    public List<Gestor> listaTareas = new ArrayList<>();

    /**
     * Obtiene la lista de tareas asociadas a este proyecto.
     *
     * @return Una lista de objetos {@link Gestor} que representan las tareas del proyecto.
     */
    public List<Gestor> getListaTareas() {
        return listaTareas;
    }

    /**
     * Constructor que crea un nuevo proyecto con el nombre especificado.
     *
     * @param nombre El nombre del proyecto.
     */
    public Proyecto(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Agrega una nueva tarea al proyecto con un progreso inicial de 0.0.
     *
     * @param nombre El nombre de la nueva tarea.
     */
    public void agregarTarea(String nombre) {
        listaTareas.add(new Tarea(nombre, 0.0)); // Añadir una nueva tarea con progreso 0
    }

    /**
     * Evalúa el progreso total del proyecto sumando el progreso de todas las tareas.
     * Si el proyecto no tiene tareas, retorna el progreso de la tarea actual.
     *
     * @return El progreso total del proyecto, como un valor entre 0 y 100.
     */
    @Override
    public double evaluarProgreso() {
        if (listaTareas.isEmpty()) {
            return progreso;
        } else {
            double progresoTotal = 0;
            for (Gestor tarea : listaTareas) {
                progresoTotal += tarea.evaluarProgreso();
            }
            return progresoTotal / listaTareas.size();
        }
    }

    /**
     * Elimina una tarea de la lista de tareas utilizando el nombre de la tarea.
     *
     * @param nombre El nombre de la tarea a eliminar.
     */
    public void removerTarea(String nombre) {
        listaTareas.removeIf(tarea -> ((Tarea) tarea).getNombre().equals(nombre));
    }

    /**
     * Obtiene el nombre del proyecto.
     *
     * @return El nombre del proyecto.
     */
    public String getNombre() {
        return nombre;
    }
}
