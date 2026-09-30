package com.airbnb.lottie.compose;

import Cf.d;
import Cf.e;
import Nd.c;
import Od.a;
import Xd.m;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.util.Base64;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import av.q;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieImageAsset;
import com.airbnb.lottie.LottieListener;
import com.airbnb.lottie.LottieTask;
import com.airbnb.lottie.compose.LottieCompositionSpec;
import com.airbnb.lottie.model.Font;
import com.airbnb.lottie.utils.Logger;
import com.airbnb.lottie.utils.Utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J6;
import vf.C3207k;
import vf.InterfaceC3206j;
import vf.ad;
import vf.ao;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022*\b\u0002\u0010\r\u001a$\b\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001aF\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015\u001a9\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00172\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a \u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001a*\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0082@¢\u0006\u0004\b\u001b\u0010\u001c\u001a*\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0082@¢\u0006\u0004\b\u001f\u0010 \u001a)\u0010#\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010%\u001a\u00020\u001e2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b%\u0010&\u001a2\u0010'\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0082@¢\u0006\u0004\b'\u0010(\u001a1\u0010+\u001a\u00020\u001e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b+\u0010,\u001a!\u00100\u001a\u0004\u0018\u00010-2\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101\u001a\u0017\u00102\u001a\u0004\u0018\u00010\u0002*\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b2\u00103\u001a\u0013\u00104\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b4\u00103\"\u0014\u00105\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b5\u00106¨\u00069²\u0006\f\u00108\u001a\u0002078\nX\u008a\u0084\u0002"}, d2 = {"Lcom/airbnb/lottie/compose/LottieCompositionSpec;", "spec", "", "imageAssetsFolder", "fontAssetsFolder", "fontFileExtension", "cacheKey", "Lkotlin/Function3;", "", "", "LNd/c;", "", "", "onRetry", "Lcom/airbnb/lottie/compose/LottieCompositionResult;", "rememberLottieComposition", "(Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LXd/m;Landroidx/compose/runtime/m;II)Lcom/airbnb/lottie/compose/LottieCompositionResult;", "Landroid/content/Context;", "context", "Lcom/airbnb/lottie/LottieComposition;", "lottieComposition", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "isWarmingCache", "Lcom/airbnb/lottie/LottieTask;", "lottieTask", "(Landroid/content/Context;Lcom/airbnb/lottie/compose/LottieCompositionSpec;Ljava/lang/String;Z)Lcom/airbnb/lottie/LottieTask;", "T", "await", "(Lcom/airbnb/lottie/LottieTask;LNd/c;)Ljava/lang/Object;", "composition", "", "loadImagesFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/airbnb/lottie/LottieImageAsset;", "asset", "maybeLoadImageFromAsset", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieImageAsset;Ljava/lang/String;)V", "maybeDecodeBase64Image", "(Lcom/airbnb/lottie/LottieImageAsset;)V", "loadFontsFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/LottieComposition;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/airbnb/lottie/model/Font;", "font", "maybeLoadTypefaceFromAssets", "(Landroid/content/Context;Lcom/airbnb/lottie/model/Font;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/graphics/Typeface;", "typeface", "style", "typefaceForStyle", "(Landroid/graphics/Typeface;Ljava/lang/String;)Landroid/graphics/Typeface;", "ensureTrailingSlash", "(Ljava/lang/String;)Ljava/lang/String;", "ensureLeadingPeriod", "DefaultCacheKey", "Ljava/lang/String;", "Lcom/airbnb/lottie/compose/LottieCompositionResultImpl;", "result", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RememberLottieCompositionKt {

    @NotNull
    private static final String DefaultCacheKey = "__LottieInternalDefaultCacheKey__";

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Object await(LottieTask<T> lottieTask, c<? super T> cVar) {
        final C3207k c3207k = new C3207k(1, J6.delta(cVar));
        c3207k.tango();
        lottieTask.addListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$1
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(T t5) {
                if (!InterfaceC3206j.this.lima()) {
                    InterfaceC3206j.this.resumeWith(Result.m206constructorimpl(t5));
                }
            }
        }).addFailureListener(new LottieListener() { // from class: com.airbnb.lottie.compose.RememberLottieCompositionKt$await$2$2
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Throwable th) {
                if (InterfaceC3206j.this.lima()) {
                    return;
                }
                InterfaceC3206j interfaceC3206j = InterfaceC3206j.this;
                Result.Companion companion = Result.INSTANCE;
                Intrinsics.checkNotNull(th);
                interfaceC3206j.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(th)));
            }
        });
        Object sierra = c3207k.sierra();
        a aVar = a.alpha;
        return sierra;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureLeadingPeriod(String str) {
        if (StringsKt.gray(str) || r.quebec(str, ".", false)) {
            return str;
        }
        return ".".concat(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ensureTrailingSlash(String str) {
        if (str != null && !StringsKt.gray(str)) {
            if (StringsKt.coral(str, '/')) {
                return str;
            }
            return str.concat("/");
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadFontsFromAssets(Context context, LottieComposition lottieComposition, String str, String str2, c<? super Unit> cVar) {
        if (lottieComposition.getFonts().isEmpty()) {
            return Unit.INSTANCE;
        }
        e eVar = ao.alpha;
        Object blue = ad.blue(d.purple, new RememberLottieCompositionKt$loadFontsFromAssets$2(lottieComposition, context, str, str2, null), cVar);
        if (blue == a.alpha) {
            return blue;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object loadImagesFromAssets(Context context, LottieComposition lottieComposition, String str, c<? super Unit> cVar) {
        if (!lottieComposition.hasImages()) {
            return Unit.INSTANCE;
        }
        e eVar = ao.alpha;
        Object blue = ad.blue(d.purple, new RememberLottieCompositionKt$loadImagesFromAssets$2(lottieComposition, context, str, null), cVar);
        if (blue == a.alpha) {
            return blue;
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007c, code lost:
    
        if (r12 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object lottieComposition(Context context, LottieCompositionSpec lottieCompositionSpec, String str, String str2, String str3, String str4, c<? super LottieComposition> cVar) {
        RememberLottieCompositionKt$lottieComposition$1 rememberLottieCompositionKt$lottieComposition$1;
        a aVar;
        int i4;
        LottieComposition lottieComposition;
        String str5;
        Context context2;
        LottieComposition lottieComposition2;
        String str6;
        if (cVar instanceof RememberLottieCompositionKt$lottieComposition$1) {
            rememberLottieCompositionKt$lottieComposition$1 = (RememberLottieCompositionKt$lottieComposition$1) cVar;
            int i5 = rememberLottieCompositionKt$lottieComposition$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                rememberLottieCompositionKt$lottieComposition$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = rememberLottieCompositionKt$lottieComposition$1.result;
                aVar = a.alpha;
                i4 = rememberLottieCompositionKt$lottieComposition$1.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                LottieComposition lottieComposition3 = (LottieComposition) rememberLottieCompositionKt$lottieComposition$1.L$0;
                                ResultKt.alpha(obj);
                                return lottieComposition3;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        lottieComposition2 = (LottieComposition) rememberLottieCompositionKt$lottieComposition$1.L$3;
                        str6 = (String) rememberLottieCompositionKt$lottieComposition$1.L$2;
                        str5 = (String) rememberLottieCompositionKt$lottieComposition$1.L$1;
                        context2 = (Context) rememberLottieCompositionKt$lottieComposition$1.L$0;
                        ResultKt.alpha(obj);
                        rememberLottieCompositionKt$lottieComposition$1.L$0 = lottieComposition2;
                        rememberLottieCompositionKt$lottieComposition$1.L$1 = null;
                        rememberLottieCompositionKt$lottieComposition$1.L$2 = null;
                        rememberLottieCompositionKt$lottieComposition$1.L$3 = null;
                        rememberLottieCompositionKt$lottieComposition$1.label = 3;
                        if (loadFontsFromAssets(context2, lottieComposition2, str5, str6, rememberLottieCompositionKt$lottieComposition$1) != aVar) {
                            return aVar;
                        }
                        return lottieComposition2;
                    }
                    str3 = (String) rememberLottieCompositionKt$lottieComposition$1.L$3;
                    str2 = (String) rememberLottieCompositionKt$lottieComposition$1.L$2;
                    str = (String) rememberLottieCompositionKt$lottieComposition$1.L$1;
                    context = (Context) rememberLottieCompositionKt$lottieComposition$1.L$0;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    LottieTask<LottieComposition> lottieTask = lottieTask(context, lottieCompositionSpec, str4, false);
                    if (lottieTask != null) {
                        rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
                        rememberLottieCompositionKt$lottieComposition$1.L$1 = str;
                        rememberLottieCompositionKt$lottieComposition$1.L$2 = str2;
                        rememberLottieCompositionKt$lottieComposition$1.L$3 = str3;
                        rememberLottieCompositionKt$lottieComposition$1.label = 1;
                        obj = await(lottieTask, rememberLottieCompositionKt$lottieComposition$1);
                    } else {
                        throw new IllegalArgumentException(("Unable to create parsing task for " + lottieCompositionSpec + ".").toString());
                    }
                }
                lottieComposition = (LottieComposition) obj;
                rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
                rememberLottieCompositionKt$lottieComposition$1.L$1 = str2;
                rememberLottieCompositionKt$lottieComposition$1.L$2 = str3;
                rememberLottieCompositionKt$lottieComposition$1.L$3 = lottieComposition;
                rememberLottieCompositionKt$lottieComposition$1.label = 2;
                if (loadImagesFromAssets(context, lottieComposition, str, rememberLottieCompositionKt$lottieComposition$1) != aVar) {
                    str5 = str2;
                    context2 = context;
                    lottieComposition2 = lottieComposition;
                    str6 = str3;
                    rememberLottieCompositionKt$lottieComposition$1.L$0 = lottieComposition2;
                    rememberLottieCompositionKt$lottieComposition$1.L$1 = null;
                    rememberLottieCompositionKt$lottieComposition$1.L$2 = null;
                    rememberLottieCompositionKt$lottieComposition$1.L$3 = null;
                    rememberLottieCompositionKt$lottieComposition$1.label = 3;
                    if (loadFontsFromAssets(context2, lottieComposition2, str5, str6, rememberLottieCompositionKt$lottieComposition$1) != aVar) {
                    }
                }
                return aVar;
            }
        }
        rememberLottieCompositionKt$lottieComposition$1 = new RememberLottieCompositionKt$lottieComposition$1(cVar);
        Object obj2 = rememberLottieCompositionKt$lottieComposition$1.result;
        aVar = a.alpha;
        i4 = rememberLottieCompositionKt$lottieComposition$1.label;
        if (i4 == 0) {
        }
        lottieComposition = (LottieComposition) obj2;
        rememberLottieCompositionKt$lottieComposition$1.L$0 = context;
        rememberLottieCompositionKt$lottieComposition$1.L$1 = str2;
        rememberLottieCompositionKt$lottieComposition$1.L$2 = str3;
        rememberLottieCompositionKt$lottieComposition$1.L$3 = lottieComposition;
        rememberLottieCompositionKt$lottieComposition$1.label = 2;
        if (loadImagesFromAssets(context, lottieComposition, str, rememberLottieCompositionKt$lottieComposition$1) != aVar) {
        }
        return aVar;
    }

    private static final LottieTask<LottieComposition> lottieTask(Context context, LottieCompositionSpec lottieCompositionSpec, String str, boolean z2) {
        if (lottieCompositionSpec instanceof LottieCompositionSpec.RawRes) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m49unboximpl());
            }
            return LottieCompositionFactory.fromRawRes(context, ((LottieCompositionSpec.RawRes) lottieCompositionSpec).m49unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Url) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m56unboximpl());
            }
            return LottieCompositionFactory.fromUrl(context, ((LottieCompositionSpec.Url) lottieCompositionSpec).m56unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.File) {
            if (z2) {
                return null;
            }
            LottieCompositionSpec.File file = (LottieCompositionSpec.File) lottieCompositionSpec;
            FileInputStream fileInputStream = new FileInputStream(file.m35unboximpl());
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = file.m35unboximpl();
            }
            if (r.golf(file.m35unboximpl(), "zip", false)) {
                return LottieCompositionFactory.fromZipStream(new ZipInputStream(fileInputStream), str);
            }
            if (r.golf(file.m35unboximpl(), "tgs", false)) {
                return LottieCompositionFactory.fromJsonInputStream(new GZIPInputStream(fileInputStream), str);
            }
            return LottieCompositionFactory.fromJsonInputStream(fileInputStream, str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.Asset) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m21unboximpl());
            }
            return LottieCompositionFactory.fromAsset(context, ((LottieCompositionSpec.Asset) lottieCompositionSpec).m21unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.JsonString) {
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = String.valueOf(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m42unboximpl().hashCode());
            }
            return LottieCompositionFactory.fromJsonString(((LottieCompositionSpec.JsonString) lottieCompositionSpec).m42unboximpl(), str);
        }
        if (lottieCompositionSpec instanceof LottieCompositionSpec.ContentProvider) {
            LottieCompositionSpec.ContentProvider contentProvider = (LottieCompositionSpec.ContentProvider) lottieCompositionSpec;
            InputStream openInputStream = context.getContentResolver().openInputStream(contentProvider.m28unboximpl());
            if (Intrinsics.areEqual(str, DefaultCacheKey)) {
                str = contentProvider.m28unboximpl().toString();
            }
            return LottieCompositionFactory.fromInputStream(context, openInputStream, str);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeDecodeBase64Image(LottieImageAsset lottieImageAsset) {
        if (lottieImageAsset.getBitmap() == null) {
            String fileName = lottieImageAsset.getFileName();
            Intrinsics.checkNotNull(fileName);
            if (r.quebec(fileName, "data:", false) && StringsKt.fuchsia(fileName, "base64,", 0, false, 6) > 0) {
                try {
                    String substring = fileName.substring(StringsKt.emerald(fileName, ',', 0, 6) + 1);
                    Intrinsics.delta(substring, "substring(...)");
                    byte[] decode = Base64.decode(substring, 0);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    lottieImageAsset.setBitmap(BitmapFactory.decodeByteArray(decode, 0, decode.length, options));
                } catch (IllegalArgumentException e) {
                    Logger.warning("data URL did not have correct base64 format.", e);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadImageFromAsset(Context context, LottieImageAsset lottieImageAsset, String str) {
        if (lottieImageAsset.getBitmap() == null && str != null) {
            String fileName = lottieImageAsset.getFileName();
            try {
                InputStream open = context.getAssets().open(str + fileName);
                Intrinsics.checkNotNull(open);
                Bitmap bitmap = null;
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inScaled = true;
                    options.inDensity = 160;
                    bitmap = BitmapFactory.decodeStream(open, null, options);
                } catch (IllegalArgumentException e) {
                    Logger.warning("Unable to decode image.", e);
                }
                if (bitmap != null) {
                    lottieImageAsset.setBitmap(Utils.resizeBitmapIfNeeded(bitmap, lottieImageAsset.getWidth(), lottieImageAsset.getHeight()));
                }
            } catch (IOException e4) {
                Logger.warning("Unable to open asset.", e4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void maybeLoadTypefaceFromAssets(Context context, Font font, String str, String str2) {
        String amber = ao.ad.amber(str, font.getFamily(), str2);
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), amber);
            try {
                Intrinsics.checkNotNull(createFromAsset);
                String style = font.getStyle();
                Intrinsics.delta(style, "getStyle(...)");
                font.setTypeface(typefaceForStyle(createFromAsset, style));
            } catch (Exception e) {
                Logger.error(q.golf("Failed to create ", font.getFamily(), " typeface with style=", font.getStyle(), "!"), e);
            }
        } catch (Exception e4) {
            Logger.error("Failed to find typeface in assets with path " + amber + ".", e4);
        }
    }

    @NotNull
    public static final LottieCompositionResult rememberLottieComposition(@NotNull LottieCompositionSpec spec, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable m mVar, @Nullable InterfaceC0581m interfaceC0581m, int i4, int i5) {
        String str5;
        String str6;
        String str7;
        String str8;
        m mVar2;
        boolean z2;
        boolean z10;
        boolean z11;
        Intrinsics.echo(spec, "spec");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(-1248473602);
        if ((i5 & 2) != 0) {
            str5 = null;
        } else {
            str5 = str;
        }
        if ((i5 & 4) != 0) {
            str6 = "fonts/";
        } else {
            str6 = str2;
        }
        if ((i5 & 8) != 0) {
            str7 = ".ttf";
        } else {
            str7 = str3;
        }
        if ((i5 & 16) != 0) {
            str8 = DefaultCacheKey;
        } else {
            str8 = str4;
        }
        if ((i5 & 32) != 0) {
            mVar2 = new RememberLottieCompositionKt$rememberLottieComposition$1(null);
        } else {
            mVar2 = mVar;
        }
        Context context = (Context) c0585q.kilo(AndroidCompositionLocals_androidKt.bravo);
        c0585q.red(1388713953);
        int i10 = (i4 & 14) ^ 6;
        if ((i10 > 4 && c0585q.golf(spec)) || (i4 & 6) == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (z2 || jade == asVar) {
            jade = C0564b.zulu(new LottieCompositionResultImpl());
            c0585q.f(jade);
        }
        ax axVar = (ax) jade;
        c0585q.quebec(false);
        c0585q.red(1388714244);
        if ((i10 > 4 && c0585q.golf(spec)) || (i4 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((((57344 & i4) ^ 24576) > 16384 && c0585q.golf(str8)) || (i4 & 24576) == 16384) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z12 = z11 | z10;
        Object jade2 = c0585q.jade();
        if (z12 || jade2 == asVar) {
            jade2 = lottieTask(context, spec, str8, true);
            c0585q.f(jade2);
        }
        c0585q.quebec(false);
        C0564b.golf(spec, str8, new RememberLottieCompositionKt$rememberLottieComposition$3(mVar2, context, spec, str5, str6, str7, str8, axVar, null), c0585q);
        LottieCompositionResultImpl rememberLottieComposition$lambda$1 = rememberLottieComposition$lambda$1(axVar);
        c0585q.quebec(false);
        return rememberLottieComposition$lambda$1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LottieCompositionResultImpl rememberLottieComposition$lambda$1(ax axVar) {
        return (LottieCompositionResultImpl) axVar.getValue();
    }

    private static final Typeface typefaceForStyle(Typeface typeface, String str) {
        int i4 = 0;
        boolean beige = StringsKt.beige(str, "Italic", false);
        boolean beige2 = StringsKt.beige(str, "Bold", false);
        if (beige && beige2) {
            i4 = 3;
        } else if (beige) {
            i4 = 2;
        } else if (beige2) {
            i4 = 1;
        }
        if (typeface.getStyle() == i4) {
            return typeface;
        }
        return Typeface.create(typeface, i4);
    }
}
