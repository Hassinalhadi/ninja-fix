package E1;

import Tf.aj;
import Tf.r;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2689j6;

/* loaded from: classes3.dex */
public final class k extends c {
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090 A[Catch: all -> 0x0089, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:16:0x0090, B:27:0x009d, B:40:0x0085, B:37:0x0080), top: B:36:0x0080, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d A[Catch: all -> 0x0089, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0089, blocks: (B:16:0x0090, B:27:0x009d, B:40:0x0085, B:37:0x0080), top: B:36:0x0080, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(Object obj, Pd.c cVar) {
        j jVar;
        int i4;
        r rVar;
        Throwable th;
        aj ajVar;
        r rVar2;
        Unit unit;
        Throwable th2;
        Unit unit2;
        if (cVar instanceof j) {
            jVar = (j) cVar;
            int i5 = jVar.white;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                jVar.white = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = jVar.silver;
                Od.a aVar = Od.a.alpha;
                i4 = jVar.white;
                Throwable th3 = null;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ajVar = jVar.red;
                        rVar2 = jVar.purple;
                        rVar = jVar.alpha;
                        try {
                            ResultKt.alpha(obj2);
                        } catch (Throwable th4) {
                            th = th4;
                            if (ajVar != null) {
                            }
                            th2 = th;
                            unit2 = null;
                            if (th2 != null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    if (!this.charlie.alpha.get()) {
                        r openReadWrite = this.alpha.openReadWrite(this.bravo);
                        try {
                            aj bravo = Tf.b.bravo(r.papa(openReadWrite));
                            try {
                                G1.e eVar = G1.e.alpha;
                                jVar.alpha = openReadWrite;
                                jVar.purple = openReadWrite;
                                jVar.red = bravo;
                                jVar.white = 1;
                                if (eVar.charlie(obj, bravo) == aVar) {
                                    return aVar;
                                }
                                rVar = openReadWrite;
                                rVar2 = rVar;
                                ajVar = bravo;
                            } catch (Throwable th5) {
                                rVar = openReadWrite;
                                th = th5;
                                ajVar = bravo;
                                if (ajVar != null) {
                                    try {
                                        try {
                                            ajVar.close();
                                        } catch (Throwable th6) {
                                            AbstractC2689j6.charlie(th, th6);
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        openReadWrite = rVar;
                                        if (openReadWrite != null) {
                                            try {
                                                openReadWrite.close();
                                            } catch (Throwable th8) {
                                                AbstractC2689j6.charlie(th, th8);
                                            }
                                        }
                                        th3 = th;
                                        unit = null;
                                        if (th3 == null) {
                                        }
                                    }
                                }
                                th2 = th;
                                unit2 = null;
                                if (th2 != null) {
                                }
                            }
                        } catch (Throwable th9) {
                            th = th9;
                            if (openReadWrite != null) {
                            }
                            th3 = th;
                            unit = null;
                            if (th3 == null) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("This scope has already been closed.");
                    }
                }
                rVar2.flush();
                unit2 = Unit.INSTANCE;
                if (ajVar != null) {
                    try {
                        ajVar.close();
                    } catch (Throwable th10) {
                        th2 = th10;
                    }
                }
                th2 = null;
                if (th2 != null) {
                    Intrinsics.checkNotNull(unit2);
                    unit = Unit.INSTANCE;
                    if (rVar != null) {
                        try {
                            rVar.close();
                        } catch (Throwable th11) {
                            th3 = th11;
                        }
                    }
                    if (th3 == null) {
                        Intrinsics.checkNotNull(unit);
                        return Unit.INSTANCE;
                    }
                    throw th3;
                }
                throw th2;
            }
        }
        jVar = new j(this, cVar);
        Object obj22 = jVar.silver;
        Od.a aVar2 = Od.a.alpha;
        i4 = jVar.white;
        Throwable th32 = null;
        if (i4 == 0) {
        }
        rVar2.flush();
        unit2 = Unit.INSTANCE;
        if (ajVar != null) {
        }
        th2 = null;
        if (th2 != null) {
        }
    }
}
