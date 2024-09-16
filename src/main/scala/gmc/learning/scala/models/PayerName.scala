package gmc.learning.scala.models

import com.fasterxml.jackson.annotation.JsonProperty
import java.beans.BeanProperty

class PayerName:
  @JsonProperty("given_name") @BeanProperty var givenName: String = _
  @JsonProperty("surname") @BeanProperty var surname: String = _