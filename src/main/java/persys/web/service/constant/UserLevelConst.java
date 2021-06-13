package persys.web.service.constant;

public enum UserLevelConst {
	
	ADMIN("admin", "001", "administrator");
	
	private String name;
	private String code;
	private String desc;
	
	private UserLevelConst(String name, String code, String desc) {
		this.name = name;
		this.code = code;
		this.desc = desc;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getCode() {
		return this.code;
	}
}
