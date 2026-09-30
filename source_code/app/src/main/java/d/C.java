package d;

import bz.AbstractC0779d;
import bz.AbstractC0800z;
import bz.C0788m;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class C extends Pd.i implements Xd.l {
    public kotlin.jvm.internal.q alpha;
    public kotlin.jvm.internal.q purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Ref.ObjectRef f11972s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f11973t;
    public /* synthetic */ Object teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ J f11974u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ float f11975v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C1548o0 f11976w;
    public final /* synthetic */ kotlin.jvm.internal.r white;
    public final /* synthetic */ Ref.ObjectRef yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(kotlin.jvm.internal.r rVar, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2, float f5, J j5, float f10, C1548o0 c1548o0, Nd.c cVar) {
        super(2, cVar);
        this.white = rVar;
        this.yellow = objectRef;
        this.f11972s = objectRef2;
        this.f11973t = f5;
        this.f11974u = j5;
        this.f11975v = f10;
        this.f11976w = c1548o0;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C c3 = new C(this.white, this.yellow, this.f11972s, this.f11973t, this.f11974u, this.f11975v, this.f11976w, cVar);
        c3.teal = obj;
        return c3;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C) create((C1542l0) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c3  */
    /* JADX WARN: Type inference failed for: r11v24, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlin.jvm.internal.q, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0183 -> B:7:0x0184). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C1542l0 c1542l0;
        kotlin.jvm.internal.q qVar;
        kotlin.jvm.internal.r rVar;
        Ref.ObjectRef objectRef;
        int i4;
        int i5;
        int i10;
        C1542l0 c1542l02;
        kotlin.jvm.internal.q qVar2;
        int i11;
        Ref.ObjectRef objectRef2;
        kotlin.jvm.internal.q qVar3;
        C c3 = this;
        Od.a aVar = Od.a.alpha;
        int i12 = c3.silver;
        Ref.ObjectRef objectRef3 = c3.yellow;
        Ref.ObjectRef objectRef4 = c3.f11972s;
        kotlin.jvm.internal.r rVar2 = c3.white;
        int i13 = 3;
        int i14 = 2;
        int i15 = 1;
        if (i12 != 0) {
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 3) {
                        kotlin.jvm.internal.q qVar4 = c3.purple;
                        kotlin.jvm.internal.q qVar5 = c3.alpha;
                        c1542l02 = (C1542l0) c3.teal;
                        ResultKt.alpha(obj);
                        i10 = 3;
                        i5 = 2;
                        i4 = 1;
                        objectRef2 = objectRef3;
                        qVar3 = qVar5;
                        qVar2 = qVar4;
                        Object bravo = obj;
                        qVar2.alpha = ((Boolean) bravo).booleanValue();
                        objectRef3 = objectRef2;
                        c1542l0 = c1542l02;
                        i14 = i5;
                        i15 = i4;
                        qVar = qVar3;
                        i13 = i10;
                        if (!qVar.alpha) {
                            qVar.alpha = false;
                            float floatValue = rVar2.alpha - ((Number) ((androidx.compose.runtime.t0) ((C0788m) objectRef3.alpha).purple).getValue()).floatValue();
                            boolean z2 = ((ay) objectRef4.alpha).charlie;
                            J j5 = c3.f11974u;
                            if (!z2) {
                                float abs = Math.abs(floatValue);
                                float f5 = c3.f11973t;
                                if (abs >= f5) {
                                    float signum = Math.signum(floatValue) * f5;
                                    j5.charlie(c1542l0, signum);
                                    C0788m c0788m = (C0788m) objectRef3.alpha;
                                    C0788m foxtrot = AbstractC0779d.foxtrot(c0788m, ((Number) ((androidx.compose.runtime.t0) c0788m.purple).getValue()).floatValue() + signum);
                                    objectRef3.alpha = foxtrot;
                                    int delta = Zd.a.delta(Math.abs(rVar2.alpha - ((Number) ((androidx.compose.runtime.t0) foxtrot.purple).getValue()).floatValue()) / c3.f11975v);
                                    if (delta > 100) {
                                        delta = 100;
                                    }
                                    C0788m c0788m2 = (C0788m) objectRef3.alpha;
                                    float f10 = rVar2.alpha;
                                    C1548o0 c1548o0 = c3.f11976w;
                                    int i16 = delta;
                                    J j6 = c3.f11974u;
                                    Ref.ObjectRef objectRef5 = objectRef4;
                                    kotlin.jvm.internal.r rVar3 = rVar2;
                                    Ec.d dVar = new Ec.d(j6, objectRef5, rVar3, c1548o0, qVar, 2);
                                    qVar2 = qVar;
                                    objectRef = objectRef5;
                                    rVar = rVar3;
                                    c3.teal = c1542l0;
                                    c3.alpha = qVar2;
                                    c3.purple = null;
                                    c3.red = i16;
                                    c3.silver = i14;
                                    j6.getClass();
                                    ?? obj2 = new Object();
                                    obj2.alpha = ((Number) ((androidx.compose.runtime.t0) c0788m2.purple).getValue()).floatValue();
                                    Float f11 = new Float(f10);
                                    bz.f0 kilo = AbstractC0779d.kilo(i16, 0, AbstractC0800z.delta, i14);
                                    C1542l0 c1542l03 = c1542l0;
                                    X9.e eVar = new X9.e((Object) obj2, j6, c1542l03, dVar, 8);
                                    i5 = i14;
                                    i10 = 3;
                                    i4 = 1;
                                    Object delta2 = bz.P.delta(c0788m2, f11, kilo, true, eVar, c3);
                                    if (delta2 != Od.a.alpha) {
                                        delta2 = Unit.INSTANCE;
                                    }
                                    if (delta2 != aVar) {
                                        c1542l02 = c1542l03;
                                        i11 = i16;
                                        if (qVar2.alpha) {
                                            c3.teal = c1542l02;
                                            c3.alpha = qVar2;
                                            c3.purple = qVar2;
                                            c3.silver = i10;
                                            objectRef2 = objectRef3;
                                            objectRef4 = objectRef;
                                            rVar2 = rVar;
                                            bravo = J.bravo(c3.f11974u, objectRef4, rVar2, c3.f11976w, objectRef2, 50 - i11, c3);
                                            if (bravo != aVar) {
                                                qVar3 = qVar2;
                                                qVar2.alpha = ((Boolean) bravo).booleanValue();
                                                objectRef3 = objectRef2;
                                                c1542l0 = c1542l02;
                                                i14 = i5;
                                                i15 = i4;
                                                qVar = qVar3;
                                                i13 = i10;
                                                if (!qVar.alpha) {
                                                    return Unit.INSTANCE;
                                                }
                                            }
                                        } else {
                                            c1542l0 = c1542l02;
                                            i13 = i10;
                                            i14 = i5;
                                            i15 = i4;
                                            objectRef4 = objectRef;
                                            rVar2 = rVar;
                                            qVar = qVar2;
                                            if (!qVar.alpha) {
                                            }
                                        }
                                    }
                                    return aVar;
                                }
                            }
                            C1542l0 c1542l04 = c1542l0;
                            i10 = i13;
                            i4 = i15;
                            kotlin.jvm.internal.q qVar6 = qVar;
                            i5 = i14;
                            objectRef2 = objectRef3;
                            j5.charlie(c1542l04, floatValue);
                            c3.teal = c1542l04;
                            c3.alpha = qVar6;
                            c3.purple = qVar6;
                            c3.silver = i4;
                            Object bravo2 = J.bravo(c3.f11974u, objectRef4, rVar2, c3.f11976w, objectRef2, 50L, c3);
                            if (bravo2 != aVar) {
                                qVar3 = qVar6;
                                c1542l02 = c1542l04;
                                qVar6.alpha = ((Boolean) bravo2).booleanValue();
                                c3 = this;
                                objectRef3 = objectRef2;
                                c1542l0 = c1542l02;
                                i14 = i5;
                                i15 = i4;
                                qVar = qVar3;
                                i13 = i10;
                                if (!qVar.alpha) {
                                }
                            }
                            return aVar;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i11 = c3.red;
                    qVar2 = c3.alpha;
                    c1542l02 = (C1542l0) c3.teal;
                    ResultKt.alpha(obj);
                    objectRef = objectRef4;
                    rVar = rVar2;
                    i10 = 3;
                    i5 = 2;
                    i4 = 1;
                    if (qVar2.alpha) {
                    }
                }
            } else {
                kotlin.jvm.internal.q qVar7 = c3.purple;
                kotlin.jvm.internal.q qVar8 = c3.alpha;
                c1542l02 = (C1542l0) c3.teal;
                ResultKt.alpha(obj);
                i10 = 3;
                i5 = 2;
                i4 = 1;
                objectRef2 = objectRef3;
                qVar3 = qVar8;
                qVar7.alpha = ((Boolean) obj).booleanValue();
                c3 = this;
                objectRef3 = objectRef2;
                c1542l0 = c1542l02;
                i14 = i5;
                i15 = i4;
                qVar = qVar3;
                i13 = i10;
                if (!qVar.alpha) {
                }
            }
        } else {
            ResultKt.alpha(obj);
            c1542l0 = (C1542l0) c3.teal;
            ?? obj3 = new Object();
            obj3.alpha = true;
            qVar = obj3;
            if (!qVar.alpha) {
            }
        }
    }
}
