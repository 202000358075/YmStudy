package main;

public class Person {
	Command command; // ������ž������������

	public void setCommand(Command command) {
		this.command = command;
	}
	public void open() {
		// �þ�������ִ��open()����
		command.open();
	}
	public void close() {
		// �þ�������ִ��close()����
		command.close();
	}
}
