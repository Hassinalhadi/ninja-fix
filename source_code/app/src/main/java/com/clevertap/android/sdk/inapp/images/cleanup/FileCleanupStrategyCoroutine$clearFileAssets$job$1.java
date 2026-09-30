package com.clevertap.android.sdk.inapp.images.cleanup;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.ab;
import vf.ad;

@e(c = "com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategyCoroutine$clearFileAssets$job$1", f = "FileCleanupStrategyCoroutine.kt", l = {48}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class FileCleanupStrategyCoroutine$clearFileAssets$job$1 extends i implements l {
    final /* synthetic */ Function1<String, Unit> $successBlock;
    final /* synthetic */ List<String> $urls;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FileCleanupStrategyCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileCleanupStrategyCoroutine$clearFileAssets$job$1(List<String> list, FileCleanupStrategyCoroutine fileCleanupStrategyCoroutine, Function1<? super String, Unit> function1, c<? super FileCleanupStrategyCoroutine$clearFileAssets$job$1> cVar) {
        super(2, cVar);
        this.$urls = list;
        this.this$0 = fileCleanupStrategyCoroutine;
        this.$successBlock = function1;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        FileCleanupStrategyCoroutine$clearFileAssets$job$1 fileCleanupStrategyCoroutine$clearFileAssets$job$1 = new FileCleanupStrategyCoroutine$clearFileAssets$job$1(this.$urls, this.this$0, this.$successBlock, cVar);
        fileCleanupStrategyCoroutine$clearFileAssets$job$1.L$0 = obj;
        return fileCleanupStrategyCoroutine$clearFileAssets$job$1;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            ab abVar = (ab) this.L$0;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = this.$urls.iterator();
            while (it.hasNext()) {
                arrayList.add(ad.golf(abVar, null, new FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1(this.this$0, it.next(), this.$successBlock, null), 3));
            }
            this.label = 1;
            if (ad.hotel(arrayList, this) == aVar) {
                return aVar;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((FileCleanupStrategyCoroutine$clearFileAssets$job$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
