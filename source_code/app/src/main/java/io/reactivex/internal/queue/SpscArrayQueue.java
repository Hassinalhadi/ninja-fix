package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class SpscArrayQueue<E> extends AtomicReferenceArray<E> implements SimplePlainQueue<E> {
    private static final Integer MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);
    private static final long serialVersionUID = -1296597691183856449L;
    final AtomicLong consumerIndex;
    final int lookAheadStep;
    final int mask;
    final AtomicLong producerIndex;
    long producerLookAhead;

    public SpscArrayQueue(int i4) {
        super(Pow2.roundToPowerOfTwo(i4));
        this.mask = length() - 1;
        this.producerIndex = new AtomicLong();
        this.consumerIndex = new AtomicLong();
        this.lookAheadStep = Math.min(i4 / 4, MAX_LOOK_AHEAD_STEP.intValue());
    }

    public int calcElementOffset(long j5, int i4) {
        return ((int) j5) & i4;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public void clear() {
        while (true) {
            if (poll() == null && isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean isEmpty() {
        if (this.producerIndex.get() == this.consumerIndex.get()) {
            return true;
        }
        return false;
    }

    public E lvElement(int i4) {
        return get(i4);
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e) {
        if (e != null) {
            int i4 = this.mask;
            long j5 = this.producerIndex.get();
            int calcElementOffset = calcElementOffset(j5, i4);
            if (j5 >= this.producerLookAhead) {
                long j6 = this.lookAheadStep + j5;
                if (lvElement(calcElementOffset(j6, i4)) == null) {
                    this.producerLookAhead = j6;
                } else if (lvElement(calcElementOffset) != null) {
                    return false;
                }
            }
            soElement(calcElementOffset, e);
            soProducerIndex(j5 + 1);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public E poll() {
        long j5 = this.consumerIndex.get();
        int calcElementOffset = calcElementOffset(j5);
        E lvElement = lvElement(calcElementOffset);
        if (lvElement == null) {
            return null;
        }
        soConsumerIndex(j5 + 1);
        soElement(calcElementOffset, null);
        return lvElement;
    }

    public void soConsumerIndex(long j5) {
        this.consumerIndex.lazySet(j5);
    }

    public void soElement(int i4, E e) {
        lazySet(i4, e);
    }

    public void soProducerIndex(long j5) {
        this.producerIndex.lazySet(j5);
    }

    public int calcElementOffset(long j5) {
        return ((int) j5) & this.mask;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(E e, E e4) {
        return offer(e) && offer(e4);
    }
}
