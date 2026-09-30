package bx;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: bx.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0767e extends Lambda implements Xd.l {
    public final /* synthetic */ Boolean alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3427c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3428d;
    public final /* synthetic */ T.p purple;
    public final /* synthetic */ Function1 red;
    public final /* synthetic */ T.k silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ Function1 white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0767e(Boolean bool, T.p pVar, Function1 function1, T.k kVar, String str, Function1 function12, P.d dVar, int i4, int i5) {
        super(2);
        this.alpha = bool;
        this.purple = pVar;
        this.red = function1;
        this.silver = kVar;
        this.teal = str;
        this.white = function12;
        this.yellow = dVar;
        this.f3427c = i4;
        this.f3428d = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int cyan = C0564b.cyan(this.f3427c | 1);
        P.d dVar = this.yellow;
        Boolean bool = this.alpha;
        String str = this.teal;
        androidx.compose.animation.a.bravo(bool, this.purple, this.red, this.silver, str, this.white, dVar, (InterfaceC0581m) obj, cyan, this.f3428d);
        return Unit.INSTANCE;
    }
}
