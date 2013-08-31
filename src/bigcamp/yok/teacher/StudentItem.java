package bigcamp.yok.teacher;

public class StudentItem {
	
	int id; 
	int group; 
	int status; 
	String name; 
	Avatar avatar; 
	
	public StudentItem(int id, int group, int status, String name, Avatar avatar){
		this.id = id; 
		this.group = group;
		this.status = status; 
		this.name = name; 
		this.avatar = avatar; 
	}
	
	public StudentItem(int id, int group, int status, String name){
		this.id = id; 
		this.group = group;
		this.status = status; 
		this.name = name; 
		this.avatar = null;  
	}
	
	public int getId(){
		return this.id; 
	}
	
	public int getGroup(){
		return this.group;
	}
	
	public int getStatus(){
		return this.status;
	}
	
	public String getName(){
		return this.name; 
	}
	
	public Avatar getAvatar(){
		return this.avatar; 
	}
	
	
}
