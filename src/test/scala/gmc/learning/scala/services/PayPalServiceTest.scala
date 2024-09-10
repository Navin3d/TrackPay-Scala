package gmc.learning.scala.services

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

import scala.compiletime.uninitialized

class PayPalServiceTest:

  @Autowired
  private var payPalService: PayPalService = uninitialized

  @Test
  def shouldReturnNonEmptyListOfTransactions: () => Unit = () => {
    assert(payPalService.myTransactions().length != 0)
  }
