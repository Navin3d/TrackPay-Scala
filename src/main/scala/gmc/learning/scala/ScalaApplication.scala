package gmc.learning.scala

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.ConfigurationPropertiesScan

@ConfigurationPropertiesScan
@SpringBootApplication
class ScalaApplication

@main def main() : Unit = {
    SpringApplication.run(classOf[ScalaApplication])
}
