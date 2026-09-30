package com.clevertap.android.sdk.inapp.images.preload;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import vf.ab;
import vf.ad;
import vf.f0;

@e(c = "com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$preloadAssets$job$1", f = "FilePreloaderCoroutine.kt", l = {104}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class FilePreloaderCoroutine$preloadAssets$job$1 extends i implements l {
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Object> $assetBlock;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $failureBlock;
    final /* synthetic */ Function1<Map<String, Boolean>, Unit> $preloadFinished;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $startedBlock;
    final /* synthetic */ Function1<Pair<String, ? extends CtCacheType>, Unit> $successBlock;
    final /* synthetic */ List<Pair<String, CtCacheType>> $urlMetas;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FilePreloaderCoroutine this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FilePreloaderCoroutine$preloadAssets$job$1(List<? extends Pair<String, ? extends CtCacheType>> list, FilePreloaderCoroutine filePreloaderCoroutine, Function1<? super Map<String, Boolean>, Unit> function1, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function12, Function1<? super Pair<String, ? extends CtCacheType>, ? extends Object> function13, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function14, Function1<? super Pair<String, ? extends CtCacheType>, Unit> function15, c<? super FilePreloaderCoroutine$preloadAssets$job$1> cVar) {
        super(2, cVar);
        this.$urlMetas = list;
        this.this$0 = filePreloaderCoroutine;
        this.$preloadFinished = function1;
        this.$startedBlock = function12;
        this.$assetBlock = function13;
        this.$successBlock = function14;
        this.$failureBlock = function15;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        FilePreloaderCoroutine$preloadAssets$job$1 filePreloaderCoroutine$preloadAssets$job$1 = new FilePreloaderCoroutine$preloadAssets$job$1(this.$urlMetas, this.this$0, this.$preloadFinished, this.$startedBlock, this.$assetBlock, this.$successBlock, this.$failureBlock, cVar);
        filePreloaderCoroutine$preloadAssets$job$1.L$0 = obj;
        return filePreloaderCoroutine$preloadAssets$job$1;
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        Object bravo;
        Map<String, Boolean> map;
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                map = (Map) this.L$0;
                ResultKt.alpha(obj);
                bravo = obj;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            ab abVar = (ab) this.L$0;
            ArrayList arrayList = new ArrayList();
            List<Pair<String, CtCacheType>> list = this.$urlMetas;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new Pair(((Pair) it.next()).getFirst(), Boolean.FALSE));
            }
            collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList2, 10);
            int quebec = y.quebec(collectionSizeOrDefault2);
            if (quebec < 16) {
                quebec = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Pair pair = (Pair) it2.next();
                Pair pair2 = new Pair(pair.getFirst(), pair.getSecond());
                linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
            }
            LinkedHashMap amber = y.amber(linkedHashMap);
            List<Pair<String, CtCacheType>> list2 = this.$urlMetas;
            FilePreloaderCoroutine filePreloaderCoroutine = this.this$0;
            Function1<Pair<String, ? extends CtCacheType>, Unit> function1 = this.$startedBlock;
            Function1<Pair<String, ? extends CtCacheType>, Object> function12 = this.$assetBlock;
            Function1<Pair<String, ? extends CtCacheType>, Unit> function13 = this.$successBlock;
            Function1<Pair<String, ? extends CtCacheType>, Unit> function14 = this.$failureBlock;
            Iterator<T> it3 = list2.iterator();
            while (it3.hasNext()) {
                Function1<Pair<String, ? extends CtCacheType>, Unit> function15 = function14;
                arrayList.add(ad.golf(abVar, null, new FilePreloaderCoroutine$preloadAssets$job$1$1$deferred$1(filePreloaderCoroutine, (Pair) it3.next(), function1, amber, function12, function13, function15, null), 3));
                function14 = function15;
            }
            long timeoutForPreload = this.this$0.getTimeoutForPreload();
            FilePreloaderCoroutine$preloadAssets$job$1$pairs$1 filePreloaderCoroutine$preloadAssets$job$1$pairs$1 = new FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(arrayList, null);
            this.L$0 = amber;
            this.label = 1;
            bravo = f0.bravo(timeoutForPreload, filePreloaderCoroutine$preloadAssets$job$1$pairs$1, this);
            if (bravo == aVar) {
                return aVar;
            }
            map = amber;
        }
        List list3 = (List) bravo;
        if (list3 != null) {
            this.$preloadFinished.invoke(y.yankee(list3));
        } else {
            this.$preloadFinished.invoke(map);
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((FilePreloaderCoroutine$preloadAssets$job$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
