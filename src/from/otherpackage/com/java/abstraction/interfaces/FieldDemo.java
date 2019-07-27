package from.otherpackage.com.java.abstraction.interfaces;
interface FieldDemo
{
	int i = 0;
	//By default, field is public, static and final

	//Following statements give compile time errors

	double d = 10;
	long l = 15;

	//You can't use any other modifiers other than public, static and final
}