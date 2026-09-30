package K1;

import java.util.concurrent.ThreadPoolExecutor;
import s6.W5;

/* loaded from: classes3.dex */
public final class m extends W5 {
    public final /* synthetic */ W5 bravo;
    public final /* synthetic */ ThreadPoolExecutor charlie;

    public m(W5 w52, ThreadPoolExecutor threadPoolExecutor) {
        this.bravo = w52;
        this.charlie = threadPoolExecutor;
    }

    @Override // s6.W5
    public final void alpha(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.charlie;
        try {
            this.bravo.alpha(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // s6.W5
    public final void bravo(com.google.firebase.messaging.o oVar) {
        ThreadPoolExecutor threadPoolExecutor = this.charlie;
        try {
            this.bravo.bravo(oVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
