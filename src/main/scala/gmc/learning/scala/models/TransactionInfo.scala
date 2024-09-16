package gmc.learning.scala.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.beans.BeanProperty

class TransactionInfo:
  @JsonProperty("transaction_id")
  @BeanProperty var transactionId: String = _
  @JsonProperty("transaction_event_code")
  @BeanProperty var transactionEventCode: String = _
  @JsonProperty("transaction_initiation_date")
  @BeanProperty var transactionInitiationDate: String = _
  @JsonProperty("transaction_updated_date")
  @BeanProperty var transactionUpdatedDate: String = _
  @JsonProperty("transaction_amount")
  @BeanProperty var transactionAmount: CurrencyValue = _
  @JsonProperty("transaction_status")
  @BeanProperty var transactionStatus: String = _
  @JsonProperty("transaction_subject")
  @BeanProperty var transactionSubject: String = _
  @JsonProperty("fee_amount")
  @BeanProperty var feeAmount: CurrencyValue = _
  @JsonProperty("ending_balance")
  @BeanProperty var endingBalance: CurrencyValue = _
  @JsonProperty("available_balance")
  @BeanProperty var availableBalance: CurrencyValue = _
  @JsonProperty("custom_field")
  @BeanProperty var customField: String = _
  @JsonProperty("protection_eligibility")
  @BeanProperty var protectionEligibility: String = _
  @JsonProperty("transaction_note")
  @BeanProperty var transactionNote: String = _