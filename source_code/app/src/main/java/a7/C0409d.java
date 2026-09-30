package a7;

import android.view.View;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* renamed from: a7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C0409d {
    public OnBackInvokedCallback alpha;

    public OnBackInvokedCallback alpha(InterfaceC0407b interfaceC0407b) {
        Objects.requireNonNull(interfaceC0407b);
        return new C0408c(0, interfaceC0407b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r3 = r3.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bravo(InterfaceC0407b interfaceC0407b, View view, boolean z2) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        int i4;
        if (this.alpha != null || findOnBackInvokedDispatcher == null) {
            return;
        }
        OnBackInvokedCallback alpha = alpha(interfaceC0407b);
        this.alpha = alpha;
        if (z2) {
            i4 = 1000000;
        } else {
            i4 = 0;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(i4, alpha);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0005, code lost:
    
        r2 = r2.findOnBackInvokedDispatcher();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void charlie(View view) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (this.alpha != null && findOnBackInvokedDispatcher != null) {
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(this.alpha);
            this.alpha = null;
        }
    }
}
