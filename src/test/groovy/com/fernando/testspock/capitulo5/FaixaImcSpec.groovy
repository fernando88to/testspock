package com.fernando.testspock.capitulo5

import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification
import spock.lang.Unroll

@SpringBootTest
class FaixaImcSpec extends Specification {

    def 'IMC deve estar na faixa correta'() {
        expect:
            FaixaImc.getFaixa(18, Sexo.FEMININO) == FaixaImc.ABAIXO
            FaixaImc.getFaixa(21, Sexo.FEMININO) == FaixaImc.NORMAL
    }

    def 'IMC deve estar na faixa correta com Data Driven Testing'() {
        expect:
            FaixaImc.getFaixa(imc, sexo) == resultado
        where:
            imc | sexo          || resultado
            18  | Sexo.FEMININO || FaixaImc.ABAIXO
            21  | Sexo.FEMININO || FaixaImc.NORMAL
            18  | Sexo.FEMININO || FaixaImc.NORMAL


    }

    @Unroll
    def 'IMC #imc deve estar na faixa #resultado para o sexo #sexo com Data Driven Testing e unrol'() {
        expect:
            FaixaImc.getFaixa(imc, sexo) == resultado
        where:
            imc | sexo          || resultado
            18  | Sexo.FEMININO || FaixaImc.ABAIXO
            21  | Sexo.FEMININO || FaixaImc.NORMAL
            18  | Sexo.FEMININO || FaixaImc.NORMAL


    }
}
