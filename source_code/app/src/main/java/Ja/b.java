package Ja;

import Pd.c;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements La.a {
    public final Ia.a alpha;

    public b(Ia.a remoteDataSource) {
        Intrinsics.echo(remoteDataSource, "remoteDataSource");
        this.alpha = remoteDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059 A[Catch: all -> 0x0027, LOOP:0: B:12:0x0053->B:14:0x0059, LOOP_END, TryCatch #0 {all -> 0x0027, blocks: (B:10:0x0023, B:11:0x0044, B:12:0x0053, B:14:0x0059, B:16:0x0074, B:23:0x0035), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object alpha(c cVar) {
        a aVar;
        int i4;
        int collectionSizeOrDefault;
        try {
            if (cVar instanceof a) {
                aVar = (a) cVar;
                int i5 = aVar.red;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    aVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = aVar.alpha;
                    Od.a aVar2 = Od.a.alpha;
                    i4 = aVar.red;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        Result.Companion companion = Result.INSTANCE;
                        Ia.a aVar3 = this.alpha;
                        aVar.red = 1;
                        obj = aVar3.alpha.alpha(aVar);
                        if (obj == aVar2) {
                            return aVar2;
                        }
                    }
                    Iterable<Ha.b> iterable = (Iterable) obj;
                    collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
                    ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                    for (Ha.b bVar : iterable) {
                        arrayList.add(new Ma.a(bVar.getName(), bVar.getLatitude(), bVar.getLongitude()));
                    }
                    return Result.m206constructorimpl(arrayList);
                }
            }
            if (i4 == 0) {
            }
            Iterable<Ha.b> iterable2 = (Iterable) obj;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable2, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            while (r9.hasNext()) {
            }
            return Result.m206constructorimpl(arrayList2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        aVar = new a(this, cVar);
        Object obj2 = aVar.alpha;
        Od.a aVar22 = Od.a.alpha;
        i4 = aVar.red;
    }
}
