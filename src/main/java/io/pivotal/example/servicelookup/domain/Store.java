package io.pivotal.example.servicelookup.domain;


/**
 * Entity to represent a {@link Store}.
 * 
 * @author Oliver Gierke
 */
public class Store {

	private String id;
	private String name;
	private String address;

	public Store(String name, String address) {

		this.name = name;
		this.address = address;
		this.id = null;
	}

	protected Store() {

		this.id = null;
		this.name = null;
		this.address = null;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", address=" + address
				+ "]";
	}
}