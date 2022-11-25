package com.fernando.testspock

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class TestSpec extends Specification {

    def "meu teste"() {
        expect:
            2 + 2 == 4
    }

}