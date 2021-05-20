package com.rana.test.geekseat;


import com.rana.test.geekseat.model.VillagerData;
import com.rana.test.geekseat.service.TestService;
import com.rana.test.geekseat.service.impl.TestServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


@RunWith(SpringRunner.class)

public class GeekseatApplicationTests {

	 @TestConfiguration
    static class ControllerTestContextConfiguration {
        @Bean
        public TestService testService() {
            return new TestServiceImpl();
        }
    }

    @Autowired
    private TestService testService;
    @Before
    public void setUp() {
        VillagerData data1 = new VillagerData(-1,12);
        VillagerData data2 = new VillagerData(10,12);
        VillagerData data3 = new VillagerData(13,17);

        List<VillagerData> allData = Arrays.asList(data1, data2, data3);

        Mockito.when(testService.findKillPeople(data1)).thenReturn(String.valueOf(-1));
        Mockito.when(testService.findKillPeople(data2)).thenReturn(String.valueOf(2));
        Mockito.when(testService.findKillPeople(data3)).thenReturn(String.valueOf(4.5));

    }

    @Test
    public void whenValidData() {
        VillagerData data1 = new VillagerData(10,12);
        VillagerData data2 = new VillagerData(13,17);
        String found = testService.findKillPeople(data2);

        assertThat(found).isEqualTo(2);
    }

    @Test
    public void whenInvalidData() {
        VillagerData data = new VillagerData(-1,17);
        String found = testService.findKillPeople(data);

        assertThat(found).isEqualTo(-1);
    }
}
