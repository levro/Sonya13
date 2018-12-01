public class Main {

    public static void main(String[] args) {

        String text = "Строка представляет собой последовательность символов. Для работы со строками в " +
                "Java определен класс String, который предоставляет ряд методов для манипуляции строками. " +
                "Физически объект String представляет собой ссылку на область в памяти, в которой размещены символы.";
        String search = ",";
        if (text.contains(search)) {
            String[] array1 = text.split(search);
            //printStringArray(b);
            int length = array1.length - 1;
            System.out.println("Ура! [" + search + "] встречается в этой строке " + length + " раз!");
        } else  {
            System.out.println("Не получилось :(");
        }
        System.out.println(text.indexOf(search));

    }

    public static void printStringArray (String[] stringArray){

        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
