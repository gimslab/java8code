import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class PersonCh2Sec10 {
   private int id;
   private String name;

   public PersonCh2Sec10(int id, String name) { this.id = id; this.name = name; }
   public int getId() { return id; }
   public String getName() { return name; }
   public String toString() { return getClass().getName() + 
         "[id=" + id + ",name=" + name + "]"; 
   }
}

public class TestCh2Sec10 {
   public static Stream<PersonCh2Sec10> people() {
      return Stream.of(
         new PersonCh2Sec10(1001, "Peter"),
         new PersonCh2Sec10(1002, "Paul"),
         new PersonCh2Sec10(1003, "Mary"));
   } 

   public static void main(String[] args) throws IOException {
      Map<Integer, String> idToName = people().collect(Collectors.toMap(PersonCh2Sec10::getId, PersonCh2Sec10::getName));
      System.out.println("idToName: " + idToName);

      Map<Integer, PersonCh2Sec10> idToPerson = people().collect(Collectors.toMap(PersonCh2Sec10::getId, Function.identity()));
      System.out.println("idToPerson: " + idToPerson.getClass().getName() + idToPerson);

      idToPerson = people().collect(
         Collectors.toMap(
        		 PersonCh2Sec10::getId,
            Function.identity(),
            (existingValue, newValue) -> { throw new IllegalStateException(); },
            TreeMap::new));

      System.out.println("idToPerson: " + idToPerson.getClass().getName() + idToPerson);

      Stream<Locale> locales = Stream.of(Locale.getAvailableLocales());
      Map<String, String> languageNames = locales.collect(
         Collectors.toMap(
            l -> l.getDisplayLanguage(), 
            l -> l.getDisplayLanguage(l), 
            (existingValue, newValue) -> existingValue));
      System.out.println("languageNames: " + languageNames);

      locales = Stream.of(Locale.getAvailableLocales());
      Map<String, Set<String>> countryLanguageSets = locales.collect(
         Collectors.toMap(
            l -> l.getDisplayCountry(),
            l -> Collections.singleton(l.getDisplayLanguage()),
            (a, b) -> { // union of a and b
               Set<String> r = new HashSet<>(a); 
               r.addAll(b);
               return r; }));
      System.out.println("countryLanguageSets: " + countryLanguageSets);
   }
}


