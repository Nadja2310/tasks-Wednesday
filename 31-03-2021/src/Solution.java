
public class Solution {
    /**
     * Метод должен делать следущее: на вход есть текст, состоящий из слов и пробелов. Не может быть больше одного
     * пробела между двумя словами и не может быть пробелов на концах текста.
     * Необходимо обрезать текст таким образом, чтобы:
     * 1) он имел максимально возможную длину, но не больше значения 'index'
     * 2) он состоял из целых слов (не содержал неполные слова)
     * <p>
     * Пример:
     * (Hello world, 5) ->Hello
     * (Hello world, 8) ->Hello
     * (Hello world und, 11) ->Hello world
     * (Hello world und, 13) ->Hello world
     *
     * @param text
     * @param index
     * @return
     */
    public String task1(String text, int index) {

        if (text.length() - 1 <= index) return text;

        String outputStr = text.substring(0, index);
        String[] stringsText = text.split(" ");
        String[] stringsOutput = outputStr.split(" ");
        StringBuilder output = new StringBuilder();
        output.append(stringsText[0]);
        for (int i = 1; i < stringsOutput.length; i++) {
            if (stringsText[i].equals(stringsOutput[i])) {
                output.append(" ").append(stringsOutput[i]);
            }
        }

        return output.toString();
    }

    public String task2() {
        return "";
    }
}
