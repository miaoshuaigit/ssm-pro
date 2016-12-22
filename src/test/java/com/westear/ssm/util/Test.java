package com.westear.ssm.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.List;

import com.westear.ssm.model.Book;

/**
 * @author westear
 *
 */
public class Test {

	public static void main(String[] args){
		
		
		
		System.out.println("================================");
		List<Book> booklist = new ArrayList<Book>();
		Class c = booklist.getClass();
		System.out.println(c);
		Type[] types = c.getGenericInterfaces();
		for(Type t : types){
			System.out.println(t);
			if(t instanceof ParameterizedType){
				ParameterizedType ptype = (ParameterizedType) t;
				for(Type type : ptype.getActualTypeArguments()){
					System.out.println(type);
					System.out.println(type instanceof TypeVariable);
					if(type instanceof TypeVariable){
						TypeVariable vtype = (TypeVariable)type;
						System.out.println(vtype.getGenericDeclaration());
					}
				}
				break;
			}
		}
		System.out.println("================================");
		if(booklist.size() <= 0){
			Class clazz = booklist.getClass();
			Constructor[] constructors = clazz.getDeclaredConstructors();
			for(Constructor cons : constructors){
				System.out.println(cons);
				Class[] paramTypes = cons.getParameterTypes();
				for(Class cc : paramTypes){
					System.out.println(cc);
				}
			}
		}
		System.out.println("================================");
		
		Class z = booklist.getClass();
		Type[] typess = z.getGenericInterfaces();
		for(Type t : typess){
			System.out.println(t);
			if(t instanceof ParameterizedType){
				ParameterizedType pt = (ParameterizedType) t;
				System.out.println(pt.getRawType());
				for(Type tt : pt.getActualTypeArguments()){
					System.out.println(tt);
					if(tt instanceof TypeVariable){
						TypeVariable vt = (TypeVariable) tt;
					}
				}
				break;
			}
		}
	}
	
}
