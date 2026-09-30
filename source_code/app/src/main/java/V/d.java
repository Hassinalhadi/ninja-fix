package V;

import A0.ac;
import A0.h;
import A0.j;
import A0.k;
import A0.s;
import A0.t;
import A0.v;
import A0.x;
import A2.q;
import D0.aj;
import D0.ak;
import D0.g;
import F.C0088b;
import F.C0092c;
import Q0.p;
import Xd.l;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.InterfaceC0640j;
import androidx.recyclerview.widget.RecyclerView;
import bv.aa;
import bv.al;
import bv.n;
import bv.o;
import j1.AbstractC1932f;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s0.L;
import s1.C2576i;
import t0.C2935q0;
import t0.C2946x;
import t0.W;
import t6.AbstractC3017k3;
import t6.O2;
import w0.C3232a;

/* loaded from: classes3.dex */
public final class d implements InterfaceC0640j, View.OnAttachStateChangeListener {
    public final C2946x alpha;

    /* renamed from: c, reason: collision with root package name */
    public aa f2163c;

    /* renamed from: d, reason: collision with root package name */
    public long f2164d;
    public final aa e;

    /* renamed from: f, reason: collision with root package name */
    public C2935q0 f2165f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f2166g;

    /* renamed from: h, reason: collision with root package name */
    public final q f2167h;
    public final P7.c purple;
    public C3232a red;
    public final ArrayList silver = new ArrayList();
    public final long teal = 100;
    public a white = a.alpha;
    public boolean yellow = true;

    /* renamed from: a, reason: collision with root package name */
    public final xf.e f2161a = AbstractC3017k3.bravo(1, 6, null);

    /* renamed from: b, reason: collision with root package name */
    public final Handler f2162b = new Handler(Looper.getMainLooper());

