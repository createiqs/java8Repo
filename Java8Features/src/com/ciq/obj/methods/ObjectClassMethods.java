package com.ciq.obj.methods;

public class ObjectClassMethods {
	private int id;
	private String name;

	public ObjectClassMethods(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectClassMethods [id=" + id + ", name=" + name + "]";
	}

//	public int hashCode() {
//		return this.id;
//	}

//	public boolean equals(Object obj) {
//		if (this == obj) {
//			return true;
//		}
//		if (obj == null || getClass() != obj.getClass()) {
//			return false;
//		}
//		ObjectClassMethods acm = (ObjectClassMethods) obj;
//
//		return this.id == acm.id && this.name.equals(acm.name);
//
//	}
	
	
	

	public static void main(String[] args) {
		ObjectClassMethods obj1 = new ObjectClassMethods(1, "anil");
		ObjectClassMethods obj2 = new ObjectClassMethods(1, "anil");
		ObjectClassMethods obj3 = new ObjectClassMethods(2, "anil");
		ObjectClassMethods obj4 = obj3;
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
//		System.out.println(obj3.hashCode());
//		System.out.println(obj1 == obj3);
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(obj3.equals(obj4));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjectClassMethods other = (ObjectClassMethods) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
