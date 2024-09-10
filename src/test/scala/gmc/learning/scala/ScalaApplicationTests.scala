package gmc.learning.scala

import gmc.learning.scala.config.PayPalConfigs
import gmc.learning.scala.services.PayPalService
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.{Autowired, Qualifier}

import scala.compiletime.uninitialized

@SpringBootTest
class ScalaApplicationTests:

  @Autowired
  private var payPalConfigs: PayPalConfigs = uninitialized

  @Test
  def contextLoads(@Qualifier("PayPalService") payPalService: PayPalService): Unit = {
    assert(payPalService.payPalConfig.baseUrl.equals(payPalConfigs.baseUrl))
  }
