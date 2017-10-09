# APAW-ECP1-COVA
#### Asignatura: *Arquitectura y Patrones para Aplicaciones Web*
#### [Máster en Ingeniería Web por la U.P.M.](http://miw.etsisi.upm.es)

### Tecnologías necesarias
* Java
* Maven
* Eclipse
* GitHub

### Descripción patrón Strategy
El patrón Stragegy encapsula familias de algoritmos. En este ejemplo, los algoritmos son los comportamientos "guardar documento" y "Abrir documento". Una de las ventajas de este patrón consiste en que otros objetos pueden reutilizar y añadir comportamientos sin necesidad de modificar las interfaces (SaveDocBehabiour u OpenDocBehaviour) o las clases que las usan.  
La clase DigitalDoc delega en las interfaces SaveDocBehaviour y OpenDocBehaviour, la implementación de las funcionalidades de guardar y abrir el documento a través de los métodos performSaveHtml,  performSavePDF, performOpenPDF y performOpenHtml respectivamente.
Las clases HtmlDoc y PDFDoc son implementaciones concretas de los documentos digitales, es decir, de la clase DigitalDoc.
Clase HtmlDoc --> Usa la clase OpenHtml para gestionar la funcionalidad de abrir un documento HTML. Cuando se instancia HtmlDoc, su constructor hereda las variables de instancia OpenDocBehaviour en una nueva instancia de tipo OpenHtml, que es una implementación concreta de OpenDocBehaviour. 
El diseño para guardar el documento es el mismo que la apertura, pero con la interfaz SaveDocBehaviour en lugar de OpenDocBehaviour y SaveHtml en lugar de OpenHtml.
En el caso del documento PDF, el comportamiento y la implementación es similar.