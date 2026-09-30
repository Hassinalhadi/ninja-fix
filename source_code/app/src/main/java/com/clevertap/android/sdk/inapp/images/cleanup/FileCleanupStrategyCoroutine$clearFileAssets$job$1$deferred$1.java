package com.clevertap.android.sdk.inapp.images.cleanup;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.ab;

@e(c = "com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1", f = "FileCleanupStrategyCoroutine.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1 extends i implements l {
    final /* synthetic */ Function1<String, Unit> $successBlock;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ FileCleanupStrategyCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1(FileCleanupStrategyCoroutine fileCleanupStrategyCoroutine, String str, Function1<? super String, Unit> function1, c<? super FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1> cVar) {
        super(2, cVar);
        this.this$0 = fileCleanupStrategyCoroutine;
        this.$url = str;
        this.$successBlock = function1;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1(this.this$0, this.$url, this.$successBlock, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            this.this$0.getFileResourceProvider().invoke().deleteData(this.$url);
            this.$successBlock.invoke(this.$url);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((FileCleanupStrategyCoroutine$clearFileAssets$job$1$deferred$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
