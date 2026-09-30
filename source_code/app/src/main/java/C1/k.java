package C1;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class k implements ar {
    public final /* synthetic */ Ef.a alpha;
    public final /* synthetic */ kotlin.jvm.internal.q bravo;
    public final /* synthetic */ Ref.ObjectRef charlie;
    public final /* synthetic */ ap delta;

    public k(Ef.a aVar, kotlin.jvm.internal.q qVar, Ref.ObjectRef objectRef, ap apVar) {
        this.alpha = aVar;
        this.bravo = qVar;
        this.charlie = objectRef;
        this.delta = apVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d9, B:46:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [Ef.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(f fVar, Pd.c cVar) {
        j jVar;
        int i4;
        ap apVar;
        Ef.c cVar2;
        kotlin.jvm.internal.q qVar;
        Ref.ObjectRef objectRef;
        Xd.l lVar;
        Ef.a aVar;
        Ef.a aVar2;
        ap apVar2;
        Object obj;
        Ref.ObjectRef objectRef2;
        try {
            if (cVar instanceof j) {
                jVar = (j) cVar;
                int i5 = jVar.f774s;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    jVar.f774s = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj2 = jVar.white;
                    Od.a aVar3 = Od.a.alpha;
                    i4 = jVar.f774s;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 != 2) {
                                if (i4 == 3) {
                                    obj = jVar.red;
                                    objectRef2 = (Ref.ObjectRef) jVar.purple;
                                    aVar = (Ef.a) jVar.alpha;
                                    try {
                                        ResultKt.alpha(obj2);
                                        objectRef2.alpha = obj;
                                        objectRef = objectRef2;
                                        Object obj3 = objectRef.alpha;
                                        ((Ef.c) aVar).foxtrot(null);
                                        return obj3;
                                    } catch (Throwable th) {
                                        th = th;
                                        ((Ef.c) aVar).foxtrot(null);
                                        throw th;
                                    }
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            apVar2 = (ap) jVar.red;
                            objectRef = (Ref.ObjectRef) jVar.purple;
                            aVar2 = (Ef.a) jVar.alpha;
                            try {
                                ResultKt.alpha(obj2);
                                if (Intrinsics.areEqual(obj2, objectRef.alpha)) {
                                    jVar.alpha = aVar2;
                                    jVar.purple = objectRef;
                                    jVar.red = obj2;
                                    jVar.f774s = 3;
                                    if (apVar2.kilo(obj2, false, jVar) != aVar3) {
                                        obj = obj2;
                                        objectRef2 = objectRef;
                                        aVar = aVar2;
                                        objectRef2.alpha = obj;
                                        objectRef = objectRef2;
                                        Object obj32 = objectRef.alpha;
                                        ((Ef.c) aVar).foxtrot(null);
                                        return obj32;
                                    }
                                    return aVar3;
                                }
                                aVar = aVar2;
                                Object obj322 = objectRef.alpha;
                                ((Ef.c) aVar).foxtrot(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((Ef.c) aVar).foxtrot(null);
                                throw th;
                            }
                        }
                        ap apVar3 = jVar.teal;
                        objectRef = jVar.silver;
                        qVar = (kotlin.jvm.internal.q) jVar.red;
                        ?? r72 = (Ef.a) jVar.purple;
                        Xd.l lVar2 = (Xd.l) jVar.alpha;
                        ResultKt.alpha(obj2);
                        apVar = apVar3;
                        lVar = lVar2;
                        cVar2 = r72;
                    } else {
                        ResultKt.alpha(obj2);
                        jVar.alpha = fVar;
                        Ef.a aVar4 = this.alpha;
                        jVar.purple = aVar4;
                        kotlin.jvm.internal.q qVar2 = this.bravo;
                        jVar.red = qVar2;
                        Ref.ObjectRef objectRef3 = this.charlie;
                        jVar.silver = objectRef3;
                        apVar = this.delta;
                        jVar.teal = apVar;
                        jVar.f774s = 1;
                        cVar2 = (Ef.c) aVar4;
                        if (cVar2.delta(jVar) != aVar3) {
                            qVar = qVar2;
                            objectRef = objectRef3;
                            lVar = fVar;
                        }
                        return aVar3;
                    }
                    if (qVar.alpha) {
                        Object obj4 = objectRef.alpha;
                        jVar.alpha = cVar2;
                        jVar.purple = objectRef;
                        jVar.red = apVar;
                        jVar.silver = null;
                        jVar.teal = null;
                        jVar.f774s = 2;
                        Object invoke = lVar.invoke(obj4, jVar);
                        if (invoke != aVar3) {
                            aVar2 = cVar2;
                            obj2 = invoke;
                            apVar2 = apVar;
                            if (Intrinsics.areEqual(obj2, objectRef.alpha)) {
                            }
                        }
                        return aVar3;
                    }
                    throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                }
            }
            if (qVar.alpha) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = cVar2;
            ((Ef.c) aVar).foxtrot(null);
            throw th;
        }
        jVar = new j(this, cVar);
        Object obj22 = jVar.white;
        Od.a aVar32 = Od.a.alpha;
        i4 = jVar.f774s;
        if (i4 == 0) {
        }
    }
}
