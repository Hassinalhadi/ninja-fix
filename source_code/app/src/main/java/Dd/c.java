package Dd;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c extends Throwable {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(String str, int i4) {
        super(str);
        this.alpha = i4;
    }

    private final synchronized Throwable alpha() {
        return this;
    }

    private final synchronized Throwable bravo() {
        return this;
    }

    private final synchronized Throwable charlie() {
        return this;
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.alpha) {
            case 1:
                alpha();
                return this;
            case 2:
                bravo();
                return this;
            case 3:
                charlie();
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String message) {
        super(message);
        this.alpha = 0;
        Intrinsics.echo(message, "message");
    }
}
