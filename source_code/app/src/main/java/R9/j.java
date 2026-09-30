package R9;

import A0.z;
import Yb.C0316l0;
import android.os.Handler;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import delivery.samurai.android.services.CaptainLocationMonitoringService;
import delivery.samurai.android.ui.orders.v2.ProcessOrderActivityV2;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.s;
import s6.J6;
import vf.C3207k;
import vf.ab;
import vf.ad;
import z9.C3490g;

/* loaded from: classes2.dex */
public final class j extends Pd.i implements Xd.l {
    public final /* synthetic */ F4.f A;
    public s alpha;
    public Ref.ObjectRef purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f2015s;
    public int silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f2016t;
    public long teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f2017u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f2018v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ C3490g f2019w;
    public long white;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ProcessOrderActivityV2 f2020x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ long f2021y;
    public int yellow;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C0316l0 f2022z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(boolean z2, boolean z10, int i4, String str, C3490g c3490g, ProcessOrderActivityV2 processOrderActivityV2, long j5, C0316l0 c0316l0, F4.f fVar, Nd.c cVar) {
        super(2, cVar);
        this.f2015s = z2;
        this.f2016t = z10;
        this.f2017u = i4;
        this.f2018v = str;
        this.f2019w = c3490g;
        this.f2020x = processOrderActivityV2;
        this.f2021y = j5;
        this.f2022z = c0316l0;
        this.A = fVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        C0316l0 c0316l0 = this.f2022z;
        F4.f fVar = this.A;
        return new j(this.f2015s, this.f2016t, this.f2017u, this.f2018v, this.f2019w, this.f2020x, this.f2021y, c0316l0, fVar, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0204  */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x02e6 -> B:7:0x02e7). Please report as a decompilation issue!!! */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i4;
        Od.a aVar;
        s obj2;
        Ref.ObjectRef objectRef;
        int i5;
        Od.a aVar2;
        ProcessOrderActivityV2 processOrderActivityV2;
        C0316l0 c0316l0;
        F4.f fVar;
        long j5;
        int i10;
        long j6;
        s sVar;
        Ref.ObjectRef objectRef2;
        int i11;
        long j7;
        Object obj3;
        int i12;
        String str;
        e eVar;
        C3490g c3490g;
        Od.a aVar3;
        int i13;
        int i14;
        int i15;
        String str2;
        s sVar2;
        F4.f fVar2;
        C0316l0 c0316l02;
        int i16;
        C3207k c3207k;
        CaptainLocationMonitoringService captainLocationMonitoringService;
        Od.a aVar4 = Od.a.alpha;
        int i17 = this.yellow;
        ProcessOrderActivityV2 processOrderActivityV22 = this.f2020x;
        C3490g c3490g2 = this.f2019w;
        String str3 = this.f2018v;
        F4.f fVar3 = this.A;
        C0316l0 c0316l03 = this.f2022z;
        long j10 = this.f2021y;
        String str4 = " taskType=";
        int i18 = this.f2017u;
        if (i17 != 0) {
            if (i17 != 1) {
                if (i17 != 2) {
                    if (i17 == 3) {
                        i5 = this.red;
                        Ref.ObjectRef objectRef3 = this.purple;
                        s sVar3 = this.alpha;
                        ResultKt.alpha(obj);
                        processOrderActivityV2 = processOrderActivityV22;
                        c3490g = c3490g2;
                        j5 = j10;
                        i14 = i18;
                        fVar = fVar3;
                        c0316l0 = c0316l03;
                        sVar = sVar3;
                        i15 = 1;
                        aVar2 = aVar4;
                        str = " taskType=";
                        objectRef2 = objectRef3;
                        objectRef = objectRef2;
                        i4 = i15;
                        c3490g2 = c3490g;
                        fVar3 = fVar;
                        c0316l03 = c0316l0;
                        str4 = str;
                        aVar = aVar2;
                        obj2 = sVar;
                        processOrderActivityV22 = processOrderActivityV2;
                        i18 = i14;
                        j10 = j5;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    i5 = this.red;
                    Ref.ObjectRef objectRef4 = this.purple;
                    s sVar4 = this.alpha;
                    ResultKt.alpha(obj);
                    str4 = " taskType=";
                    objectRef = objectRef4;
                    obj2 = sVar4;
                    i4 = 1;
                    c3490g2 = c3490g2;
                    fVar3 = fVar3;
                    c0316l03 = c0316l03;
                    aVar = aVar4;
                    i18 = i18;
                    j10 = j10;
                    processOrderActivityV22 = processOrderActivityV22;
                }
            } else {
                int i19 = this.silver;
                long j11 = this.white;
                long j12 = this.teal;
                int i20 = this.red;
                Ref.ObjectRef objectRef5 = this.purple;
                s sVar5 = this.alpha;
                ResultKt.alpha(obj);
                processOrderActivityV2 = processOrderActivityV22;
                i12 = i20;
                i10 = i18;
                aVar2 = aVar4;
                sVar = sVar5;
                str = " taskType=";
                objectRef2 = objectRef5;
                obj3 = obj;
                i11 = i19;
                j7 = j12;
                fVar = fVar3;
                c0316l0 = c0316l03;
                j6 = j11;
                j5 = j10;
                eVar = (e) obj3;
                c3490g = c3490g2;
                if (!(eVar instanceof b)) {
                    int i21 = sVar.alpha;
                    b bVar = (b) eVar;
                    boolean z2 = bVar.alpha;
                    StringBuilder lima = z.lima("FRESH_LOC_ALLOW action=PRE_COMPLETE taskId=", str, str3, " attempt=", i10);
                    lima.append(i21);
                    lima.append(" sent=");
                    lima.append(z2);
                    Log.i("LocationFlow", lima.toString());
                    AtomicBoolean atomicBoolean = k.bravo;
                    if (bVar.alpha) {
                        str2 = "fresh_sent";
                    } else {
                        str2 = "already_fresh";
                    }
                    k.alpha(processOrderActivityV2, str2, this.f2016t, System.currentTimeMillis() - j5, false, this.f2015s);
                    if (k.bravo(processOrderActivityV2)) {
                        c0316l0.invoke();
                    }
                    return Unit.INSTANCE;
                }
                int i22 = i10;
                int i23 = i12;
                if (eVar instanceof c) {
                    c cVar = (c) eVar;
                    f fVar4 = cVar.alpha;
                    if (fVar4 != null) {
                        objectRef2.alpha = fVar4;
                        aVar3 = aVar2;
                        int i24 = sVar.alpha;
                        i13 = i11;
                        StringBuilder lima2 = z.lima("FRESH_LOC_BLOCKED_STALE action=PRE_COMPLETE taskId=", str, str3, " attempt=", i22);
                        lima2.append(i24);
                        lima2.append(" ageMs=");
                        lima2.append(fVar4.alpha);
                        lima2.append(" reason=");
                        lima2.append(fVar4.bravo);
                        Pd.f.alpha(Log.w("LocationFlow", lima2.toString()));
                    } else {
                        aVar3 = aVar2;
                        i13 = i11;
                    }
                    int i25 = sVar.alpha;
                    i14 = i22;
                    StringBuilder lima3 = z.lima("FRESH_LOC_RETRY action=PRE_COMPLETE taskId=", str, str3, " attempt=", i14);
                    lima3.append(i25);
                    lima3.append(" nextAttempt=");
                    lima3.append(i25 + 1);
                    lima3.append(" stompReconnect=");
                    boolean z10 = cVar.bravo;
                    lima3.append(z10);
                    Log.i("LocationFlow", lima3.toString());
                    if (z10 && i23 == 0) {
                        Log.i("LocationFlow", "FRESH_LOC_STOMP_RECONNECT action=PRE_COMPLETE taskId=" + i14 + str + str3 + " requesting STOMP reconnect");
                        c3490g.delta();
                        this.alpha = sVar;
                        this.purple = objectRef2;
                        this.red = 1;
                        this.teal = j7;
                        this.white = j6;
                        this.silver = i13;
                        this.yellow = 2;
                        aVar2 = aVar3;
                        if (ad.november(3000L, this) != aVar2) {
                            Ref.ObjectRef objectRef6 = objectRef2;
                            i5 = 1;
                            str4 = str;
                            objectRef = objectRef6;
                            obj2 = sVar;
                            i4 = 1;
                            c3490g2 = c3490g;
                            fVar3 = fVar;
                            c0316l03 = c0316l0;
                            aVar = aVar2;
                            i18 = i14;
                            j10 = j5;
                            processOrderActivityV22 = processOrderActivityV2;
                        }
                    } else {
                        aVar2 = aVar3;
                        i15 = 1;
                        this.alpha = sVar;
                        this.purple = objectRef2;
                        this.red = i23;
                        this.teal = j7;
                        this.white = j6;
                        this.silver = i13;
                        this.yellow = 3;
                        if (ad.november(Constants.PN_LARGE_ICON_DOWNLOAD_TIMEOUT_IN_MILLIS, this) != aVar2) {
                            i5 = i23;
                            objectRef = objectRef2;
                            i4 = i15;
                            c3490g2 = c3490g;
                            fVar3 = fVar;
                            c0316l03 = c0316l0;
                            str4 = str;
                            aVar = aVar2;
                            obj2 = sVar;
                            processOrderActivityV22 = processOrderActivityV2;
                            i18 = i14;
                            j10 = j5;
                        }
                    }
                    return aVar2;
                }
                if (eVar instanceof d) {
                    f fVar5 = ((d) eVar).alpha;
                    if (fVar5 == null) {
                        fVar5 = (f) objectRef2.alpha;
                    }
                    f fVar6 = fVar5;
                    AtomicBoolean atomicBoolean2 = k.bravo;
                    ProcessOrderActivityV2 processOrderActivityV23 = processOrderActivityV2;
                    k.delta(processOrderActivityV23, this.f2017u, str3, sVar.alpha, fVar6, fVar, c0316l0, this.f2015s, this.f2016t, System.currentTimeMillis() - j5, "");
                    return Unit.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i4 = 1;
            aVar = aVar4;
            ResultKt.alpha(obj);
            if (this.f2015s && !this.f2016t) {
                Log.i("LocationFlow", "FRESH_LOC_PREEMPT_RECONNECT action=PRE_COMPLETE taskId=" + i18 + " taskType=" + str3);
                c3490g2.delta();
            }
            obj2 = new Object();
            objectRef = new Ref.ObjectRef();
            i5 = 0;
        }
        if (obj2.alpha < 4 && k.bravo(processOrderActivityV22)) {
            obj2.alpha++;
            j5 = j10;
            long currentTimeMillis = System.currentTimeMillis();
            fVar = fVar3;
            c0316l0 = c0316l03;
            j6 = currentTimeMillis - j5;
            if (j6 >= 15000) {
                int i26 = obj2.alpha;
                StringBuilder lima4 = z.lima("FRESH_LOC_BUDGET_EXHAUSTED action=PRE_COMPLETE taskId=", str4, str3, " elapsed=", i18);
                lima4.append(j6);
                lima4.append("ms attempt=");
                lima4.append(i26);
                Log.w("LocationFlow", lima4.toString());
                sVar2 = obj2;
                fVar2 = fVar;
                c0316l02 = c0316l0;
            } else {
                if (obj2.alpha < 4 && System.currentTimeMillis() - j5 < 0) {
                    i16 = i4;
                } else {
                    i16 = 0;
                }
                String str5 = str4;
                String str6 = str3;
                int i27 = i18;
                sVar = obj2;
                str = str5;
                processOrderActivityV2 = processOrderActivityV22;
                i iVar = new i(currentTimeMillis, this.f2017u, str6, sVar);
                str3 = str6;
                this.alpha = sVar;
                this.purple = objectRef;
                this.red = i5;
                this.teal = currentTimeMillis;
                this.white = j6;
                this.silver = i16;
                int i28 = i4;
                this.yellow = i28;
                int i29 = i5;
                C3207k c3207k2 = new C3207k(i28, J6.delta(this));
                boolean z11 = i16;
                c3207k2.tango();
                g gVar = new g(c3207k2, iVar, z11);
                Y9.k kVar = c3490g2.alpha;
                kVar.getClass();
                if (kVar.delta && (captainLocationMonitoringService = kVar.charlie) != null) {
                    c3207k = c3207k2;
                    captainLocationMonitoringService.hotel(new Y9.j(kVar, gVar, 0));
                    i10 = i27;
                } else {
                    c3207k = c3207k2;
                    kVar.hotel = gVar;
                    Y9.i iVar2 = new Y9.i(kVar, 1);
                    kVar.india = iVar2;
                    Handler handler = kVar.echo;
                    Intrinsics.checkNotNull(iVar2);
                    i10 = i27;
                    handler.postDelayed(iVar2, 4000L);
                    if (!kVar.delta) {
                        kVar.delta();
                    }
                }
                obj3 = c3207k.sierra();
                Od.a aVar5 = Od.a.alpha;
                aVar2 = aVar;
                if (obj3 != aVar2) {
                    objectRef2 = objectRef;
                    i11 = z11 ? 1 : 0;
                    i12 = i29;
                    j7 = currentTimeMillis;
                    eVar = (e) obj3;
                    c3490g = c3490g2;
                    if (!(eVar instanceof b)) {
                    }
                }
                return aVar2;
            }
        } else {
            sVar2 = obj2;
            j5 = j10;
            fVar2 = fVar3;
            c0316l02 = c0316l03;
        }
        long currentTimeMillis2 = System.currentTimeMillis() - j5;
        AtomicBoolean atomicBoolean3 = k.bravo;
        k.delta(processOrderActivityV22, this.f2017u, str3, sVar2.alpha, (f) objectRef.alpha, fVar2, c0316l02, this.f2015s, this.f2016t, currentTimeMillis2, com.google.android.material.datepicker.j.kilo("elapsed=", currentTimeMillis2, "ms reason=exhausted"));
        return Unit.INSTANCE;
    }
}
