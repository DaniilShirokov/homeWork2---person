import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jack", "Connor", "Harry", "George", "Samuel", "John");
        List<String> families = Arrays.asList("Evans", "Young", "Harris", "Wilson", "Davies", "Adamson", "Brown");
        Collection<Person> persons = new ArrayList<>();
        for (int i = 0; i < 10_000_00; i++) {
            persons.add(new Person(
                    names.get(new Random().nextInt(names.size())),
                    families.get(new Random().nextInt(families.size())),
                    new Random().nextInt(100),
                    SEX.Sex.values()[new Random().nextInt(SEX.Sex.values().length)],
                    Education1.Education.values()[new Random().nextInt(Education1.Education.values().length)])
            );
        }
        System.out.println(persons.stream().toList());
        int sum = (int) persons.stream()
                .filter(x -> x.getAge() < 18)
                .count();
        System.out.println(sum);
        List<String> secondNameList = persons.stream()
                .filter(x -> x.getAge() >= 18 && x.getAge() <= 27)
                .filter(x -> x.getSex().equals(SEX.Sex.MAN))
                .map(x -> x.getFamily())
                .collect(Collectors.toList());

        System.out.println(secondNameList);

        List<String> worker = (List<String>) persons.stream()
                .filter(x -> x.getEducation().equals(Education1.Education.HIGHER))
                .filter(x -> (x.getSex().equals(SEX.Sex.MAN)) ? ((x.getAge() >= 18) && (x.getAge() <= 65)) : ((x.getAge() >= 18) && (x.getAge() <= 60)))
                .map(x -> x.getFamily())
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(worker);
    }
}

