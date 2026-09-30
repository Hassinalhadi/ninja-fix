package db;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Function0 {
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ kotlin.e red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ p(Http2Connection.ReaderRunnable readerRunnable, boolean z2, Settings settings) {
        this.red = readerRunnable;
        this.purple = z2;
        this.silver = settings;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit unit;
        switch (this.alpha) {
            case 0:
                if (this.purple) {
                    ((Function1) this.red).invoke((String) this.silver);
                }
                return Unit.INSTANCE;
            default:
                unit = Http2Connection.ReaderRunnable.settings$lambda$3((Http2Connection.ReaderRunnable) this.red, this.purple, (Settings) this.silver);
                return unit;
        }
    }

    public /* synthetic */ p(boolean z2, Function1 function1, String str) {
        this.purple = z2;
        this.red = function1;
        this.silver = str;
    }
}
