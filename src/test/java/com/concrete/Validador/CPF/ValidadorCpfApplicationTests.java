package com.concrete.Validador.CPF;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import com.concrete.Validador.CPF.models.Cliente;

@SpringBootTest
class ValidadorCpfApplicationTests {

    @Test
	@DisplayName("Quando eu passar um CPF válido o valor precisa ser verdadeiro")
	void paraValidarCPF() {
		Cliente cliente = new Cliente("Luis", "25358061002");
		//Cliente luis = new Cliente();
		//luis.setNome("Luis Eduardo");
		//luis.setCpf("25358061002");
		assertEquals(true, cliente.validarCPF());
	}

	//Debug/NullCPF//
	@Test
	@DisplayName("Quando eu passar um CPF nulo")
	void paraValidarCPFNulo() {
		Cliente cliente = new Cliente("Luis", null);
		assertEquals(false, cliente.validarCPF());
	}

    @Test
	@DisplayName("Quando eu passar um CPF inválido o valor precisa ser falso")
	void paraValidarCPFinvalido() {
		Cliente cliente = new Cliente("Luis", "25358061000");
        assertEquals(false, cliente.validarCPF());
	}

    @Test
	@DisplayName("Quando eu passar um CPF invalido formatado o valor precisa ser falso")
	void paraValidarCPFinvalidoFormatado() {
		Cliente cliente = new Cliente("Luis", "25358061000");
        assertEquals(false, cliente.validarCPF());
	}

    @Test
	@DisplayName("Quando eu passar um CPF valido formatado o valor precisa ser verdadeiro")
	void paraValidarCPFvalidoFormatado() {
		Cliente cliente = new Cliente("Luis", "25358061002");
        assertEquals(true, cliente.validarCPF());
	}
}