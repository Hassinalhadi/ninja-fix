package a7;

import android.os.Build;
import android.view.View;

/* renamed from: a7.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0412g {
    public final C0409d alpha;
    public final InterfaceC0407b bravo;
    public final View charlie;

    /* JADX WARN: Multi-variable type inference failed */
    public C0412g(InterfaceC0407b interfaceC0407b, View view) {
        C0409d c0409d;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            c0409d = new Object();
        } else if (i4 >= 33) {
            c0409d = new Object();
        } else {
            c0409d = null;
        }
        this.alpha = c0409d;
        this.bravo = interfaceC0407b;
        this.charlie = view;
    }
}
