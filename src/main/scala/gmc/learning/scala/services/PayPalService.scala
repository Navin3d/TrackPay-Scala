package gmc.learning.scala.services

import gmc.learning.scala.config.PayPalConfigs
import org.springframework.beans.factory.annotation.{Autowired, Value}
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient

import scala.compiletime.uninitialized

@Service
class PayPalService(var payPalConfig: PayPalConfigs):

  private val webClientBuilder: WebClient.Builder = WebClient.builder()

  private val webClient: WebClient = webClientBuilder.baseUrl(payPalConfig.baseUrl).build
