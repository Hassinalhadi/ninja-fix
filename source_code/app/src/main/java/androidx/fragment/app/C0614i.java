package androidx.fragment.app;

import android.animation.AnimatorSet;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: androidx.fragment.app.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0614i {
    public static final C0614i alpha = new Object();

    public final void alpha(@NotNull AnimatorSet animatorSet) {
        Intrinsics.echo(animatorSet, "animatorSet");
        animatorSet.reverse();
    }

    public final void bravo(@NotNull AnimatorSet animatorSet, long j5) {
        Intrinsics.echo(animatorSet, "animatorSet");
        animatorSet.setCurrentPlayTime(j5);
    }
}
