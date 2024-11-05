package TD2024II.MsSecurity.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import TD2024II.MsSecurity.model.UsuarioModel;

@Repository
public interface IUsuarioRepository extends CrudRepository<UsuarioModel, Integer>{

    
    
}
