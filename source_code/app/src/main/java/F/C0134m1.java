package F;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import bz.C0778c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: F.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0134m1 extends Lambda implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ kotlin.e red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ kotlin.e white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0134m1(kotlin.e eVar, Object obj, Object obj2, kotlin.e eVar2, int i4, int i5) {
        super(2);
        this.alpha = i5;
        this.red = eVar;
        this.silver = obj;
        this.teal = obj2;
        this.white = eVar2;
        this.purple = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                ((Number) obj2).intValue();
                int cyan = C0564b.cyan(this.purple | 1);
                P.d dVar = (P.d) this.white;
                K1.golf((Function0) this.red, (C0126k1) this.silver, (C0778c) this.teal, dVar, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            default:
                ((Number) obj2).intValue();
                androidx.compose.ui.viewinterop.a.bravo((Function1) this.red, (T.s) this.silver, (Function1) this.teal, (Function1) this.white, (InterfaceC0581m) obj, C0564b.cyan(this.purple | 1));
                return Unit.INSTANCE;
        }
    }
}
