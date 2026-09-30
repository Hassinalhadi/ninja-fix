package p7;

import com.google.android.material.internal.ab;

/* loaded from: classes2.dex */
public final class w extends u {
    public final /* synthetic */ G6.h purple;
    public final /* synthetic */ com.google.android.play.core.integrity.h red;
    public final /* synthetic */ C2285b silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(C2285b c2285b, G6.h hVar, G6.h hVar2, com.google.android.play.core.integrity.h hVar3) {
        super(hVar);
        this.purple = hVar2;
        this.red = hVar3;
        this.silver = c2285b;
    }

    @Override // p7.u
    public final void bravo() {
        synchronized (this.silver.foxtrot) {
            try {
                C2285b c2285b = this.silver;
                G6.h hVar = this.purple;
                c2285b.echo.add(hVar);
                hVar.alpha.bravo(new ab(8, c2285b, hVar));
                if (this.silver.lima.getAndIncrement() > 0) {
                    this.silver.bravo.bravo("Already connected to the service.", new Object[0]);
                }
                C2285b.bravo(this.silver, this.red);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
