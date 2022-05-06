package SoulCode.EmprestimoLivro.Repository;

import SoulCode.EmprestimoLivro.Model.EmprestimoLivro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmprestimoLivroRepository extends JpaRepository<EmprestimoLivro, String> {

    Optional<EmprestimoLivro> findByNomeDaReserva(String nome);
}
