package Example.restfulApi.services;

import java.util.List;

import Example.restfulApi.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();
    public Course getCourseById(int courseId);
    public Course addCourse(Course course);
   

}
