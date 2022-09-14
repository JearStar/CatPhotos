package io.javabrains.courseapidata.course;

import io.javabrains.courseapidata.topic.Topic;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<Course, String> {
    public List<Course> findByTopicId(String topicId);

}
