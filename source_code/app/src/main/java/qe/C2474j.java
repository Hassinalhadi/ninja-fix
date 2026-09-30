package qe;

import T.r;
import androidx.lifecycle.d0;
import delivery.samurai.android.ui.attendanceRegistry.AttendanceRegistryFragment;
import delivery.samurai.android.ui.score.ScoreFragment;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ab;
import kotlin.collections.t;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import s0.C2544d;
import s0.L;
import s0.al;
import s0.ap;
import s0.ay;
import t0.au;
import t0.av;
import tc.C3105j;
import ve.v;
import vf.ad;
import wa.C3248d;
import ye.af;
import ye.z;
import z5.C3464a;

/* renamed from: qe.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2474j extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2474j(int i4, Object obj) {
        super(0);
        this.alpha = i4;
        this.purple = obj;
    }

    /* JADX WARN: Type inference failed for: r2v13, types: [java.util.Map, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        v vVar;
        Se.i iVar;
        n nVar;
        Se.b bVar;
        int i4 = 0;
        t tVar = t.alpha;
        Map map = null;
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                C2475k c2475k = (C2475k) obj;
                return c2475k.alpha.india(c2475k.bravo).oscar();
            case 1:
                r0.d dVar = (r0.d) obj;
                dVar.foxtrot = false;
                HashSet hashSet = new HashSet();
                J.e eVar = dVar.delta;
                Object[] objArr = eVar.alpha;
                int i5 = eVar.red;
                int i10 = 0;
                while (true) {
                    J.e eVar2 = dVar.echo;
                    if (i10 < i5) {
                        al alVar = (al) objArr[i10];
                        r0.g gVar = (r0.g) eVar2.alpha[i10];
                        if (((r) alVar.f13305x.delta).isAttached()) {
                            r0.d.bravo((r) alVar.f13305x.delta, gVar, hashSet);
                        }
                        i10++;
                    } else {
                        eVar.india();
                        eVar2.india();
                        J.e eVar3 = dVar.bravo;
                        Object[] objArr2 = eVar3.alpha;
                        int i11 = eVar3.red;
                        while (true) {
                            J.e eVar4 = dVar.charlie;
                            if (i4 < i11) {
                                C2544d c2544d = (C2544d) objArr2[i4];
                                r0.g gVar2 = (r0.g) eVar4.alpha[i4];
                                if (c2544d.isAttached()) {
                                    r0.d.bravo(c2544d, gVar2, hashSet);
                                }
                                i4++;
                            } else {
                                eVar3.india();
                                eVar4.india();
                                Iterator it = hashSet.iterator();
                                while (it.hasNext()) {
                                    ((C2544d) it.next()).d();
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
            case 2:
                ap apVar = ((al) obj).f13306y;
                apVar.papa.f13233s = true;
                ay ayVar = apVar.quebec;
                if (ayVar != null) {
                    ayVar.f13332m = true;
                }
                return Unit.INSTANCE;
            case 3:
                a0.ap apVar2 = L.f13246F;
                ((Function1) obj).invoke(apVar2);
                apVar2.f2585l = apVar2.e.alpha(apVar2.f2581h, apVar2.f2583j, apVar2.f2582i);
                return Unit.INSTANCE;
            case 4:
                return (AttendanceRegistryFragment) obj;
            case 5:
                return (d0) ((C2474j) obj).invoke();
            case 6:
                return (List) ((se.ap) obj).e.getValue();
            case 7:
                ad.kilo(((au) obj).red, null);
                return Unit.INSTANCE;
            case 8:
                ((av) obj).getClass();
                return Unit.INSTANCE;
            case 9:
                ((androidx.appcompat.app.g) ((C3.d) obj).red).dismiss();
                return Unit.INSTANCE;
            case 10:
                return (C3105j) obj;
            case 11:
                return (d0) ((C2474j) obj).invoke();
            case 12:
                return (C3248d) obj;
            case 13:
                return (d0) ((C2474j) obj).invoke();
            case 14:
                return (ScoreFragment) obj;
            case 15:
                return (d0) ((C2474j) obj).invoke();
            case 16:
                Ld.c hotel = ab.hotel();
                z zVar = (z) obj;
                hotel.add(zVar.alpha.alpha);
                af afVar = zVar.bravo;
                if (afVar != null) {
                    hotel.add("under-migration:".concat(afVar.alpha));
                }
                for (Map.Entry entry : zVar.charlie.entrySet()) {
                    hotel.add("@" + entry.getKey() + ':' + ((af) entry.getValue()).alpha);
                }
                return (String[]) ab.alpha(hotel).toArray(new String[0]);
            case 17:
                return new al.f(2, (C3464a) obj);
            case 18:
                Object obj2 = ze.e.alpha;
                Ee.a aVar = ((ze.i) obj).delta;
                if (aVar instanceof v) {
                    vVar = (v) aVar;
                } else {
                    vVar = null;
                }
                if (vVar != null && (nVar = (n) ze.e.bravo.get(Ne.f.echo(vVar.bravo.name()).bravo())) != null) {
                    iVar = new Se.i(Ne.b.juliet(me.m.victor), Ne.f.echo(nVar.name()));
                } else {
                    iVar = null;
                }
                if (iVar != null) {
                    map = y.romeo(new Pair(ze.c.charlie, iVar));
                }
                if (map != null) {
                    return map;
                }
                return tVar;
            default:
                Ee.a aVar2 = ((ze.j) obj).delta;
                if (aVar2 instanceof ve.h) {
                    Object obj3 = ze.e.alpha;
                    bVar = ze.e.alpha(((ve.h) aVar2).alpha());
                } else if (aVar2 instanceof v) {
                    Object obj4 = ze.e.alpha;
                    bVar = ze.e.alpha(ab.juliet(aVar2));
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    map = y.romeo(new Pair(ze.c.bravo, bVar));
                }
                if (map != null) {
                    return map;
                }
                return tVar;
        }
    }
}
