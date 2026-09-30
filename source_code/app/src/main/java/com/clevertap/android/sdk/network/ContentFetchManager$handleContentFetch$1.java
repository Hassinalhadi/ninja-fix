package com.clevertap.android.sdk.network;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import com.clevertap.android.sdk.Logger;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import org.json.JSONArray;
import vf.ab;

@e(c = "com.clevertap.android.sdk.network.ContentFetchManager$handleContentFetch$1", f = "ContentFetchManager.kt", l = {55}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes3.dex */
public final class ContentFetchManager$handleContentFetch$1 extends i implements l {
    final /* synthetic */ JSONArray $contentFetchItems;
    final /* synthetic */ String $packageName;
    int label;
    final /* synthetic */ ContentFetchManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFetchManager$handleContentFetch$1(ContentFetchManager contentFetchManager, JSONArray jSONArray, String str, c<? super ContentFetchManager$handleContentFetch$1> cVar) {
        super(2, cVar);
        this.this$0 = contentFetchManager;
        this.$contentFetchItems = jSONArray;
        this.$packageName = str;
    }

    @Override // Pd.a
    public final c<Unit> create(Object obj, c<?> cVar) {
        return new ContentFetchManager$handleContentFetch$1(this.this$0, this.$contentFetchItems, this.$packageName, cVar);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Logger logger;
        Logger logger2;
        JSONArray contentFetchPayload;
        Logger logger3;
        Object sendContentFetchRequest;
        a aVar = a.alpha;
        int i4 = this.label;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                contentFetchPayload = this.this$0.getContentFetchPayload(this.$contentFetchItems, this.$packageName);
                if (contentFetchPayload.length() <= 0) {
                    logger3 = this.this$0.logger;
                    logger3.verbose("ContentFetch", "No valid content fetch items to send.");
                } else {
                    ContentFetchManager contentFetchManager = this.this$0;
                    this.label = 1;
                    sendContentFetchRequest = contentFetchManager.sendContentFetchRequest(contentFetchPayload, this);
                    if (sendContentFetchRequest == aVar) {
                        return aVar;
                    }
                }
            }
        } catch (CancellationException unused) {
            logger2 = this.this$0.logger;
            logger2.verbose("ContentFetch", "Fetch job was cancelled.");
        } catch (Exception e) {
            logger = this.this$0.logger;
            logger.verbose("ContentFetch", "Unexpected error during content fetch", e);
        }
        return Unit.INSTANCE;
    }

    @Override // Xd.l
    public final Object invoke(ab abVar, c<? super Unit> cVar) {
        return ((ContentFetchManager$handleContentFetch$1) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
