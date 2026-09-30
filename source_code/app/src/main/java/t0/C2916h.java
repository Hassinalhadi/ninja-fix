package t0;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Build;
import kotlin.Unit;

/* renamed from: t0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2916h implements InterfaceC2897O {
    public final C2918i alpha;

    public C2916h(C2918i c2918i) {
        this.alpha = c2918i;
    }

    public final Unit alpha(C2896N c2896n) {
        ClipboardManager clipboardManager = this.alpha.alpha;
        if (c2896n == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                clipboardManager.clearPrimaryClip();
            } else {
                clipboardManager.setPrimaryClip(ClipData.newPlainText("", ""));
            }
        } else {
            clipboardManager.setPrimaryClip(c2896n.alpha);
        }
        return Unit.INSTANCE;
    }
}
