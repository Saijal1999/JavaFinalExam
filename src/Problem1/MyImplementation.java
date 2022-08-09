package Problem1;

import org.w3c.dom.DOMStringList;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyImplementation<T>{

    public interface SupplyString<T> extends Supplier<T> {
        T StringList(T s);
    }
        public interface IntegerPredicate<T> extends Predicate<T>{
            T CheckingCondition(T numb);
        }

        public interface MapperFunction<T,S>{
            T Conversion(T t, S s);
        }

        public  void StringList() {
            ArrayList<String> names = new ArrayList<>();
            names.add("Jess");
            names.add("Saijal");
            names.add("Ramneek");
            Supplier<String> s = () -> names.get(0);
            Supplier<String> q = () -> names.get(1);
            Supplier<String> r = () -> names.get(2);
            System.out.println(s.get());
            System.out.println(q.get());
            System.out.println(r.get());
        }

        public  void CheckingCondition(int numb) {
            Predicate<Integer> p = (i -> i % 2 == 0);
            System.out.println(p.test(10));
        }











    }



