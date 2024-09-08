package gmc.learning.scala.repositories

import gmc.learning.scala.entities.CustomerEntity
import org.springframework.data.mongodb.repository.ReactiveMongoRepository

trait CustomerRepository extends ReactiveMongoRepository[CustomerEntity, Long]
