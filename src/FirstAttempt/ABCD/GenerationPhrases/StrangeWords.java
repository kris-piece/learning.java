package FirstAttempt.ABCD.GenerationPhrases;

public class StrangeWords {
    public static void main(String[] args) {
        String[] listAdin = {"великолепный","изящный","работоспособный","привлекательный","блестящий","свободолюбивый","крикливый","быстрый","искушающий"};
        String[] listDva = {"бесовской","церковный","ляпиструбецкой","шоколадный","внимательный","ровный","четкий","условный","покладистый"};
        String[] listTri = {"шар","треугольник","квадрат","параллепипед","трапеций","овал","штангенциркуль","конь","лён"};
//вычисляем, сколько слов в каждом списке
        int adinLength = listAdin.length;
        int dvaLength = listDva.length;
        int triLength = listTri.length;
//генерируем три случайных числа
        int rand1 = (int) (Math.random()*adinLength);
        int rand2 = (int) (Math.random()*dvaLength);
        int rand3 = (int) (Math.random()*triLength);
//теперь строим фразу
        String phrase = listAdin[rand1]+" "+listDva[rand2]+" "+listTri[rand3];

        System.out.println("Дикая вещь - "+phrase);
    }
}

