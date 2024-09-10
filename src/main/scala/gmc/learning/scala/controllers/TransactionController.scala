package gmc.learning.scala.controllers

import gmc.learning.scala.models.TransactionInfo
import gmc.learning.scala.services.PayPalService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.web.bind.annotation.{GetMapping, RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/trx"))
class TransactionController(@Qualifier("PayPalService") payPalService: PayPalService):

  @GetMapping
  def getMyTransactions: Array[TransactionInfo] = payPalService.myTransactions()
