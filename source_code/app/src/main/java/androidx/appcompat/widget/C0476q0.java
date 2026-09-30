package androidx.appcompat.widget;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: androidx.appcompat.widget.q0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0476q0 extends C0466l0 implements InterfaceC0468m0 {

    /* renamed from: x, reason: collision with root package name */
    public static final Method f2922x;

    /* renamed from: w, reason: collision with root package name */
    public androidx.core.widget.f f2923w;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f2922x = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // androidx.appcompat.widget.InterfaceC0468m0
    public final void hotel(ao.l lVar, ao.n nVar) {
        androidx.core.widget.f fVar = this.f2923w;
        if (fVar != null) {
            fVar.hotel(lVar, nVar);
        }
    }

    @Override // androidx.appcompat.widget.C0466l0
    public final Z papa(Context context, boolean z2) {
        C0474p0 c0474p0 = new C0474p0(context, z2);
        c0474p0.setHoverListener(this);
        return c0474p0;
    }

    @Override // androidx.appcompat.widget.InterfaceC0468m0
    public final void quebec(ao.l lVar, ao.n nVar) {
        androidx.core.widget.f fVar = this.f2923w;
        if (fVar != null) {
            fVar.quebec(lVar, nVar);
        }
    }
}
