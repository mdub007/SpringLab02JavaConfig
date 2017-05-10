package com.oaktreeair.ffprogram;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Value;


public class Flier {
	
	@Value("Nitish Dubey")
	private String flierName;
	@Value("1234")
	private Long flierID;
	private ContactInfo contactInformation;
	private ArrayList<Segment> segments = new ArrayList<Segment>();
	public enum Level
	{
	Member, Gold, Platinum
	};
	private Level level;
	public String getFlierName() {
		return flierName;
	}
	public void setFlierName(String flierName) {
		this.flierName = flierName;
	}
	public Long getFlierID() {
		return flierID;
	}
	public void setFlierID(Long flierID) {
		this.flierID = flierID;
	}
	public ContactInfo getContactInformation() {
		return contactInformation;
	}
	public void setContactInformation(ContactInfo contactInfo) {
		this.contactInformation = contactInfo;
	}
	public Level getLevel() {
		return level;
	}
	public void setLevel(Level level) {
		this.level = level;
	}
	
	public ArrayList<Segment> getSegments() {
		return segments;
	}
	
	public void addSegment(Segment seg){
		segments.add(seg);
	}
	
	@Override
	public String toString() {
		return "Flier [flierName=" + flierName + ", flierID=" + flierID + ", contactInfo=" + contactInformation + ", level="
				+ level + "]";
	}
	
	
}
