package gmc.learning.scala

import gmc.learning.scala.config.PayPalConfigs
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.{Autowired, Qualifier, Value}

import scala.compiletime.uninitialized

@SpringBootTest
class ScalaApplicationTests {

  @Autowired
  private var payPalConfigs: PayPalConfigs = uninitialized

  @Test
  def contextLoads(): Unit = {
    assert(payPalConfigs.baseUrl.equals("https://api-m.sandbox.paypal.com"))
  }
}
