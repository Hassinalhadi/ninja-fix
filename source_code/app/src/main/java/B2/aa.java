package B2;

import androidx.appcompat.widget.P0;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class aa extends Lambda implements Function0 {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ w purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ A2.ah silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(A2.ah ahVar, w wVar, String str) {
        super(0);
        this.silver = ahVar;
        this.purple = wVar;
        this.red = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                K2.b.alpha(new r(this.purple, this.red, 2, kotlin.collections.ab.juliet(this.silver)));
                return Unit.INSTANCE;
            default:
                A2.ah ahVar = this.silver;
                w wVar = this.purple;
                String str = this.red;
                aa aaVar = new aa(ahVar, wVar, str);
                J2.r uniform = wVar.delta.uniform();
                ArrayList india = uniform.india(str);
                if (india.size() <= 1) {
                    J2.o oVar = (J2.o) CollectionsKt.green(india);
                    if (oVar == null) {
                        aaVar.invoke();
                    } else {
                        String str2 = oVar.alpha;
                        J2.p hotel = uniform.hotel(str2);
                        if (hotel != null) {
                            if (hotel.delta()) {
                                if (oVar.bravo == 6) {
                                    uniform.alpha(str2);
                                    aaVar.invoke();
                                } else {
                                    final J2.p bravo = J2.p.bravo(ahVar.bravo, oVar.alpha, 0, null, null, 0, 0L, 0, 0, 0L, 0, 16777214);
                                    f processor = wVar.golf;
                                    Intrinsics.delta(processor, "processor");
                                    final WorkDatabase workDatabase = wVar.delta;
                                    Intrinsics.delta(workDatabase, "workDatabase");
                                    A2.a configuration = wVar.charlie;
                                    Intrinsics.delta(configuration, "configuration");
                                    final List schedulers = wVar.foxtrot;
                                    Intrinsics.delta(schedulers, "schedulers");
                                    J2.r uniform2 = workDatabase.uniform();
                                    final String str3 = bravo.alpha;
                                    final J2.p hotel2 = uniform2.hotel(str3);
                                    if (hotel2 != null) {
                                        if (!A0.z.bravo(hotel2.bravo)) {
                                            if (!(hotel2.delta() ^ bravo.delta())) {
                                                final boolean foxtrot = processor.foxtrot(str3);
                                                if (!foxtrot) {
                                                    Iterator it = schedulers.iterator();
                                                    while (it.hasNext()) {
                                                        ((h) it.next()).delta(str3);
                                                    }
                                                }
                                                final Set set = ahVar.charlie;
                                                workDatabase.oscar(new Runnable() { // from class: B2.z
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        WorkDatabase workDatabase2 = WorkDatabase.this;
                                                        J2.r uniform3 = workDatabase2.uniform();
                                                        J2.t victor = workDatabase2.victor();
                                                        J2.p pVar = hotel2;
                                                        int i4 = pVar.bravo;
                                                        long j5 = pVar.november;
                                                        int i5 = pVar.tango + 1;
                                                        long j6 = pVar.uniform;
                                                        int i10 = pVar.victor;
                                                        J2.p pVar2 = bravo;
                                                        J2.p bravo2 = J2.p.bravo(pVar2, null, i4, null, null, pVar.kilo, j5, pVar.sierra, i5, j6, i10, 12835837);
                                                        if (pVar2.victor == 1) {
                                                            bravo2.uniform = pVar2.uniform;
                                                            bravo2.victor++;
                                                        }
                                                        J2.p delta = K2.f.delta(schedulers, bravo2);
                                                        WorkDatabase_Impl workDatabase_Impl = uniform3.alpha;
                                                        workDatabase_Impl.bravo();
                                                        workDatabase_Impl.charlie();
                                                        try {
                                                            J2.h hVar = uniform3.charlie;
                                                            androidx.sqlite.db.framework.i alpha = hVar.alpha();
                                                            try {
                                                                hVar.november(alpha, delta);
                                                                alpha.charlie();
                                                                hVar.lima(alpha);
                                                                workDatabase_Impl.papa();
                                                                workDatabase_Impl.kilo();
                                                                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) victor.alpha;
                                                                workDatabase_Impl2.bravo();
                                                                J2.h hVar2 = (J2.h) victor.red;
                                                                androidx.sqlite.db.framework.i alpha2 = hVar2.alpha();
                                                                String str4 = str3;
                                                                alpha2.oscar(1, str4);
                                                                try {
                                                                    workDatabase_Impl2.charlie();
                                                                    try {
                                                                        alpha2.charlie();
                                                                        workDatabase_Impl2.papa();
                                                                        hVar2.lima(alpha2);
                                                                        victor.romeo(str4, set);
                                                                        if (!foxtrot) {
                                                                            uniform3.juliet(-1L, str4);
                                                                            workDatabase2.tango().lima(str4);
                                                                        }
                                                                    } finally {
                                                                        workDatabase_Impl2.kilo();
                                                                    }
                                                                } catch (Throwable th) {
                                                                    hVar2.lima(alpha2);
                                                                    throw th;
                                                                }
                                                            } catch (Throwable th2) {
                                                                hVar.lima(alpha);
                                                                throw th2;
                                                            }
                                                        } catch (Throwable th3) {
                                                            workDatabase_Impl.kilo();
                                                            throw th3;
                                                        }
                                                    }
                                                });
                                                if (!foxtrot) {
                                                    k.bravo(configuration, workDatabase, schedulers);
                                                }
                                            } else {
                                                StringBuilder sb2 = new StringBuilder("Can't update ");
                                                ab abVar = ab.alpha;
                                                sb2.append((String) abVar.invoke(hotel2));
                                                sb2.append(" Worker to ");
                                                throw new UnsupportedOperationException(P0.gold(sb2, (String) abVar.invoke(bravo), " Worker. Update operation must preserve worker's type."));
                                            }
                                        }
                                    } else {
                                        throw new IllegalArgumentException(ao.ad.gray("Worker with ", str3, " doesn't exist"));
                                    }
                                }
                            } else {
                                throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                            }
                        } else {
                            throw new IllegalStateException(av.q.golf("WorkSpec with ", str2, ", that matches a name \"", str, "\", wasn't found"));
                        }
                    }
                    return Unit.INSTANCE;
                }
                throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(w wVar, String str, A2.ah ahVar) {
        super(0);
        this.purple = wVar;
        this.red = str;
        this.silver = ahVar;
    }
}
