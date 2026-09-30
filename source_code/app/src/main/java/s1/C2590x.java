package s1;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

/* renamed from: s1.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2590x implements InterfaceC2591y {
    public final ScrollFeedbackProvider alpha;

    public C2590x(NestedScrollView nestedScrollView) {
        this.alpha = ScrollFeedbackProvider.createProvider(nestedScrollView);
    }

    @Override // s1.InterfaceC2591y
    public final void alpha(int i4, int i5, int i10, boolean z2) {
        this.alpha.onScrollLimit(i4, i5, i10, z2);
    }

    @Override // s1.InterfaceC2591y
    public final void bravo(int i4, int i5, int i10, int i11) {
        this.alpha.onScrollProgress(i4, i5, i10, i11);
    }
}
