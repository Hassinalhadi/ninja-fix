package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1432a implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ C1464q silver;

    public /* synthetic */ RunnableC1432a(C1464q c1464q, String str, long j5, int i4) {
        this.alpha = i4;
        this.purple = str;
        this.red = j5;
        this.silver = c1464q;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C1464q c1464q = this.silver;
                c1464q.W();
                String str = this.purple;
                V5.x.echo(str);
                bv.e eVar = c1464q.red;
                boolean isEmpty = eVar.isEmpty();
                long j5 = this.red;
                if (isEmpty) {
                    c1464q.silver = j5;
                }
                Integer num = (Integer) eVar.get(str);
                if (num != null) {
                    eVar.put(str, Integer.valueOf(num.intValue() + 1));
                    return;
                }
                if (eVar.red >= 100) {
                    ar arVar = ((G) c1464q.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.f7632b.alpha("Too many ads visible");
                    return;
                } else {
                    eVar.put(str, 1);
                    c1464q.purple.put(str, Long.valueOf(j5));
                    return;
                }
            default:
                C1464q c1464q2 = this.silver;
                c1464q2.W();
                String str2 = this.purple;
                V5.x.echo(str2);
                bv.e eVar2 = c1464q2.red;
                Integer num2 = (Integer) eVar2.get(str2);
                G g2 = (G) c1464q2.alpha;
                if (num2 != null) {
                    C1480y0 c1480y0 = g2.f7512h;
                    G.echo(c1480y0);
                    C1474v0 d02 = c1480y0.d0(false);
                    int intValue = num2.intValue() - 1;
                    if (intValue == 0) {
                        eVar2.remove(str2);
                        bv.e eVar3 = c1464q2.purple;
                        Long l10 = (Long) eVar3.get(str2);
                        long j6 = this.red;
                        ar arVar2 = g2.f7507b;
                        if (l10 == null) {
                            G.foxtrot(arVar2);
                            arVar2.white.alpha("First ad unit exposure time was never set");
                        } else {
                            long longValue = j6 - l10.longValue();
                            eVar3.remove(str2);
                            c1464q2.b0(str2, longValue, d02);
                        }
                        if (eVar2.isEmpty()) {
                            long j7 = c1464q2.silver;
                            if (j7 == 0) {
                                G.foxtrot(arVar2);
                                arVar2.white.alpha("First ad exposure time was never set");
                                return;
                            } else {
                                c1464q2.a0(j6 - j7, d02);
                                c1464q2.silver = 0L;
                                return;
                            }
                        }
                        return;
                    }
                    eVar2.put(str2, Integer.valueOf(intValue));
                    return;
                }
                ar arVar3 = g2.f7507b;
                G.foxtrot(arVar3);
                arVar3.white.bravo(str2, "Call to endAdUnitExposure for unknown ad unit id");
                return;
        }
    }
}
