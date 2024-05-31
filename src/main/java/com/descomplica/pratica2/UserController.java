package com.descomplica.pratica2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // Método para retornar uma mensagem simples
    @GetMapping("/hello")
    public String hello() {
        return "Olá, mundo!";
    }

    // Método para retornar informações sobre um usuário com base no ID
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable Long id) {
        // Aqui você pode implementar a lógica para recuperar informações do usuário com o ID fornecido
        return "Informações do usuário com ID " + id;
    }

    // Método para criar um novo usuário
    @PostMapping("/user")
    public String createUser(@RequestBody String userInfo) {
        // Aqui você pode implementar a lógica para criar um novo usuário com as informações fornecidas
        return "Novo usuário criado: " + userInfo;
    }
}
