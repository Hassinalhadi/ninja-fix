package S;

import androidx.compose.runtime.J;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x {
    public final Function1 alpha;
    public boolean charlie;
    public B2.s hotel;
    public w india;
    public final AtomicReference bravo = new AtomicReference(null);
    public final Ac.k delta = new Ac.k(14, this);
    public final Aa.l echo = new Aa.l(21, this);
    public final J.e foxtrot = new J.e(new w[16]);
    public final Object golf = new Object();
    public long juliet = -1;

    public x(Function1 function1) {
        this.alpha = function1;
    }

    public final void alpha() {
        synchronized (this.golf) {
            J.e eVar = this.foxtrot;
            Object[] objArr = eVar.alpha;
            int i4 = eVar.red;
            for (int i5 = 0; i5 < i4; i5++) {
                w wVar = (w) objArr[i5];
                wVar.echo.alpha();
                wVar.foxtrot.alpha();
                wVar.kilo.alpha();
                wVar.lima.clear();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0082 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:6:0x000f, B:9:0x007a, B:11:0x0082, B:13:0x0092, B:15:0x0087, B:18:0x0022, B:21:0x002e, B:23:0x0043, B:25:0x0051, B:27:0x005b, B:29:0x0066, B:36:0x0073, B:39:0x0098), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bravo(Object obj) {
        int i4;
        synchronized (this.golf) {
            try {
                J.e eVar = this.foxtrot;
                int i5 = eVar.red;
                int i10 = 0;
                int i11 = 0;
                while (i10 < i5) {
                    w wVar = (w) eVar.alpha[i10];
                    bv.ag agVar = (bv.ag) wVar.foxtrot.kilo(obj);
                    if (agVar != null) {
                        Object[] objArr = agVar.bravo;
                        int[] iArr = agVar.charlie;
                        long[] jArr = agVar.alpha;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i12 = 0;
                            while (true) {
                                long j5 = jArr[i12];
                                i4 = i10;
                                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i13 = 8 - ((~(i12 - length)) >>> 31);
                                    for (int i14 = 0; i14 < i13; i14++) {
                                        if ((j5 & 255) < 128) {
                                            int i15 = (i12 << 3) + i14;
                                            Object obj2 = objArr[i15];
                                            int i16 = iArr[i15];
                                            wVar.delta(obj, obj2);
                                        }
                                        j5 >>= 8;
                                    }
                                    if (i13 != 8) {
                                        break;
                                    }
                                }
                                if (i12 == length) {
                                    break;
                                }
                                i12++;
                                i10 = i4;
                            }
                            if (wVar.foxtrot.juliet()) {
                                i11++;
                            } else if (i11 > 0) {
                                Object[] objArr2 = eVar.alpha;
                                objArr2[i4 - i11] = objArr2[i4];
                            }
                            i10 = i4 + 1;
                        }
                    }
                    i4 = i10;
                    if (wVar.foxtrot.juliet()) {
                    }
                    i10 = i4 + 1;
                }
                int i17 = i5 - i11;
                Arrays.fill(eVar.alpha, i17, i5, (Object) null);
                eVar.red = i17;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean charlie() {
        boolean z2;
        Set set;
        synchronized (this.golf) {
            z2 = this.charlie;
        }
        if (z2) {
            return false;
        }
        boolean z10 = false;
        while (true) {
            AtomicReference atomicReference = this.bravo;
            Object obj = atomicReference.get();
            Set set2 = null;
            List list = null;
            List list2 = null;
            if (obj != null) {
                if (obj instanceof Set) {
                    set = (Set) obj;
                } else if (obj instanceof List) {
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set = set3;
                    list = list2;
                } else {
                    androidx.compose.runtime.r.delta("Unexpected notification");
                    throw new KotlinNothingValueException();
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set2 = set;
            }
            if (set2 == null) {
                return z10;
            }
            synchronized (this.golf) {
                J.e eVar = this.foxtrot;
                Object[] objArr = eVar.alpha;
                int i4 = eVar.red;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (!((w) objArr[i5]).bravo(set2) && !z10) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                }
            }
        }
    }

    public final void delta(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        w wVar;
        synchronized (this.golf) {
            J.e eVar = this.foxtrot;
            Object[] objArr = eVar.alpha;
            int i4 = eVar.red;
            int i5 = 0;
            while (true) {
                if (i5 < i4) {
                    obj2 = objArr[i5];
                    if (((w) obj2).alpha == function1) {
                        break;
                    } else {
                        i5++;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            wVar = (w) obj2;
            if (wVar == null) {
                Intrinsics.charlie(function1, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, kotlin.Unit>");
                kotlin.jvm.internal.x.echo(1, function1);
                wVar = new w(function1);
                eVar.bravo(wVar);
            }
        }
        w wVar2 = this.india;
        long j5 = this.juliet;
        if (j5 != -1 && j5 != P.e.charlie()) {
            StringBuilder uniform = Q0.c.uniform("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", j5, "), currentThread={id=");
            uniform.append(P.e.charlie());
            uniform.append(", name=");
            uniform.append(Thread.currentThread().getName());
            uniform.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            J.alpha(uniform.toString());
        }
        try {
            this.india = wVar;
            this.juliet = P.e.charlie();
            wVar.alpha(obj, this.echo, function0);
        } finally {
            this.india = wVar2;
            this.juliet = j5;
        }
    }

    public final void echo() {
        Ac.k kVar = this.delta;
        n.foxtrot(n.alpha);
        synchronized (n.charlie) {
            n.hotel = CollectionsKt.plus(n.hotel, kVar);
        }
        this.hotel = new B2.s(25, kVar);
    }
}
