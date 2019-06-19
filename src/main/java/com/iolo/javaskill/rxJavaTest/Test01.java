package com.iolo.javaskill.rxJavaTest;

import io.reactivex.ObservableEmitter;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import lombok.extern.slf4j.Slf4j;

/**
 * //TODO 添加类/接口功能描述
 *
 * @author Fengxinxin
 * @date 2019-06-19
 */
@Slf4j
public class Test01 {
    private Disposable mDisposable;
    public static void main(String[] args) {

        String TAG = "TAG";
        Observable novel = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
                emitter.onNext("连载01");
                emitter.onNext("连载02");
                emitter.onNext("连载03");
                emitter.onComplete();
            }
        });

        Observer<String> reader = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable disposable) {
                log.info(TAG + " - onSubscribe");
            }

            @Override
            public void onNext(String value) {
                log.info(TAG + " - onNext:" + value);
            }

            @Override
            public void onError(Throwable throwable) {
                log.info(TAG + " - onError=" + throwable.getMessage());
            }

            @Override
            public void onComplete() {
                log.info(TAG + " - onComplete()");
            }
        };

//        novel.subscribe(reader);
    }
}
