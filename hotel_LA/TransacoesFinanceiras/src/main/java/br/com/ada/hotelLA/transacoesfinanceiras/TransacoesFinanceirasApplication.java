package br.com.ada.hotelLA.transacoesfinanceiras;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Operações Financeiras", version = "1.0", description = "Informação Pagamento Reserva"))
public class TransacoesFinanceirasApplication {

    public static void main(String[] args) {
        SpringApplication.run(TransacoesFinanceirasApplication.class, args);
    }

}
