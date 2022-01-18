package io.javabrains.springbootstarter.topic;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService; // while reading this file based on the registry value in the container based on the class path scan it will give the instance.
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		return topicService.getAllTopics();
		// ---- 1. simple implementation ----- 
//		return Arrays.asList(
//			new Topic("spring","Spring Framework","Spring Framework Description"),
//			new Topic("java","Core java","Core java Description"),
//			new Topic("javascript","javascript","javascript Description")
//		); // the Spring frame work will automatically converts the  object data into JSON formate
		
//		List<Topic> list = new ArrayList<Topic>();
//		list.add(new Topic("spring","Spring Framework","Spring Framework Description ArrayList"));
//		list.add(new Topic("java","Core java","Core java Description"));
//		list.add(new Topic("javascript","javascript","javascript Description"));
//		return list; 
		
		// ------ 2. using services --------
		// Now we are using Service class to display the topics
	}
	
	// Get the course details based on the id parameter
	@RequestMapping("/topics/{id}") // here id is inside {} because that is dynamic not a static route
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	// Create the POST method to add new course
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	// Update operation 
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(topic,id);
	}
	
	// Delete Operation
	@RequestMapping(method=RequestMethod.DELETE, value="topics/{id}")
	public List<Topic> deleteTopic(@PathVariable String id){
		topicService.deleteTopic(id);
		return topicService.getAllTopics();
	}
	
}
