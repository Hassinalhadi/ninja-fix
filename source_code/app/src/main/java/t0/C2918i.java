package t0;

import android.content.ClipboardManager;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: t0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2918i implements InterfaceC2898P {
    public final ClipboardManager alpha;

    public C2918i(Context context) {
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.alpha = (ClipboardManager) systemService;
    }
}
