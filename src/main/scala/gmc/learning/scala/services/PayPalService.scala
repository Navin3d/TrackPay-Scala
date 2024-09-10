package gmc.learning.scala.services

import gmc.learning.scala.config.PayPalConfigs
import gmc.learning.scala.models.TransactionInfo
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

import java.net.URI

@Service("PayPalService")
class PayPalService(var payPalConfig: PayPalConfigs):

  private val webClientBuilder: WebClient.Builder = WebClient.builder()
  private val webClient: WebClient = webClientBuilder.baseUrl(payPalConfig.baseUrl).build

  def myTransactions(): Array[TransactionInfo] = {
    val res = webClient.get().uri(URI(payPalConfig.transactionsUrl)).asInstanceOf[Array[TransactionInfo]]
    res
  }
