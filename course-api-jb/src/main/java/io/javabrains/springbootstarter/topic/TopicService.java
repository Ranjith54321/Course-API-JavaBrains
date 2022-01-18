package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
//	private  List<Topic> topics = Arrays.asList(
//	new Topic("spring","Spring Framework","Spring Framework Description"),
//	new Topic("java","Core java","Core java Description"),
//	new Topic("javascript","javascript","javascript Description Ranjith_dot")
//			); 
	
	// if you want to edit or delete the topics List you can't because we used Arrays.asList. It is immutable.
				//  So now we converted to ArrayList. Now it is mutable list.
	private  List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("spring","Spring Framework","Spring Framework Description"),
			new Topic("java","Core java","Core java Description"),
			new Topic("javascript","javascript","javascript Description Ranjith_dot")
					)); 
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	public Topic getTopic(String id) {
		// 1. normal approach
		for(Topic t : topics) {
			if(t.getId().equals(id))
				return t;
		}
		return null;
		
		// 2. using Stream and Lambda expressions
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get(); // have to learn the Stream and Lambda expression
	}
	
	public void addTopic(Topic topic) {
		topics.add(topic);
	}

	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++) { // here it is ArrayList
			if(topics.get(i).getId().equals(id)) {
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id) {
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().equals(id)) {
				topics.remove(i);
			}
		}
	}
}
