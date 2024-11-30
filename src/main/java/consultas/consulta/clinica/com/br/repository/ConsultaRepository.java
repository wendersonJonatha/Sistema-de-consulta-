package consultas.consulta.clinica.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import consultas.consulta.clinica.com.br.model.Consulta;

public interface ConsultaRepository extends JpaRepository <Consulta, Long> {
    
}
