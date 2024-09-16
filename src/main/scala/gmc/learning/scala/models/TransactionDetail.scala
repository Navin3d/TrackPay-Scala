package gmc.learning.scala.models

import com.fasterxml.jackson.annotation.JsonProperty

import scala.beans.BeanProperty

class TransactionDetail:
  @JsonProperty("transaction_info")
  @BeanProperty var transactionInfo: TransactionInfo = _
  @JsonProperty("payer_info")
  @BeanProperty var payerInfo: PayerInfo = _
  @JsonProperty("shipping_info")
  @BeanProperty var shippingInfo: ShippingInfo = _
