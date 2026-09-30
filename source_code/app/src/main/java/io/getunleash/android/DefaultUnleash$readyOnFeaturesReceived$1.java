package io.getunleash.android;

import Pd.c;
import Pd.e;
import androidx.recyclerview.widget.RecyclerView;
import com.zendesk.service.HttpConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "io.getunleash.android.DefaultUnleash", f = "DefaultUnleash.kt", l = {HttpConstants.HTTP_UNPROCESSABLE_ENTITY}, m = "readyOnFeaturesReceived")
@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultUnleash$readyOnFeaturesReceived$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DefaultUnleash this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash$readyOnFeaturesReceived$1(DefaultUnleash defaultUnleash, Nd.c<? super DefaultUnleash$readyOnFeaturesReceived$1> cVar) {
        super(cVar);
        this.this$0 = defaultUnleash;
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object readyOnFeaturesReceived;
        this.result = obj;
        this.label |= RecyclerView.UNDEFINED_DURATION;
        readyOnFeaturesReceived = this.this$0.readyOnFeaturesReceived(this);
        return readyOnFeaturesReceived;
    }
}
