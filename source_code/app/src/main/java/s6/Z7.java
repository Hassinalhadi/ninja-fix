package s6;

import android.util.Log;

/* loaded from: classes2.dex */
public final class Z7 {
    public final /* synthetic */ A5 alpha;
    public final /* synthetic */ float bravo;
    public final /* synthetic */ X7 charlie;
    public final /* synthetic */ float delta;
    public final /* synthetic */ a8 echo;

    public Z7(a8 a8Var, A5 a52, float f5, X7 x72, float f10) {
        this.alpha = a52;
        this.bravo = f5;
        this.charlie = x72;
        this.delta = f10;
        this.echo = a8Var;
    }

    public final void alpha(Throwable th) {
        V5.g gVar = a8.sierra;
        String str = "Unable to set zoom to " + this.delta;
        if (Log.isLoggable(gVar.alpha, 5)) {
            Log.w("AutoZoom", gVar.bravo(str), th);
        }
        this.echo.bravo.set(false);
    }
}
