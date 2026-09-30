package retrofit2.adapter.rxjava2;

import vg.aq;

/* loaded from: classes2.dex */
public final class Result<T> {
    private final Throwable error;
    private final aq<T> response;

    private Result(aq<T> aqVar, Throwable th) {
        this.response = aqVar;
        this.error = th;
    }

    public static <T> Result<T> error(Throwable th) {
        if (th != null) {
            return new Result<>(null, th);
        }
        throw new NullPointerException("error == null");
    }

    public static <T> Result<T> response(aq<T> aqVar) {
        if (aqVar != null) {
            return new Result<>(aqVar, null);
        }
        throw new NullPointerException("response == null");
    }

    public boolean isError() {
        if (this.error != null) {
            return true;
        }
        return false;
    }

    public Throwable error() {
        return this.error;
    }

    public aq<T> response() {
        return this.response;
    }
}
