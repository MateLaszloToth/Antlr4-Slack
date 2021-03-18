package com.kambr.parser.oney.xml

import java.io.ByteArrayInputStream
import java.io.File
import java.io.InputStream
import javax.xml.XMLConstants
import javax.xml.bind.JAXBContext
import javax.xml.bind.Unmarshaller
import javax.xml.stream.XMLInputFactory
import javax.xml.transform.stream.StreamSource
import javax.xml.validation.SchemaFactory

object JAXBMiscellaneous {

    /**
     * Pribas sends multiple xml root elements in one file. Each line is an xml root element.
     * Solution: Read line by line and parse line by line.
     */
    fun getObjectFromFileWithXMLRootElementOnEachLine(xmlFilePath: String, clazz: Class<*>): List<Any> {
        val xmlInputFactory = XMLInputFactory.newInstance()
        xmlInputFactory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false)
        xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false)
        val unmarshaller = getUnmarshallerByClass(clazz, validateSchema = false)
        val xmlObjects = mutableListOf<Any>()
        File(xmlFilePath).bufferedReader().forEachLine { line ->
            val xmlStreamReader = xmlInputFactory.createXMLStreamReader(ByteArrayInputStream(line.toByteArray()))
            xmlObjects.add(unmarshaller.unmarshal(xmlStreamReader))
        }
        return xmlObjects
    }

    fun getObjectFromXML(xmlFilePath: String, clazz: Class<*>): Any {
        val xmlInputFactory = XMLInputFactory.newInstance()
        xmlInputFactory.setProperty(XMLInputFactory.IS_SUPPORTING_EXTERNAL_ENTITIES, false)
        xmlInputFactory.setProperty(XMLInputFactory.SUPPORT_DTD, false)
        val xmlStreamReader =
            xmlInputFactory.createXMLStreamReader(File(xmlFilePath).inputStream())
        val unmarshaller = getUnmarshallerByClass(clazz, validateSchema = true)
        return unmarshaller.unmarshal(xmlStreamReader)
    }

    private fun getUnmarshallerByClass(clazz: Class<*>, validateSchema: Boolean): Unmarshaller {
        val context: JAXBContext = JAXBContext.newInstance(clazz)
        val unmarshaller: Unmarshaller = context.createUnmarshaller()
        if (validateSchema) {
            val xsdFileName: String = getXSDFileName(clazz.simpleName)
            val xsdAsStream: InputStream = getXSDAsStream(xsdFileName)
            val schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI)
            val schema = schemaFactory.newSchema(StreamSource(xsdAsStream))
            unmarshaller.schema = schema
        }
        return unmarshaller
    }

    private fun getXSDAsStream(xsdFileName: String): InputStream {
        return javaClass.getResourceAsStream("/schemas/$xsdFileName")!!
    }

    private fun getXSDFileName(name: String): String {
        var simpleName = name
        if (simpleName.equals("Acknowledgement", ignoreCase = true)) {
            simpleName = "IATA$simpleName"
        }
        simpleName = simpleName.replace("IATA", "IATA_")
        simpleName += ".xsd"
        return simpleName
    }
}