package sentenciaThrow;
// Realizar una clase de Excepciones Personalizada que extienda de la clase Exception. 
// Implementar los diferentes métodos que sean necesarios teniendo en cuenta cada uno de los mensajes personalizados que podrían arrojar.
//  Provocar la ejecución de la excepción personalizada mediante la sentencia throw para probar la ejecución de la excepción y responder…
//  ¿Se ejecuta correctamente? ¿Qué método de la excepción se ejecutó?


public class errorSentenciaThrow extends Exception {
    public errorSentenciaThrow (String mensaje){
        super(mensaje);
    }
}

