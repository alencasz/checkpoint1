package br.com.fiap.checkpoint1.service;

import br.com.fiap.checkpoint1.dto.PacienteDTO;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class PacienteService {
    private final Map<Long, PacienteDTO> pacientes = new HashMap<>();
    private long idCounter = 1;

    public PacienteDTO salvar(PacienteDTO paciente) {
        paciente.setId(idCounter++);
        pacientes.put(paciente.getId(), paciente);
        return paciente;
    }

    public PacienteDTO atualizar(Long id, PacienteDTO paciente) {
        if (!pacientes.containsKey(id)) throw new NoSuchElementException("Paciente não encontrado");
        paciente.setId(id);
        pacientes.put(id, paciente);
        return paciente;
    }

    public void deletar(Long id) {
        if (!pacientes.containsKey(id)) throw new NoSuchElementException("Paciente não encontrado");
        pacientes.remove(id);
    }

    public PacienteDTO buscarPorId(Long id) {
        return Optional.ofNullable(pacientes.get(id)).orElseThrow(() -> new NoSuchElementException("Paciente não encontrado"));
    }

    public List<PacienteDTO> listarTodos() {
        return new ArrayList<>(pacientes.values());
    }
}
