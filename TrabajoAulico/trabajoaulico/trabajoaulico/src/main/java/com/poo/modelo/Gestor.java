package com.poo.modelo;

/**
 * La interfaz {@code Gestor} define el comportamiento común para gestionar y evaluar el progreso de las tareas o proyectos.
 * Las clases que implementen esta interfaz deben proporcionar su propia implementación del método {@link #evaluarProgreso()}.
 */
public interface Gestor {
    
    /**
     * Evalúa el progreso de la tarea o proyecto.
     * Este método debe ser implementado por cualquier clase que implemente la interfaz {@code Gestor}.
     * 
     * @return El progreso de la tarea o proyecto, representado como un valor numérico.
     *         El valor debe estar entre 0 (sin progreso) y 100 (progreso completo).
     */
    double evaluarProgreso();
}
