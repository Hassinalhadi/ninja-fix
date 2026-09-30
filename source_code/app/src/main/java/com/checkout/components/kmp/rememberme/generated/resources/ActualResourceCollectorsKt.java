package com.checkout.components.kmp.rememberme.generated.resources;

import Of.p;
import Wf.ad;
import Wf.e;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\n\"+\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0001*\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007\"+\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0001*\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007\"+\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0001*\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0005\u001a\u0004\b\u0012\u0010\u0007\"+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\u0001*\u00020\u00008@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0005\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/kmp/rememberme/generated/resources/Res;", "", "", "LWf/e;", "allDrawableResources$delegate", "Lkotlin/Lazy;", "getAllDrawableResources", "(Lcom/checkout/components/kmp/rememberme/generated/resources/Res;)Ljava/util/Map;", "allDrawableResources", "LWf/ad;", "allStringResources$delegate", "getAllStringResources", "allStringResources", "", "allStringArrayResources$delegate", "getAllStringArrayResources", "allStringArrayResources", "allPluralStringResources$delegate", "getAllPluralStringResources", "allPluralStringResources", "allFontResources$delegate", "getAllFontResources", "allFontResources", "rememberme_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ActualResourceCollectorsKt {

    @NotNull
    private static final Lazy allDrawableResources$delegate = LazyKt.lazy(new p(2));

    @NotNull
    private static final Lazy allStringResources$delegate = LazyKt.lazy(new p(3));

    @NotNull
    private static final Lazy allStringArrayResources$delegate = LazyKt.lazy(new p(4));

    @NotNull
    private static final Lazy allPluralStringResources$delegate = LazyKt.lazy(new p(5));

    @NotNull
    private static final Lazy allFontResources$delegate = LazyKt.lazy(new p(6));

    public static final Map allDrawableResources_delegate$lambda$0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Drawable0_commonMainKt._collectCommonMainDrawable0Resources(linkedHashMap);
        return linkedHashMap;
    }

    public static final Map allFontResources_delegate$lambda$4() {
        return new LinkedHashMap();
    }

    public static final Map allPluralStringResources_delegate$lambda$3() {
        return new LinkedHashMap();
    }

    public static final Map allStringArrayResources_delegate$lambda$2() {
        return new LinkedHashMap();
    }

    public static final Map allStringResources_delegate$lambda$1() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String0_commonMainKt._collectCommonMainString0Resources(linkedHashMap);
        return linkedHashMap;
    }

    @NotNull
    public static final Map<String, e> getAllDrawableResources(@NotNull Res res) {
        Intrinsics.echo(res, "<this>");
        return (Map) allDrawableResources$delegate.getValue();
    }

    @NotNull
    public static final Map<String, Object> getAllFontResources(@NotNull Res res) {
        Intrinsics.echo(res, "<this>");
        return (Map) allFontResources$delegate.getValue();
    }

    @NotNull
    public static final Map<String, Object> getAllPluralStringResources(@NotNull Res res) {
        Intrinsics.echo(res, "<this>");
        return (Map) allPluralStringResources$delegate.getValue();
    }

    @NotNull
    public static final Map<String, Object> getAllStringArrayResources(@NotNull Res res) {
        Intrinsics.echo(res, "<this>");
        return (Map) allStringArrayResources$delegate.getValue();
    }

    @NotNull
    public static final Map<String, ad> getAllStringResources(@NotNull Res res) {
        Intrinsics.echo(res, "<this>");
        return (Map) allStringResources$delegate.getValue();
    }
}
