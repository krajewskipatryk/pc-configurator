package com.wisepc.wisepc.part.mapper;

import com.wisepc.wisepc.model.part.domain.Case;
import com.wisepc.wisepc.part.constants.Currency;
import com.wisepc.wisepc.part.request.CaseCreationRequest;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
class CaseMapperTest {
    @Autowired
    private CaseMapper caseMapper;

    @Test
    void caseCreationRequestToCase_whenCreationRequestGotAllValues_returnsMappedCase() {
        // GIVEN
        CaseCreationRequest caseCreationRequest = buildCaseCreationRequest();

        // WHEN
        Case mappedCase = caseMapper.caseCreationRequestToCase(caseCreationRequest);

        assertAll(
                () -> assertEquals(caseCreationRequest.getHeight(), mappedCase.getHeight()),
                () -> assertEquals(caseCreationRequest.getWidth(), mappedCase.getWidth()),
                () -> assertEquals(caseCreationRequest.getLength(), mappedCase.getLength()),
                () -> assertEquals(caseCreationRequest.getCurrency(), mappedCase.getCurrency()),
                () -> assertEquals(caseCreationRequest.getPrice(), mappedCase.getPrice()),
                () -> assertNull(mappedCase.getBrand()),
                () -> assertNull(mappedCase.getModel())
        );
    }

    private CaseCreationRequest buildCaseCreationRequest() {
        return new CaseCreationRequest(
                1L,
                1L,
                100,
                Currency.EUR,
                10,
                10,
                10
        );
    }
}