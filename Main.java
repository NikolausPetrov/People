public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Anna")
                .setSurname("Wolf")
                .setAge(31)
                .setAddress("Sydney")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Antoshka")
                .build();

        System.out.println("At " + mom + " has a son, " + son);

        try {

            Person unnamedPerson = new PersonBuilder().build();
        } catch (IllegalStateException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {

            Person invalidAgePerson = new PersonBuilder().setName("Ivan").setSurname("Ivanov").setAge(-100).build();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}