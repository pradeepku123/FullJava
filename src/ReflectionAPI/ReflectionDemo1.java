package ReflectionAPI;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionDemo1 implements Cloneable,Serializable {
	public int a;
	public static String b;
	public final int c;
	public ReflectionDemo1(int a ,String b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	public static void main(String[] args) throws ClassNotFoundException {
		ReflectionDemo1 reflectionDemo=new ReflectionDemo1(2,"2nd Argumnt",25);
		Class objClass=reflectionDemo.getClass();
		Method[] methods = objClass.getSuperclass().getMethods();
		/*for(Method method:methods) {
		   System.out.println(method.getModifiers());
		    String modifierName = Modifier.toString(method.getModifiers());
		    System.out.println(modifierName);
		}
	        Class[] interfacesClass = objClass.getInterfaces();
	   
	        for(Class classobj:interfacesClass) {
	        	
	        	System.out.println(classobj.getSimpleName());
	        	
	        }*/
		Field[] declaredFields = objClass.getDeclaredFields();
		for(Field field:declaredFields) {
			String str=Modifier.toString(field.getModifiers());
			System.out.println(str);
		}
	}

}
