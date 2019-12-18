package com.jihe;

import java.util.*;
import java.util.stream.Collectors;

public class PersonModel_Stream_test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List<PersonModel> list=new ArrayList<>();
		PersonModel p1=new PersonModel("wang yu",18,"男");
		PersonModel p2=new PersonModel("zhang san",20,"男");
		PersonModel p3=new PersonModel("li si",22,"女");
		PersonModel p4=new PersonModel("zhao qiao",28,"男");
		list=Arrays.asList(p1,p2,p3,p4);
		
		//old
		for (PersonModel pm : list) {
			System.out.println(pm.getName());
		}
		
		//new1
		List<String> list2=list.stream().map(a->a.getName()).collect(Collectors.toList());
		System.out.println(list2);
		
		//new2
		List<String> list3=list.stream().map(PersonModel::getName).collect(Collectors.toList());
		System.out.println(list3);
		
		//new3
		List<String> list4=list.stream().map(a->
		{
			return a.getName();
		}).collect(Collectors.toList());
		System.out.println(list4);
	}

}
