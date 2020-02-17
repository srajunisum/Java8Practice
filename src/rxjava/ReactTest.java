package rxjava;


import rx.Observable;

public class ReactTest {


    public static void main(String[] args) {

        Observable.range(1, 2).subscribe(
                number -> System.out.println(number),
                error -> System.out.println("error"),
                () -> System.out.println("completed")
        );
        ReactTest reactTest = new ReactTest();
        reactTest.reactOperation();

    }
    private void reactOperation(){
        Integer[] numbers = { 1, 2, 3, 4, 5, 6};
        String[] letters = {"a", "b", "c", "d", "e", "f", "g"};
        final StringBuilder result = new StringBuilder();
        Observable<String> observable1 = Observable.from(letters);
        Observable<Integer> observable2 = Observable.from(numbers);
        Observable.concatEager(observable1, observable2)
                .subscribe( letter -> result.append(letter));
        System.out.println(result);
    }



}


