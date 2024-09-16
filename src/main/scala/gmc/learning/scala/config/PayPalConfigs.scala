package gmc.learning.scala.config

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

import scala.compiletime.uninitialized

@Component
class PayPalConfigs:
  @Value("${paypal.client.id}")
  var clientId: String = uninitialized
  @Value("${paypal.client.secret}")
  var clientSecret: String = uninitialized
  @Value("${paypal.base-url}")
  var baseUrl: String = uninitialized
  @Value("${paypal.auth-url}")
  var authUrl: String = uninitialized
  @Value("${paypal.auth-token}")
  var authToken: String = uninitialized
  @Value("${paypal.user-url}")
  var userUrl: String = uninitialized
  @Value("${paypal.transactions-url}")
  var transactionsUrl: String = uninitialized
