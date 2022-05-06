package SoulCode.EmprestimoLivro.Service;

import SoulCode.EmprestimoLivro.Model.EmprestimoLivro;
import SoulCode.EmprestimoLivro.Repository.EmprestimoLivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Period;
import java.util.Optional;

@Service
public class EmprestimoLivroService {

   @Autowired
    EmprestimoLivroRepository emprestimoLivroRepository;

   public int calculoDeDias(String nome){
       Optional<EmprestimoLivro> emprestimo = emprestimoLivroRepository.findByNomeDaReserva(nome);

       //o metodo between faz o calculo de tempo entre duas datas
       return Period.between(emprestimo.get().getDataSaida(), emprestimo.get().getDataDevolucao()).getDays();

   }
}
