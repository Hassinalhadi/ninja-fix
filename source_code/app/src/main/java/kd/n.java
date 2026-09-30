package kd;

import id.C1914b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import pd.AbstractC2304b;
import t6.AbstractC3006i2;
import zd.C3509a;

/* loaded from: classes2.dex */
public final class n extends Pd.i implements Xd.m {
    public final /* synthetic */ int alpha = 0;
    public ArrayList purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C1914b f12931s;
    public final /* synthetic */ boolean silver;

    /* renamed from: t, reason: collision with root package name */
    public /* synthetic */ Object f12932t;
    public final /* synthetic */ g teal;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f12933u;
    public final /* synthetic */ ArrayList white;
    public final /* synthetic */ e yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z2, g gVar, ArrayList arrayList, ArrayList arrayList2, e eVar, C1914b c1914b, Nd.c cVar) {
        super(3, cVar);
        this.silver = z2;
        this.teal = gVar;
        this.purple = arrayList;
        this.white = arrayList2;
        this.yellow = eVar;
        this.f12931s = c1914b;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                ArrayList arrayList = this.purple;
                ArrayList arrayList2 = this.white;
                g gVar = this.teal;
                e eVar = this.yellow;
                C1914b c1914b = this.f12931s;
                n nVar = new n(this.silver, gVar, arrayList, arrayList2, eVar, c1914b, (Nd.c) obj3);
                nVar.f12932t = (al) obj;
                nVar.f12933u = (C2226c) obj2;
                return nVar.invokeSuspend(Unit.INSTANCE);
            default:
                g gVar2 = this.teal;
                ArrayList arrayList3 = this.white;
                e eVar2 = this.yellow;
                C1914b c1914b2 = this.f12931s;
                n nVar2 = new n(this.silver, gVar2, arrayList3, eVar2, c1914b2, (Nd.c) obj3);
                nVar2.f12932t = (aj) obj;
                nVar2.f12933u = (AbstractC2304b) obj2;
                return nVar2.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015d A[Catch: all -> 0x00cd, TRY_ENTER, TryCatch #4 {all -> 0x00cd, blocks: (B:69:0x00c8, B:78:0x015d, B:82:0x016c), top: B:29:0x0099 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016c A[Catch: all -> 0x00cd, TRY_LEAVE, TryCatch #4 {all -> 0x00cd, blocks: (B:69:0x00c8, B:78:0x015d, B:82:0x016c), top: B:29:0x0099 }] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.util.List] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C2226c c2226c;
        C2226c c2226c2;
        al alVar;
        Object golf;
        Object hotel;
        al alVar2;
        ArrayList arrayList;
        vd.e eVar;
        Object obj2;
        C2226c c2226c3;
        Object juliet;
        AbstractC2304b abstractC2304b;
        aj ajVar;
        ArrayList arrayList2;
        AbstractC2304b abstractC2304b2;
        g gVar = this.teal;
        boolean z2 = this.silver;
        int i4 = this.alpha;
        Od.a aVar = Od.a.alpha;
        switch (i4) {
            case 0:
                int i5 = this.red;
                e eVar2 = this.yellow;
                try {
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2 && i5 != 3) {
                                if (i5 != 4) {
                                    if (i5 == 5) {
                                        c2226c3 = (C2226c) this.f12932t;
                                        try {
                                            ResultKt.alpha(obj);
                                            return Unit.INSTANCE;
                                        } catch (Throwable th) {
                                            th = th;
                                            C3509a c3509a = aa.alpha;
                                            if (eVar2.alpha) {
                                            }
                                            throw th;
                                        }
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c2226c2 = (C2226c) this.f12933u;
                                alVar = (al) this.f12932t;
                                try {
                                    ResultKt.alpha(obj);
                                    c2226c = c2226c2;
                                    golf = obj;
                                    try {
                                        obj2 = (vd.e) golf;
                                    } catch (Throwable unused) {
                                        c2226c2 = c2226c;
                                        c2226c = c2226c2;
                                        obj2 = null;
                                        if (obj2 == null) {
                                        }
                                        this.f12932t = c2226c;
                                        this.f12933u = null;
                                        this.red = 5;
                                        if (alVar.alpha.echo(this, obj2) == aVar) {
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } catch (Throwable unused2) {
                                    c2226c = c2226c2;
                                    obj2 = null;
                                    if (obj2 == null) {
                                    }
                                    this.f12932t = c2226c;
                                    this.f12933u = null;
                                    this.red = 5;
                                    if (alVar.alpha.echo(this, obj2) == aVar) {
                                    }
                                    return Unit.INSTANCE;
                                }
                                if (obj2 == null) {
                                    try {
                                        obj2 = c2226c.delta;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        c2226c3 = c2226c;
                                        C3509a c3509a2 = aa.alpha;
                                        if (eVar2.alpha) {
                                            gVar.log("REQUEST " + AbstractC3006i2.bravo(c2226c3.alpha) + " failed with exception: " + th);
                                        }
                                        throw th;
                                    }
                                }
                                this.f12932t = c2226c;
                                this.f12933u = null;
                                this.red = 5;
                                if (alVar.alpha.echo(this, obj2) == aVar) {
                                    return aVar;
                                }
                                return Unit.INSTANCE;
                            }
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        ?? r02 = (List) this.f12933u;
                        alVar2 = (al) this.f12932t;
                        ResultKt.alpha(obj);
                        arrayList = r02;
                        hotel = obj;
                        eVar = (vd.e) hotel;
                        if (arrayList.size() > 0) {
                            gVar.log(CollectionsKt.maroon(arrayList, "\n", null, null, null, 62));
                        }
                        if (eVar == null) {
                            this.f12932t = null;
                            this.f12933u = null;
                            this.red = 2;
                            if (alVar2.alpha.echo(this, eVar) == aVar) {
                                return aVar;
                            }
                        } else {
                            this.f12932t = null;
                            this.f12933u = null;
                            this.red = 3;
                            if (alVar2.alpha.delta(this) == aVar) {
                                return aVar;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    ResultKt.alpha(obj);
                    al alVar3 = (al) this.f12932t;
                    c2226c = (C2226c) this.f12933u;
                    C3509a c3509a3 = aa.alpha;
                    ArrayList arrayList3 = this.purple;
                    if (!arrayList3.isEmpty()) {
                        if (!arrayList3.isEmpty()) {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                if (((Boolean) ((Function1) it.next()).invoke(c2226c)).booleanValue()) {
                                }
                            }
                        }
                        zd.i iVar = c2226c.foxtrot;
                        C3509a c3509a4 = aa.bravo;
                        Unit unit = Unit.INSTANCE;
                        iVar.foxtrot(c3509a4, unit);
                        return unit;
                    }
                    ArrayList arrayList4 = this.white;
                    if (z2) {
                        ArrayList arrayList5 = new ArrayList();
                        this.f12932t = alVar3;
                        this.f12933u = arrayList5;
                        this.red = 1;
                        hotel = aa.hotel(arrayList4, this.yellow, this.f12931s, c2226c, arrayList5, this);
                        if (hotel != aVar) {
                            alVar2 = alVar3;
                            arrayList = arrayList5;
                            eVar = (vd.e) hotel;
                            if (arrayList.size() > 0) {
                            }
                            if (eVar == null) {
                            }
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    }
                    try {
                        this.f12932t = alVar3;
                        this.f12933u = c2226c;
                        this.red = 4;
                        golf = aa.golf(gVar, eVar2, arrayList4, c2226c, this);
                    } catch (Throwable unused3) {
                        c2226c2 = c2226c;
                        alVar = alVar3;
                        c2226c = c2226c2;
                        obj2 = null;
                        if (obj2 == null) {
                        }
                        this.f12932t = c2226c;
                        this.f12933u = null;
                        this.red = 5;
                        if (alVar.alpha.echo(this, obj2) == aVar) {
                        }
                        return Unit.INSTANCE;
                    }
                    if (golf != aVar) {
                        alVar = alVar3;
                        obj2 = (vd.e) golf;
                        if (obj2 == null) {
                        }
                        this.f12932t = c2226c;
                        this.f12933u = null;
                        this.red = 5;
                        if (alVar.alpha.echo(this, obj2) == aVar) {
                        }
                        return Unit.INSTANCE;
                    }
                    return aVar;
                } catch (Throwable th3) {
                    gVar.log("<-- HTTP FAILED: " + th3);
                    throw th3;
                }
            default:
                int i10 = this.red;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ArrayList arrayList6 = this.purple;
                        abstractC2304b = (AbstractC2304b) this.f12933u;
                        ajVar = (aj) this.f12932t;
                        ResultKt.alpha(obj);
                        arrayList2 = arrayList6;
                        juliet = obj;
                        abstractC2304b2 = (AbstractC2304b) juliet;
                        if (arrayList2.size() > 0) {
                            gVar.log(CollectionsKt.maroon(arrayList2, "\n", null, null, null, 62));
                        }
                        if (!Intrinsics.areEqual(abstractC2304b2, abstractC2304b)) {
                            this.f12932t = null;
                            this.f12933u = null;
                            this.purple = null;
                            this.red = 2;
                            if (ajVar.alpha.echo(this, abstractC2304b2) == aVar) {
                                return aVar;
                            }
                        }
                    }
                } else {
                    ResultKt.alpha(obj);
                    aj ajVar2 = (aj) this.f12932t;
                    AbstractC2304b abstractC2304b3 = (AbstractC2304b) this.f12933u;
                    if (z2) {
                        ArrayList arrayList7 = new ArrayList();
                        this.f12932t = ajVar2;
                        this.f12933u = abstractC2304b3;
                        this.purple = arrayList7;
                        this.red = 1;
                        juliet = aa.juliet(this.white, this.yellow, this.f12931s, abstractC2304b3, arrayList7, this);
                        if (juliet != aVar) {
                            abstractC2304b = abstractC2304b3;
                            ajVar = ajVar2;
                            arrayList2 = arrayList7;
                            abstractC2304b2 = (AbstractC2304b) juliet;
                            if (arrayList2.size() > 0) {
                            }
                            if (!Intrinsics.areEqual(abstractC2304b2, abstractC2304b)) {
                            }
                        } else {
                            return aVar;
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(boolean z2, g gVar, ArrayList arrayList, e eVar, C1914b c1914b, Nd.c cVar) {
        super(3, cVar);
        this.silver = z2;
        this.teal = gVar;
        this.white = arrayList;
        this.yellow = eVar;
        this.f12931s = c1914b;
    }
}
