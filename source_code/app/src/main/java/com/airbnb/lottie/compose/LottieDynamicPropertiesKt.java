package com.airbnb.lottie.compose;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.LottieValueCallback;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000-\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0005*\u0001\u0011\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0006\u0010\b\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aQ\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u00062\u0006\u0010\u0007\u001a\u00028\u00002\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\u0000\"\u00020\t2\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0007¢\u0006\u0004\b\u000b\u0010\u0010\u001a1\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011\"\u0004\b\u0000\u0010\u0006*\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0015²\u0006$\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r\"\u0004\b\u0000\u0010\u00068\nX\u008a\u0084\u0002"}, d2 = {"", "Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "properties", "Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "rememberLottieDynamicProperties", "([Lcom/airbnb/lottie/compose/LottieDynamicProperty;Landroidx/compose/runtime/m;I)Lcom/airbnb/lottie/compose/LottieDynamicProperties;", "T", "property", "value", "", "keyPath", "rememberLottieDynamicProperty", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/String;Landroidx/compose/runtime/m;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "Lkotlin/Function1;", "Lcom/airbnb/lottie/value/LottieFrameInfo;", "callback", "(Ljava/lang/Object;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/m;I)Lcom/airbnb/lottie/compose/LottieDynamicProperty;", "com/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1", "toValueCallback", "(Lkotlin/jvm/functions/Function1;)Lcom/airbnb/lottie/compose/LottieDynamicPropertiesKt$toValueCallback$1;", "callbackState", "lottie-compose_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieDynamicPropertiesKt {
    @NotNull
    public static final LottieDynamicProperties rememberLottieDynamicProperties(@NotNull LottieDynamicProperty<?>[] properties, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(properties, "properties");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(-395574495);
        int hashCode = Arrays.hashCode(properties);
        c0585q.red(34468001);
        boolean echo = c0585q.echo(hashCode);
        Object jade = c0585q.jade();
        if (echo || jade == C0580l.alpha) {
            jade = new LottieDynamicProperties(ArraysKt.b(properties));
            c0585q.f(jade);
        }
        LottieDynamicProperties lottieDynamicProperties = (LottieDynamicProperties) jade;
        c0585q.quebec(false);
        c0585q.quebec(false);
        return lottieDynamicProperties;
    }

    @NotNull
    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t5, T t10, @NotNull String[] keyPath, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(keyPath, "keyPath");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(-1788530187);
        c0585q.red(1613443961);
        boolean golf = c0585q.golf(keyPath);
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (golf || jade == asVar) {
            jade = new KeyPath((String[]) Arrays.copyOf(keyPath, keyPath.length));
            c0585q.f(jade);
        }
        KeyPath keyPath2 = (KeyPath) jade;
        c0585q.quebec(false);
        c0585q.red(1613444012);
        boolean z2 = true;
        boolean golf2 = c0585q.golf(keyPath2) | ((((i4 & 14) ^ 6) > 4 && c0585q.golf(t5)) || (i4 & 6) == 4);
        if ((((i4 & 112) ^ 48) <= 32 || !c0585q.golf(t10)) && (i4 & 48) != 32) {
            z2 = false;
        }
        boolean z10 = golf2 | z2;
        Object jade2 = c0585q.jade();
        if (z10 || jade2 == asVar) {
            jade2 = new LottieDynamicProperty(t5, keyPath2, t10);
            c0585q.f(jade2);
        }
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) jade2;
        c0585q.quebec(false);
        c0585q.quebec(false);
        return lottieDynamicProperty;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function1<LottieFrameInfo<T>, T> rememberLottieDynamicProperty$lambda$4(D0 d02) {
        return (Function1) d02.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1] */
    public static final LottieDynamicPropertiesKt$toValueCallback$1 toValueCallback(final Function1 function1) {
        return new LottieValueCallback<Object>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$toValueCallback$1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public Object getValue(@NotNull LottieFrameInfo<Object> frameInfo) {
                Intrinsics.echo(frameInfo, "frameInfo");
                return function1.invoke(frameInfo);
            }
        };
    }

    @NotNull
    public static final <T> LottieDynamicProperty<T> rememberLottieDynamicProperty(T t5, @NotNull String[] keyPath, @NotNull Function1<? super LottieFrameInfo<T>, ? extends T> callback, @Nullable InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(keyPath, "keyPath");
        Intrinsics.echo(callback, "callback");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.red(1331897370);
        int hashCode = Arrays.hashCode(keyPath);
        c0585q.red(1613445061);
        boolean echo = c0585q.echo(hashCode);
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (echo || jade == asVar) {
            jade = new KeyPath((String[]) Arrays.copyOf(keyPath, keyPath.length));
            c0585q.f(jade);
        }
        KeyPath keyPath2 = (KeyPath) jade;
        c0585q.quebec(false);
        final ax black = C0564b.black(callback, c0585q);
        c0585q.red(1613445186);
        boolean golf = ((((i4 & 14) ^ 6) > 4 && c0585q.golf(t5)) || (i4 & 6) == 4) | c0585q.golf(keyPath2);
        Object jade2 = c0585q.jade();
        if (golf || jade2 == asVar) {
            jade2 = new LottieDynamicProperty((Object) t5, keyPath2, (Function1) new Function1<LottieFrameInfo<T>, T>() { // from class: com.airbnb.lottie.compose.LottieDynamicPropertiesKt$rememberLottieDynamicProperty$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final T invoke(@NotNull LottieFrameInfo<T> it) {
                    Function1 rememberLottieDynamicProperty$lambda$4;
                    Intrinsics.echo(it, "it");
                    rememberLottieDynamicProperty$lambda$4 = LottieDynamicPropertiesKt.rememberLottieDynamicProperty$lambda$4(D0.this);
                    return (T) rememberLottieDynamicProperty$lambda$4.invoke(it);
                }
            });
            c0585q.f(jade2);
        }
        LottieDynamicProperty<T> lottieDynamicProperty = (LottieDynamicProperty) jade2;
        c0585q.quebec(false);
        c0585q.quebec(false);
        return lottieDynamicProperty;
    }
}
