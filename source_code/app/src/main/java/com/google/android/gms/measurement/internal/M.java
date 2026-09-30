package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class M implements Callable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ O teal;

    public /* synthetic */ M(O o5, String str, String str2, String str3, int i4) {
        this.alpha = i4;
        this.purple = str;
        this.red = str2;
        this.silver = str3;
        this.teal = o5;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.alpha) {
            case 0:
                O o5 = this.teal;
                o5.golf.echo();
                C1450j c1450j = o5.golf.red;
                Z0.cyan(c1450j);
                return c1450j.f0(this.purple, this.red, this.silver);
            case 1:
                O o10 = this.teal;
                o10.golf.echo();
                C1450j c1450j2 = o10.golf.red;
                Z0.cyan(c1450j2);
                return c1450j2.f0(this.purple, this.red, this.silver);
            case 2:
                O o11 = this.teal;
                o11.golf.echo();
                C1450j c1450j3 = o11.golf.red;
                Z0.cyan(c1450j3);
                return c1450j3.b0(this.purple, this.red, this.silver);
            default:
                O o12 = this.teal;
                o12.golf.echo();
                C1450j c1450j4 = o12.golf.red;
                Z0.cyan(c1450j4);
                return c1450j4.b0(this.purple, this.red, this.silver);
        }
    }
}
