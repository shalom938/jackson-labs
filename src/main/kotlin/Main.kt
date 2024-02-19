package org.sh.samples

import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.ObjectMapper


fun main() {

    val jsonAsString = "{\"name\":\"John\",\"age\":30,\"city\":\"New York\"}"

    try {
        val objectMapper = ObjectMapper()
        val jsonNode: JsonNode = objectMapper.readTree(jsonAsString)

        try {
            //this will not work because Person doesn't have a default constructor and needs JsonCreator
            val person: Person = objectMapper.treeToValue(jsonNode, Person::class.java)
            println("Deserialized Person object: $person")
        }catch (e:Exception){
            e.printStackTrace()
        }


        try {
            //this will work because PersonClass has default constructor , but the properties must be initialized
            // when declared
            val person: PersonClass = objectMapper.treeToValue(jsonNode, PersonClass::class.java)
            println("Deserialized Person object: $person")
        }catch (e:Exception){
            e.printStackTrace()
        }



    } catch (e: Exception) {
        e.printStackTrace()
    }

}