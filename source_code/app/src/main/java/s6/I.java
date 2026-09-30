package s6;

import java.util.logging.Logger;

/* loaded from: classes2.dex */
public final class I {
    public final C2673i alpha = new Object();
    public final String bravo;
    public volatile Logger charlie;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, s6.i] */
    public I(Class cls) {
        this.bravo = cls.getName();
    }

    public final Logger alpha() {
        Logger logger = this.charlie;
        if (logger != null) {
            return logger;
        }
        synchronized (this.alpha) {
            try {
                Logger logger2 = this.charlie;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.bravo);
                this.charlie = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
