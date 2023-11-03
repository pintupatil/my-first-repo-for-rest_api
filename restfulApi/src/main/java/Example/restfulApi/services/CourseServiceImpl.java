package Example.restfulApi.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import Example.restfulApi.entities.Course;

@Service
public class CourseServiceImpl implements CourseService{
  
	List<Course> list;
	
	public CourseServiceImpl() {
		list=new ArrayList<>();
		list.add(new Course(101,"java","basic for all") );
		list.add(new Course(102,"Python","this course is for python enthusiast"));
		list.add(new Course (103,"React","React course for extremely beginners"));
		list.add(new Course(104,"dsa","great"));
	}
	
	@Override
	public List<Course> getCourses() {
		
		return list;
	}

	@Override
	public Course getCourseById(int courseId) {
		
		Course c=null;
		for(Course course:list) {
			if(course.getCourseId()==courseId) {
				
				c=course;
				break;
				
			}
				
	
			
			
		}
		
		
		
		
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}




	
}
