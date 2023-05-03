 // https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/StringBuilder.html
 class StringBuilderDemo {

    
    public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();

        System.out.println(stringBuilder.capacity());

        stringBuilder.append("Hello");

        stringBuilder.deleteCharAt(1);
        stringBuilder.insert(1,'A');

        stringBuilder.reverse();

        System.out.println(stringBuilder);
        System.out.println(stringBuilder.capacity());
    }
}
