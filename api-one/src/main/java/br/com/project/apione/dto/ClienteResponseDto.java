package br.com.project.apione.dto;

import java.util.List;

import br.com.project.apione.entities.Cliente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteResponseDto {

	private List<Cliente> clientes;
}
