package gmc.learning.scala.models

import com.fasterxml.jackson.annotation.JsonProperty
import scala.beans.BeanProperty

class PayerInfo:
  @JsonProperty("email_address") @BeanProperty var emailAddress: String = _
  @JsonProperty("address_status") @BeanProperty var addressStatus: String = _
  @JsonProperty("payer_name") @BeanProperty var payerName: PayerName = _
