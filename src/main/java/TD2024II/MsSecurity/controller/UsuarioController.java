package TD2024II.MsSecurity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/getById/{id}")
    public UsuarioModel getById(@PathVariable int id){
        return usuarioService.findById(id);
    }
    
    @PutMapping("/update")
    public UsuarioModel update(@RequestBody UsuarioModel model){
        return usuarioService.update(model);
    }

    @DeleteMapping("/delete/{id}")
    public boolean delete(@PathVariable int id){
        return usuarioService.delete(id);
    }
}
