package projekt.jazs21488nbp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import java.util.Collections;

@Configuration
public class SpringFoxConfig {

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.OAS_30)
                .select()
                .apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .paths(PathSelectors.any())
                .build().apiInfo(info());

    }


    private ApiInfo info(){
        return new ApiInfo(
                "tytul",
                "note",
                "Zaliczenie 1.0",
                null,
                new Contact("Adrian", null,"s21488@pjwstk.edu.pl"),
                "Licencja na zdawanie",
                null,
                Collections.emptyList());
    }

}