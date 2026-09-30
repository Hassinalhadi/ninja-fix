package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.m0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0133m0 extends Lambda implements Xd.l {
    public final /* synthetic */ Function0 alpha;
    public final /* synthetic */ T.s purple;
    public final /* synthetic */ boolean red;
    public final /* synthetic */ C0129l0 silver;
    public final /* synthetic */ Xd.l teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ int yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0133m0(Function0 function0, T.s sVar, boolean z2, C0129l0 c0129l0, Xd.l lVar, int i4, int i5) {
        super(2);
        this.alpha = function0;
        this.purple = sVar;
        this.red = z2;
        this.silver = c0129l0;
        this.teal = lVar;
        this.white = i4;
        this.yellow = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.white | 1);
        C0129l0 c0129l0 = this.silver;
        K1.foxtrot(this.alpha, this.purple, this.red, c0129l0, this.teal, (InterfaceC0581m) obj, cyan, this.yellow);
        return Unit.INSTANCE;
    }
}
