<p style="text-align: center; color: lightgray; font-size: 12px;">
    <strong>Programación Orientada a Objetos II</strong>
</p>

___

<h1 style="text-align: center;color:blue"><u>Trabajo Áulico</u></h1>
<h3 style="text-align: center;">Patrones de Diseño</h3>

##### Grupo B integrantes:
>Gigena, Maximo
>Eitner, Bianca Michelle
>Fernandez, Lautaro
>Lovera, Hernan

### Consigna
Estás desarrollando un sistema de gestión de tareas para proyectos. En este sistema, cada proyecto puede estar compuesto por varias tareas, y cada tarea puede dividirse en subtareas más pequeñas. Debes implementar el patrón correspondiente para permitir que los proyectos y las tareas (o subtareas) sean tratadas de manera uniforme, de modo que puedas calcular el progreso total del proyecto en base al progreso de todas sus tareas y subtareas.

### Diagrama de clases siguiendo el patron Composite
![Diagrama de clases ](https://github.com/user-attachments/assets/28db5824-be2f-4148-adcd-c89fb8691bab)
La elección del patrón **Composite** para este sistema de gestión de tareas se justifica porque nos permite manejar proyectos, tareas y subtareas de manera uniforme, facilitando la organización jerárquica de elementos en una estructura de árbol. En este caso, cada proyecto puede contener múltiples tareas y cada tarea puede descomponerse en subtareas. Esta organización jerárquica es ideal para el patrón Composite, ya que cada componente en el árbol (ya sea un proyecto, una tarea o una subtarea) se trata de forma consistente mediante una interfaz común, *ComponenteTarea*, que define las operaciones necesarias para obtener el progreso y gestionar la composición de elementos.
