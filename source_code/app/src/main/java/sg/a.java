package sg;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;
import pe.AbstractC2327c;
import tg.g;

/* loaded from: classes2.dex */
public final class a implements rg.b, Serializable {
    public String alpha;
    public g purple;
    public LinkedBlockingQueue red;

    @Override // rg.b
    public final boolean alpha() {
        return true;
    }

    @Override // rg.b
    public final boolean bravo() {
        return true;
    }

    @Override // rg.b
    public final void charlie() {
        juliet(2);
    }

    @Override // rg.b
    public final boolean delta() {
        return true;
    }

    @Override // rg.b
    public final boolean echo() {
        return true;
    }

    @Override // rg.b
    public final boolean foxtrot() {
        return true;
    }

    @Override // rg.b
    public final String getName() {
        return this.alpha;
    }

    @Override // rg.b
    public final void golf(Throwable th) {
        juliet(4);
    }

    @Override // rg.b
    public final void hotel(String str) {
        juliet(5);
    }

    @Override // rg.b
    public final /* synthetic */ boolean india(int i4) {
        return AbstractC2327c.bravo(this, i4);
    }

    @Override // rg.b
    public final void info(String str) {
        juliet(3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, sg.b] */
    public final void juliet(int i4) {
        ?? obj = new Object();
        System.currentTimeMillis();
        obj.alpha = i4;
        obj.bravo = this.purple;
        Thread.currentThread().getName();
        this.red.add(obj);
    }
}
