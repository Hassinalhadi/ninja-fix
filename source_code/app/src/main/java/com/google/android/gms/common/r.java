package com.google.android.gms.common;

/* loaded from: classes2.dex */
public final class r extends s {
    public final l echo;

    public /* synthetic */ r(l lVar) {
        super(false, null, null);
        this.echo = lVar;
    }

    @Override // com.google.android.gms.common.s
    public final String alpha() {
        try {
            return (String) this.echo.call();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
