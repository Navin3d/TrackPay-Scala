package gmc.learning.scala.models

import com.fasterxml.jackson.annotation.JsonProperty

import scala.beans.BeanProperty

class TransactionDetails:
  @JsonProperty("transaction_details") @BeanProperty var transactionDetails: Array[TransactionDetail] = _
