package dio.gof.service;

import dio.gof.model.Cliente;
import dio.gof.model.ClienteRepository;
import dio.gof.model.Endereco;
import dio.gof.model.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Autowired
    private ViaCepService viaCepService;

    public void inserir(Cliente cliente){
        salvarClienteComCep(cliente);
    }

    public Iterable<Cliente> buscarTodos() {
        return repository.findAll();
    }

    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = repository.findById(id);
        return cliente.get();
    }

    public void atualizar(Long id, Cliente cliente){
        
        Optional<Cliente> clienteBd = repository.findById(id);
        
        if (clienteBd.isPresent()) {
            salvarClienteComCep(cliente);
        }
    }

    public void deletar(Long id){
        repository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });

        cliente.setEndereco(endereco);
        repository.save(cliente);
    }


}
