package androidx.fragment.app;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: androidx.fragment.app.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0615j {
    public final i0 alpha;

    public AbstractC0615j(i0 operation) {
        Intrinsics.echo(operation, "operation");
        this.alpha = operation;
    }

    public final boolean alpha() {
        int i4;
        i0 i0Var = this.alpha;
        View view = i0Var.charlie.mView;
        if (view != null) {
            i4 = 4;
            if (view.getAlpha() != 0.0f || view.getVisibility() != 0) {
                int visibility = view.getVisibility();
                if (visibility != 0) {
                    if (visibility != 4) {
                        if (visibility == 8) {
                            i4 = 3;
                        } else {
                            throw new IllegalArgumentException(ao.ad.zulu(visibility, "Unknown visibility "));
                        }
                    }
                } else {
                    i4 = 2;
                }
            }
        } else {
            i4 = 0;
        }
        int i5 = i0Var.alpha;
        if (i4 != i5) {
            if (i4 == 2 || i5 == 2) {
                return false;
            }
            return true;
        }
        return true;
    }
}
