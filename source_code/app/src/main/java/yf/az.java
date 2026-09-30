package yf;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.J6;
import vf.C3204h;
import vf.C3207k;
import xf.EnumC3340a;
import zf.AbstractC3511a;

/* loaded from: classes2.dex */
public class az extends AbstractC3511a implements as, InterfaceC3439i, zf.v {

    /* renamed from: a, reason: collision with root package name */
    public Object[] f14161a;

    /* renamed from: b, reason: collision with root package name */
    public long f14162b;

    /* renamed from: c, reason: collision with root package name */
    public long f14163c;

    /* renamed from: d, reason: collision with root package name */
    public int f14164d;
    public int e;
    public final int teal;
    public final int white;
    public final EnumC3340a yellow;

    public az(int i4, int i5, EnumC3340a enumC3340a) {
        this.teal = i4;
        this.white = i5;
        this.yellow = enumC3340a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: all -> 0x0038, TryCatch #1 {all -> 0x0038, blocks: (B:14:0x0031, B:18:0x0079, B:20:0x0081, B:29:0x0094, B:32:0x009b, B:33:0x009f, B:35:0x00a0, B:41:0x004b), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r5v1, types: [zf.a] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [yf.az] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [yf.j] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v2, types: [zf.c] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [yf.B] */
    /* JADX WARN: Type inference failed for: r9v8, types: [yf.B] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00ae -> B:15:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void juliet(az azVar, InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        ay ayVar;
        Od.a aVar;
        int i4;
        ?? r5;
        InterfaceC3440j interfaceC3440j2;
        vf.I i5;
        vf.I i10;
        InterfaceC3440j interfaceC3440j3;
        Object romeo;
        C3429B c3429b;
        try {
            try {
                if (cVar instanceof ay) {
                    ayVar = (ay) cVar;
                    int i11 = ayVar.yellow;
                    if ((i11 & RecyclerView.UNDEFINED_DURATION) != 0) {
                        ayVar.yellow = i11 - RecyclerView.UNDEFINED_DURATION;
                        Object obj = ayVar.teal;
                        aVar = Od.a.alpha;
                        i4 = ayVar.yellow;
                        if (i4 == 0) {
                            if (i4 != 1) {
                                if (i4 != 2) {
                                    if (i4 == 3) {
                                        i10 = ayVar.silver;
                                        C3429B c3429b2 = ayVar.red;
                                        interfaceC3440j3 = ayVar.purple;
                                        az azVar2 = ayVar.alpha;
                                        ResultKt.alpha(obj);
                                        az azVar3 = azVar2;
                                        C3429B c3429b3 = c3429b2;
                                        interfaceC3440j2 = interfaceC3440j3;
                                        i5 = i10;
                                        azVar = azVar3;
                                        c3429b = c3429b3;
                                        r5 = azVar;
                                        i10 = i5;
                                        interfaceC3440j3 = interfaceC3440j2;
                                        interfaceC3440j = c3429b;
                                        do {
                                            romeo = r5.romeo(interfaceC3440j);
                                            if (romeo == AbstractC3428A.alpha) {
                                                if (i10 != null && !i10.echo()) {
                                                    throw i10.quebec();
                                                }
                                                ayVar.alpha = r5;
                                                ayVar.purple = interfaceC3440j3;
                                                ayVar.red = interfaceC3440j;
                                                ayVar.silver = i10;
                                                ayVar.yellow = 3;
                                                azVar3 = r5;
                                                c3429b3 = interfaceC3440j;
                                                if (interfaceC3440j3.emit(romeo, ayVar) == aVar) {
                                                    return;
                                                }
                                                interfaceC3440j2 = interfaceC3440j3;
                                                i5 = i10;
                                                azVar = azVar3;
                                                c3429b = c3429b3;
                                                r5 = azVar;
                                                i10 = i5;
                                                interfaceC3440j3 = interfaceC3440j2;
                                                interfaceC3440j = c3429b;
                                                romeo = r5.romeo(interfaceC3440j);
                                                if (romeo == AbstractC3428A.alpha) {
                                                    ayVar.alpha = r5;
                                                    ayVar.purple = interfaceC3440j3;
                                                    ayVar.red = interfaceC3440j;
                                                    ayVar.silver = i10;
                                                    ayVar.yellow = 2;
                                                }
                                            }
                                        } while (r5.hotel(interfaceC3440j, ayVar) != aVar);
                                        return;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                i10 = ayVar.silver;
                                C3429B c3429b4 = ayVar.red;
                                interfaceC3440j3 = ayVar.purple;
                                az azVar4 = ayVar.alpha;
                                ResultKt.alpha(obj);
                                r5 = azVar4;
                                interfaceC3440j = c3429b4;
                                do {
                                    romeo = r5.romeo(interfaceC3440j);
                                    if (romeo == AbstractC3428A.alpha) {
                                    }
                                } while (r5.hotel(interfaceC3440j, ayVar) != aVar);
                                return;
                            }
                            interfaceC3440j = ayVar.red;
                            InterfaceC3440j interfaceC3440j4 = ayVar.purple;
                            az azVar5 = ayVar.alpha;
                            try {
                                ResultKt.alpha(obj);
                                interfaceC3440j2 = interfaceC3440j4;
                                azVar = azVar5;
                                interfaceC3440j = interfaceC3440j;
                            } catch (Throwable th) {
                                th = th;
                                r5 = azVar5;
                                r5.foxtrot(interfaceC3440j);
                                throw th;
                            }
                        } else {
                            ResultKt.alpha(obj);
                            interfaceC3440j2 = interfaceC3440j;
                            interfaceC3440j = (C3429B) azVar.charlie();
                        }
                        i5 = (vf.I) ayVar.getContext().get(vf.H.alpha);
                        c3429b = interfaceC3440j;
                        r5 = azVar;
                        i10 = i5;
                        interfaceC3440j3 = interfaceC3440j2;
                        interfaceC3440j = c3429b;
                        do {
                            romeo = r5.romeo(interfaceC3440j);
                            if (romeo == AbstractC3428A.alpha) {
                            }
                        } while (r5.hotel(interfaceC3440j, ayVar) != aVar);
                        return;
                    }
                }
                i5 = (vf.I) ayVar.getContext().get(vf.H.alpha);
                c3429b = interfaceC3440j;
                r5 = azVar;
                i10 = i5;
                interfaceC3440j3 = interfaceC3440j2;
                interfaceC3440j = c3429b;
                do {
                    romeo = r5.romeo(interfaceC3440j);
                    if (romeo == AbstractC3428A.alpha) {
                    }
                } while (r5.hotel(interfaceC3440j, ayVar) != aVar);
                return;
            } catch (Throwable th2) {
                r5 = azVar;
                th = th2;
                r5.foxtrot(interfaceC3440j);
                throw th;
            }
            if (i4 == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        ayVar = new ay(azVar, cVar);
        Object obj2 = ayVar.teal;
        aVar = Od.a.alpha;
        i4 = ayVar.yellow;
    }

    @Override // yf.as
    public final boolean alpha(Object obj) {
        int i4;
        boolean z2;
        Nd.c[] cVarArr = zf.b.alpha;
        synchronized (this) {
            if (papa(obj)) {
                cVarArr = mike(cVarArr);
                z2 = true;
            } else {
                z2 = false;
            }
        }
        for (Nd.c cVar : cVarArr) {
            if (cVar != null) {
                Result.Companion companion = Result.INSTANCE;
                cVar.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
            }
        }
        return z2;
    }

    @Override // zf.v
    public final InterfaceC3439i bravo(Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        return AbstractC3428A.quebec(this, hVar, i4, enumC3340a);
    }

    @Override // yf.InterfaceC3439i
    public final Object collect(InterfaceC3440j interfaceC3440j, Nd.c cVar) {
        juliet(this, interfaceC3440j, cVar);
        return Od.a.alpha;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yf.B, zf.c, java.lang.Object] */
    @Override // zf.AbstractC3511a
    public final zf.c delta() {
        ?? obj = new Object();
        obj.alpha = -1L;
        return obj;
    }

    @Override // zf.AbstractC3511a
    public final zf.c[] echo() {
        return new C3429B[2];
    }

    @Override // yf.as, yf.InterfaceC3440j
    public final Object emit(Object obj, Nd.c cVar) {
        Throwable th;
        Nd.c[] mike;
        ax axVar;
        if (alpha(obj)) {
            return Unit.INSTANCE;
        }
        C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        Nd.c[] cVarArr = zf.b.alpha;
        synchronized (this) {
            try {
                if (papa(obj)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c3207k.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                        mike = mike(cVarArr);
                        axVar = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        ax axVar2 = new ax(this, november() + this.f14164d + this.e, obj, c3207k);
                        lima(axVar2);
                        this.e++;
                        if (this.white == 0) {
                            cVarArr = mike(cVarArr);
                        }
                        mike = cVarArr;
                        axVar = axVar2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (axVar != null) {
                    c3207k.whiskey(new C3204h(2, axVar));
                }
                for (Nd.c cVar2 : mike) {
                    if (cVar2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        cVar2.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
                    }
                }
                Object sierra = c3207k.sierra();
                Od.a aVar = Od.a.alpha;
                if (sierra != aVar) {
                    sierra = Unit.INSTANCE;
                }
                if (sierra == aVar) {
                    return sierra;
                }
                return Unit.INSTANCE;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public final Object hotel(C3429B c3429b, ay ayVar) {
        C3207k c3207k = new C3207k(1, J6.delta(ayVar));
        c3207k.tango();
        synchronized (this) {
            if (quebec(c3429b) < 0) {
                c3429b.bravo = c3207k;
            } else {
                Result.Companion companion = Result.INSTANCE;
                c3207k.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
            }
        }
        Object sierra = c3207k.sierra();
        if (sierra == Od.a.alpha) {
            return sierra;
        }
        return Unit.INSTANCE;
    }

    public final void india() {
        if (this.white != 0 || this.e > 1) {
            Object[] objArr = this.f14161a;
            Intrinsics.checkNotNull(objArr);
            while (this.e > 0 && AbstractC3428A.echo(objArr, (november() + (this.f14164d + this.e)) - 1) == AbstractC3428A.alpha) {
                this.e--;
                AbstractC3428A.golf(objArr, november() + this.f14164d + this.e, null);
            }
        }
    }

    public final void kilo() {
        zf.c[] cVarArr;
        Object[] objArr = this.f14161a;
        Intrinsics.checkNotNull(objArr);
        AbstractC3428A.golf(objArr, november(), null);
        this.f14164d--;
        long november = november() + 1;
        if (this.f14162b < november) {
            this.f14162b = november;
        }
        if (this.f14163c < november) {
            if (this.purple != 0 && (cVarArr = this.alpha) != null) {
                for (zf.c cVar : cVarArr) {
                    if (cVar != null) {
                        C3429B c3429b = (C3429B) cVar;
                        long j5 = c3429b.alpha;
                        if (j5 >= 0 && j5 < november) {
                            c3429b.alpha = november;
                        }
                    }
                }
            }
            this.f14163c = november;
        }
    }

    public final void lima(Object obj) {
        int i4 = this.f14164d + this.e;
        Object[] objArr = this.f14161a;
        if (objArr == null) {
            objArr = oscar(0, null, 2);
        } else if (i4 >= objArr.length) {
            objArr = oscar(i4, objArr, objArr.length * 2);
        }
        AbstractC3428A.golf(objArr, november() + i4, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object[], java.lang.Object] */
    public final Nd.c[] mike(Nd.c[] cVarArr) {
        zf.c[] cVarArr2;
        C3429B c3429b;
        C3207k c3207k;
        int length = cVarArr.length;
        if (this.purple != 0 && (cVarArr2 = this.alpha) != null) {
            int length2 = cVarArr2.length;
            int i4 = 0;
            cVarArr = cVarArr;
            while (i4 < length2) {
                zf.c cVar = cVarArr2[i4];
                if (cVar != null && (c3207k = (c3429b = (C3429B) cVar).bravo) != null && quebec(c3429b) >= 0) {
                    int length3 = cVarArr.length;
                    cVarArr = cVarArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(cVarArr, Math.max(2, cVarArr.length * 2));
                        Intrinsics.delta(copyOf, "copyOf(...)");
                        cVarArr = copyOf;
                    }
                    cVarArr[length] = c3207k;
                    c3429b.bravo = null;
                    length++;
                }
                i4++;
                cVarArr = cVarArr;
            }
        }
        return cVarArr;
    }

    public final long november() {
        return Math.min(this.f14163c, this.f14162b);
    }

    public final Object[] oscar(int i4, Object[] objArr, int i5) {
        if (i5 > 0) {
            Object[] objArr2 = new Object[i5];
            this.f14161a = objArr2;
            if (objArr != null) {
                long november = november();
                for (int i10 = 0; i10 < i4; i10++) {
                    long j5 = i10 + november;
                    AbstractC3428A.golf(objArr2, j5, objArr[((int) j5) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        throw new IllegalStateException("Buffer size overflow");
    }

    public final boolean papa(Object obj) {
        int i4 = this.purple;
        int i5 = this.teal;
        if (i4 == 0) {
            if (i5 != 0) {
                lima(obj);
                int i10 = this.f14164d + 1;
                this.f14164d = i10;
                if (i10 > i5) {
                    kilo();
                }
                this.f14163c = november() + this.f14164d;
                return true;
            }
        } else {
            int i11 = this.f14164d;
            int i12 = this.white;
            if (i11 >= i12 && this.f14163c <= this.f14162b) {
                int ordinal = this.yellow.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    return false;
                }
            }
            lima(obj);
            int i13 = this.f14164d + 1;
            this.f14164d = i13;
            if (i13 > i12) {
                kilo();
            }
            long november = november() + this.f14164d;
            long j5 = this.f14162b;
            if (((int) (november - j5)) > i5) {
                sierra(1 + j5, this.f14163c, november() + this.f14164d, november() + this.f14164d + this.e);
            }
        }
        return true;
    }

    public final long quebec(C3429B c3429b) {
        long j5 = c3429b.alpha;
        if (j5 >= november() + this.f14164d) {
            if (this.white > 0 || j5 > november() || this.e == 0) {
                return -1L;
            }
            return j5;
        }
        return j5;
    }

    public final Object romeo(C3429B c3429b) {
        Object obj;
        Nd.c[] cVarArr = zf.b.alpha;
        synchronized (this) {
            try {
                long quebec = quebec(c3429b);
                if (quebec < 0) {
                    obj = AbstractC3428A.alpha;
                } else {
                    long j5 = c3429b.alpha;
                    Object[] objArr = this.f14161a;
                    Intrinsics.checkNotNull(objArr);
                    Object echo = AbstractC3428A.echo(objArr, quebec);
                    if (echo instanceof ax) {
                        echo = ((ax) echo).red;
                    }
                    c3429b.alpha = quebec + 1;
                    Object obj2 = echo;
                    cVarArr = tango(j5);
                    obj = obj2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (Nd.c cVar : cVarArr) {
            if (cVar != null) {
                Result.Companion companion = Result.INSTANCE;
                cVar.resumeWith(Result.m206constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    public final void sierra(long j5, long j6, long j7, long j10) {
        long min = Math.min(j6, j5);
        for (long november = november(); november < min; november++) {
            Object[] objArr = this.f14161a;
            Intrinsics.checkNotNull(objArr);
            AbstractC3428A.golf(objArr, november, null);
        }
        this.f14162b = j5;
        this.f14163c = j6;
        this.f14164d = (int) (j7 - min);
        this.e = (int) (j10 - j7);
    }

    public final Nd.c[] tango(long j5) {
        int i4;
        long j6;
        long j7;
        long j10;
        int i5;
        Nd.c[] cVarArr;
        long j11;
        zf.c[] cVarArr2;
        long j12 = this.f14163c;
        Nd.c[] cVarArr3 = zf.b.alpha;
        if (j5 <= j12) {
            long november = november();
            long j13 = this.f14164d + november;
            int i10 = this.white;
            if (i10 == 0 && this.e > 0) {
                j13++;
            }
            int i11 = 0;
            if (this.purple != 0 && (cVarArr2 = this.alpha) != null) {
                for (zf.c cVar : cVarArr2) {
                    if (cVar != null) {
                        long j14 = ((C3429B) cVar).alpha;
                        if (j14 >= 0 && j14 < j13) {
                            j13 = j14;
                        }
                    }
                }
            }
            if (j13 > this.f14163c) {
                long november2 = november() + this.f14164d;
                if (this.purple > 0) {
                    i4 = Math.min(this.e, i10 - ((int) (november2 - j13)));
                } else {
                    i4 = this.e;
                }
                long j15 = this.e + november2;
                Af.t tVar = AbstractC3428A.alpha;
                if (i4 > 0) {
                    Nd.c[] cVarArr4 = new Nd.c[i4];
                    j10 = 1;
                    Object[] objArr = this.f14161a;
                    Intrinsics.checkNotNull(objArr);
                    i5 = i10;
                    long j16 = november2;
                    while (true) {
                        if (november2 < j15) {
                            j6 = november;
                            Object echo = AbstractC3428A.echo(objArr, november2);
                            if (echo != tVar) {
                                Intrinsics.charlie(echo, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                                ax axVar = (ax) echo;
                                int i12 = i11 + 1;
                                j7 = j13;
                                cVarArr4[i11] = axVar.silver;
                                AbstractC3428A.golf(objArr, november2, tVar);
                                AbstractC3428A.golf(objArr, j16, axVar.red);
                                j16++;
                                if (i12 >= i4) {
                                    break;
                                }
                                i11 = i12;
                            } else {
                                j7 = j13;
                            }
                            november2++;
                            november = j6;
                            j13 = j7;
                        } else {
                            j6 = november;
                            j7 = j13;
                            break;
                        }
                    }
                    november2 = j16;
                    cVarArr = cVarArr4;
                } else {
                    j6 = november;
                    j7 = j13;
                    j10 = 1;
                    i5 = i10;
                    cVarArr = cVarArr3;
                }
                int i13 = (int) (november2 - j6);
                if (this.purple == 0) {
                    j11 = november2;
                } else {
                    j11 = j7;
                }
                long max = Math.max(this.f14162b, november2 - Math.min(this.teal, i13));
                if (i5 == 0 && max < j15) {
                    Object[] objArr2 = this.f14161a;
                    Intrinsics.checkNotNull(objArr2);
                    if (Intrinsics.areEqual(AbstractC3428A.echo(objArr2, max), tVar)) {
                        november2 += j10;
                        max += j10;
                    }
                }
                sierra(max, j11, november2, j15);
                india();
                if (cVarArr.length == 0) {
                    return cVarArr;
                }
                return mike(cVarArr);
            }
        }
        return cVarArr3;
    }
}
