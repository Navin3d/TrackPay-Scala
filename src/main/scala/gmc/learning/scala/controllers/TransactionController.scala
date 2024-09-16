package gmc.learning.scala.controllers

import gmc.learning.scala.models.TransactionDetails
import gmc.learning.scala.services.PayPalService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}
import reactor.core.publisher.Mono

@RestController
@RequestMapping(path = Array("/trx"))
class TransactionController(@Qualifier("PayPalService") payPalService: PayPalService):

  @GetMapping
  def getMyTransactions: Mono[TransactionDetails] = payPalService.myTransactions()
