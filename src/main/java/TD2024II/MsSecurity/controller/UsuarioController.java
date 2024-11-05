package TD2024II.MsSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import TD2024II.MsSecurity.model.UsuarioModel;
import TD2024II.MsSecurity.services.UsuarioService;

@RestController
@RequestMapping("usuario")
public class UsuarioController {
    
    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/getALL")
    public List<UsuarioModel> getaLL(){
        return usuarioService.findAll();
    }

    @PostMapping("/create")
    public UsuarioModel create(@RequestBody UsuarioModel model){
        return usuarioService.add(model);
    }
    
}
