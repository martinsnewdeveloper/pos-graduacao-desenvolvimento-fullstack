package fundamentos;
public class ClasseString {
    public static void main(String[] args) {
        String framework = "Spring Boot";

        System.out.println(framework.length());
        System.out.println("Framework: ".concat(framework));
        System.out.println(framework.equals("Spring Boot"));
        System.out.println(framework.contains("Spring"));
        System.out.println(framework.replaceAll("Boot", "Java"));
    }
}
