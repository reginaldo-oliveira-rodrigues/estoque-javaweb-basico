package br.com.rnglnd.estoquewebagrichile.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/estoque")
public class EstoqueController {
    
    @RequestMapping(value = "/responder", method = RequestMethod.POST)
    public @ResponseBody Object responderRequisicao(Object dados){
        // TODO implementar com objetos de entrada e saída de dados 
        // no formato JSON, que é DTO
        return new Object();
    }
}
