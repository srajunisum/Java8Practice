import java.util.*;

public class Java8Tester {


   public static void main(String args[]) {

      int  a[] = {1,8,5,6,4,2,6};
      for (int i=0;i<a.length;i++){
         for (int j=i+1;j<a.length;j++){
            if (a[i]==a[j]){
               System.out.println("a[j] = " + a[j]);


            }
         }
      }

      List<String> names1 = new ArrayList<String>();
      names1.add("Mahesh ");
      names1.add("Suresh ");
      names1.add("Ramesh ");
      names1.add("Naresh ");
      names1.add("Kalpesh ");
		
      List<String> names2 = new ArrayList<String>();
      names2.add("Mahesh ");
      names2.add("Suresh ");
      names2.add("Ramesh ");
      names2.add("Naresh ");
      names2.add("Kalpesh ");

      // remove element from list

      for (String names: names1 ) {
         String nam = "Mahesh";
         if(names==nam){
            names1.remove(nam);
            System.out.println("names ================== " + names);
         }
      }

      names1.removeIf(i->i.contains("Mahesh"));
      System.out.println("names1 = " + names1);

		
      Java8Tester tester = new Java8Tester();
      System.out.println("Sort using Java 7 syntax: ");
		
      tester.sortUsingJava7(names1);
      System.out.println(names1);
      System.out.println("Sort using Java 8 syntax: ");
		
      tester.sortUsingJava8(names2);
      System.out.println(names2);

      EmployeeTest  employeeTest = new EmployeeTest("1","raju","hyd");
       EmployeeTest  employeeTest1 = employeeTest;
       EmployeeTest  employeeTest2 = employeeTest1;
       employeeTest2.setName("kumar");
       employeeTest2.setName("raj");
       System.out.println("employeeTest1 = " + employeeTest.getName());
       System.out.println("employeeTest2.getName() = " + employeeTest1.getName());
       System.out.println("employeeTest2 = " + employeeTest2.getName());


   }
   
   //sort using java 7
   private void sortUsingJava7(List<String> names) {   
      Collections.sort(names, new Comparator<String>() {
         @Override
         public int compare(String s1, String s2) {
            return s1.compareTo(s2);
         }
      });
   }
   
   //sort using java 8
   private void sortUsingJava8(List<String> names) {
      Collections.sort(names, (s1, s2) -> s1.compareTo(s2));
   }
}


/*  int a = 2/0;
      try {
         System.out.println("a = " + a);
      }catch (Exception e){
         try {
            System.out.println("a = " + a);
         }catch (Exception ex){

            try {
               System.out.println("a = " + a);
            }catch (Exception e){

            }
         }
      }*/