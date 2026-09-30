package Pf;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class k extends j {
    public final boolean silver;

    public k(Fe.c cVar, boolean z2) {
        super(0, cVar);
        this.silver = z2;
    }

    @Override // Pf.j
    public final void quebec(String value) {
        Intrinsics.echo(value, "value");
        if (this.silver) {
            super.quebec(value);
        } else {
            november(value);
        }
    }
}
