package bj;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {
    public final /* synthetic */ k alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ int red;

    public /* synthetic */ h(k kVar, int i4, int i5) {
        this.alpha = kVar;
        this.purple = i4;
        this.red = i5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        k kVar = this.alpha;
        int i4 = kVar.india;
        int i5 = this.purple;
        boolean z10 = true;
        if (i4 != i5) {
            kVar.india = i5;
            z2 = true;
        } else {
            z2 = false;
        }
        int i10 = kVar.hotel;
        int i11 = this.red;
        if (i10 != i11) {
            kVar.hotel = i11;
        } else {
            z10 = z2;
        }
        if (z10) {
            kVar.echo();
        }
    }
}
