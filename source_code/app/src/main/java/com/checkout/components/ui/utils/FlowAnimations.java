package com.checkout.components.ui.utils;

import bx.ar;
import bx.ax;
import bx.az;
import bz.AbstractC0779d;
import bz.aa;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/ui/utils/FlowAnimations;", "", "<init>", "()V", "Lbx/ax;", "defaultEnterTransition", "Lbx/ax;", "getDefaultEnterTransition", "()Lbx/ax;", "Lbx/az;", "defaultExitTransition", "Lbx/az;", "getDefaultExitTransition", "()Lbx/az;", "Lbz/aa;", "LQ0/m;", "defaultContentSizeSpec", "Lbz/aa;", "getDefaultContentSizeSpec", "()Lbz/aa;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FlowAnimations {

    @NotNull
    public static final FlowAnimations INSTANCE = new FlowAnimations();

    @NotNull
    private static final ax defaultEnterTransition = ar.bravo(AbstractC0779d.juliet(1500.0f, null, 5), 2).alpha(ar.alpha(AbstractC0779d.juliet(1500.0f, null, 5), 14));

    @NotNull
    private static final az defaultExitTransition = ar.delta(AbstractC0779d.juliet(10000.0f, null, 5), 14).alpha(ar.charlie(AbstractC0779d.juliet(10000.0f, null, 5), 2));

    @NotNull
    private static final aa defaultContentSizeSpec = AbstractC0779d.juliet(10000.0f, null, 5);
    public static final int $stable = 8;

    private FlowAnimations() {
    }

    @NotNull
    public final aa getDefaultContentSizeSpec() {
        return defaultContentSizeSpec;
    }

    @NotNull
    public final ax getDefaultEnterTransition() {
        return defaultEnterTransition;
    }

    @NotNull
    public final az getDefaultExitTransition() {
        return defaultExitTransition;
    }
}
