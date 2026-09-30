package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* loaded from: classes2.dex */
public final class ObservableRangeLong extends Observable<Long> {
    private final long count;
    private final long start;

    /* loaded from: classes2.dex */
    public static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final Observer<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        public RangeDisposable(Observer<? super Long> observer, long j5, long j6) {
            this.downstream = observer;
            this.index = j5;
            this.end = j6;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            if (get() != 0) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            if (this.index == this.end) {
                return true;
            }
            return false;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i4) {
            if ((i4 & 1) != 0) {
                this.fused = true;
                return 1;
            }
            return 0;
        }

        public void run() {
            if (!this.fused) {
                Observer<? super Long> observer = this.downstream;
                long j5 = this.end;
                for (long j6 = this.index; j6 != j5 && get() == 0; j6++) {
                    observer.onNext(Long.valueOf(j6));
                }
                if (get() == 0) {
                    lazySet(1);
                    observer.onComplete();
                }
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Long poll() throws Exception {
            long j5 = this.index;
            if (j5 != this.end) {
                this.index = 1 + j5;
                return Long.valueOf(j5);
            }
            lazySet(1);
            return null;
        }
    }

    public ObservableRangeLong(long j5, long j6) {
        this.start = j5;
        this.count = j6;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super Long> observer) {
        long j5 = this.start;
        RangeDisposable rangeDisposable = new RangeDisposable(observer, j5, this.count + j5);
        observer.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }
}
