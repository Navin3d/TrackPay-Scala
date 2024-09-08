package gmc.learning.scala.entities

import org.springframework.data.mongodb.core.mapping.{Document, MongoId}

@Document(collection = "customers")
case class CustomerEntity(
  @MongoId
  var id: Long,
  var name: String,
  var email: String
)
