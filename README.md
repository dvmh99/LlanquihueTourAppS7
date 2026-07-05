# LlanquihueTourAppS7

Proyecto desarrollado para la Semana 7 de la asignatura Desarrollo Orientado a Objetos I.

Esta actividad continúa el proyecto LlanquihueTourApp, incorporando el uso de polimorfismo, sobrescritura de métodos y colecciones genéricas para gestionar distintos servicios turísticos de la agencia Llanquihue Tour.

## Descripción del proyecto

El sistema permite almacenar y mostrar distintos tipos de servicios turísticos utilizando una colección polimórfica.

Los servicios turísticos implementados son:

- RutaGastronomica
- PaseoLacustre
- ExcursionCultural

Cada clase hereda desde la clase ServicioTuristico y sobrescribe el método mostrarInformacion(), permitiendo mostrar información específica según el tipo de servicio.

## Funcionalidades implementadas

- Creación de una jerarquía de clases basada en herencia.
- Implementación de sobrescritura de métodos con @Override.
- Uso del método mostrarInformacion() en la superclase y en las subclases.
- Creación de una colección genérica List<ServicioTuristico>.
- Carga manual de seis servicios turísticos.
- Recorrido de la colección mediante un ciclo for-each.
- Aplicación de polimorfismo al llamar mostrarInformacion() desde referencias de tipo ServicioTuristico.
- Organización del proyecto en paquetes model, data y ui.
- Salida clara por consola.

## Estructura del proyecto

```
src/
├── model/
│   ├── ServicioTuristico.java
│   ├── RutaGastronomica.java
│   ├── PaseoLacustre.java
│   └── ExcursionCultural.java
│
├── data/
│   └── GestorServicios.java
│
└── ui/
    └── Main.java
```

## Clases principales

### ServicioTuristico

Clase padre del proyecto. Contiene los atributos comunes de los servicios turísticos, como nombre y duración en horas.

También contiene el método mostrarInformacion(), que es sobrescrito por las subclases.

### RutaGastronomica

Clase hija de ServicioTuristico.

Representa una ruta gastronómica e incluye el número de paradas del recorrido.

### PaseoLacustre

Clase hija de ServicioTuristico.

Representa un paseo lacustre e incluye el tipo de embarcación utilizada.

### ExcursionCultural

Clase hija de ServicioTuristico.

Representa una excursión cultural e incluye el lugar histórico visitado.

### GestorServicios

Clase ubicada en el paquete data.

Se encarga de crear una lista de tipo List<ServicioTuristico>, cargar servicios turísticos y recorrerlos para mostrar su información aplicando polimorfismo.

### Main

Clase principal ubicada en el paquete ui.

Permite ejecutar el sistema y mostrar por consola los servicios turísticos disponibles.

## Ejecución del programa

Para ejecutar el programa desde NetBeans:

1. Abrir el proyecto LlanquihueTourAppS7.
2. Verificar que la clase Main.java se encuentre dentro del paquete ui.
3. Ejecutar el proyecto con la opción Run Project.
4. Revisar la salida por consola.

## Ejemplo de salida esperada

SERVICIOS TURISTICOS DISPONIBLES
================================

Ruta Gastronomica
Nombre: Sabores de Puerto Varas
Duracion: 4 horas
Numero de paradas: 5

------------------------------

Paseo Lacustre
Nombre: Navegacion por el Lago Llanquihue
Duracion: 2 horas
Tipo de embarcacion: Catamaran

------------------------------

Excursion Cultural
Nombre: Historia y patrimonio de Frutillar
Duracion: 5 horas
Lugar historico: Museo y teatro

### Tecnologías utilizadas

- Java
- NetBeans
- GitHub

## Autor

Diego Martinez Herrera
