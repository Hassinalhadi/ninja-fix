package io.reactivex.internal.util;

import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Predicate;
import qg.c;

/* loaded from: classes2.dex */
public class AppendOnlyLinkedArrayList<T> {
    final int capacity;
    final Object[] head;
    int offset;
    Object[] tail;

    /* loaded from: classes2.dex */
    public interface NonThrowingPredicate<T> extends Predicate<T> {
        @Override // io.reactivex.functions.Predicate
        boolean test(T t5);
    }

    public AppendOnlyLinkedArrayList(int i4) {
        this.capacity = i4;
        Object[] objArr = new Object[i4 + 1];
        this.head = objArr;
        this.tail = objArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean accept(c cVar) {
        Object[] objArr = this.head;
        int i4 = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                Object[] objArr2 = objArr[i5];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, cVar)) {
                    return true;
                }
            }
            objArr = objArr[i4];
        }
    }

    public void add(T t5) {
        int i4 = this.capacity;
        int i5 = this.offset;
        if (i5 == i4) {
            Object[] objArr = new Object[i4 + 1];
            this.tail[i4] = objArr;
            this.tail = objArr;
            i5 = 0;
        }
        this.tail[i5] = t5;
        this.offset = i5 + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void forEachWhile(NonThrowingPredicate<? super T> nonThrowingPredicate) {
        int i4 = this.capacity;
        for (Object[] objArr = this.head; objArr != null; objArr = (Object[]) objArr[i4]) {
            for (int i5 = 0; i5 < i4; i5++) {
                Object obj = objArr[i5];
                if (obj == null) {
                    break;
                } else {
                    if (nonThrowingPredicate.test(obj)) {
                        return;
                    }
                }
            }
        }
    }

    public void setFirst(T t5) {
        this.head[0] = t5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0019, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <U> boolean accept(Observer<? super U> observer) {
        Object[] objArr = this.head;
        int i4 = this.capacity;
        while (true) {
            if (objArr == null) {
                return false;
            }
            for (int i5 = 0; i5 < i4; i5++) {
                Object[] objArr2 = objArr[i5];
                if (objArr2 == null) {
                    break;
                }
                if (NotificationLite.acceptFull(objArr2, observer)) {
                    return true;
                }
            }
            objArr = objArr[i4];
        }
    }

    public <S> void forEachWhile(S s3, BiPredicate<? super S, ? super T> biPredicate) throws Exception {
        Object[] objArr = this.head;
        int i4 = this.capacity;
        while (true) {
            for (int i5 = 0; i5 < i4; i5++) {
                Object obj = objArr[i5];
                if (obj == null || biPredicate.test(s3, obj)) {
                    return;
                }
            }
            objArr = (Object[]) objArr[i4];
        }
    }
}
