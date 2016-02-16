package kyorugi

import grails.test.mixin.TestFor
import spock.lang.Specification
import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*
import org.apache.Integration
@Rollback
@TestFor(Dojang)
class DojangSpec_02 extends Specification {

    void setupData() {
        new Dojang(name: 'Red Phoenix').save(flush: true)
    }

    void "test something"() {
        given:
        setupData()

        expect:
        Dojang.count() == 1
    }



}
