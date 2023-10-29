public class FirstWordLetter {
    public static String findWordWithMostI(String sentence) {
        // Разбиваем предложение на слова по пробелам и помещаем их в массив
        String[] words = sentence.split("\\s+");

        // Переменные для хранения слова с наибольшим количеством букв "И" и этого количества
        String wordWithMostI = "";
        int maxCount = 0;

        // Проходимся по каждому слову в массиве
        for (String word : words) {
            // Переменная для хранения количества букв "И" в текущем слове
            int count = 0;

            // Проходимся по каждой букве в текущем слове
            for (char letter : word.toCharArray()) {
                // Проверяем, является ли текущая буква буквой "И" (регистронезависимо)
                if (Character.toLowerCase(letter) == 'и') {
                    // Если да, увеличиваем счетчик
                    count++;
                }
            }

            // Сравниваем количество букв "И" в текущем слове с максимальным количеством
            if (count > maxCount) {
                // Если текущее количество больше максимального, обновляем значения
                maxCount = count;
                wordWithMostI = word;
            }
        }

        // Возвращаем слово с наибольшим количеством букв "И"
        return wordWithMostI;
    }

}
