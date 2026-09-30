package V2;

import V5.x;
import android.text.TextUtils;
import bv.w;
import coil.memory.MemoryCache$Key;
import com.bumptech.glide.load.engine.h;
import com.google.android.gms.internal.measurement.C1314f0;
import com.google.android.gms.internal.measurement.af;
import com.google.android.gms.measurement.internal.A;
import com.google.android.gms.measurement.internal.C1450j;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ar;

/* loaded from: classes3.dex */
public final class d extends w {
    public final /* synthetic */ int golf = 0;
    public final /* synthetic */ Object hotel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(A a6) {
        super(20);
        this.hotel = a6;
    }

    @Override // bv.w
    public Object alpha(Object obj) {
        switch (this.golf) {
            case 1:
                String str = (String) obj;
                x.echo(str);
                A a6 = (A) this.hotel;
                boolean j02 = ((G) a6.alpha).yellow.j0(null, ac.f7597g0);
                d dVar = a6.f7498c;
                if (j02) {
                    a6.X();
                    x.echo(str);
                    C1450j c1450j = a6.purple.red;
                    Z0.cyan(c1450j);
                    h V02 = c1450j.V0(str);
                    if (V02 == null) {
                        return null;
                    }
                    ar arVar = ((G) a6.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.f7636g.bravo(str, "Populate EES config from database on cache miss. appId");
                    a6.f0(str, a6.c0(str, (byte[]) V02.purple));
                    return (af) dVar.hotel().get(str);
                }
                a6.X();
                x.echo(str);
                if (TextUtils.isEmpty(str)) {
                    return null;
                }
                bv.e eVar = a6.f7496a;
                C1314f0 c1314f0 = (C1314f0) eVar.get(str);
                if (c1314f0 == null || c1314f0.november() == 0) {
                    return null;
                }
                if (eVar.containsKey(str) && eVar.get(str) != null) {
                    a6.f0(str, (C1314f0) eVar.get(str));
                } else {
                    a6.e0(str);
                }
                return (af) dVar.hotel().get(str);
            default:
                return super.alpha(obj);
        }
    }

    @Override // bv.w
    public void bravo(Object obj, Object obj2, Object obj3) {
        switch (this.golf) {
            case 0:
                c cVar = (c) obj2;
                ((Fe.c) ((J2.c) this.hotel).purple).kilo((MemoryCache$Key) obj, cVar.alpha, cVar.bravo, cVar.charlie);
                return;
            default:
                super.bravo(obj, obj2, obj3);
                return;
        }
    }

    @Override // bv.w
    public int golf(Object obj, Object obj2) {
        switch (this.golf) {
            case 0:
                return ((c) obj2).charlie;
            default:
                return super.golf(obj, obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(int i4, J2.c cVar) {
        super(i4);
        this.hotel = cVar;
    }
}
