package java8.optionalTrial;

import java.util.Optional;

public class OptionalUse {

    public static void main(String[] args) {
        OptionalUse optionalUse = new OptionalUse();


        Person person1 = new Person();
        person1.setId(4546);
        person1.setAddress("Pune");
        person1.setName("QA");
        person1.setMobileno(54612);

        Person person2 = null;

        //ofNullable
        optionalUse.performOptionalOfNullable(person1);
        optionalUse.performOptionalOfNullable(person2);

        //Of - expectation is non null value
        optionalUse.performOtionalOf(person1);


    }

    public void performOptionalOfNullable(Person person) {
        Optional<Person> checkNull = Optional.ofNullable(person);
        if (checkNull.isPresent()) {
            String address = person.getAddress();
            System.out.print(address);
        } else
            System.out.println("\n  Sorry address null");
    }

    private void performOtionalOf(Person person) {
        Optional<Person> checkNull = Optional.of(person);
        System.out.println(checkNull.get().mobileno);
        System.out.println(checkNull.isPresent());
        System.out.println(checkNull.filter(s->s.getName().contains("QA")).toString());
        System.out.println(checkNull.map((s)->(s.getId())));

    }

}
