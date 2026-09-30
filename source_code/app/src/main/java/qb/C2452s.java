package qb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m.C2093f;
import s6.A7;
import s6.B7;

/* renamed from: qb.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2452s implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f13174a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f13175b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f13176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13177d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f13178f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f13179g;
    public final /* synthetic */ Function0 purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ C2093f silver;
    public final /* synthetic */ long teal;
    public final /* synthetic */ long white;
    public final /* synthetic */ long yellow;

    public /* synthetic */ C2452s(Object obj, Function0 function0, T.s sVar, C2093f c2093f, long j5, long j6, long j7, long j10, long j11, boolean z2, int i4, int i5, int i10, int i11) {
        this.alpha = i11;
        this.f13179g = obj;
        this.purple = function0;
        this.red = sVar;
        this.silver = c2093f;
        this.teal = j5;
        this.white = j6;
        this.yellow = j7;
        this.f13174a = j10;
        this.f13175b = j11;
        this.f13176c = z2;
        this.f13177d = i4;
        this.e = i5;
        this.f13178f = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.f13177d | 1);
                int cyan2 = C0564b.cyan(this.e);
                A7.bravo((C2449p) this.f13179g, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f13174a, this.f13175b, this.f13176c, interfaceC0581m, cyan, cyan2, this.f13178f);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.f13177d | 1);
                int cyan4 = C0564b.cyan(this.e);
                B7.charlie((C2456w) this.f13179g, this.purple, this.red, this.silver, this.teal, this.white, this.yellow, this.f13174a, this.f13175b, this.f13176c, interfaceC0581m, cyan3, cyan4, this.f13178f);
                return Unit.INSTANCE;
        }
    }
}
