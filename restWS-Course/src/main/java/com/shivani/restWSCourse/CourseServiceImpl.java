package com.shivani.restWSCourse;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

}
