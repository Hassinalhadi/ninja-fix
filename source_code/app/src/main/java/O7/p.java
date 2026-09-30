package O7;

/* loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ r purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ String silver;

    public /* synthetic */ p(r rVar, long j5, String str, int i4) {
        this.alpha = i4;
        this.purple = rVar;
        this.red = j5;
        this.silver = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                r rVar = this.purple;
                rVar.oscar.bravo.alpha(new p(rVar, this.red, this.silver, 1));
                return;
            default:
                n nVar = this.purple.golf;
                t tVar = nVar.november;
                if (tVar == null || !tVar.echo.get()) {
                    ((Q7.d) nVar.india.purple).kilo(this.red, this.silver);
                    return;
                }
                return;
        }
    }
}
