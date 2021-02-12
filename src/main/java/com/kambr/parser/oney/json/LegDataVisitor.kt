package com.kambr.parser.oney.json

import com.kambr.parser.oney.json.ExtensionFunctions.toInteger
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDate
import com.kambr.parser.oney.json.ExtensionFunctions.toLocalDateTime
import com.kambr.parser.oney.json.dataClasses.BlockSpaceDetails
import com.kambr.parser.oney.json.dataClasses.CabinDetails
import com.kambr.parser.oney.json.dataClasses.FieldNames.AIRCRAFT_AUTHORIZED_CAPACITY
import com.kambr.parser.oney.json.dataClasses.FieldNames.AIRCRAFT_SALEABLE_CAPACITY
import com.kambr.parser.oney.json.dataClasses.FieldNames.ARRIVAL_STATION
import com.kambr.parser.oney.json.dataClasses.FieldNames.ARRIVAL_TIME
import com.kambr.parser.oney.json.dataClasses.FieldNames.BASE_CURRENCY_CODE
import com.kambr.parser.oney.json.dataClasses.FieldNames.CARRIER_CODE
import com.kambr.parser.oney.json.dataClasses.FieldNames.DEPARTURE_STATION
import com.kambr.parser.oney.json.dataClasses.FieldNames.DEPARTURE_TIME
import com.kambr.parser.oney.json.dataClasses.FieldNames.EQUIPMENT_VERSION
import com.kambr.parser.oney.json.dataClasses.FieldNames.FLIGHT_NUMBER
import com.kambr.parser.oney.json.dataClasses.FieldNames.LEG_DEPARTURE_DATE
import com.kambr.parser.oney.json.dataClasses.FieldNames.OPERATING_SUFFIX
import com.kambr.parser.oney.json.dataClasses.FieldNames.OVER_NIGHTS
import com.kambr.parser.oney.json.dataClasses.FieldNames.SERVICE_TYPE
import com.kambr.parser.oney.json.generated.JSONBaseVisitor
import com.kambr.parser.oney.json.generated.JSONParser
import com.kambr.parser.oney.json.generated.JSONParser.ArrayContext
import com.kambr.parser.oney.json.generated.JSONParser.JsonContext
import com.kambr.parser.oney.json.generated.JSONParser.ObjectContext
import com.kambr.parser.oney.json.generated.JSONParser.PairContext
import com.kambr.parser.oney.json.generated.JSONParser.ValueContext
import org.antlr.v4.runtime.tree.TerminalNode
import java.time.LocalDate
import java.time.LocalDateTime

class LegDataVisitor : JSONBaseVisitor<Any>() {

    override fun visitJson(ctx: JsonContext): List<Any> {
        var legDataList = mutableListOf<Any>()
        ctx.children.forEach { child ->
            when (child) {
                is ValueContext -> legDataList.add(visitValue(child))
                !is TerminalNode -> throw RuntimeException(
                    "Unexpected children of JsonContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                )
            }
        }
        return legDataList
    }

    override fun visitObject(ctx: ObjectContext): Any {

        var legDepartureDate: LocalDate
        var carrierCode: String
        var operatingSuffix: String
        var flightNumber: Int
        var departureStation: String?
        var arrivalStation: String?
        var departureTime: LocalDateTime?
        var arrivalTime: LocalDateTime?
        var overNights: Int?
        var serviceType: String?
        var equipmentVersion: String?
        var baseCurrencyCode: String?
        var aircraftSaleableCapacity: Int?
        var aircraftAuthorizedCapacity: Int?
        var cabinDetails: CabinDetails?
        var blockSpaceDetails: BlockSpaceDetails?
        var codeShareBlock: String
        var protectedSeats: String
        var cabinCode: String
        var cabinSaleableCapacity: Int
        var cabinAuthorizedCapacity: Int
        var cabinBlock: String

        val pairs = mutableListOf<Pair<String, ValueContext>>()
        ctx.children.forEach { child ->
            when (child) {
                is PairContext -> pairs.add(visitPair(child))
                !is TerminalNode -> {
                    throw RuntimeException(
                        "Unexpected children of JsonContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
                    )
                }
            }
        }

        pairs.forEach { pair ->
            when (pair.first) {

                LEG_DEPARTURE_DATE.value -> legDepartureDate = visitValue(pair.second).toLocalDate()
                CARRIER_CODE.value -> carrierCode = visitValue(pair.second).toString()
                OPERATING_SUFFIX.value -> operatingSuffix = visitValue(pair.second).toString()
                FLIGHT_NUMBER.value -> flightNumber = visitValue(pair.second).toInteger()
                DEPARTURE_STATION.value -> departureStation = visitValue(pair.second).toString()
                ARRIVAL_STATION.value -> arrivalStation = visitValue(pair.second).toString()
                DEPARTURE_TIME.value -> departureTime = visitValue(pair.second).toLocalDateTime()
                ARRIVAL_TIME.value -> arrivalTime = visitValue(pair.second).toLocalDateTime()
                OVER_NIGHTS.value -> overNights = visitValue(pair.second).toInteger()
                SERVICE_TYPE.value -> serviceType = visitValue(pair.second).toString()
                EQUIPMENT_VERSION.value -> equipmentVersion = visitValue(pair.second).toString()
                BASE_CURRENCY_CODE.value -> baseCurrencyCode = visitValue(pair.second).toString()
                AIRCRAFT_SALEABLE_CAPACITY.value -> aircraftSaleableCapacity = visitValue(pair.second).toInteger()
                AIRCRAFT_AUTHORIZED_CAPACITY.value -> aircraftAuthorizedCapacity = visitValue(pair.second).toInteger()
                // CABIN_DETAILS.value -> cabinDetails = visitValue(pair.second) //visitCabinDetails(pair.second)
                // BLOCK_SPACE_DETAILS.value -> blockSpaceDetails = pair.second
                // CODE_SHARE_BLOCK.value ->
                //     ,
                // PROTECTED_SEATS.value ->
                //     CABIN_CODE.value
                // ->
                //     ,
                // CABIN_SALEABLE_CAPACITY.value ->
                //     ,
                // CABIN_AUTHORIZED_CAPACITY.value ->
                //     ,
                // CABIN_BLOCK.value ->
            }
        }
        return Any()
    }

    /**
     * {@inheritDoc}
     *
     *
     * The default implementation returns the result of calling
     * [.visitChildren] on `ctx`.
     */
    override fun visitPair(ctx: PairContext): Pair<String, ValueContext> {
        return Pair(ctx.STRING().text, ctx.value())
    }

    /**
     * {@inheritDoc}
     *
     *
     * The default implementation returns the result of calling
     * [.visitChildren] on `ctx`.
     */
    override fun visitArray(ctx: ArrayContext?) {
        // return visitChildren(ctx)
    }

    override fun visitValue(ctx: ValueContext): Any {
        if (ctx.childCount != 1) throw RuntimeException("ValueContext must have 1 children, but it has: ${ctx.childCount}")
        return when (val child = ctx.getChild(0)) { // Value has only one child
            is ObjectContext -> visitObject(child)
            is ArrayContext -> visitArray(child)
            is TerminalNode -> {
                return child.symbol
            }
            else -> throw RuntimeException(
                "Unexpected children of JsonContext. Content is: ${child.text}\nParse tree: ${child.toStringTree()}"
            )

        }
    }
}