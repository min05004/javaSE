package section19.access1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PokemonVO implements Serializable {
// 버전 정보를 표시.
	private String no;
	private String name;
	private String type;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
