package gmc.learning.scala.services

import gmc.learning.scala.config.PayPalConfigs
import gmc.learning.scala.models.TransactionDetails
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.Mono

import java.net.URI

@Service("PayPalService")
class PayPalService(var payPalConfig: PayPalConfigs):

  val webClient: WebClient = WebClient.create()

  def myTransactions(): Mono[TransactionDetails] = webClient.get()
      .uri(URI.create(payPalConfig.baseUrl+payPalConfig.transactionsUrl))
      .header("Authorization", "Bearer " + payPalConfig.authToken) // Add your headers here
      .retrieve() // Retrieve the response
      .bodyToMono(classOf[TransactionDetails])
