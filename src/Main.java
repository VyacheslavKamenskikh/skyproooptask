public class Main {
    public static void main(String[] args) {
        Automobile car1 = new Automobile();
        car1.brand = "Lada";
        car1.model = "Granta";
        car1.year =2015;
        car1.country = "Россия";
        car1.engineVolume =1.7;
        car1.color = "желтый";
        Automobile car2 = new Automobile();
        car2.brand = "Audi";
        car2.model = "A8 50 L TDI quattro";
        car2.year =2020;
        car2.country = "Германия";
        car2.engineVolume =3.0;
        car2.color = "черный";
        Automobile car3 = new Automobile();
        car3.brand = "BMW";
        car3.model = "Z8";
        car3.year =2021;
        car3.country = "Германия";
        car3.engineVolume =3.0;
        car3.color = "черный";
        Automobile car4 = new Automobile();
        car4.brand = "Kia";
        car4.model = "Sportage 4-го поколения";
        car4.year =2018;
        car4.country = "Южная Корея";
        car4.engineVolume =2.4;
        car4.color = "красный";
        Automobile car5 = new Automobile();
        car5.brand = "Hyundai";
        car5.model = "Avante";
        car5.year =2016;
        car5.country = "Южная Корея";
        car5.engineVolume =1.6;
        car5.color = "оранжевый";
        System.out.println("Task 1");
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        System.out.println("\nTask 2");
        Automobile carWithConstructor1 = new Automobile("Lada","Granta",1.7,"желтый",2015,"Россия");
        Automobile carWithConstructor2 = new Automobile("Audi","A8 50 L TDI quattro",3.0,"черный",2020,"Германия");
        Automobile carWithConstructor3 = new Automobile("BMW","Z8",3.0,"черный",2021,"Германия");
        Automobile carWithConstructor4 = new Automobile("Kia","Sportage 4-го поколения",2.4,"красный",2018,"Южная Корея");
        Automobile carWithConstructor5 = new Automobile("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");
        System.out.println(carWithConstructor1.toString());
        System.out.println(carWithConstructor2.toString());
        System.out.println(carWithConstructor3.toString());
        System.out.println(carWithConstructor4.toString());
        System.out.println(carWithConstructor5.toString());
        System.out.println("\nTask 3");
        Automobile carTestConstructorErrors = new Automobile("","",0,"",0,"");
        System.out.println(carTestConstructorErrors.toString());
    }
}