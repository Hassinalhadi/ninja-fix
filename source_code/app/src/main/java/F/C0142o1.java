package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import f.InterfaceC1673j;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0142o1 extends Lambda implements Xd.l {
    public final /* synthetic */ C0150q1 alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f1154c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f1155d;
    public final /* synthetic */ int e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f1156f;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ InterfaceC1673j silver;
    public final /* synthetic */ T.p teal;
    public final /* synthetic */ C0143o2 white;
    public final /* synthetic */ a0.as yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0142o1(C0150q1 c0150q1, boolean z2, boolean z10, InterfaceC1673j interfaceC1673j, T.p pVar, C0143o2 c0143o2, a0.as asVar, float f5, float f10, int i4, int i5) {
        super(2);
        this.alpha = c0150q1;
        this.purple = z2;
        this.red = z10;
        this.silver = interfaceC1673j;
        this.teal = pVar;
        this.white = c0143o2;
        this.yellow = asVar;
        this.f1154c = f5;
        this.f1155d = f10;
        this.e = i4;
        this.f1156f = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.e | 1);
        a0.as asVar = this.yellow;
        this.alpha.alpha(this.purple, this.red, this.silver, this.teal, this.white, asVar, this.f1154c, this.f1155d, (InterfaceC0581m) obj, cyan, this.f1156f);
        return Unit.INSTANCE;
    }
}
