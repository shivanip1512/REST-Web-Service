package com.shivani.restWSCourse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ws.rs.core.Response;

import org.springframework.stereotype.Service;

import com.shivani.restWSCourse.Model.Course;

@Service
public class CourseServiceImpl implements CourseService {

	Map<Integer, Course> courses = new HashMap<>();
	Integer CourseId = 100;

	public CourseServiceImpl() {
		Course course = new Course();
		course.setId(CourseId);
		course.setName("DSA");
		course.setPrice(100.5);
		course.setTaughtBy("Ravula");
		course.setRating(10);
		courses.put(CourseId, course);
	}

	@Override
	public List<Course> getcourses() {
		Collection<Course> res = courses.values();
		ArrayList<Course> courseList = new ArrayList<>(res);
		return courseList;
	}

	@Override
	public Response updateCourse(Course course) {
		boolean courseExist = courses.get(course.getId()) != null;
		Response response;
		if (courseExist) {
			Course updateCourse = new Course();
			updateCourse.setId(course.getId());
			updateCourse.setName(course.getName());
			updateCourse.setPrice(course.getPrice());
			updateCourse.setRating(course.getRating());
			updateCourse.setTaughtBy(course.getTaughtBy());
			courses.put(course.getId(), updateCourse);
			response = Response.ok().build();
		} else {
			response = Response.notModified().build();
		}
		return response;
	}

	@Override
	public Response createCourse(Course course) {
		Course newCourse = new Course();
		newCourse.setId(++CourseId);
		newCourse.setName(course.getName());
		newCourse.setPrice(course.getPrice());
		newCourse.setRating(course.getRating());
		newCourse.setTaughtBy(course.getTaughtBy());
		courses.put(CourseId, newCourse);
		return Response.ok(course).build();
	}

	@Override
	public Response deleteCourse(Integer id) {
		boolean courseExists = courses.get(id) != null;
		Response response;
		if(courseExists) {
			courses.remove(id);
			response = Response.ok().build();
		}else {
			response = Response.notModified().build();
		}
		return response;
	}

}
