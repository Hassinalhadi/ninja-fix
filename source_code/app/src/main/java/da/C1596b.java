package da;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: da.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1596b {
    public final InterfaceC1597c alpha;
    public final InterfaceC1598d bravo;

    public C1596b(InterfaceC1597c loginStateProvider, InterfaceC1598d sessionInvalidator) {
        Intrinsics.echo(loginStateProvider, "loginStateProvider");
        Intrinsics.echo(sessionInvalidator, "sessionInvalidator");
        this.alpha = loginStateProvider;
        this.bravo = sessionInvalidator;
    }
}
