package gmc.learning.scala.services

import com.fasterxml.jackson.core.`type`.TypeReference
import gmc.learning.scala.config.PayPalConfigs
import gmc.learning.scala.models.TransactionDetails
import org.springframework.stereotype.Service
import org.springframework.web.reactive.function.client.WebClient
import reactor.core.publisher.{Flux, Mono}

import java.net.URI
import com.fasterxml.jackson.databind.{DeserializationFeature, ObjectMapper}
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import com.fasterxml.jackson.module.scala.ScalaObjectMapper

@Service("PayPalService")
class PayPalService(var payPalConfig: PayPalConfigs):

//  private val webClientBuilder: WebClient.Builder = WebClient.builder()
//  private val webClient: WebClient = webClientBuilder.baseUrl(payPalConfig.baseUrl).build
  val webClient: WebClient = WebClient.create()
  private val objectMapper: ObjectMapper with ScalaObjectMapper = new ObjectMapper() with ScalaObjectMapper
  objectMapper.registerModule(DefaultScalaModule)
  objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)

  def myTransactions(): Mono[TransactionDetails] = {
    webClient.get()
      .uri(URI.create(payPalConfig.baseUrl+payPalConfig.transactionsUrl))
      .header("Authorization", "Bearer " + payPalConfig.authToken) // Add your headers here
      .retrieve() // Retrieve the response
      .bodyToMono(classOf[TransactionDetails])
  }
