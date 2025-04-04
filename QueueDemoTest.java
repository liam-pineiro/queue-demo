package classAssignments;

public class QueueDemoTest {
	
	public static void main(String[] args) {
		QueueDemo queueDemo = new QueueDemo();
		queueDemo.pop();
		queueDemo.push(23);
		queueDemo.push(2);
		queueDemo.push(73);
		queueDemo.push(21);
		queueDemo.pop();
		queueDemo.pop();
		queueDemo.pop();
		queueDemo.pop();
	}
}
