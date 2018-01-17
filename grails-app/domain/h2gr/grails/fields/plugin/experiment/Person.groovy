package h2gr.grails.fields.plugin.experiment

/**
 * Domain class with a single property of type String, which we'll use
 * to test the Grails Fields Plugin.
 */
class Person {

    String name

    static constraints = {
        name    nullable:true, blank:false
    }

}
