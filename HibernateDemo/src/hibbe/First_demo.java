package hibbe;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity

@Table(name="qafox")
public class First_demo {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="sub")
	private String sub;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSub() {
		return sub;
	}

	public void setSub(String sub) {
		this.sub = sub;
	}

	public First_demo(int id, String name, String sub) { 
		this.id = id;
		this.name = name;
		this.sub = sub;
	}

	@Override
	public String toString() {
		return "First_demo [id=" + id + ", name=" + name + ", sub=" + sub + "]";
	}

}
