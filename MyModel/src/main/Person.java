package main;

public class Person {
	Command command; // 用来存放具体命令的引用

	public void setCommand(Command command) {
		this.command = command;
	}
	public void open() {
		// 让具体命令执行open()方法
		command.open();
	}
	public void close() {
		// 让具体命令执行close()方法
		command.close();
	}
}
