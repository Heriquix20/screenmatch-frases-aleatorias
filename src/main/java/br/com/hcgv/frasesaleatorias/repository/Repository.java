package br.com.hcgv.frasesaleatorias.repository;


import br.com.hcgv.frasesaleatorias.model.Corpo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface Repository extends JpaRepository<Corpo, Long> {

    @Query("SELECT c FROM Corpo c order by function('RANDOM') LIMIT 1")
    Corpo buscarFraseAleatoria();

}
