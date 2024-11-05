package TD2024II.MsSecurity.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import TD2024II.MsSecurity.model.UsuarioModel;
import TD2024II.MsSecurity.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    IUsuarioRepository repository;

    @Override
    public UsuarioModel add(UsuarioModel model) {
        return repository.save(model);
    }

    @Override
    public UsuarioModel update(UsuarioModel model) {
        return repository.save(model);
    }

    @Override
    public boolean delete(int id) {
        repository.deleteById(id);
        return true;
    }

    @Override
    public List<UsuarioModel> findAll() {
        return (List<UsuarioModel>) repository.findAll();
    }

    @Override
    public UsuarioModel findById(int id) {
        return repository.findById(id).get();
    }
    
}
