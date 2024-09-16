package gmc.learning.scala.services

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired

import scala.compiletime.uninitialized

class PayPalServiceTest:

  @Autowired
  private var payPalService: PayPalService = uninitialized

  @Test
  def shouldReturnNonEmptyListOfTransactions: () => Unit = () => {
    assert(payPalService.myTransactions().block().transactionDetails.length != 0)
  }
