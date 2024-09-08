package gmc.learning.scala.entities

import org.springframework.data.mongodb.core.mapping.{Document, MongoId}

import java.time.LocalDateTime

@Document(collection = "transactions")
case class TransactionEntity(
  @MongoId
  var id: Long,
  var amount: Long,
  var ref: String,
  var from: Long,
  var to: Long,
  var time: LocalDateTime
)
