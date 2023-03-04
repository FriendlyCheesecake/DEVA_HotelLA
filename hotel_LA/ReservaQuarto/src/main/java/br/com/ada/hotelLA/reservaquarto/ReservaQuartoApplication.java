package br.com.ada.hotelLA.reservaquarto;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Reserva Quarto", version = "1.0", description = "Informações de reserva"))
public class ReservaQuartoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReservaQuartoApplication.class, args);
    }

}
