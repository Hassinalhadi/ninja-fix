package t0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: t0.l0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2925l0 extends Lambda implements Function0 {
    public static final C2925l0 purple = new C2925l0(0, 0);
    public static final C2925l0 red = new C2925l0(0, 1);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2925l0(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.alpha) {
            case 0:
                return null;
            default:
                return Boolean.FALSE;
        }
    }
}
