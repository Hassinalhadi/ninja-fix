package p7;

import J8.B;

/* renamed from: p7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2284a extends u {
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ C2284a(int i4, Object obj) {
        this.purple = i4;
        this.red = obj;
    }

    @Override // p7.u
    public final void bravo() {
        switch (this.purple) {
            case 0:
                C2285b c2285b = (C2285b) ((B) this.red).bravo;
                c2285b.bravo.bravo("unlinkToDeath", new Object[0]);
                ((p) c2285b.november).golf.unlinkToDeath(c2285b.kilo, 0);
                c2285b.november = null;
                c2285b.golf = false;
                return;
            default:
                synchronized (((C2285b) this.red).foxtrot) {
                    try {
                        if (((C2285b) this.red).lima.get() > 0 && ((C2285b) this.red).lima.decrementAndGet() > 0) {
                            ((C2285b) this.red).bravo.bravo("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        C2285b c2285b2 = (C2285b) this.red;
                        if (c2285b2.november != null) {
                            c2285b2.bravo.bravo("Unbind from service.", new Object[0]);
                            C2285b c2285b3 = (C2285b) this.red;
                            c2285b3.alpha.unbindService(c2285b3.mike);
                            C2285b c2285b4 = (C2285b) this.red;
                            c2285b4.golf = false;
                            c2285b4.november = null;
                            c2285b4.mike = null;
                        }
                        ((C2285b) this.red).delta();
                        return;
                    } finally {
                    }
                }
        }
    }
}
