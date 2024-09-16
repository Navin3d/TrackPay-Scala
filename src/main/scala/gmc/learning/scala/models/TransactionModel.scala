package gmc.learning.scala.models

import com.fasterxml.jackson.annotation.JsonProperty

case class CurrencyValue(
                          @JsonProperty("currency_code") currencyCode: String,
                          @JsonProperty("value") value: String
                        )

case class TransactionInfo(
                            @JsonProperty("transaction_id") transactionId: String,
                            @JsonProperty("transaction_event_code") transactionEventCode: String,
                            @JsonProperty("transaction_initiation_date") transactionInitiationDate: String,
                            @JsonProperty("transaction_updated_date") transactionUpdatedDate: String,
                            @JsonProperty("transaction_amount") transactionAmount: CurrencyValue,
                            @JsonProperty("transaction_status") transactionStatus: String,
                            @JsonProperty("transaction_subject") transactionSubject: String,
                            @JsonProperty("fee_amount") feeAmount: CurrencyValue,
                            @JsonProperty("ending_balance") endingBalance: CurrencyValue,
                            @JsonProperty("available_balance") availableBalance: CurrencyValue,
                            @JsonProperty("custom_field") customField: String,
                            @JsonProperty("protection_eligibility") protectionEligibility: String,
                            @JsonProperty("transaction_note") transactionNote: String
                          )

case class PayerInfo(
                      @JsonProperty("email_address") emailAddress: String,
                      @JsonProperty("address_status") addressStatus: String,
                      @JsonProperty("payer_name") payerName: PayerName
                    )

case class PayerName(
                      @JsonProperty("given_name") givenName: String,
                      @JsonProperty("surname") surname: String
                    )

case class ShippingInfo(@JsonProperty("name") name: String)
case class CartInfo()
case class StoreInfo()
case class AuctionInfo()
case class IncentiveInfo()

case class TransactionDetail(
                              @JsonProperty("transaction_info") transactionInfo: TransactionInfo,
                              @JsonProperty("payer_info") payerInfo: PayerInfo,
                              @JsonProperty("shipping_info") shippingInfo: ShippingInfo,
                              @JsonProperty("cart_info") cartInfo: CartInfo,
                              @JsonProperty("store_info") storeInfo: StoreInfo,
                              @JsonProperty("auction_info") auctionInfo: AuctionInfo,
                              @JsonProperty("incentive_info") incentiveInfo: IncentiveInfo
                            )

case class TransactionDetails(
                               @JsonProperty("transaction_details") var transactionDetails: Array[TransactionDetail]
                             )
