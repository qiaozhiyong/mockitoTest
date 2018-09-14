package com.example.mockito;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Test3 {
    @Mock
    private List mockList;
    @Test
    public void shorthand(){
        mockList.add(1);
        verify(mockList).add(1);
    }
}
