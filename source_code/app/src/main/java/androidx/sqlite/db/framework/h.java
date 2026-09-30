package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.Intrinsics;
import s2.InterfaceC2595c;

/* loaded from: classes3.dex */
public class h implements InterfaceC2595c, AutoCloseable {
    public final SQLiteProgram alpha;

    public h(SQLiteProgram delegate) {
        Intrinsics.echo(delegate, "delegate");
        this.alpha = delegate;
    }

    @Override // s2.InterfaceC2595c
    public final void b(int i4) {
        this.alpha.bindNull(i4);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
    }

    @Override // s2.InterfaceC2595c
    public final void gold(int i4, long j5) {
        this.alpha.bindLong(i4, j5);
    }

    @Override // s2.InterfaceC2595c
    public final void ivory(int i4, byte[] bArr) {
        this.alpha.bindBlob(i4, bArr);
    }

    @Override // s2.InterfaceC2595c
    public final void oscar(int i4, String value) {
        Intrinsics.echo(value, "value");
        this.alpha.bindString(i4, value);
    }

    @Override // s2.InterfaceC2595c
    public final void zulu(int i4, double d4) {
        this.alpha.bindDouble(i4, d4);
    }
}
