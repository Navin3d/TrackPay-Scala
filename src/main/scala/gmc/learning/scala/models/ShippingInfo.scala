package gmc.learning.scala.models

import com.fasterxml.jackson.annotation.JsonProperty
import scala.beans.BeanProperty

class ShippingInfo:
 @JsonProperty("name")
 @BeanProperty
 var name: String = _
