package zadacha4;

public class main {
    public static void main(String[] args) {
        cat koks = new cat("Кокс", 7, "кот");
        System.out.println(koks.toString());
        koks.setColor("Рыжий");
        koks.setWeight(6);
        System.out.println(koks.toString());
        koks.vac();
        System.out.println(koks.toString());
        vac(koks);
        System.out.println(koks.toString());
        koks.meow(5);
    }

    public static void vac(cat cat) {
        if (!cat.isVaccine()) {
            cat.setVaccine(true);
        }
        else System.out.println("Кот уже привит");
    }
    
}
