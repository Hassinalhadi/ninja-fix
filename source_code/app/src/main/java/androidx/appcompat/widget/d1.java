package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* loaded from: classes3.dex */
public final class d1 implements View.OnClickListener {
    public final ao.a alpha;
    public final /* synthetic */ e1 purple;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ao.a] */
    public d1(e1 e1Var) {
        this.purple = e1Var;
        Context context = e1Var.alpha.getContext();
        CharSequence charSequence = e1Var.hotel;
        ?? obj = new Object();
        obj.teal = 4096;
        obj.yellow = 4096;
        obj.e = null;
        obj.f3166f = null;
        obj.f3167g = false;
        obj.f3168h = false;
        obj.f3169i = 16;
        obj.f3163b = context;
        obj.alpha = charSequence;
        this.alpha = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e1 e1Var = this.purple;
        Window.Callback callback = e1Var.kilo;
        if (callback != null && e1Var.lima) {
            callback.onMenuItemSelected(0, this.alpha);
        }
    }
}
