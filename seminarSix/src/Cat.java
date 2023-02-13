public class Cat {
    /*
    1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
    а) информационной системой ветеринарной клиники
    б) архивом выставки котов
    в) информационной системой Театра кошек Ю. Д. Куклачёва
    Можно записать в текстовом виде, не обязательно реализовывать в java.
    */

    int id;
    int age;
    String name;
    String ownerName;
    String doctorId;

    void sayMeow(){
        System.out.println("Мяу-Мяу");
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Кличка: " + name + ", Возраст: " + age + ", Владелец: " + ownerName + ".";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }

        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && ownerName.equals(cat.ownerName);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + age + ownerName.hashCode();
    }
}
