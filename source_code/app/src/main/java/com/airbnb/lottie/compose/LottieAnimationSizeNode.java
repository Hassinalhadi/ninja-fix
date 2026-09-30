package com.airbnb.lottie.compose;

import Q0.a;
import Q0.b;
import T.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.t;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.InterfaceC2401t;
import q0.InterfaceC2402u;
import q0.ao;
import q0.aq;
import q0.ar;
import s0.ab;
import s6.AbstractC2627c7;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u0010\u001a\u00020\r*\u00020\b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013\"\u0004\b\u0017\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Lcom/airbnb/lottie/compose/LottieAnimationSizeNode;", "LT/r;", "Ls0/ab;", "", "width", "height", "<init>", "(II)V", "Lq0/ar;", "Lq0/ao;", "measurable", "LQ0/a;", "constraints", "Lq0/aq;", "measure-3p2s80s", "(Lq0/ar;Lq0/ao;J)Lq0/aq;", "measure", "I", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "lottie-compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LottieAnimationSizeNode extends r implements ab {
    public static final int $stable = 8;
    private int height;
    private int width;

    public LottieAnimationSizeNode(int i4, int i5) {
        this.width = i4;
        this.height = i5;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // s0.ab
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(@NotNull InterfaceC2402u interfaceC2402u, @NotNull InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.echo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(@NotNull InterfaceC2402u interfaceC2402u, @NotNull InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.hotel(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    @NotNull
    /* renamed from: measure-3p2s80s */
    public aq mo0measure3p2s80s(@NotNull ar measure, @NotNull ao measurable, long j5) {
        long alpha;
        Intrinsics.echo(measure, "$this$measure");
        Intrinsics.echo(measurable, "measurable");
        long delta = b.delta(j5, AbstractC2627c7.alpha(this.width, this.height));
        if (a.golf(j5) == Integer.MAX_VALUE && a.hotel(j5) != Integer.MAX_VALUE) {
            int i4 = (int) (delta >> 32);
            int i5 = (this.height * i4) / this.width;
            alpha = b.alpha(i4, i4, i5, i5);
        } else if (a.hotel(j5) == Integer.MAX_VALUE && a.golf(j5) != Integer.MAX_VALUE) {
            int i10 = (int) (delta & 4294967295L);
            int i11 = (this.width * i10) / this.height;
            alpha = b.alpha(i11, i11, i10, i10);
        } else {
            int i12 = (int) (delta >> 32);
            int i13 = (int) (delta & 4294967295L);
            alpha = b.alpha(i12, i12, i13, i13);
        }
        final AbstractC2367C victor = measurable.victor(alpha);
        return measure.papa(victor.alpha, victor.purple, t.alpha, new Function1<AbstractC2366B, Unit>() { // from class: com.airbnb.lottie.compose.LottieAnimationSizeNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AbstractC2366B abstractC2366B) {
                invoke2(abstractC2366B);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull AbstractC2366B layout) {
                Intrinsics.echo(layout, "$this$layout");
                AbstractC2366B.juliet(layout, AbstractC2367C.this, 0, 0);
            }
        });
    }

    @Override // s0.ab
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(@NotNull InterfaceC2402u interfaceC2402u, @NotNull InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.kilo(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // s0.ab
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(@NotNull InterfaceC2402u interfaceC2402u, @NotNull InterfaceC2401t interfaceC2401t, int i4) {
        return AbstractC2327c.november(this, interfaceC2402u, interfaceC2401t, i4);
    }

    @Override // T.r
    public /* bridge */ /* synthetic */ void onDensityChange() {
    }

    @Override // T.r
    public /* bridge */ /* synthetic */ void onLayoutDirectionChange() {
    }

    public final void setHeight(int i4) {
        this.height = i4;
    }

    public final void setWidth(int i4) {
        this.width = i4;
    }
}
