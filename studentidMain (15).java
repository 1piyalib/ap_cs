class Main {
  public static void main(String[] args){
    StudentID SD = new StudentID();
    System.out.println(SD.toString());
    SD.setFirstName("Ada");
    SD.setLastName("Lovelace");
    SD.setStudentId(223344);
    //StudentID SD1 = new StudentID("Ada", "Lovelace", 223344);
    System.out.println(SD.toString());

    StudentID SD1 = new StudentID("Buzz","Lightyear",123456);
    System.out.println(SD1.toString());
    System.out.print(SD1.getFirstName()+" "+SD1.getLastName()+" ID = "+SD1.getStudentId()+" "+SD1.getPassword());
      
  }
}