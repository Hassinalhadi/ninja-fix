package l9;

import androidx.viewpager.widget.h;
import kotlin.jvm.functions.Function1;

/* renamed from: l9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2061a implements h {
    public final /* synthetic */ Function1 alpha;
    public final /* synthetic */ Function1 bravo;

    public C2061a(Function1 function1, Function1 function12) {
        this.alpha = function1;
        this.bravo = function12;
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageScrollStateChanged(int i4) {
        Function1 function1 = this.bravo;
        if (function1 != null) {
        }
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageScrolled(int i4, float f5, int i5) {
    }

    @Override // androidx.viewpager.widget.h
    public final void onPageSelected(int i4) {
        Function1 function1 = this.alpha;
        if (function1 != null) {
        }
    }
}
