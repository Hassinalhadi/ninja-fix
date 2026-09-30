package s0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: s0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2550j extends Lambda implements Function0 {
    public static final C2550j purple = new C2550j(0, 0);
    public static final C2550j red = new C2550j(0, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2550j(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return new al(2);
            default:
                return new al(3);
        }
    }
}
