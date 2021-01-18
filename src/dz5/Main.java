package dz5;

//паттерн "Наблюдатель"
//Работу этого паттерна можно проиллюстрировать на примере подписки на газету или журнал.
// Как только выходит новый номер, его экземпляры распространяются между подписчиками.




public class Main {
    public static void main(String[] args) {

// Создаём экземпляры субъекта и наблюдателей
        Magazine magazine = new Magazine();
        MagazineSubscriber observer1 = new MagazineSubscriber();
        MagazineSubscriber observer2 = new MagazineSubscriber();
        MagazineSubscriber observer3 = new MagazineSubscriber();
// Добавляем наблюдателей субъекту
        magazine.attach(observer1);
        magazine.attach(observer2);
        magazine.attach(observer3);
// Задаём номер журнала
        magazine.setNumber(1);
        System.out.println("Observer 1 Magazine number " + observer1.getMagazineNumber());
        System.out.println("Observer 2 Magazine number " + observer2.getMagazineNumber());
        System.out.println("Observer 3 Magazine number " + observer3.getMagazineNumber());
// Удаляем одного наблюдателя и изменяем номер журнала
        magazine.detach(observer3);
        magazine.setNumber(2);
        System.out.println("Observer 1 Magazine number " + observer1.getMagazineNumber());
        System.out.println("Observer 2 Magazine number " + observer2.getMagazineNumber());
        System.out.println("Observer 3 Magazine number " + observer3.getMagazineNumber());
    }



}
