package consultas.consulta.clinica.com.br.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import consultas.consulta.clinica.com.br.model.Paciente;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {
    
}
