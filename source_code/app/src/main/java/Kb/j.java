package Kb;

import androidx.recyclerview.widget.AbstractC0677w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j extends AbstractC0677w {
    @Override // androidx.recyclerview.widget.AbstractC0677w
    public final boolean areContentsTheSame(Object obj, Object obj2) {
        return Intrinsics.areEqual((a) obj, (a) obj2);
    }

    @Override // androidx.recyclerview.widget.AbstractC0677w
    public final boolean areItemsTheSame(Object obj, Object obj2) {
        if (((a) obj).alpha == ((a) obj2).alpha) {
            return true;
        }
        return false;
    }
}
