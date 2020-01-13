package GameLauncher;

public class GuessGame{
    Player p1;
    Player p2;
    Player p3;
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1=0;
        int guessp2=0;
        int guessp3=0;

        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int TargetNumber = (int) (Math.random()*10);
        System.out.println("Я загадываю число от 0 до 9...");

        while(true){
            System.out.println("Число, которое нужно угадать - "+ TargetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это "+p1.number);

            guessp2 = p2.number;
            System.out.println("Второй игрок думает, что это "+p2.number);

            guessp3 = p3.number;
            System.out.println("Трейтий игрок думает, что это "+p3.number);

            if (guessp1 == TargetNumber){
                p1isRight=true;
            }

            if (guessp2 == TargetNumber){
                p2isRight=true;
            }

            if (guessp3 == TargetNumber){
                p3isRight=true;
            }

            if (p1isRight || p2isRight || p3isRight){
                System.out.println("У нас есть победитель!");
                System.out.println("Первый игрок угадал? " + p1isRight);

                System.out.println("Второй игрок угадал? " + p2isRight);

                System.out.println("Трейтий игрок угадал? " + p3isRight);
                System.out.println("Конец игры.");
                break;
            } else {
                System.out.println("Игроки должны попробовать еще раз");

            }
        }
    }
}