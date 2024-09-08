package gmc.learning.scala.repositories

import gmc.learning.scala.entities.AccountEntity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

trait AccountRepository extends ReactiveMongoRepository[AccountEntity, Long]
