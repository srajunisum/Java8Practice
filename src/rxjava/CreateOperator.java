package rxjava;

import rx.Observable;
import rx.Observer;
import rx.Subscriber;
import rx.observables.AsyncOnSubscribe;

public class CreateOperator {

    public static void main(String[] args) {
        unsafeCreateOperator();
        createOperator();

    }

    private static void unsafeCreateOperator() {
        Observable<String> ob = Observable.unsafeCreate(new Observable.OnSubscribe<String>() {
            @Override
            public void call(Subscriber<? super String> subscriber) {
                subscriber.onNext("Hello");
            }
        });
       // ob.subscribe(i -> System.out.println("i = " + i));

        Subscriber<String> mySubscriber = new Subscriber<String>() {
            @Override
            public void onCompleted() {
                System.out.println("on complete");
            }

            @Override
            public void onError(Throwable throwable) {
                System.out.println("throwable = " + throwable);
            }

            @Override
            public void onNext(String s) {
                System.out.println(s);
            }
        };
        ob.subscribe(mySubscriber);
    }

    private static  void createOperator(){
        Observable<String> stringObservable = Observable.create(new AsyncOnSubscribe<String, String>() {
            @Override
            protected String generateState() {
                return "Hi";
            }

            @Override
            protected String next(String s, long l, Observer<Observable<? extends String>> observer) {
                return "Hi";
            }
        });
        stringObservable.subscribe(j-> System.out.println("j = " + j));
        System.out.println(" = " );
    }

}
