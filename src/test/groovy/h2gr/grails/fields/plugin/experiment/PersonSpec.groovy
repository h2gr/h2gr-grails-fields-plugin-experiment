package h2gr.grails.fields.plugin.experiment

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PersonSpec extends Specification implements DomainUnitTest<Person> {

    def setup() {
    }

    def cleanup() {
    }

    void "test person name"() {
        def person = new Person(name:'h2gr')

        expect:
        assert person.name == 'h2gr'
        assert person.name instanceof String
    }

}
