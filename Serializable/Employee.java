/*一个类的对象要想序列化成功，必须满足两个条件：

该类必须实现 java.io.Serializable 对象。

该类的所有属性必须是可序列化的。如果有一个属性不是可序列化的，则该属性必须注明是短暂的。

如果你想知道一个Java标准类是否是可序列化的，请查看该类的文档。

检验一个类的实例是否能序列化十分简单， 

只需要查看该类有没有实现java.io.Serializable接口。 */


/*
 * 定义可序列化实体类
 */
package Serializable;
//实现java.io.Serializable接口
public class Employee implements java.io.Serializable{
	/**
	 * 每个序列化对象都会分配相应serialVersionUID（序列化编号）
	 */
	private static final long serialVersionUID = 1L;
	public String name;
	public String address;
	//注明SSN属性为短暂的，不可序列化
	public transient int SSN;
	public int number;
	public void mailCheck()
	{
		System.out.println("Mailing a check to "+ name +" "+address);
	}
}
