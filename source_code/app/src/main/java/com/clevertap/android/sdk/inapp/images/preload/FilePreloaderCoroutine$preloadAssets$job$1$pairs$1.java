package com.clevertap.android.sdk.inapp.images.preload;

import Nd.c;
import Pd.e;
import Pd.i;
import Xd.l;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;
import vf.ag;

@e(c = "com.clevertap.android.sdk.inapp.images.preload.FilePreloaderCoroutine$preloadAssets$job$1$pairs$1", f = "FilePreloaderCoroutine.kt", l = {105}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvf/ab;", "", "Lkotlin/Pair;", "", "", "<anonymous>", "(Lvf/ab;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class FilePreloaderCoroutine$preloadAssets$job$1$pairs$1 extends i implements l {
    final /* synthetic */ List<ag> $dowloadResults;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(List<ag> list, c<? super FilePreloaderCoroutine$preloadAssets$job$1$pairs$1> cVar) {
        super(2, cVar);
        this.$dowloadResults = list;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new FilePreloaderCoroutine$preloadAssets$job$1$pairs$1(this.$dowloadResults, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        List<ag> list = this.$dowloadResults;
        this.label = 1;
        Object hotel = ad.hotel(list, this);
        if (hotel == aVar) {
            return aVar;
        }
        return hotel;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super List<Pair<String, Boolean>>> cVar) {
        return ((FilePreloaderCoroutine$preloadAssets$job$1$pairs$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
