package ru.pinchuk;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ru.pinchuk.models.Student;
import ru.pinchuk.models.enums.Subject;

import java.util.Map;

public class JillBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

        if (bean instanceof Student student && "Jil".equals(student.getName()) && !student.isEnrolled()) {
            Map<Subject, Integer> grades = student.getGrades();
            grades.entrySet().stream()
                    .filter(empty -> empty.getValue() < 3)
                    .forEach(empty -> grades.put(empty.getKey(), 5));
            System.out.println("BeanPostProcessor");
        }

        return bean;
    }
}
