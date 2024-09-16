package gmc.learning.scala.models

import com.fasterxml.jackson.annotation.JsonProperty
import scala.beans.BeanProperty

class CurrencyValue:
  @JsonProperty("currency_code") @BeanProperty var currencyCode: String = _
  @JsonProperty("value") @BeanProperty var value: String = _