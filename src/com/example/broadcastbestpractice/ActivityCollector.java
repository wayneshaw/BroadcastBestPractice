package com.example.broadcastbestpractice;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;

public class ActivityCollector {
	
	public static List<Activity> activities=new ArrayList<Activity>();
	
	
	public static void addActivity(Activity activity)
	{
		activities.add(activity);	
		
	}
	
	public static void removeActivity(Activity activity)
	{
		activities.remove(activity);
	}
	
	public static void finishAll()
	{
		for(Activity x:activities)
		{
			if(!x.isFinishing())
			{
				x.finish();
			}
		}
	}
	

}
