package t0;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import m0.C2095a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class al {
    public static final al alpha = new Object();

    public final void alpha(@NotNull View view, @Nullable m0.o oVar) {
        PointerIcon pointerIcon;
        Context context = view.getContext();
        PointerIcon systemIcon = oVar instanceof C2095a ? PointerIcon.getSystemIcon(context, ((C2095a) oVar).bravo) : PointerIcon.getSystemIcon(context, 1000);
        pointerIcon = view.getPointerIcon();
        if (!Intrinsics.areEqual(pointerIcon, systemIcon)) {
            view.setPointerIcon(systemIcon);
        }
    }
}
