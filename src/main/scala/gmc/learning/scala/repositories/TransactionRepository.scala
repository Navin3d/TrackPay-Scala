package gmc.learning.scala.repositories

import gmc.learning.scala.entities.TransactionEntity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

trait TransactionRepository extends ReactiveMongoRepository[TransactionEntity, Long]
