package com.concrete.Validador.CPF.Controllers;

import com.concrete.Validador.CPF.models.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
       return "home/index";
    }

    @GetMapping("/profile-luis")
    public String profile_luis() {
       return "home/profile-luis";
    }

    @GetMapping("/profile-lucas")
    public String profile_lucas() {
       return "home/profile-lucas";
    }

    @GetMapping("/profile-thiago")
    public String profile_thiago() {
       return "home/profile-thiago";
    }
 
    @PostMapping("/valida-cpf")
    public String validarCpf(Cliente cliente, Model model) {
        model.addAttribute("cliente", cliente);
        model.addAttribute("validado", cliente.validarCPF());
        return "home/cpfvalidado";
    }
} 
