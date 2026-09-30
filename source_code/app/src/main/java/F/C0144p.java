package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0144p extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1157c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1158d;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ P.d red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144p(P.d dVar, Function0 function0, T.s sVar, boolean z2, C0156s0 c0156s0, androidx.compose.foundation.layout.M m4, int i4, int i5) {
        super(2);
        this.red = dVar;
        this.white = function0;
        this.yellow = sVar;
        this.purple = z2;
        this.f1157c = c0156s0;
        this.f1158d = m4;
        this.silver = i4;
        this.teal = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.silver | 1);
                P.d dVar = this.red;
                C0156s0 c0156s0 = (C0156s0) this.f1157c;
                AbstractC0148q.bravo(dVar, (Function0) this.white, (T.s) this.yellow, this.purple, c0156s0, (androidx.compose.foundation.layout.M) this.f1158d, (InterfaceC0581m) obj, cyan, this.teal);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.silver | 1);
                P.d dVar2 = this.red;
                bx.az azVar = (bx.az) this.f1157c;
                androidx.compose.animation.b.charlie(this.purple, (T.p) this.white, (bx.ax) this.yellow, azVar, (String) this.f1158d, dVar2, (InterfaceC0581m) obj, cyan2, this.teal);
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0144p(boolean z2, T.p pVar, bx.ax axVar, bx.az azVar, String str, P.d dVar, int i4, int i5) {
        super(2);
        this.purple = z2;
        this.white = pVar;
        this.yellow = axVar;
        this.f1157c = azVar;
        this.f1158d = str;
        this.red = dVar;
        this.silver = i4;
        this.teal = i5;
    }
}
