package frases.projeto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frases")
public class FraseController {
    @Autowired
    private FraseService servico;

    @GetMapping
    public FraseDTO obterFraseAleatoria(){
         return  servico.obterFraseAleatoria();
    }

}
