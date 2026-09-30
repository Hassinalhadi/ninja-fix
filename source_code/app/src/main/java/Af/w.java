package Af;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Intrinsics;
import vf.av;
import vf.aw;

/* loaded from: classes2.dex */
public class w {
    public static final /* synthetic */ AtomicIntegerFieldUpdater bravo = AtomicIntegerFieldUpdater.newUpdater(w.class, "_size$volatile");
    private volatile /* synthetic */ int _size$volatile;
    public av[] alpha;

    public final void alpha(av avVar) {
        avVar.delta((aw) this);
        av[] avVarArr = this.alpha;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = bravo;
        if (avVarArr == null) {
            avVarArr = new av[4];
            this.alpha = avVarArr;
        } else if (atomicIntegerFieldUpdater.get(this) >= avVarArr.length) {
            Object[] copyOf = Arrays.copyOf(avVarArr, atomicIntegerFieldUpdater.get(this) * 2);
            Intrinsics.delta(copyOf, "copyOf(...)");
            avVarArr = (av[]) copyOf;
            this.alpha = avVarArr;
        }
        int i4 = atomicIntegerFieldUpdater.get(this);
        atomicIntegerFieldUpdater.set(this, i4 + 1);
        avVarArr[i4] = avVar;
        avVar.purple = i4;
        delta(i4);
    }

    public final void bravo(av avVar) {
        synchronized (this) {
            if (avVar.bravo() != null) {
                charlie(avVar.purple);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r6.compareTo(r7) < 0) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final av charlie(int i4) {
        Object[] objArr = this.alpha;
        Intrinsics.checkNotNull(objArr);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = bravo;
        atomicIntegerFieldUpdater.set(this, atomicIntegerFieldUpdater.get(this) - 1);
        if (i4 < atomicIntegerFieldUpdater.get(this)) {
            echo(i4, atomicIntegerFieldUpdater.get(this));
            int i5 = (i4 - 1) / 2;
            if (i4 > 0) {
                av avVar = objArr[i4];
                Intrinsics.checkNotNull(avVar);
                Object obj = objArr[i5];
                Intrinsics.checkNotNull(obj);
                if (avVar.compareTo(obj) < 0) {
                    echo(i4, i5);
                    delta(i5);
                }
            }
            while (true) {
                int i10 = i4 * 2;
                int i11 = i10 + 1;
                if (i11 >= atomicIntegerFieldUpdater.get(this)) {
                    break;
                }
                Object[] objArr2 = this.alpha;
                Intrinsics.checkNotNull(objArr2);
                int i12 = i10 + 2;
                if (i12 < atomicIntegerFieldUpdater.get(this)) {
                    Comparable comparable = objArr2[i12];
                    Intrinsics.checkNotNull(comparable);
                    Object obj2 = objArr2[i11];
                    Intrinsics.checkNotNull(obj2);
                }
                i12 = i11;
                Comparable comparable2 = objArr2[i4];
                Intrinsics.checkNotNull(comparable2);
                Comparable comparable3 = objArr2[i12];
                Intrinsics.checkNotNull(comparable3);
                if (comparable2.compareTo(comparable3) <= 0) {
                    break;
                }
                echo(i4, i12);
                i4 = i12;
            }
        }
        av avVar2 = objArr[atomicIntegerFieldUpdater.get(this)];
        Intrinsics.checkNotNull(avVar2);
        avVar2.delta(null);
        avVar2.purple = -1;
        objArr[atomicIntegerFieldUpdater.get(this)] = null;
        return avVar2;
    }

    public final void delta(int i4) {
        while (i4 > 0) {
            av[] avVarArr = this.alpha;
            Intrinsics.checkNotNull(avVarArr);
            int i5 = (i4 - 1) / 2;
            av avVar = avVarArr[i5];
            Intrinsics.checkNotNull(avVar);
            av avVar2 = avVarArr[i4];
            Intrinsics.checkNotNull(avVar2);
            if (avVar.compareTo(avVar2) <= 0) {
                return;
            }
            echo(i4, i5);
            i4 = i5;
        }
    }

    public final void echo(int i4, int i5) {
        av[] avVarArr = this.alpha;
        Intrinsics.checkNotNull(avVarArr);
        av avVar = avVarArr[i5];
        Intrinsics.checkNotNull(avVar);
        av avVar2 = avVarArr[i4];
        Intrinsics.checkNotNull(avVar2);
        avVarArr[i4] = avVar;
        avVarArr[i5] = avVar2;
        avVar.purple = i4;
        avVar2.purple = i5;
    }
}
