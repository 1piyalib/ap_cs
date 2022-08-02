public class StudentID{
  private String studentFirstName;
  private String studentLastName;
  private int studentId;

  public StudentID(){
    studentFirstName = "First";
    studentLastName = "Last";
    studentId = 111111;
  }
  public StudentID(String initStudentFirstName, String initStudentLastName, int initStudentId){
    studentFirstName = initStudentFirstName;
    studentLastName = initStudentLastName;
    studentId = initStudentId;
  }
  public String getLastName(){
    return(studentLastName);
  }
  public String getFirstName(){
    return(studentFirstName);
  }
  public int getStudentId(){
    return(studentId);
  }
  public void setFirstName(String newFirstName){
       studentFirstName = newFirstName;
  }
  public void setLastName(String newLastName){
       studentLastName = newLastName;
  }
  public void setStudentId(int newStudentId){
       studentId = newStudentId;
  }
  public String getPassword(){
    String ans = "Password = "+studentLastName.substring(0,1) + String.valueOf(studentId) + 
    studentLastName.substring(studentLastName.length() -1);
    return(ans);

  }
  public String toString(){
    return("Name = "+studentFirstName+" "+studentLastName+" Student ID = "+studentId);
  }
}