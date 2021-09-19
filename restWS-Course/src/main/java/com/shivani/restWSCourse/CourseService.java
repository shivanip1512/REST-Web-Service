package com.shivani.restWSCourse;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import com.shivani.restWSCourse.Model.Course;

@Path("/courseService")
public interface CourseService {

	@Path("/listCourses")
	@GET
	List<Course> getcourses();
}
