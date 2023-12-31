package com.example.learninggithubactions;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class TestClassTest {

    @Mock
    private TestClass testClass;

    @InjectMocks
    private TestClassTest tct;

    @Test
    void printy()
    {
        testClass.printy();
        verify(testClass).printy();
    }
}