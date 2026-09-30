package okhttp3.internal.http2;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Http2Connection purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ ErrorCode silver;

    public /* synthetic */ c(Http2Connection http2Connection, int i4, ErrorCode errorCode, int i5) {
        this.alpha = i5;
        this.purple = http2Connection;
        this.red = i4;
        this.silver = errorCode;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return Http2Connection.papa(this.purple, this.red, this.silver);
            default:
                return Http2Connection.echo(this.purple, this.red, this.silver);
        }
    }
}
