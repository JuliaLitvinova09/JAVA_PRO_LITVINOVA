package homework7;

public class StringHelper {
    public String formatString(String inputStr, char[] inputCharArray) {
        //   1.1. Массив символов преобразовать в строку, предварительно
        //   проверив чтобы массив не был null.
        //   Если массив null, то выводим сообщение что массив null и выходим из метода;
        if (inputCharArray == null) {
            System.out.println("Input char array is null!");
            return "";
        }
        String strFromArray = String.valueOf(inputCharArray);
        //   1.2. Выполнить проверку не пустые ли эти строки(если строка состоит из пробелов,
        //   табуляций и прочих пустых символов - также считать пустой строкой).
        //   В случае, если одна из строк оказывается пустой, выводить тексто о том,
        //   что есть пустая строка и выходить из метода;

        if (inputStr.isBlank() || strFromArray.isBlank()) {
            System.out.println("There is an empty string in the input!");
            return "";
        }
        ;
        // 1.3. Если обе строки не пустые, то первую строку привести к верхнему регистру,
        //      вторую - - к нижнему
        // 1.4. Обрезать возможные пробелы в конце и вначале каждой строки;

        inputStr = inputStr.toUpperCase().strip();
        strFromArray = strFromArray.toLowerCase().strip();

        //   1.5. Выполнить конкатенацию строк разделив их между собой пробелом;
        String strConcat = inputStr.concat("\u0020").concat(strFromArray);
        System.out.println("Concat string: " + strConcat);

        //   1.6. Зная длину сформированной строки вырезать центральный 1-2 символа
        //   (зависит от четности/нечетности длины) и вернуть вызывающей стороне;

        //System.out.println(strConcat.length());

        int midLength = ((int) (strConcat.length() / 2));
        int beginIndex = 0;
        int endIndex = 0;

        if (strConcat.length() % 2 == 0) {
            beginIndex = (midLength) - 1;
            endIndex = beginIndex + 2;
        } else {
            beginIndex = (midLength);
            endIndex = beginIndex + 1;
        }

        return strConcat.substring(beginIndex, endIndex);

    }
}
