package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class av extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha = 1;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1116c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1117d;
    public final /* synthetic */ int purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(int i4, P.d dVar, P.d dVar2, P.d dVar3, P.d dVar4, androidx.compose.foundation.layout.a0 a0Var, P.d dVar5, int i5) {
        super(2);
        this.purple = i4;
        this.red = dVar;
        this.teal = dVar2;
        this.white = dVar3;
        this.yellow = dVar4;
        this.f1116c = a0Var;
        this.f1117d = dVar5;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.purple | 1);
                P.d dVar = this.red;
                au auVar = (au) this.f1116c;
                K1.charlie((T.s) this.teal, (a0.as) this.white, (at) this.yellow, auVar, (b.ab) this.f1117d, dVar, (InterfaceC0581m) obj, cyan, this.silver);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.silver | 1);
                P.d dVar2 = (P.d) this.teal;
                P.d dVar3 = (P.d) this.white;
                P.d dVar4 = (P.d) this.yellow;
                Q1.bravo(this.purple, this.red, dVar2, dVar3, dVar4, (androidx.compose.foundation.layout.a0) this.f1116c, (P.d) this.f1117d, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av(T.s sVar, a0.as asVar, at atVar, au auVar, b.ab abVar, P.d dVar, int i4, int i5) {
        super(2);
        this.teal = sVar;
        this.white = asVar;
        this.yellow = atVar;
        this.f1116c = auVar;
        this.f1117d = abVar;
        this.red = dVar;
        this.purple = i4;
        this.silver = i5;
    }
}
