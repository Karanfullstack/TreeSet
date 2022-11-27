import java.util.*;
class Student implements Comparable{
  int Roll;
  String Name;
  public Student(int Roll, String Name){
    this.Roll = Roll;
    this.Name = Name;
  }

  public int compareTo(Object O){ // for compare with TreeSet always...
      Student s = (Student) O;
  //return Name.compareTo(s.Name); // this predefined logic preferable for string value
    if(this.Roll == s.Roll) // this is custom logic
     return 0;
     else if(this.Roll < s.Roll)
     return -1;
     else
    return 1;
  }
  public String toString(){
    return Roll + "->> " + Name;
  }
}
class TreeSetDemo{
  public static void main(String[] args) {
 TreeSet<Student>College = new TreeSet<Student>();
 Student s1 = new Student(101,"Gita");
 Student s2 = new Student(102,"Karan");
 Student s3 = new Student(103,"Nikhl");
 Student s4 = new Student(104,"Alka");
 Student s5 = new Student(105,"Amit");

 College.add(s2);
 College.add(s1);
 College.add(s4);
 College.add(s5);
 College.add(s3);

 for(Student s:College)
 System.out.println(s);

    // TreeSet<Integer>tSet = new TreeSet<Integer>(); // it doesn't allow duplicate values and has sorted order way..
    // tSet.add(10);
    // tSet.add(9);
    // tSet.add(3);
    // tSet.add(1);
    // System.out.println(tSet);
    //
    // System.out.println("HeadSet");
    // TreeSet<Integer> header = (TreeSet<Integer>) tSet.headSet(10);
    // System.out.println(header);
    //
    // System.out.println("Tailor");
    // TreeSet<Integer> Tailor = (TreeSet<Integer>) tSet.tailSet(1);
    // System.out.println(Tailor);
    //
    // System.out.println("Head First");
    // System.out.println(tSet.first());
    //
    // System.out.println("Head Last");
    // System.out.println(tSet.last());
  }

}
