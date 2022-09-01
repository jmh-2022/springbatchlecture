package io.springbatch.springbatchlecture;

import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.JobParametersIncrementer;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CustoJobParametersIncrementer implements JobParametersIncrementer {
    @Override
    public JobParameters getNext(JobParameters parameters) {

        String id = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss"));

        return new JobParametersBuilder().addString("run.id",id).toJobParameters();
    }
}
