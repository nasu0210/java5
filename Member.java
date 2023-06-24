package p0617_2;

public class Member {
	private String name;
	private String id;
	public Member() {
		System.out.println("Member()실행");
	}
	public Member(String id) {
		super();
		this.id = id;
	}
	public Member(String name, String id) {
		super();
		this.name = name;
		this.id = id;
		System.out.println("Member(String name, String id)실행");
	}
	public String getId() {return id;}

	
}
