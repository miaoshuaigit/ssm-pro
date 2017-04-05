package com.westear.ssm.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.westear.ssm.model.Book;
import com.westear.ssm.util.cache.GenericsUtils;

public class GenericsUtilsTest extends BaseTest<Book> {
	
	//private HashSet<Map<String,Book>> bookSet; //不支持嵌套泛型
	private Set<Book> bookSet;
	
	public Set<Book> getBookSet() {
		return bookSet;
	}

	public void setBookSet(Set<Book> bookSet) {
		this.bookSet = new HashSet<Book>(bookSet);
	}

	public Map<String, Object> getModel(Book book){
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}
	
	public Map<String, Object> getModel(List<Book> booklist){
		Map<String, Object> map = new HashMap<String, Object>();
		return map;
	}
	
	public static void main(String[] args){
		Class c = GenericsUtils.getSuperClassGenricType(GenericsUtilsTest.class);
		System.out.println(c);
		System.out.println("========================================");
		
		GenericsUtilsTest genericsUtilsTest = new GenericsUtilsTest();
		Method[] methods = genericsUtilsTest.getClass().getDeclaredMethods();
		for(Method m : methods){
			System.out.println(m);
		}
		
		try {
			Class [] params = new Class[]{Book.class};
			Method method = genericsUtilsTest.getClass().getDeclaredMethod("getModel", params);
			Class z1 = GenericsUtils.getMethodGenericReturnType(method, 0);
			Class z2 = GenericsUtils.getMethodGenericReturnType(method, 1);
			System.out.println(z1 + "," + z2);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("========================================");
		
		try {
			Method method2 = GenericsUtilsTest.class.getDeclaredMethod("getModel", new Class[]{List.class});
			List<Class> ps = GenericsUtils.getMethodGenericParameterTypes(method2);
			for(Class p : ps){
				System.out.print(p + " ");
			}
			System.out.println();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("========================================");
		
		Field[] fields = GenericsUtilsTest.class.getDeclaredFields();
		for(Field field : fields){
			System.out.println(field);
		}
		Class f = GenericsUtils.getFieldGenericType(fields[0]);
		System.out.println(f);
	}
}
