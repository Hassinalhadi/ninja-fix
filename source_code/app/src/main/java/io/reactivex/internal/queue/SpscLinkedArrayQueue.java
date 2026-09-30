package io.reactivex.internal.queue;

import io.reactivex.annotations.Nullable;
import io.reactivex.internal.fuseable.SimplePlainQueue;
import io.reactivex.internal.util.Pow2;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* loaded from: classes2.dex */
public final class SpscLinkedArrayQueue<T> implements SimplePlainQueue<T> {
    AtomicReferenceArray<Object> consumerBuffer;
    final int consumerMask;
    AtomicReferenceArray<Object> producerBuffer;
    long producerLookAhead;
    int producerLookAheadStep;
    final int producerMask;
    static final int MAX_LOOK_AHEAD_STEP = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096).intValue();
    private static final Object HAS_NEXT = new Object();
    final AtomicLong producerIndex = new AtomicLong();
    final AtomicLong consumerIndex = new AtomicLong();

    public SpscLinkedArrayQueue(int i4) {
        int roundToPowerOfTwo = Pow2.roundToPowerOfTwo(Math.max(8, i4));
        int i5 = roundToPowerOfTwo - 1;
        AtomicReferenceArray<Object> atomicReferenceArray = new AtomicReferenceArray<>(roundToPowerOfTwo + 1);
        this.producerBuffer = atomicReferenceArray;
        this.producerMask = i5;
        adjustLookAheadStep(roundToPowerOfTwo);
        this.consumerBuffer = atomicReferenceArray;
        this.consumerMask = i5;
        this.producerLookAhead = roundToPowerOfTwo - 2;
        soProducerIndex(0L);
    }

    private void adjustLookAheadStep(int i4) {
        this.producerLookAheadStep = Math.min(i4 / 4, MAX_LOOK_AHEAD_STEP);
    }

    private static int calcDirectOffset(int i4) {
        return i4;
    }

    private static int calcWrappedOffset(long j5, int i4) {
        return calcDirectOffset(((int) j5) & i4);
    }

    private long lpConsumerIndex() {
        return this.consumerIndex.get();
    }

    private long lpProducerIndex() {
        return this.producerIndex.get();
    }

    private long lvConsumerIndex() {
        return this.consumerIndex.get();
    }

    private static <E> Object lvElement(AtomicReferenceArray<Object> atomicReferenceArray, int i4) {
        return atomicReferenceArray.get(i4);
    }

    private AtomicReferenceArray<Object> lvNextBufferAndUnlink(AtomicReferenceArray<Object> atomicReferenceArray, int i4) {
        int calcDirectOffset = calcDirectOffset(i4);
        AtomicReferenceArray<Object> atomicReferenceArray2 = (AtomicReferenceArray) lvElement(atomicReferenceArray, calcDirectOffset);
        soElement(atomicReferenceArray, calcDirectOffset, null);
        return atomicReferenceArray2;
    }

    private long lvProducerIndex() {
        return this.producerIndex.get();
    }

    private T newBufferPeek(AtomicReferenceArray<Object> atomicReferenceArray, long j5, int i4) {
        this.consumerBuffer = atomicReferenceArray;
        return (T) lvElement(atomicReferenceArray, calcWrappedOffset(j5, i4));
    }

    private T newBufferPoll(AtomicReferenceArray<Object> atomicReferenceArray, long j5, int i4) {
        this.consumerBuffer = atomicReferenceArray;
        int calcWrappedOffset = calcWrappedOffset(j5, i4);
        T t5 = (T) lvElement(atomicReferenceArray, calcWrappedOffset);
        if (t5 != null) {
            soElement(atomicReferenceArray, calcWrappedOffset, null);
            soConsumerIndex(j5 + 1);
        }
        return t5;
    }

    private void resize(AtomicReferenceArray<Object> atomicReferenceArray, long j5, int i4, T t5, long j6) {
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        this.producerLookAhead = (j6 + j5) - 1;
        soElement(atomicReferenceArray2, i4, t5);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, i4, HAS_NEXT);
        soProducerIndex(j5 + 1);
    }

    private void soConsumerIndex(long j5) {
        this.consumerIndex.lazySet(j5);
    }

    private static void soElement(AtomicReferenceArray<Object> atomicReferenceArray, int i4, Object obj) {
        atomicReferenceArray.lazySet(i4, obj);
    }

    private void soNext(AtomicReferenceArray<Object> atomicReferenceArray, AtomicReferenceArray<Object> atomicReferenceArray2) {
        soElement(atomicReferenceArray, calcDirectOffset(atomicReferenceArray.length() - 1), atomicReferenceArray2);
    }

    private void soProducerIndex(long j5) {
        this.producerIndex.lazySet(j5);
    }

    private boolean writeToQueue(AtomicReferenceArray<Object> atomicReferenceArray, T t5, long j5, int i4) {
        soElement(atomicReferenceArray, i4, t5);
        soProducerIndex(j5 + 1);
        return true;
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
        if (lvProducerIndex() == lvConsumerIndex()) {
            return true;
        }
        return false;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t5) {
        if (t5 != null) {
            AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
            long lpProducerIndex = lpProducerIndex();
            int i4 = this.producerMask;
            int calcWrappedOffset = calcWrappedOffset(lpProducerIndex, i4);
            if (lpProducerIndex < this.producerLookAhead) {
                return writeToQueue(atomicReferenceArray, t5, lpProducerIndex, calcWrappedOffset);
            }
            long j5 = this.producerLookAheadStep + lpProducerIndex;
            if (lvElement(atomicReferenceArray, calcWrappedOffset(j5, i4)) == null) {
                this.producerLookAhead = j5 - 1;
                return writeToQueue(atomicReferenceArray, t5, lpProducerIndex, calcWrappedOffset);
            }
            if (lvElement(atomicReferenceArray, calcWrappedOffset(lpProducerIndex + 1, i4)) == null) {
                return writeToQueue(atomicReferenceArray, t5, lpProducerIndex, calcWrappedOffset);
            }
            resize(atomicReferenceArray, lpProducerIndex, calcWrappedOffset, t5, i4);
            return true;
        }
        throw new NullPointerException("Null is not a valid element");
    }

    public T peek() {
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        int i4 = this.consumerMask;
        T t5 = (T) lvElement(atomicReferenceArray, calcWrappedOffset(lpConsumerIndex, i4));
        if (t5 == HAS_NEXT) {
            return newBufferPeek(lvNextBufferAndUnlink(atomicReferenceArray, i4 + 1), lpConsumerIndex, i4);
        }
        return t5;
    }

    @Override // io.reactivex.internal.fuseable.SimplePlainQueue, io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public T poll() {
        boolean z2;
        AtomicReferenceArray<Object> atomicReferenceArray = this.consumerBuffer;
        long lpConsumerIndex = lpConsumerIndex();
        int i4 = this.consumerMask;
        int calcWrappedOffset = calcWrappedOffset(lpConsumerIndex, i4);
        T t5 = (T) lvElement(atomicReferenceArray, calcWrappedOffset);
        if (t5 == HAS_NEXT) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (t5 != null && !z2) {
            soElement(atomicReferenceArray, calcWrappedOffset, null);
            soConsumerIndex(lpConsumerIndex + 1);
            return t5;
        }
        if (!z2) {
            return null;
        }
        return newBufferPoll(lvNextBufferAndUnlink(atomicReferenceArray, i4 + 1), lpConsumerIndex, i4);
    }

    public int size() {
        long lvConsumerIndex = lvConsumerIndex();
        while (true) {
            long lvProducerIndex = lvProducerIndex();
            long lvConsumerIndex2 = lvConsumerIndex();
            if (lvConsumerIndex == lvConsumerIndex2) {
                return (int) (lvProducerIndex - lvConsumerIndex2);
            }
            lvConsumerIndex = lvConsumerIndex2;
        }
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public boolean offer(T t5, T t10) {
        AtomicReferenceArray<Object> atomicReferenceArray = this.producerBuffer;
        long lvProducerIndex = lvProducerIndex();
        int i4 = this.producerMask;
        long j5 = 2 + lvProducerIndex;
        if (lvElement(atomicReferenceArray, calcWrappedOffset(j5, i4)) == null) {
            int calcWrappedOffset = calcWrappedOffset(lvProducerIndex, i4);
            soElement(atomicReferenceArray, calcWrappedOffset + 1, t10);
            soElement(atomicReferenceArray, calcWrappedOffset, t5);
            soProducerIndex(j5);
            return true;
        }
        AtomicReferenceArray<Object> atomicReferenceArray2 = new AtomicReferenceArray<>(atomicReferenceArray.length());
        this.producerBuffer = atomicReferenceArray2;
        int calcWrappedOffset2 = calcWrappedOffset(lvProducerIndex, i4);
        soElement(atomicReferenceArray2, calcWrappedOffset2 + 1, t10);
        soElement(atomicReferenceArray2, calcWrappedOffset2, t5);
        soNext(atomicReferenceArray, atomicReferenceArray2);
        soElement(atomicReferenceArray, calcWrappedOffset2, HAS_NEXT);
        soProducerIndex(j5);
        return true;
    }
}
