// package com.kambr.parser.onex.spo
//
// import com.kambr.parser.onex.spo.dataClasses.FromAndPrice
// import com.kambr.parser.onex.spo.dataClasses.SpoGlobal
// import com.kambr.parser.onex.spo.generated.SpoBaseVisitor
// import com.kambr.parser.onex.spo.generated.SpoParser
// import com.kambr.parser.onex.spo.generated.SpoParser.AgencyCodeContext
// import com.kambr.parser.onex.spo.generated.SpoParser.AgencyNameContext
// import com.kambr.parser.onex.spo.generated.SpoParser.AvailableContext
// import com.kambr.parser.onex.spo.generated.SpoParser.BookingsContext
// import com.kambr.parser.onex.spo.generated.SpoParser.CarrierCodeContext
// import com.kambr.parser.onex.spo.generated.SpoParser.ContractPriceContext
// import com.kambr.parser.onex.spo.generated.SpoParser.FixAllocationContext
// import com.kambr.parser.onex.spo.generated.SpoParser.FromContext
// import com.kambr.parser.onex.spo.generated.SpoParser.HeaderContext
// import com.kambr.parser.onex.spo.generated.SpoParser.PoolingEnabledContext
// import com.kambr.parser.onex.spo.generated.SpoParser.ProRataAmountContext
// import com.kambr.parser.onex.spo.generated.SpoParser.RowContext
// import com.kambr.parser.onex.spo.generated.SpoParser.SpoContext
// import com.kambr.parser.onex.spo.generated.SpoParser.SurchargeContext
// import com.kambr.parser.onex.spo.generated.SpoParser.TaxAmountContext
// import com.kambr.parser.onex.spo.generated.SpoParser.TotalNumberOfAllocationsContext
// import org.antlr.v4.runtime.tree.ParseTree
// import java.math.BigInteger
// import java.time.LocalDate
// import java.time.LocalTime
//
// class MySpoBaseVisitor: SpoBaseVisitor<Any>() {
//
//     override fun visitSpo(ctx: SpoContext): List<SpoGlobal> {
//         val spoList = mutableListOf<SpoGlobal>()
//         for(child in ctx.children){
//             when(child) {
//                 is HeaderContext -> {}
//                 is RowContext -> spoList.add(visitRow(child))
//             }
//
//         }
//         return spoList
//     }
//
//     override fun visitRow(ctx: RowContext): T {
//         var departureDate: LocalDate? = null
//         var origin: String? = null
//         var destination: String? = null
//         var viaStation: String? = null
//         var carrierCode: String? = null
//         var flightNumber: Short? = null
//         var departureTime: LocalTime? = null
//         var arrivalTime: LocalTime? = null
//         var taxAmount: Double? = null
//         var surcharge: Double? = null
//         var fixAllocation: Short? = null
//         var proRataAmount: Short? = null
//         var totalNumberOfAllocations: Short? = null
//         var bookings: Short? = null
//         var available: Short? = null
//         var contractPrice: Double? = null
//         var fromAndPrice: MutableList<FromAndPrice> = mutableListOf()
//         var flightID: BigInteger? = null
//         var poolingEnabled: Boolean? = null
//         var agencyCode: BigInteger? = null
//         var agencyName: String? = null
//
//         for( child in ctx.children){
//             when(child){
//                 is SpoParser.DepartureDateContext -> departureDate = visitDepartureDate(child)
//                 is SpoParser.OriginContext -> origin = visitOrigin(child)
//                 is SpoParser.DestinationContext -> destination = visitDestination(child)
//                 is SpoParser.ViaStationContext -> viaStation = visitViaStation(child)
//                 is CarrierCodeContext ->
//
//             }
//         }
//         return visitChildren(ctx)
//     }
//
//     override fun visitDepartureDate(ctx: SpoParser.DepartureDateContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitOrigin(ctx: SpoParser.OriginContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitDestination(ctx: SpoParser.DestinationContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitViaStation(ctx: SpoParser.ViaStationContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitCarrierCode(ctx: CarrierCodeContext): T {
//         return visitChildren(ctx)
//     }
//
//
//     override fun visitFlightNumber(ctx: SpoParser.FlightNumberContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitDepartureTime(ctx: SpoParser.DepartureTimeContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitArrivalTime(ctx: SpoParser.ArrivalTimeContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitTaxAmount(ctx: TaxAmountContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitSurcharge(ctx: SurchargeContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitFixAllocation(ctx: FixAllocationContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitProRataAmount(ctx: ProRataAmountContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitTotalNumberOfAllocations(ctx: TotalNumberOfAllocationsContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitBookings(ctx: BookingsContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitAvailable(ctx: AvailableContext): T {
//         return visitChildren(ctx)
//     }
//
//     override fun visitContractPrice(ctx: ContractPriceContext): T {
//         return visitChildren(ctx)
//     }
//
//
//     override fun visitFrom(ctx: FromContext): T {
//         return visitChildren(ctx)
//     }
//
//
//     override fun visitPrice(ctx: SpoParser.PriceContext): T {
//         return visitChildren(ctx)
//     }
//
//
//     override fun visitFlightID(ctx: SpoParser.FlightIDContext): T {
//         return visitChildren(ctx)
//     }
//
//
//     override fun visitPoolingEnabled(ctx: PoolingEnabledContext): T {
//         return visitChildren(ctx)
//     }
//
//
//     override fun visitAgencyCode(ctx: AgencyCodeContext): T {
//         return visitChildren(ctx)
//     }
//
//
//     override fun visitAgencyName(ctx: AgencyNameContext): T {
//         return visitChildren(ctx)
//     }
// }