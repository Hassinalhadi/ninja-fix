package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;

/* loaded from: classes2.dex */
public final class aw {
    public final String alpha;
    public final long bravo;
    public boolean charlie;
    public long delta;
    public final /* synthetic */ ax echo;

    public aw(ax axVar, String str, long j5) {
        this.echo = axVar;
        V5.x.echo(str);
        this.alpha = str;
        this.bravo = j5;
    }

    public final long alpha() {
        if (!this.charlie) {
            this.charlie = true;
            this.delta = this.echo.b0().getLong(this.alpha, this.bravo);
        }
        return this.delta;
    }

    public final void bravo(long j5) {
        SharedPreferences.Editor edit = this.echo.b0().edit();
        edit.putLong(this.alpha, j5);
        edit.apply();
        this.delta = j5;
    }
}
