package com.srccodes.example;

public class DomainObject {
	
	public DomainObject (String name)	{
		_name = name;
	};

	public DomainObject ()	{};

	public String name ()	{
		return _name;
	};

	public String toString() {
		return _name;
	};

	protected String _name = "no name";
}
