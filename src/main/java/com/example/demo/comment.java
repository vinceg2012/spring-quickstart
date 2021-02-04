package com.example.demo;

import java.util.UUID;

import lombok.Getter;
import lombok.Setter;

public class comment {
	

	   public static void main(String[] args) {
		      // creating UUID
		      UUID uid = UUID.fromString("38400000-8cf0-11bd-b23e-10b96e4ef00d");
		      // checking the value of random UUID
		      System.out.println("Random UUID value: " + uid.randomUUID());
		   }

	@Getter @Setter private long id = this.id;
	@Getter @Setter private String name = "Vincent";
	@Getter @Setter private String comment = "comment";
	@Getter @Setter private String email = "email";
}
