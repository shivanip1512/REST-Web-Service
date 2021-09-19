package com.shivani.restWSCourse;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

import com.shivani.restWSCourse.Model.Course;

@Path("/courseService")
public interface CourseService {

	@Path("/listCourses")
	@GET
	List<Course> getcourses();
	
	@Path("/updateCourse")
	@PUT
	Response updateCourse(Course course);
	
	@Path("/addCourse")
	@POST
	Response createCourse(Course course);
	
	@Path("/removeCourse/{id}")
	@DELETE
	Response deleteCourse(@PathParam("id")Integer id);
}
