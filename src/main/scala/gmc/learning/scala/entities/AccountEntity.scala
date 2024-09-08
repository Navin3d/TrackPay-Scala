package gmc.learning.scala.entities

import org.springframework.data.mongodb.core.mapping.{Document, MongoId}

import java.time.LocalDateTime

@Document(collection = "accounts")
case class AccountEntity(
  @MongoId
  var id: Long,
  var balance: Long,
  var holder: Long,
  var createdOn: LocalDateTime
)
