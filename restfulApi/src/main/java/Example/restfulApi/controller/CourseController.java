package Example.restfulApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import Example.restfulApi.entities.Course;
import Example.restfulApi.services.CourseService;

@RestController
public class CourseController {
	
    @Autowired
	CourseService courseService;
	
	@GetMapping("/hello")
	public String disp() {
		
		return "Hello world";
	}
	
	@GetMapping("/getAllCourses")
	public List<Course> getCourses(){
		return this.courseService.getCourses();
	}
	
	@GetMapping("/getAllCourses/{courseId}")
	public Course getCourseById(@PathVariable int courseId) {
		
	   return this.courseService.getCourseById(courseId);
	}
	@PostMapping("/addCourse")
	public Course addCourse(@RequestBody Course course) {
		
		return this.courseService.addCourse(course);
	}
	@DeleteMapping("/deleteCourse/{courseIdForDelete}")
	public void deleteCourse(@PathVariable int courseIdForDelete) {
		
		return;
	}
	
}
