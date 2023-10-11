package dev.belavirag.workshop.di;

import dev.belavirag.workshop.di.config.AppConfig;
import dev.belavirag.workshop.di.data_access.StudentDao;
import dev.belavirag.workshop.di.util.UserInputService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);

        UserInputService inputService = context.getBean(UserInputService.class);

        System.out.println(inputService.getString());
        System.out.println(inputService.getInt());
    }
}