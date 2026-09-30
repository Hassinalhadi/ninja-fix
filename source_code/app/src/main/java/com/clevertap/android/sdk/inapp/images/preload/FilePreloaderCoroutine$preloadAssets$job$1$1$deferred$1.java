package com.clevertap.android.sdk.inapp.images.preload;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import vf.ab;

@e(c = "com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1", f = "FilePreloaderCoroutine.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvf/ab;", "Lkotlin/Pair;", "", "", "<anonymous>", "(Lvf/ab;)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1 extends i implements l {
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Object> $assetBlock;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $failureBlock;
    final /* synthetic */ Pair<String, CtCacheType> $meta;
    final /* synthetic */ Map<String, Boolean> $results;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $startedBlock;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $successBlock;
    int label;
    final /* synthetic */ FilePreloaderCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1(FilePreloaderCoroutine filePreloaderCoroutine, Pair<String, ? extends CtCacheType> pair, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function1, Map<String, Boolean> map, Function1<? super Pair<String, ? extends CtCacheType>, ? extends Object> function12, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function13, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function14, c<? super FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1> cVar) {
        super(2, cVar);
        this.this$0 = filePreloaderCoroutine;
        this.$meta = pair;
        this.$startedBlock = function1;
        this.$results = map;
        this.$assetBlock = function12;
        this.$successBlock = function13;
        this.$failureBlock = function14;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1(this.this$0, this.$meta, this.$startedBlock, this.$results, this.$assetBlock, this.$successBlock, this.$failureBlock, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        boolean z2;
        boolean z10;
        boolean z11;
        ILogger logger;
        ILogger logger2;
        Od.a aVar = Od.a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            z2 = this.this$0.deepLogging;
            if (z2 && (logger2 = this.this$0.getLogger()) != null) {
                logger2.verbose("started asset url fetch " + this.$meta);
            }
            this.$startedBlock.invoke(this.$meta);
            Function1<Pair<String, ? extends CtCacheType>, Object> function1 = this.$assetBlock;
            Pair<String, CtCacheType> pair = this.$meta;
            Function1<Pair<String, ? extends CtCacheType>, Unit> function12 = this.$successBlock;
            Function1<Pair<String, ? extends CtCacheType>, Unit> function13 = this.$failureBlock;
            long currentTimeMillis = System.currentTimeMillis();
            if (function1.invoke(pair) != null) {
                function12.invoke(pair);
                z10 = true;
            } else {
                function13.invoke(pair);
                z10 = false;
            }
            long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
            z11 = this.this$0.deepLogging;
            if (z11 && (logger = this.this$0.getLogger()) != null) {
                logger.verbose("finished asset url fetch " + this.$meta + " in " + currentTimeMillis2 + " ms");
            }
            this.$results.put(this.$meta.getFirst(), Boolean.valueOf(z10));
            return new Pair(this.$meta.getFirst(), Boolean.valueOf(z10));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Pair<String, Boolean>> cVar) {
        return ((FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
