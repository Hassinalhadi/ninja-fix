package com.checkout.components.ui.utils.extensions;

import T.s;
import Vc.d;
import Xd.l;
import Y.i;
import Y.v;
import Y.x;
import android.view.View;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import androidx.compose.runtime.ax;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t0.AbstractC2901T;
import t0.AbstractC2911e0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u0015\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001d\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000e²\u0006\u000e\u0010\u000b\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\f\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\r\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"LT/s;", "clearFocusOnKeyboardDismiss", "(LT/s;)LT/s;", "Landroidx/compose/runtime/D0;", "", "rememberKeyboardOpenState", "(Landroidx/compose/runtime/m;I)Landroidx/compose/runtime/D0;", "", "testTag", "optionalTestTag", "(LT/s;Ljava/lang/String;)LT/s;", "isFocused", "keyboardAppearedSinceLastFocused", "isKeyboardOpen", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ModifierExtensionsKt {
    public static /* synthetic */ s bravo(s sVar, InterfaceC0581m interfaceC0581m, int i4) {
        return clearFocusOnKeyboardDismiss$lambda$10(sVar, interfaceC0581m, i4);
    }

    @NotNull
    public static final s clearFocusOnKeyboardDismiss(@NotNull s sVar) {
        Intrinsics.echo(sVar, "<this>");
        return T.a.alpha(sVar, AbstractC2911e0.alpha, new d(6));
    }

    public static final s clearFocusOnKeyboardDismiss$lambda$10(s composed, InterfaceC0581m interfaceC0581m, int i4) {
        Intrinsics.echo(composed, "$this$composed");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.purple(1504257340);
        Object jade = c0585q.jade();
        as asVar = C0580l.alpha;
        if (jade == asVar) {
            jade = C0564b.zulu(Boolean.FALSE);
            c0585q.f(jade);
        }
        final ax axVar = (ax) jade;
        Object jade2 = c0585q.jade();
        if (jade2 == asVar) {
            jade2 = C0564b.zulu(Boolean.FALSE);
            c0585q.f(jade2);
        }
        final ax axVar2 = (ax) jade2;
        if (clearFocusOnKeyboardDismiss$lambda$10$lambda$1(axVar)) {
            c0585q.purple(-358015412);
            D0 rememberKeyboardOpenState = rememberKeyboardOpenState(c0585q, 0);
            i iVar = (i) c0585q.kilo(AbstractC2901T.india);
            Boolean valueOf = Boolean.valueOf(clearFocusOnKeyboardDismiss$lambda$10$lambda$6(rememberKeyboardOpenState));
            boolean golf = c0585q.golf(rememberKeyboardOpenState) | c0585q.india(iVar);
            Object jade3 = c0585q.jade();
            if (golf || jade3 == asVar) {
                jade3 = new ModifierExtensionsKt$clearFocusOnKeyboardDismiss$1$1$1(iVar, rememberKeyboardOpenState, axVar2, null);
                c0585q.f(jade3);
            }
            C0564b.foxtrot((l) jade3, c0585q, valueOf);
        } else {
            c0585q.purple(-359558778);
        }
        c0585q.quebec(false);
        Object jade4 = c0585q.jade();
        if (jade4 == asVar) {
            jade4 = new Function1() { // from class: com.checkout.components.ui.utils.extensions.a
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    Unit clearFocusOnKeyboardDismiss$lambda$10$lambda$9$lambda$8;
                    clearFocusOnKeyboardDismiss$lambda$10$lambda$9$lambda$8 = ModifierExtensionsKt.clearFocusOnKeyboardDismiss$lambda$10$lambda$9$lambda$8(ax.this, axVar2, (v) obj);
                    return clearFocusOnKeyboardDismiss$lambda$10$lambda$9$lambda$8;
                }
            };
            c0585q.f(jade4);
        }
        s charlie = androidx.compose.ui.focus.a.charlie(composed, (Function1) jade4);
        c0585q.quebec(false);
        return charlie;
    }

    private static final boolean clearFocusOnKeyboardDismiss$lambda$10$lambda$1(ax axVar) {
        return ((Boolean) axVar.getValue()).booleanValue();
    }

    private static final void clearFocusOnKeyboardDismiss$lambda$10$lambda$2(ax axVar, boolean z2) {
        axVar.setValue(Boolean.valueOf(z2));
    }

    public static final boolean clearFocusOnKeyboardDismiss$lambda$10$lambda$4(ax axVar) {
        return ((Boolean) axVar.getValue()).booleanValue();
    }

    public static final void clearFocusOnKeyboardDismiss$lambda$10$lambda$5(ax axVar, boolean z2) {
        axVar.setValue(Boolean.valueOf(z2));
    }

    public static final boolean clearFocusOnKeyboardDismiss$lambda$10$lambda$6(D0 d02) {
        return ((Boolean) d02.getValue()).booleanValue();
    }

    public static final Unit clearFocusOnKeyboardDismiss$lambda$10$lambda$9$lambda$8(ax axVar, ax axVar2, v focusState) {
        Intrinsics.echo(focusState, "focusState");
        x xVar = (x) focusState;
        if (clearFocusOnKeyboardDismiss$lambda$10$lambda$1(axVar) != xVar.bravo()) {
            clearFocusOnKeyboardDismiss$lambda$10$lambda$2(axVar, xVar.bravo());
            if (clearFocusOnKeyboardDismiss$lambda$10$lambda$1(axVar)) {
                clearFocusOnKeyboardDismiss$lambda$10$lambda$5(axVar2, false);
            }
        }
        return Unit.INSTANCE;
    }

    @NotNull
    public static final s optionalTestTag(@NotNull s sVar, @Nullable String str) {
        s alpha;
        Intrinsics.echo(sVar, "<this>");
        if (str != null && (alpha = androidx.compose.ui.platform.a.alpha(sVar, str)) != null) {
            return alpha;
        }
        return sVar;
    }

    private static final D0 rememberKeyboardOpenState(InterfaceC0581m interfaceC0581m, int i4) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.purple(2003319634);
        View view = (View) c0585q.kilo(AndroidCompositionLocals_androidKt.foxtrot);
        Boolean valueOf = Boolean.valueOf(ViewExtensionsKt.isKeyboardOpen(view));
        boolean india = c0585q.india(view);
        Object jade = c0585q.jade();
        if (india || jade == C0580l.alpha) {
            jade = new ModifierExtensionsKt$rememberKeyboardOpenState$1$1$1(view, null);
            c0585q.f(jade);
        }
        ax amber = C0564b.amber((l) jade, c0585q, valueOf);
        c0585q.quebec(false);
        return amber;
    }
}
