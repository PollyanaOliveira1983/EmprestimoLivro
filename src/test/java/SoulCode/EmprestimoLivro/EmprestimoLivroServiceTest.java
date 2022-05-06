package SoulCode.EmprestimoLivro;

import SoulCode.EmprestimoLivro.Model.EmprestimoLivro;
import SoulCode.EmprestimoLivro.Repository.EmprestimoLivroRepository;
import SoulCode.EmprestimoLivro.Service.EmprestimoLivroService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;

//faz a ponte entre o spring boot e JUnit
@RunWith(SpringRunner.class)
public class EmprestimoLivroServiceTest {

    @TestConfiguration
    static class EmprestimoLivroServiceTestConfig{

        //@ Bean siginifica objeto instanciado de outra classe
        @Bean
        public EmprestimoLivroService emprestimoLivroService(){
            return new EmprestimoLivroService();
        }
    }

    @Autowired
    EmprestimoLivroService emprestimoLivroService;

    //@MockBean serve para adicionar objetos simulados(fakes) aos nossos testes
    //permite clonar uma classe ou interface
    @MockBean
    EmprestimoLivroRepository emprestimoLivroRepository;

    @Test
    public void emprestimoLivroServiceCalculoDeDias(){

    }

    public void setup(){
        LocalDate dataSaida = LocalDate.parse("2022-05-10");
        LocalDate dataDevolucao = LocalDate.parse("2022-05-20");

        EmprestimoLivro emprestimoLivro = new EmprestimoLivro("1","Thyago", dataSaida,dataDevolucao, "Kafta");
    }

}
