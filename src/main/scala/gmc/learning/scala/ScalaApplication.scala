package gmc.learning.scala

import io.swagger.v3.oas.annotations.OpenAPIDefinition
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@OpenAPIDefinition
@SpringBootApplication
class ScalaApplication

@main def main() : Unit = {
    SpringApplication.run(classOf[ScalaApplication])
}
