package com.poo.modelo;

/**
 * La clase {@code SubTarea} representa una subtarea individual que implementa la interfaz {@link Gestor}.
 * Una subtarea tiene un nombre y un progreso, pero no puede contener otras tareas, ya que es una unidad básica.
 */
public class SubTarea implements Gestor {
    private String nombre;
    private double progreso;

    /**
     * Constructor que crea una nueva subtarea con el nombre y el progreso especificado.
     *
     * @param nombre El nombre de la subtarea.
     * @param progreso El progreso inicial de la subtarea, representado como un número entre 0 y 100.
     */
    public SubTarea(String nombre, double progreso) {
        this.nombre = nombre;
        this.progreso = progreso;
    }

    /**
     * Este método no está soportado en la clase {@code SubTarea}, ya que no es posible agregar tareas a una subtarea.
     * Lanza una excepción {@link UnsupportedOperationException}.
     *
     * @param nombre El nombre de la tarea a agregar (no se usa en este caso).
     * @throws UnsupportedOperationException Siempre que se intente agregar una tarea a una subtarea.
     */
    public void agregarTarea(String nombre) {
        throw new UnsupportedOperationException("No se pueden agregar tareas a una subtarea.");
    }

    /**
     * Evalúa el progreso de la subtarea.
     * Retorna el progreso individual de la subtarea, ya que una subtarea no tiene otras tareas asociadas.
     *
     * @return El progreso de la subtarea, como un valor entre 0 y 100.
     */
    @Override
    public double evaluarProgreso() {
        return progreso;
    }

    /**
     * Este método no está soportado en la clase {@code SubTarea}, ya que no es posible remover tareas de una subtarea.
     * Lanza una excepción {@link UnsupportedOperationException}.
     *
     * @param nombre El nombre de la tarea a remover (no se usa en este caso).
     * @throws UnsupportedOperationException Siempre que se intente remover una tarea de una subtarea.
     */
    public void removerTarea(String nombre) {
        throw new UnsupportedOperationException("No se pueden remover tareas de una subtarea.");
    }

    /**
     * Obtiene el nombre de la subtarea.
     *
     * @return El nombre de la subtarea.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece un nuevo valor de progreso para la subtarea.
     *
     * @param progreso El nuevo valor de progreso de la subtarea, representado como un número entre 0 y 100.
     */
    public void setProgreso(double progreso) {
        this.progreso = progreso;
    }
}
