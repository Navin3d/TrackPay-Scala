package gmc.learning.scala.entities

case class CurrencyValue(currency_code: String, value: String)
case class TransactionInfo(
                            transaction_id: String,
                            transaction_event_code: String,
                            transaction_initiation_date: String,
                            transaction_updated_date: String,
                            transaction_amount: CurrencyValue,
                            transaction_status: String,
                            transaction_subject: Option[String],
                            fee_amount: Option[CurrencyValue],
                            ending_balance: CurrencyValue,
                            available_balance: CurrencyValue,
                            custom_field: Option[String],
                            protection_eligibility: String,
                            transaction_note: Option[String]
                          )
case class PayerInfo(
                      email_address: Option[String],
                      address_status: String,
                      payer_name: Option[Map[String, String]]
                    )
case class ShippingInfo(name: Option[String])
case class CartInfo() // Assuming no fields here
case class StoreInfo() // Assuming no fields here
case class AuctionInfo() // Assuming no fields here
case class IncentiveInfo() // Assuming no fields here
case class TransactionDetail(
                              transaction_info: TransactionInfo,
                              payer_info: PayerInfo,
                              shipping_info: ShippingInfo,
                              cart_info: CartInfo,
                              store_info: StoreInfo,
                              auction_info: AuctionInfo,
                              incentive_info: IncentiveInfo
                            )
case class TransactionDetails(transaction_details: List[TransactionDetail])
