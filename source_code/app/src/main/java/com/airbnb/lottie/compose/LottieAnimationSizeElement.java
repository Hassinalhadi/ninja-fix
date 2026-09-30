package com.airbnb.lottie.compose;

import Q0.c;
import T.s;
import Xd.l;
import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s0.F;
import t0.C2915g0;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000b*\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J$\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b \u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b!\u0010\u0017¨\u0006\""}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "Ls0/F;", "Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "", "width", "height", "<init>", "(II)V", "create", "()Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "node", "", "update", "(Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;)V", "Lt0/g0;", "inspectableProperties", "(Lt0/g0;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "component1", "component2", Constants.COPY_TYPE, "(II)Lcom/airbnb/lottie/compose/LottieAnimationSizeElement;", "", "toString", "()Ljava/lang/String;", "I", "getWidth", "getHeight", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class LottieAnimationSizeElement extends F {
    public static final int $stable = 0;
    private final int height;
    private final int width;

    public LottieAnimationSizeElement(int i4, int i5) {
        this.width = i4;
        this.height = i5;
    }

    public static /* synthetic */ LottieAnimationSizeElement copy$default(LottieAnimationSizeElement lottieAnimationSizeElement, int i4, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = lottieAnimationSizeElement.width;
        }
        if ((i10 & 2) != 0) {
            i5 = lottieAnimationSizeElement.height;
        }
        return lottieAnimationSizeElement.copy(i4, i5);
    }

    @Override // s0.F, T.s
    public /* bridge */ /* synthetic */ boolean all(@NotNull Function1 function1) {
        return c.alpha(this, function1);
    }

    public boolean any(@NotNull Function1 function1) {
        return ((Boolean) function1.invoke(this)).booleanValue();
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final LottieAnimationSizeElement copy(int width, int height) {
        return new LottieAnimationSizeElement(width, height);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LottieAnimationSizeElement)) {
            return false;
        }
        LottieAnimationSizeElement lottieAnimationSizeElement = (LottieAnimationSizeElement) other;
        if (this.width == lottieAnimationSizeElement.width && this.height == lottieAnimationSizeElement.height) {
            return true;
        }
        return false;
    }

    @Override // s0.F, T.s
    public Object foldIn(Object obj, @NotNull l lVar) {
        return lVar.invoke(obj, this);
    }

    public Object foldOut(Object obj, @NotNull l lVar) {
        return lVar.invoke(this, obj);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (this.width * 31) + this.height;
    }

    @Override // s0.F
    public void inspectableProperties(@NotNull C2915g0 c2915g0) {
        Intrinsics.echo(c2915g0, "<this>");
        c2915g0.alpha = "Lottie Size";
        Integer valueOf = Integer.valueOf(this.width);
        o oVar = c2915g0.charlie;
        oVar.bravo(valueOf, "width");
        oVar.bravo(Integer.valueOf(this.height), "height");
    }

    @Override // s0.F, T.s
    @NotNull
    public /* bridge */ /* synthetic */ s then(@NotNull s sVar) {
        return c.charlie(this, sVar);
    }

    @NotNull
    public String toString() {
        return P0.azure(this.width, this.height, "LottieAnimationSizeElement(width=", ", height=", ")");
    }

    @Override // s0.F
    @NotNull
    public LottieAnimationSizeNode create() {
        return new LottieAnimationSizeNode(this.width, this.height);
    }

    @Override // s0.F
    public void update(@NotNull LottieAnimationSizeNode node) {
        Intrinsics.echo(node, "node");
        node.setWidth(this.width);
        node.setHeight(this.height);
    }
}
