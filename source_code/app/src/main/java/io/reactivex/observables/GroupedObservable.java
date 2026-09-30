package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.annotations.Nullable;

/* loaded from: classes2.dex */
public abstract class GroupedObservable<K, T> extends Observable<T> {
    final K key;

    public GroupedObservable(@Nullable K k6) {
        this.key = k6;
    }

    @Nullable
    public K getKey() {
        return this.key;
    }
}
