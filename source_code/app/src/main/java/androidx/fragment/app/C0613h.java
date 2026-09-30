package androidx.fragment.app;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0613h {
    public static final C0613h alpha = new Object();

    public final long alpha(@NotNull AnimatorSet animatorSet) {
        Intrinsics.echo(animatorSet, "animatorSet");
        return animatorSet.getTotalDuration();
    }
}
