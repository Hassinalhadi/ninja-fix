package androidx.sqlite.db.framework;

import Xe.s;
import android.content.Context;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import s2.InterfaceC2594b;

/* loaded from: classes3.dex */
public final class g implements InterfaceC2594b, AutoCloseable {
    public final Context alpha;
    public final String purple;
    public final B0.a red;
    public final boolean silver;
    public final boolean teal;
    public final Lazy white;
    public boolean yellow;

    public g(Context context, String str, B0.a callback, boolean z2, boolean z10) {
        Intrinsics.echo(callback, "callback");
        this.alpha = context;
        this.purple = str;
        this.red = callback;
        this.silver = z2;
        this.teal = z10;
        this.white = LazyKt.lazy(new s(10, this));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lazy lazy = this.white;
        if (lazy.alpha()) {
            ((f) lazy.getValue()).close();
        }
    }

    @Override // s2.InterfaceC2594b
    public final b lime() {
        return ((f) this.white.getValue()).charlie(true);
    }

    @Override // s2.InterfaceC2594b
    public final void setWriteAheadLoggingEnabled(boolean z2) {
        Lazy lazy = this.white;
        if (lazy.alpha()) {
            f sQLiteOpenHelper = (f) lazy.getValue();
            Intrinsics.echo(sQLiteOpenHelper, "sQLiteOpenHelper");
            sQLiteOpenHelper.setWriteAheadLoggingEnabled(z2);
        }
        this.yellow = z2;
    }
}
