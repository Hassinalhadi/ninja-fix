package io.reactivex.observers;

import Q0.c;
import com.google.maps.android.BuildConfig;
import io.reactivex.Notification;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.VolatileSizeArrayList;
import io.reactivex.observers.BaseTestConsumer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class BaseTestConsumer<T, U extends BaseTestConsumer<T, U>> implements Disposable {
    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected int establishedFusionMode;
    protected int initialFusionMode;
    protected Thread lastThread;
    protected CharSequence tag;
    protected boolean timeout;
    protected final List<T> values = new VolatileSizeArrayList();
    protected final List<Throwable> errors = new VolatileSizeArrayList();
    protected final CountDownLatch done = new CountDownLatch(1);

    /* loaded from: classes2.dex */
    public enum TestWaitStrategy implements Runnable {
        SPIN { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.1
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
            }
        },
        YIELD { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.2
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                Thread.yield();
            }
        },
        SLEEP_1MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.3
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1);
            }
        },
        SLEEP_10MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.4
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(10);
            }
        },
        SLEEP_100MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.5
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(100);
            }
        },
        SLEEP_1000MS { // from class: io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.6
            @Override // io.reactivex.observers.BaseTestConsumer.TestWaitStrategy, java.lang.Runnable
            public void run() {
                TestWaitStrategy.sleep(1000);
            }
        };

        public static void sleep(int i4) {
            try {
                Thread.sleep(i4);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // java.lang.Runnable
        public abstract void run();
    }

    public static String valueAndClass(Object obj) {
        if (obj != null) {
            return obj + " (class: " + obj.getClass().getSimpleName() + ")";
        }
        return BuildConfig.TRAVIS;
    }

    public final U assertComplete() {
        long j5 = this.completions;
        if (j5 != 0) {
            if (j5 <= 1) {
                return this;
            }
            throw fail("Multiple completions: " + j5);
        }
        throw fail("Not completed");
    }

    public final U assertEmpty() {
        return (U) assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final U assertError(Throwable th) {
        return assertError(Functions.equalsWith(th));
    }

    public final U assertErrorMessage(String str) {
        int size = this.errors.size();
        if (size != 0) {
            if (size == 1) {
                String message = this.errors.get(0).getMessage();
                if (ObjectHelper.equals(str, message)) {
                    return this;
                }
                throw fail("Error message differs; exptected: " + str + " but was: " + message);
            }
            throw fail("Multiple errors");
        }
        throw fail("No errors");
    }

    public final U assertFailure(Class<? extends Throwable> cls, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertNotComplete();
    }

    public final U assertFailureAndMessage(Class<? extends Throwable> cls, String str, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(cls).assertErrorMessage(str).assertNotComplete();
    }

    public final U assertNever(T t5) {
        int size = this.values.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (ObjectHelper.equals(this.values.get(i4), t5)) {
                StringBuilder sierra = c.sierra(i4, "Value at position ", " is equal to ");
                sierra.append(valueAndClass(t5));
                sierra.append("; Expected them to be different");
                throw fail(sierra.toString());
            }
        }
        return this;
    }

    public final U assertNoErrors() {
        if (this.errors.size() == 0) {
            return this;
        }
        throw fail("Error(s) present: " + this.errors);
    }

    public final U assertNoTimeout() {
        if (!this.timeout) {
            return this;
        }
        throw fail("Timeout?!");
    }

    public final U assertNoValues() {
        return assertValueCount(0);
    }

    public final U assertNotComplete() {
        long j5 = this.completions;
        if (j5 != 1) {
            if (j5 <= 1) {
                return this;
            }
            throw fail("Multiple completions: " + j5);
        }
        throw fail("Completed!");
    }

    public abstract U assertNotSubscribed();

    public final U assertNotTerminated() {
        if (this.done.getCount() != 0) {
            return this;
        }
        throw fail("Subscriber terminated!");
    }

    public final U assertResult(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertComplete();
    }

    public abstract U assertSubscribed();

    public final U assertTerminated() {
        if (this.done.getCount() == 0) {
            long j5 = this.completions;
            if (j5 <= 1) {
                int size = this.errors.size();
                if (size <= 1) {
                    if (j5 != 0 && size != 0) {
                        throw fail("Terminated with multiple completions and errors: " + j5);
                    }
                    return this;
                }
                throw fail("Terminated with multiple errors: " + size);
            }
            throw fail("Terminated with multiple completions: " + j5);
        }
        throw fail("Subscriber still running!");
    }

    public final U assertTimeout() {
        if (this.timeout) {
            return this;
        }
        throw fail("No timeout?!");
    }

    public final U assertValue(T t5) {
        if (this.values.size() == 1) {
            T t10 = this.values.get(0);
            if (ObjectHelper.equals(t5, t10)) {
                return this;
            }
            throw fail("expected: " + valueAndClass(t5) + " but was: " + valueAndClass(t10));
        }
        throw fail("expected: " + valueAndClass(t5) + " but was: " + this.values);
    }

    public final U assertValueAt(int i4, T t5) {
        int size = this.values.size();
        if (size == 0) {
            throw fail("No values");
        }
        if (i4 < size) {
            T t10 = this.values.get(i4);
            if (ObjectHelper.equals(t5, t10)) {
                return this;
            }
            throw fail("expected: " + valueAndClass(t5) + " but was: " + valueAndClass(t10));
        }
        throw fail("Invalid index: " + i4);
    }

    public final U assertValueCount(int i4) {
        int size = this.values.size();
        if (size == i4) {
            return this;
        }
        throw fail("Value counts differ; expected: " + i4 + " but was: " + size);
    }

    public final U assertValueSequence(Iterable<? extends T> iterable) {
        boolean hasNext;
        boolean hasNext2;
        Iterator<T> it = this.values.iterator();
        Iterator<? extends T> it2 = iterable.iterator();
        int i4 = 0;
        while (true) {
            hasNext = it2.hasNext();
            hasNext2 = it.hasNext();
            if (!hasNext2 || !hasNext) {
                break;
            }
            T next = it2.next();
            T next2 = it.next();
            if (ObjectHelper.equals(next, next2)) {
                i4++;
            } else {
                StringBuilder sierra = c.sierra(i4, "Values at position ", " differ; expected: ");
                sierra.append(valueAndClass(next));
                sierra.append(" but was: ");
                sierra.append(valueAndClass(next2));
                throw fail(sierra.toString());
            }
        }
        if (!hasNext2) {
            if (!hasNext) {
                return this;
            }
            throw fail("Fewer values received than expected (" + i4 + ")");
        }
        throw fail("More values received than expected (" + i4 + ")");
    }

    public final U assertValueSequenceOnly(Iterable<? extends T> iterable) {
        return (U) assertSubscribed().assertValueSequence(iterable).assertNoErrors().assertNotComplete();
    }

    public final U assertValueSet(Collection<? extends T> collection) {
        if (collection.isEmpty()) {
            assertNoValues();
            return this;
        }
        for (T t5 : this.values) {
            if (!collection.contains(t5)) {
                throw fail("Value not in the expected collection: " + valueAndClass(t5));
            }
        }
        return this;
    }

    public final U assertValueSetOnly(Collection<? extends T> collection) {
        return (U) assertSubscribed().assertValueSet(collection).assertNoErrors().assertNotComplete();
    }

    public final U assertValues(T... tArr) {
        int size = this.values.size();
        if (size == tArr.length) {
            for (int i4 = 0; i4 < size; i4++) {
                T t5 = this.values.get(i4);
                T t10 = tArr[i4];
                if (!ObjectHelper.equals(t10, t5)) {
                    StringBuilder sierra = c.sierra(i4, "Values at position ", " differ; expected: ");
                    sierra.append(valueAndClass(t10));
                    sierra.append(" but was: ");
                    sierra.append(valueAndClass(t5));
                    throw fail(sierra.toString());
                }
            }
            return this;
        }
        throw fail("Value count differs; expected: " + tArr.length + " " + Arrays.toString(tArr) + " but was: " + size + " " + this.values);
    }

    public final U assertValuesOnly(T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertNoErrors().assertNotComplete();
    }

    public final U await() throws InterruptedException {
        if (this.done.getCount() == 0) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final U awaitCount(int i4) {
        return awaitCount(i4, TestWaitStrategy.SLEEP_10MS, 5000L);
    }

    public final U awaitDone(long j5, TimeUnit timeUnit) {
        try {
            if (!this.done.await(j5, timeUnit)) {
                this.timeout = true;
                dispose();
                return this;
            }
            return this;
        } catch (InterruptedException e) {
            dispose();
            throw ExceptionHelper.wrapOrThrow(e);
        }
    }

    public final boolean awaitTerminalEvent() {
        try {
            await();
            return true;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U clearTimeout() {
        this.timeout = false;
        return this;
    }

    public final long completions() {
        return this.completions;
    }

    public final int errorCount() {
        return this.errors.size();
    }

    public final List<Throwable> errors() {
        return this.errors;
    }

    public final AssertionError fail(String str) {
        StringBuilder sb2 = new StringBuilder(str.length() + 64);
        sb2.append(str);
        sb2.append(" (latch = ");
        sb2.append(this.done.getCount());
        sb2.append(", values = ");
        sb2.append(this.values.size());
        sb2.append(", errors = ");
        sb2.append(this.errors.size());
        sb2.append(", completions = ");
        sb2.append(this.completions);
        if (this.timeout) {
            sb2.append(", timeout!");
        }
        if (isDisposed()) {
            sb2.append(", disposed!");
        }
        CharSequence charSequence = this.tag;
        if (charSequence != null) {
            sb2.append(", tag = ");
            sb2.append(charSequence);
        }
        sb2.append(')');
        AssertionError assertionError = new AssertionError(sb2.toString());
        if (!this.errors.isEmpty()) {
            if (this.errors.size() == 1) {
                assertionError.initCause(this.errors.get(0));
                return assertionError;
            }
            assertionError.initCause(new CompositeException(this.errors));
        }
        return assertionError;
    }

    public final List<List<Object>> getEvents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(values());
        arrayList.add(errors());
        ArrayList arrayList2 = new ArrayList();
        for (long j5 = 0; j5 < this.completions; j5++) {
            arrayList2.add(Notification.createOnComplete());
        }
        arrayList.add(arrayList2);
        return arrayList;
    }

    public final boolean isTerminated() {
        if (this.done.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isTimeout() {
        return this.timeout;
    }

    public final Thread lastThread() {
        return this.lastThread;
    }

    public final int valueCount() {
        return this.values.size();
    }

    public final List<T> values() {
        return this.values;
    }

    public final U withTag(CharSequence charSequence) {
        this.tag = charSequence;
        return this;
    }

    public final U assertError(Class<? extends Throwable> cls) {
        return assertError(Functions.isInstanceOf(cls));
    }

    public final U awaitCount(int i4, Runnable runnable) {
        return awaitCount(i4, runnable, 5000L);
    }

    public final U assertError(Predicate<Throwable> predicate) {
        int size = this.errors.size();
        if (size != 0) {
            Iterator<Throwable> it = this.errors.iterator();
            while (it.hasNext()) {
                try {
                    if (predicate.test(it.next())) {
                        if (size == 1) {
                            return this;
                        }
                        throw fail("Error present but other errors as well");
                    }
                } catch (Exception e) {
                    throw ExceptionHelper.wrapOrThrow(e);
                }
            }
            throw fail("Error not present");
        }
        throw fail("No errors");
    }

    public final boolean await(long j5, TimeUnit timeUnit) throws InterruptedException {
        boolean z2 = this.done.getCount() == 0 || this.done.await(j5, timeUnit);
        this.timeout = !z2;
        return z2;
    }

    public final U awaitCount(int i4, Runnable runnable, long j5) {
        long currentTimeMillis = System.currentTimeMillis();
        while (true) {
            if (j5 > 0 && System.currentTimeMillis() - currentTimeMillis >= j5) {
                this.timeout = true;
                return this;
            }
            if (this.done.getCount() != 0 && this.values.size() < i4) {
                runnable.run();
            }
        }
        return this;
    }

    public final boolean awaitTerminalEvent(long j5, TimeUnit timeUnit) {
        try {
            return await(j5, timeUnit);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final U assertFailure(Predicate<Throwable> predicate, T... tArr) {
        return (U) assertSubscribed().assertValues(tArr).assertError(predicate).assertNotComplete();
    }

    public final U assertValue(Predicate<T> predicate) {
        assertValueAt(0, (Predicate) predicate);
        if (this.values.size() <= 1) {
            return this;
        }
        throw fail("Value present but other values as well");
    }

    public final U assertValueAt(int i4, Predicate<T> predicate) {
        if (this.values.size() != 0) {
            if (i4 < this.values.size()) {
                try {
                    if (predicate.test(this.values.get(i4))) {
                        return this;
                    }
                    throw fail("Value not present");
                } catch (Exception e) {
                    throw ExceptionHelper.wrapOrThrow(e);
                }
            }
            throw fail("Invalid index: " + i4);
        }
        throw fail("No values");
    }

    public final U assertNever(Predicate<? super T> predicate) {
        int size = this.values.size();
        for (int i4 = 0; i4 < size; i4++) {
            try {
                if (predicate.test(this.values.get(i4))) {
                    throw fail("Value at position " + i4 + " matches predicate " + predicate.toString() + ", which was not expected.");
                }
            } catch (Exception e) {
                throw ExceptionHelper.wrapOrThrow(e);
            }
        }
        return this;
    }
}
