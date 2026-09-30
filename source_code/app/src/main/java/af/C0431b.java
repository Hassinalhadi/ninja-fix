package af;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: af.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0431b extends Lambda implements Function0 {
    public static final C0431b purple = new C0431b(0, 0);
    public static final C0431b red = new C0431b(0, 1);
    public static final C0431b silver = new C0431b(0, 2);
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0431b(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return UUID.randomUUID().toString();
            case 1:
                return null;
            default:
                return null;
        }
    }
}
