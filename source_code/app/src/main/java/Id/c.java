package Id;

import ao.ad;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public abstract class c implements d, AutoCloseable {
    public static final /* synthetic */ AtomicLongFieldUpdater teal = AtomicLongFieldUpdater.newUpdater(c.class, "top");
    public final int alpha;
    public final int purple;
    public final AtomicReferenceArray red;
    public final int[] silver;

    @NotNull
    private volatile /* synthetic */ long top;

    public c(int i4) {
        if (i4 > 0) {
            if (i4 <= 536870911) {
                this.top = 0L;
                int highestOneBit = Integer.highestOneBit((i4 * 4) - 1) * 2;
                this.alpha = highestOneBit;
                this.purple = Integer.numberOfLeadingZeros(highestOneBit) + 1;
                int i5 = highestOneBit + 1;
                this.red = new AtomicReferenceArray(i5);
                this.silver = new int[i5];
                return;
            }
            throw new IllegalArgumentException(ad.zulu(i4, "capacity should be less or equal to 536870911 but it is ").toString());
        }
        throw new IllegalArgumentException(ad.zulu(i4, "capacity should be positive but it is ").toString());
    }

    public Object charlie(Object obj) {
        return obj;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        do {
        } while (foxtrot() != null);
    }

    public abstract Object echo();

    public final Object foxtrot() {
        long j5;
        int i4;
        c cVar;
        long j6;
        do {
            j5 = this.top;
            if (j5 != 0) {
                j6 = ((j5 >> 32) & 4294967295L) + 1;
                i4 = (int) (4294967295L & j5);
                if (i4 != 0) {
                    cVar = this;
                }
            }
            i4 = 0;
            cVar = this;
            break;
        } while (!teal.compareAndSet(cVar, j5, (j6 << 32) | this.silver[i4]));
        if (i4 == 0) {
            return null;
        }
        return cVar.red.getAndSet(i4, null);
    }

    @Override // Id.d
    public final void s(Object instance) {
        long j5;
        long j6;
        Intrinsics.echo(instance, "instance");
        Intrinsics.echo(instance, "instance");
        int identityHashCode = ((System.identityHashCode(instance) * (-1640531527)) >>> this.purple) + 1;
        for (int i4 = 0; i4 < 8; i4++) {
            AtomicReferenceArray atomicReferenceArray = this.red;
            while (!atomicReferenceArray.compareAndSet(identityHashCode, null, instance)) {
                if (atomicReferenceArray.get(identityHashCode) != null) {
                    identityHashCode--;
                    if (identityHashCode == 0) {
                        identityHashCode = this.alpha;
                    }
                }
            }
            if (identityHashCode <= 0) {
                throw new IllegalArgumentException("index should be positive");
            }
            do {
                j5 = this.top;
                j6 = ((((j5 >> 32) & 4294967295L) + 1) << 32) | identityHashCode;
                this.silver[identityHashCode] = (int) (4294967295L & j5);
            } while (!teal.compareAndSet(this, j5, j6));
            return;
        }
    }

    @Override // Id.d
    public final Object yankee() {
        Object foxtrot = foxtrot();
        if (foxtrot != null) {
            return charlie(foxtrot);
        }
        return echo();
    }
}
