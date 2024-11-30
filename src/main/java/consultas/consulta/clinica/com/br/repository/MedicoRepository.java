package consultas.consulta.clinica.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import consultas.consulta.clinica.com.br.model.Medico;

public interface MedicoRepository extends JpaRepository< Medico,Long> {
    
}
