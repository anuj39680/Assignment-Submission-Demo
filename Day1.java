/*
1. Mention the difference between interpreter and compiler. 

Ans:- 
Interpreter--->
1) Interpreter scan line by line programe and convert into machine code. 
2) Interpreter takes very less time to analyze the source code.
3) Execution time is comparatively slower than compiler.

Compiler--->
1) Compiler scans the entire program and convert whole of it into machine code at once. 
2) Compiler takes more time to analyze the source code.
3) Execution time is comparatively faster than interpreter.

*/

/*
2. Define a class Student with following members:
int roll, String name, float marks.
input() to take input of the details
display() to all details of a student.
Write a program to which will store details of a student and print the details using the above
*/

class Test{
		int rollno;
		String name;
		float marks;
		void display() {
		System.out.println("Student Name = "+name);
		System.out.println("Student Rollno = "+rollno);
		System.out.println("Student's Marks  = "+marks);
	}
}

class Student{
	public static void main(String[] args) {
		Test obj=new Test();
		obj.rollno=101;
		obj.name="Anuj kumar Singh";
		obj.marks=75.6f;
		obj.display();
	}
}