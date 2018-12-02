import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите поисковый знак (для выхода наберите [сТоп]):");
            String search = in.nextLine();

            if ( search.equals("сТоп") ){
                System.out.println("Программа закончена");
                break;
            }

            String text = "Очень много статей о Gradle написано. И со своей стороны хотелось бы добавить в копилку такую п" +
                    "ошаговую инструкцию, прочтение которой, я надеюсь, позволит тем, кто плохо знаком с Gradle, “распробов" +
                    "ать” и продолжить самостоятельно изучать этот инструмент." +
                    "Данная статья не будет подробно описывать такие темы, как плагины gradle (plugin), задачи (task), зави" +
                    "симости (dependencies), автоматическое тестирование и прочие прелести этого сборщика проектов. Во-перв" +
                    "ых, каждая тема заслуживает отдельной статьи или даже серии статей, а во-вторых, на эти темы уже есть " +
                    "статьи на хабре, например: Gradle: Tasks Are Code, Gradle: Better Way To Build. А еще на официальном с" +
                    "айте Gradle есть прекрасно написанный Gradle User Guide. Я же cфокусирую внимание на непосредственном " +
                    "решении поставленной задачи, и все сопутствующие темы будут описаны в рамках этой самой задачи." +
                    "Сначала определимся с целью, что же мы хотим получить на выходе? А цель указана в заголовке статьи. " +
                    "Мы хотим получить проект с несколькими модулями, который собирается с помощью Gradle. И так, приступим.";
            String[] textWithoutSpaces = text.split(" ");
            String result = "";
            for (String str : textWithoutSpaces) {
                result = result + str;
            }
            text = result.toLowerCase();
            if (text.contains(search)) {
                String[] array1 = text.split(search);
                //printStringArray(b);
                int length = array1.length - 1;
                System.out.println("[" + search + "] встречается в этом тексте " + length + " раз");
            } else {
                System.out.println("Не получилось :(");
            }
            System.out.println("[" + (text.indexOf(search) + 1) + "] - первое место этого знака");

        }
    }

    public static void printStringArray(String[] stringArray) {

        for (String str : stringArray) {
            System.out.println(str);
        }
    }
}
