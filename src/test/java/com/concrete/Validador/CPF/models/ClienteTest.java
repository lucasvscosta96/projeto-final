package com.concrete.Validador.CPF.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest

public class ClienteTest{

	@Test
	void testandoInstanciaDeCliente() {

        Cliente cli = new Cliente();
        cli.setNome("Luis");
        assertEquals(cli.getNome(), "Luis");

        cli.setCpf("3333333333");
        assertEquals(cli.getCpf(),"3333333333");

}

private void assertEquals(String cpf, String string) {
    }

@DisplayName("Dado que eu passei um CPF válido, então devo receber uma validação verdadeira")
@Test
      void testandoValidacaoDeCpfValida() {
  Cliente cli = new Cliente();
  cli.setCpf("235.086.800-10");
  assertEquals(cli.validarCPF(), true);
      }

private void assertEquals(boolean validarCPF, boolean b) {
}

@DisplayName("Dado que eu passei um CPF inválido, então devo receber uma validação falsa")
@Test
      void testandoValidacaoDeCpfInvalida() {
  Cliente cli = new Cliente();
  cli.setCpf("235.086.800-11");
  assertEquals(cli.validarCPF(), false);
      
}

}
