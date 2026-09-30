package com.airbnb.lottie.compose;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import Xd.l;
import android.content.Context;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.model.Font;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.ab;

@e(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$loadFontsFromAssets$2", f = "rememberLottieComposition.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvf/ab;", "", "<anonymous>", "(Lvf/ab;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt$loadFontsFromAssets$2 extends i implements l {
    final /* synthetic */ LottieComposition $composition;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$loadFontsFromAssets$2(LottieComposition lottieComposition, Context context, String str, String str2, c<? super RememberLottieCompositionKt$loadFontsFromAssets$2> cVar) {
        super(2, cVar);
        this.$composition = lottieComposition;
        this.$context = context;
        this.$fontAssetsFolder = str;
        this.$fontFileExtension = str2;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@Nullable Object obj, @NotNull c<?> cVar) {
        return new RememberLottieCompositionKt$loadFontsFromAssets$2(this.$composition, this.$context, this.$fontAssetsFolder, this.$fontFileExtension, cVar);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.alpha;
        if (this.label == 0) {
            ResultKt.alpha(obj);
            for (Font font : this.$composition.getFonts().values()) {
                Context context = this.$context;
                Intrinsics.checkNotNull(font);
                RememberLottieCompositionKt.maybeLoadTypefaceFromAssets(context, font, this.$fontAssetsFolder, this.$fontFileExtension);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // Xd.l
    @Nullable
    public final Object invoke(@NotNull ab abVar, @Nullable c<? super Unit> cVar) {
        return ((RememberLottieCompositionKt$loadFontsFromAssets$2) create(abVar, cVar)).invokeSuspend(Unit.INSTANCE);
    }
}
