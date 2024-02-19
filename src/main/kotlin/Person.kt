package org.sh.samples

import com.fasterxml.jackson.annotation.JsonCreator
import java.beans.ConstructorProperties

data class Person
//@JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
//@ConstructorProperties(
//    "name",
//    "age",
//    "city"
//)
constructor(val name: String, val age: Int, val city: String)
