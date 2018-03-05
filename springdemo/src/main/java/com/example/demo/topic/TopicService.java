package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	/**
	 * 
	 */
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("CD","Connected Dignostics","DA Dignostics"),
			new Topic("CSU","Connected Software Update","DA Sofware Update"),
			new Topic("FE","Fuel Extender"," DA Fuel Optimization")
	
			));
	/**
	 * 
	 * @return
	 */
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Topic getTopic(String id){
		
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
	/**
	 * 
	 * @param topic
	 */
	public void addTopic(Topic topic){		
		 topics.add(topic);
	}
	
}
