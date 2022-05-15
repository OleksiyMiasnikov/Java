package com.tasks5.command;

public class Application {

	public static void main(String[] args) {

	if (args == null) {
		System.out.println("Error");
	} else if (args.length == 1 && args[0].equals("help")){
		new Help().execute();
	} else if (args.length == 2 && args[0].equals("date") && args[1].equals("now")){
		new DateNow().execute();
	} else if (args.length == 1 && args[0].equals("exit")){
		new Exit().execute();
	} else if (args.length ==2 && args[0].equals("echo") && args[1] != null) {
		new Echo(args[1]).execute();		
	} else {
		System.out.println("Error");
	}
	}
}
