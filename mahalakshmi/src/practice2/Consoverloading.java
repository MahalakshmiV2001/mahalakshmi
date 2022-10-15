package practice2;

public class Consoverloading {
	int rollno;
	String name;
	int mark;
	Consoverloading(){
		rollno=10;
		name="maha";
		mark=50;
	}
    Consoverloading(int rollno,String name, int mark)	{
	 this.rollno=rollno;
	 this.name=name;
	 this.mark=mark;
		}
    void display() {
    	System.out.println(rollno);
    	System.out.println(name);
    	System.out.println(mark);
    }
public static void main(String[] args) {
		// TODO Auto-generated method stub
	Consoverloading s=new Consoverloading();
	Consoverloading s1=new Consoverloading(100,"lakshmi",90);
	s.display();
	s1.display();
	}

}
