package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {
  @NotBlank(message = "Preencha o campo corretamente")
  @Size(min = 3, max = 50, message = "'${validateValue}' Precisa estar entre {min} e {max} caracteres")
  private String nome;

  @NotBlank(message = "Preencha o campo corretamente")
  @CPF(message = "'${validateValue}' é inválido")
  private String cpf;

  @NotBlank(message = "Preencha o campo corretamente")
  @Size(min = 3, max = 50, message = "'${validateValue}' Precisa estar entre {min} e {max} caracteres")
  private String bairro;

  @NotBlank(message = "Preencha o campo corretamente")
  @Size(message = "Data '${validateValue}' é inválida")
  private LocalDate dataDeNascimento;
}
