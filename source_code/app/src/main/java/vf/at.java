package vf;

import kotlin.Unit;

/* loaded from: classes2.dex */
public final class at extends av {
    public final C3207k red;
    public final /* synthetic */ ax silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at(ax axVar, long j5, C3207k c3207k) {
        super(j5);
        this.silver = axVar;
        this.red = c3207k;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.red.beige(this.silver, Unit.INSTANCE);
    }

    @Override // vf.av
    public final String toString() {
        return super.toString() + this.red;
    }
}
