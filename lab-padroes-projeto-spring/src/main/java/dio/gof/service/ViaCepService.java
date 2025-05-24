package dio.gof.service;

import dio.gof.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "viacep.com.br/ws")
public class ViaCepService {

    @GetMapping("/{cep}/json")
    Endereco consultarCep(@PathVariable("cep") String cep){
        return null;
    }

}
