package one.digitalinnovation.personapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    private Long id;

    @NotEmpty(message = "{firstName.not.empty}")
    @Size(min = 2, max = 100)
    private String firstName;

    @NotEmpty(message = "{lastName.not.empty}")
    @Size(min = 2, max = 100)
    private String lastName;

    @NotEmpty(message = "{cpf.not.empty}")
    @CPF(message = "{cpf.not.valid}")
    private String cpf;

    private String birthDate;

    @Valid
    @NotEmpty(message = "{phones.not.empty}")
    private List<PhoneDTO> phones;
}
