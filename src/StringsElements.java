public class StringsElements {
    public static void main(String[] args) {
        String s1 = "Testando String"; // String aqui no JAVA é classe
        System.out.println(s1);
        System.out.println(s1.charAt(2));
        System.out.println(s1.chars());
        System.out.println(s1.contains(" "));
        s1.replace("Testando", "AAAAAAAAA");
        s1.replace("T", "aaa");
        System.out.println(s1);
        System.out.println(s1.indexOf("s"));
        
        

    }
}
