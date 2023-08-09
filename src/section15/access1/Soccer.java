package section15.access1;

public class Soccer implements Cloneable {
	
	public String team;
	public String location;
	public int since;
	public String league;
	
	public Soccer(
		String team,
		String location,
		String league,
		int since)
	{
		this.league = league;
		this.location= location;
		this.since= since;
		this.team= team;
		
	}
	
	@Override
	public String toString() { // toString 주소값
		return team + "@" + league;
	}
	
	@Override //implements Cloneable 상속 받아야 가능 하기 때문에! 오버라이딩 일때 protected 접근제한자 바꾸지말고 한번 더 감싸기 
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	//protected 접근제한자 이기 때문에,
	public Object callclon()throws CloneNotSupportedException {
		return clone();
	}
}

