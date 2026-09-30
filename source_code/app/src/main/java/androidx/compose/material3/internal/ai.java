package androidx.compose.material3.internal;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class ai extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ long purple;
    public final /* synthetic */ D0.an red;
    public final /* synthetic */ Xd.l silver;
    public final /* synthetic */ int teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai(long j5, D0.an anVar, Xd.l lVar, int i4, int i5) {
        super(2);
        this.alpha = i5;
        this.purple = j5;
        this.red = anVar;
        this.silver = lVar;
        this.teal = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.teal | 1);
                D0.an anVar = this.red;
                Xd.l lVar = this.silver;
                i.alpha(this.purple, anVar, lVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                int cyan2 = C0564b.cyan(this.teal | 1);
                D0.an anVar2 = this.red;
                Xd.l lVar2 = this.silver;
                at.bravo(this.purple, anVar2, lVar2, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
        }
    }
}