    public d(C2946x c2946x, P7.c cVar) {
        this.alpha = c2946x;
        this.purple = cVar;
        aa aaVar = o.alpha;
        Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2163c = aaVar;
        this.e = new aa();
        s alpha = c2946x.getSemanticsOwner().alpha();
        Intrinsics.charlie(aaVar, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f2165f = new C2935q0(alpha, aaVar);
        this.f2167h = new q(20, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 != r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (vf.ad.november(r7.teal, r0) == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:11:0x0047). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(Pd.c cVar) {
        c cVar2;
        int i4;
        xf.b bVar;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i5 = cVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                cVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = cVar2.purple;
                Od.a aVar = Od.a.alpha;
                i4 = cVar2.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            bVar = cVar2.alpha;
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        bVar = cVar2.alpha;
                        ResultKt.alpha(obj);
                        if (((Boolean) obj).booleanValue()) {
                            bVar.delta();
                            if (echo()) {
                                foxtrot();
                            }
                            if (!this.f2166g) {
                                this.f2166g = true;
                                this.f2162b.post(this.f2167h);
                            }
                            cVar2.alpha = bVar;
                            cVar2.silver = 2;
                        } else {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    ResultKt.alpha(obj);
                    xf.e eVar = this.f2161a;
                    eVar.getClass();
                    bVar = new xf.b(eVar);
                }
                cVar2.alpha = bVar;
                cVar2.silver = 1;
                obj = bVar.charlie(cVar2);
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = cVar2.silver;
        if (i4 == 0) {
        }
        cVar2.alpha = bVar;
        cVar2.silver = 1;
        obj2 = bVar.charlie(cVar2);
    }

    public final void bravo(n nVar) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j5;
        char c3;
        long j6;
        int i4;
        s sVar;
        long[] jArr3;
        long[] jArr4;
        long j7;
        g gVar;
        g gVar2;
        long j10;
        g gVar3;
        n nVar2 = nVar;
        int[] iArr3 = nVar2.bravo;
        long[] jArr5 = nVar2.alpha;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j11 = jArr5[i5];
                char c4 = 7;
                long j12 = -9187201950435737472L;
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8;
                    int i11 = 8 - ((~(i5 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j11 & 255) < 128) {
                            int i13 = iArr3[(i5 << 3) + i12];
                            c3 = c4;
                            C2935q0 c2935q0 = (C2935q0) this.e.bravo(i13);
                            t tVar = (t) nVar2.bravo(i13);
                            if (tVar != null) {
                                sVar = tVar.alpha;
                            } else {
                                sVar = null;
                            }
                            if (sVar != null) {
                                j6 = j12;
                                int i14 = sVar.golf;
                                k kVar = sVar.delta;
                                if (c2935q0 == null) {
                                    al alVar = kVar.alpha;
                                    Object[] objArr = alVar.bravo;
                                    long[] jArr6 = alVar.alpha;
                                    int length2 = jArr6.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i15 = i10;
                                        int i16 = 0;
                                        while (true) {
                                            long j13 = jArr6[i16];
                                            j5 = j11;
                                            if ((((~j13) << c3) & j13 & j6) != j6) {
                                                int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                                for (int i18 = 0; i18 < i17; i18++) {
                                                    if ((j13 & 255) < 128) {
                                                        j10 = j13;
                                                        ac acVar = (ac) objArr[(i16 << 3) + i18];
                                                        ac acVar2 = x.alpha;
                                                        ac acVar3 = x.amber;
                                                        if (Intrinsics.areEqual(acVar, acVar3)) {
                                                            List list = (List) v.delta(kVar, acVar3);
                                                            if (list != null) {
                                                                gVar3 = (g) CollectionsKt.green(list);
                                                            } else {
                                                                gVar3 = null;
                                                            }
                                                            hotel(i14, String.valueOf(gVar3));
                                                        }
                                                    } else {
                                                        j10 = j13;
                                                    }
                                                    j13 = j10 >> i15;
                                                }
                                                if (i17 != i15) {
                                                    break;
                                                }
                                            }
                                            if (i16 == length2) {
                                                break;
                                            }
                                            i16++;
                                            j11 = j5;
                                            i15 = 8;
                                        }
                                    } else {
                                        j5 = j11;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    j5 = j11;
                                    al alVar2 = kVar.alpha;
                                    Object[] objArr2 = alVar2.bravo;
                                    long[] jArr7 = alVar2.alpha;
                                    int length3 = jArr7.length - 2;
                                    if (length3 >= 0) {
                                        Object[] objArr3 = objArr2;
                                        jArr2 = jArr5;
                                        int i19 = 0;
                                        while (true) {
                                            long j14 = jArr7[i19];
                                            Object[] objArr4 = objArr3;
                                            i4 = i12;
                                            if ((((~j14) << c3) & j14 & j6) != j6) {
                                                int i20 = 8 - ((~(i19 - length3)) >>> 31);
                                                int i21 = 0;
                                                while (i21 < i20) {
                                                    if ((j14 & 255) < 128) {
                                                        jArr4 = jArr7;
                                                        ac acVar4 = (ac) objArr4[(i19 << 3) + i21];
                                                        ac acVar5 = x.alpha;
                                                        j7 = j14;
                                                        ac acVar6 = x.amber;
                                                        if (Intrinsics.areEqual(acVar4, acVar6)) {
                                                            List list2 = (List) v.delta(c2935q0.alpha, acVar6);
                                                            if (list2 != null) {
                                                                gVar = (g) CollectionsKt.green(list2);
                                                            } else {
                                                                gVar = null;
                                                            }
                                                            List list3 = (List) v.delta(kVar, acVar6);
                                                            if (list3 != null) {
                                                                gVar2 = (g) CollectionsKt.green(list3);
                                                            } else {
                                                                gVar2 = null;
                                                            }
                                                            if (!Intrinsics.areEqual(gVar, gVar2)) {
                                                                hotel(i14, String.valueOf(gVar2));
                                                            }
                                                        }
                                                    } else {
                                                        jArr4 = jArr7;
                                                        j7 = j14;
                                                    }
                                                    j14 = j7 >> 8;
                                                    i21++;
                                                    jArr7 = jArr4;
                                                }
                                                jArr3 = jArr7;
                                                if (i20 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr3 = jArr7;
                                            }
                                            if (i19 == length3) {
                                                break;
                                            }
                                            i19++;
                                            i12 = i4;
                                            objArr3 = objArr4;
                                            jArr7 = jArr3;
                                        }
                                        j11 = j5 >> 8;
                                        i12 = i4 + 1;
                                        jArr5 = jArr2;
                                        c4 = c3;
                                        j12 = j6;
                                        iArr3 = iArr2;
                                        i10 = 8;
                                        nVar2 = nVar;
                                    }
                                }
                                jArr2 = jArr5;
                            } else {
                                throw Q0.c.xray("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j5 = j11;
                            c3 = c4;
                            j6 = j12;
                        }
                        i4 = i12;
                        j11 = j5 >> 8;
                        i12 = i4 + 1;
                        jArr5 = jArr2;
                        c4 = c3;
                        j12 = j6;
                        iArr3 = iArr2;
                        i10 = 8;
                        nVar2 = nVar;
                    }
                    iArr = iArr3;
                    int i22 = i10;
                    jArr = jArr5;
                    if (i11 != i22) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                    jArr = jArr5;
                }
                if (i5 != length) {
                    i5++;
                    nVar2 = nVar;
                    jArr5 = jArr;
                    iArr3 = iArr;
                } else {
                    return;
                }
            }
        }
    }

    public final void charlie(s sVar, l lVar) {
        sVar.getClass();
        List juliet = s.juliet(4, sVar);
        int size = juliet.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            Object obj = juliet.get(i5);
            if (delta().alpha(((s) obj).golf)) {
                lVar.invoke(Integer.valueOf(i4), obj);
                i4++;
            }
        }
    }

    public final n delta() {
        if (this.yellow) {
            this.yellow = false;
            this.f2163c = v.bravo(this.alpha.getSemanticsOwner());
            this.f2164d = System.currentTimeMillis();
        }
        return this.f2163c;
    }

    public final boolean echo() {
        if (this.red != null) {
            return true;
        }
        return false;
    }

    public final void foxtrot() {
        C3232a c3232a = this.red;
        if (c3232a != null && Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.silver;
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                int i4 = 0;
                while (true) {
                    Object obj = c3232a.alpha;
                    if (i4 < size) {
                        e eVar = (e) arrayList.get(i4);
                        int i5 = b.$EnumSwitchMapping$0[eVar.charlie.ordinal()];
                        if (i5 != 1) {
                            if (i5 == 2) {
                                AutofillId alpha = c3232a.alpha(eVar.alpha);
                                if (alpha != null && Build.VERSION.SDK_INT >= 29) {
                                    I2.b.foxtrot(AbstractC1932f.mike(obj), alpha);
                                }
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            C2576i c2576i = eVar.delta;
                            if (c2576i != null && Build.VERSION.SDK_INT >= 29) {
                                I2.b.echo(AbstractC1932f.mike(obj), (ViewStructure) c2576i.alpha);
                            }
                        }
                        i4++;
                    } else {
                        if (Build.VERSION.SDK_INT >= 29) {
                            ContentCaptureSession mike = AbstractC1932f.mike(obj);
                            ai.a bravo = O2.bravo(c3232a.bravo);
                            Objects.requireNonNull(bravo);
                            I2.b.hotel(mike, vg.al.hotel(bravo.alpha), new long[]{Long.MIN_VALUE});
                        }
                        arrayList.clear();
                        return;
                    }
                }
            }
        }
    }

    public final void golf(s sVar, C2935q0 c2935q0) {
        charlie(sVar, new C0092c(6, c2935q0, this));
        List juliet = s.juliet(4, sVar);
        int size = juliet.size();
        for (int i4 = 0; i4 < size; i4++) {
            s sVar2 = (s) juliet.get(i4);
            if (delta().alpha(sVar2.golf)) {
                aa aaVar = this.e;
                int i5 = sVar2.golf;
                if (aaVar.alpha(i5)) {
                    Object bravo = aaVar.bravo(i5);
                    if (bravo != null) {
                        golf(sVar2, (C2935q0) bravo);
                    } else {
                        throw Q0.c.xray("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    public final void hotel(int i4, String str) {
        C3232a c3232a;
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 29 && (c3232a = this.red) != null) {
            AutofillId alpha = c3232a.alpha(i4);
            if (alpha != null) {
                if (i5 >= 29) {
                    I2.b.golf(AbstractC1932f.mike(c3232a.alpha), alpha, str);
                    return;
                }
                return;
            }
            throw Q0.c.xray("Invalid content capture ID");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0088, code lost:
    
        if (r6 == null) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x018e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void india(int i4, s sVar) {
        A0.a aVar;
        Function1 function1;
        int i5;
        ai.a bravo;
        AutofillId hotel;
        C2576i c2576i;
        Z.c cVar;
        C2576i c2576i2;
        String oscar;
        Function1 function12;
        if (!echo()) {
            return;
        }
        k kVar = sVar.delta;
        Boolean bool = (Boolean) v.delta(kVar, x.beige);
        if (this.white == a.alpha && Intrinsics.areEqual(bool, Boolean.TRUE)) {
            A0.a aVar2 = (A0.a) v.delta(kVar, j.lima);
            if (aVar2 != null && (function12 = (Function1) aVar2.bravo) != null) {
            }
        } else if (this.white == a.purple && Intrinsics.areEqual(bool, Boolean.FALSE) && (aVar = (A0.a) v.delta(kVar, j.lima)) != null && (function1 = (Function1) aVar.bravo) != null) {
        }
        C3232a c3232a = this.red;
        L l10 = null;
        if (c3232a != null && (i5 = Build.VERSION.SDK_INT) >= 29 && (bravo = O2.bravo(this.alpha)) != null) {
            if (sVar.lima() != null) {
                hotel = c3232a.alpha(r7.golf);
            } else {
                hotel = vg.al.hotel(bravo.alpha);
            }
            int i10 = sVar.golf;
            long j5 = i10;
            if (i5 >= 29) {
                c2576i = new C2576i(I2.b.delta(AbstractC1932f.mike(c3232a.alpha), hotel, j5));
            } else {
                c2576i = null;
            }
            if (c2576i != null) {
                ac acVar = x.emerald;
                k kVar2 = sVar.delta;
                if (!kVar2.alpha.charlie(acVar)) {
                    ViewStructure viewStructure = (ViewStructure) c2576i.alpha;
                    Bundle extras = viewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong("android.view.contentcapture.EventTimestamp", this.f2164d);
                        extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i4);
                    }
                    String str = (String) v.delta(kVar2, x.yankee);
                    if (str != null) {
                        viewStructure.setId(i10, null, null, str);
                    }
                    if (((Boolean) v.delta(kVar2, x.mike)) != null) {
                        viewStructure.setClassName("android.widget.ViewGroup");
                    }
                    List list = (List) v.delta(kVar2, x.amber);
                    if (list != null) {
                        viewStructure.setClassName("android.widget.TextView");
                        viewStructure.setText(S0.a.alpha(list, "\n", null, 62));
                    }
                    g gVar = (g) v.delta(kVar2, x.blue);
                    if (gVar != null) {
                        viewStructure.setClassName("android.widget.EditText");
                        viewStructure.setText(gVar);
                    }
                    List list2 = (List) v.delta(kVar2, x.alpha);
                    if (list2 != null) {
                        viewStructure.setContentDescription(S0.a.alpha(list2, "\n", null, 62));
                    }
                    h hVar = (h) v.delta(kVar2, x.xray);
                    if (hVar != null && (oscar = W.oscar(hVar.alpha)) != null) {
                        viewStructure.setClassName(oscar);
                    }
                    ak india = W.india(kVar2);
                    if (india != null) {
                        aj ajVar = india.alpha;
                        float charlie = p.charlie(ajVar.bravo.alpha.bravo);
                        Q0.d dVar = ajVar.golf;
                        viewStructure.setTextStyle(dVar.indigo() * dVar.alpha() * charlie, 0, 0, 0);
                    }
                    L delta = sVar.delta();
                    if (delta != null) {
                        if (delta.india()) {
                            l10 = delta;
                        }
                        if (l10 != null) {
                            cVar = sVar.alpha(l10);
                            float f5 = cVar.alpha;
                            float f10 = cVar.bravo;
                            viewStructure.setDimens((int) f5, (int) f10, 0, 0, (int) (cVar.charlie - f5), (int) (cVar.delta - f10));
                            c2576i2 = c2576i;
                            if (c2576i2 != null) {
                                this.silver.add(new e(sVar.golf, this.f2164d, f.alpha, c2576i2));
                            }
                            charlie(sVar, new C0088b(6, this));
                        }
                    }
                    cVar = Z.c.echo;
                    float f52 = cVar.alpha;
                    float f102 = cVar.bravo;
                    viewStructure.setDimens((int) f52, (int) f102, 0, 0, (int) (cVar.charlie - f52), (int) (cVar.delta - f102));
                    c2576i2 = c2576i;
                    if (c2576i2 != null) {
                    }
                    charlie(sVar, new C0088b(6, this));
                }
            }
        }
        c2576i2 = null;
        if (c2576i2 != null) {
        }
        charlie(sVar, new C0088b(6, this));
    }

    public final void juliet(s sVar) {
        if (echo()) {
            this.silver.add(new e(sVar.golf, this.f2164d, f.purple, null));
            List juliet = s.juliet(4, sVar);
            int size = juliet.size();
            for (int i4 = 0; i4 < size; i4++) {
                juliet((s) juliet.get(i4));
            }
        }
    }

    public final void kilo() {
        aa aaVar = this.e;
        aaVar.charlie();
        n delta = delta();
        int[] iArr = delta.bravo;
        Object[] objArr = delta.charlie;
        long[] jArr = delta.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128) {
                            int i11 = (i4 << 3) + i10;
                            aaVar.hotel(iArr[i11], new C2935q0(((t) objArr[i11]).alpha, delta()));
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        break;
                    }
                }
                if (i4 == length) {
                    break;
                } else {
                    i4++;
                }
            }
        }
        this.f2165f = new C2935q0(this.alpha.getSemanticsOwner().alpha(), delta());
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final /* synthetic */ void onCreate(androidx.lifecycle.al alVar) {
        P0.papa(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onDestroy(androidx.lifecycle.al alVar) {
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onPause(androidx.lifecycle.al alVar) {
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final /* synthetic */ void onResume(androidx.lifecycle.al alVar) {
        P0.sierra(alVar);
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onStart(androidx.lifecycle.al alVar) {
        this.red = (C3232a) this.purple.invoke();
        india(-1, this.alpha.getSemanticsOwner().alpha());
        foxtrot();
    }

    @Override // androidx.lifecycle.InterfaceC0640j
    public final void onStop(androidx.lifecycle.al alVar) {
        juliet(this.alpha.getSemanticsOwner().alpha());
        foxtrot();
        this.red = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f2162b.removeCallbacks(this.f2167h);
        this.red = null;
    }
}
