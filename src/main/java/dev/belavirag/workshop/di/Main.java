package dev.belavirag.workshop.di;

import dev.belavirag.workshop.di.config.ComponentScanConfig;
import dev.belavirag.workshop.di.data_access.StudentDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ComponentScanConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
    }
}