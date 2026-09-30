package rb;

import D0.an;
import P.d;
import T.s;
import Xd.l;
import a0.as;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import t6.P3;
import t6.r;

/* renamed from: rb.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2514b implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f13211a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13212b;
    public final /* synthetic */ s purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ float teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ C2514b(s sVar, as asVar, long j5, long j6, float f5, d dVar, int i4, int i5) {
        this.purple = sVar;
        this.f13211a = asVar;
        this.red = j5;
        this.silver = j6;
        this.teal = f5;
        this.f13212b = dVar;
        this.white = i4;
        this.yellow = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.white | 1);
                long j5 = this.silver;
                r.alpha((String) this.f13211a, this.purple, this.red, this.teal, (an) this.f13212b, j5, (InterfaceC0581m) obj, cyan, this.yellow);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.white | 1);
                d dVar = (d) this.f13212b;
                P3.alpha(this.purple, (as) this.f13211a, this.red, this.silver, this.teal, dVar, (InterfaceC0581m) obj, cyan2, this.yellow);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2514b(String str, s sVar, long j5, float f5, an anVar, long j6, int i4, int i5) {
        this.f13211a = str;
        this.purple = sVar;
        this.red = j5;
        this.teal = f5;
        this.f13212b = anVar;
        this.silver = j6;
        this.white = i4;
        this.yellow = i5;
    }
}
