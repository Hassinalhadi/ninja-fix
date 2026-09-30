package t1;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: t1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2949a extends ClickableSpan {
    public final int alpha;
    public final C2952d purple;
    public final int red;

    public C2949a(int i4, C2952d c2952d, int i5) {
        this.alpha = i4;
        this.purple = c2952d;
        this.red = i5;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.alpha);
        this.purple.alpha.performAction(this.red, bundle);
    }
}
