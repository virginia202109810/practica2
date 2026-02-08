# practica2
Método HTTP	Ruta	Cuerpo (Body)	Descripción	Posibles respuestas
POST	/carrito	JSON Carrito	Crea un nuevo carrito y lo guarda en memoria	200 OK, 400 Bad Request
GET	/carrito	No requiere	Devuelve el carrito almacenado actualmente	200 OK
PUT	/carrito	JSON Carrito	Actualiza el carrito existente	200 OK, 400 Bad Request
DELETE	/carrito	No requiere	Elimina el carrito almacenado (lo pone a null)	200 OK
