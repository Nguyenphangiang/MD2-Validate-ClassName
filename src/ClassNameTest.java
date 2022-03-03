public class ClassNameTest {
   private static ClassName className;

   private static final String[] validClassName = new String[]{"C1221H","C0318G","P2211K"};
   private static final String[] inValidClassName = new String[]{"M1221H1","P0318G","P211K","C2222X"};

    public static void main(String[] args) {
        className = new ClassName();
        for(String name : validClassName){
            boolean isvalid = ClassName.validate(name);
            System.out.println("Class name: " + name + " is valid : " + isvalid);
        }
        for (String name : inValidClassName){
            boolean isvalid = ClassName.validate(name);
            System.out.println("Class name: " + name + " is valid : " + isvalid);
        }
    }
}
