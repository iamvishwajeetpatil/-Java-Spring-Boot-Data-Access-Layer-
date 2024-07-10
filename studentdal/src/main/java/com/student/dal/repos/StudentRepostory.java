package com.student.dal.repos;

import com.student.dal.entities.Student;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;

public interface StudentRepostory extends JpaAttributeConverter<Student, Long> {

}
