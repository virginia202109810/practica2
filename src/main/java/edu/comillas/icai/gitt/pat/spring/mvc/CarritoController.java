package edu.comillas.icai.gitt.pat.spring.mvc;

import org.springframework.web.bind.annotation.*;

@RestController // indica que la clase es controller
@RequestMapping("/carrito") // se pone /nombre recurso , en este caso el recurso es un carrito
public class CarritoController{
    private Carrito carrito_controller;

    //Create
    //el metodo lo que va a hacer es q yo le paso un objeto del tipo Carrito y lo q voy a hacer es decir carrito de la clase controller= carrito q le paso por el metodo , de maner q el carrito de la clase controller ahora vale lo q vale el carrito q he pasado por el metedo y se queda guardado en la clase controller.
    @PostMapping
    public Carrito crearCarrito(@RequestBody Carrito carrito){
        carrito_controller = carrito;
        return carrito_controller;
    }

    //Read
    // el metodo read simplemente se usa para obtener el objeto carrito de la clase controller
    @GetMapping
    public Carrito obtenerCarrito(){
        return carrito_controller;
    }


    // Upadte
    // es basicamente la misma forma q create, solo q si tenia un valro antes pues ahora tiene uno nuevo , estoy actualizando
    @PutMapping
    public Carrito actualizarCarrito(@RequestBody Carrito carrito){
        carrito_controller=carrito;
        return carrito_controller;
    }

    //delete
    // igualo el carrito_controller a null
    @DeleteMapping
    public void borrarCarrito(){
        this.carrito_controller=null;
    }
}