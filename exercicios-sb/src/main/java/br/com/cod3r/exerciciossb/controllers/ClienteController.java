package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.models.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes") //diz que toda a classe está mapeada por /clientes, n precisando repetir
public class ClienteController {

    @GetMapping(path = "/qualquer")
    public Cliente obterCliente() {
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    // primeira forma de passar parametros para um web service: passando o id em {} na url
    @GetMapping("/{id}") //{algum valor}
    public Cliente obterClientePorId(@PathVariable int id) { //@pathvariable valor variavel
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    // segunda forma de passar parametros para um web service:passando ? e cada parametro com "seuvalor" na url
    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id") int id) {
        return new Cliente(id, "João Augusto", "111.222.333-44");
    }

}
