package create.model;

import java.util.ArrayList;

public class CreateModel 
{
	ArrayList topicList = new ArrayList();
	private String BuildList;

	public boolean Buildlist(boolean BuildList)
	{
	// The topic's should be changed to something relevant to the project
	topicList.add("Potato");
	topicList.add("Chinese Food");
	topicList.add("Indian Food");
	topicList.add("Mexican Food");
	topicList.add("Cheese Burger");
	topicList.add("7");
	
	topicList.get(3);
	
	return BuildList;
	}
}
