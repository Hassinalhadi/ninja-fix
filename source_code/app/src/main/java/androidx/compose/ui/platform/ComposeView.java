package androidx.compose.ui.platform;

import F.C0088b;
import Xd.l;
import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.Q;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t0.AbstractC2902a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tR*\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n8\u0014@RX\u0094\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/platform/ComposeView;", "Lt0/a;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Lkotlin/Function0;", "", Constants.KEY_CONTENT, "setContent", "(LXd/l;)V", "", "value", "c", "Z", "getShouldCreateCompositionOnAttachedToWindow", "()Z", "getShouldCreateCompositionOnAttachedToWindow$annotations", "()V", "shouldCreateCompositionOnAttachedToWindow", "ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposeView extends AbstractC2902a {

    /* renamed from: b, reason: collision with root package name */
    public final ax f3026b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // t0.AbstractC2902a
    public final void alpha(InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(420213850);
        if (c0585q.india(this)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i10 = i5 | i4;
        if ((i10 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i10 & 1, z2)) {
            l lVar = (l) ((t0) this.f3026b).getValue();
            if (lVar == null) {
                c0585q.purple(-1238798753);
            } else {
                c0585q.purple(98586082);
                lVar.invoke(c0585q, 0);
            }
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C0088b(this, i4, 10);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // t0.AbstractC2902a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final void setContent(@NotNull l content) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        ((t0) this.f3026b).setValue(content);
        if (isAttachedToWindow()) {
            charlie();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i4) {
        super(context, (i4 & 2) != 0 ? null : attributeSet);
        this.f3026b = C0564b.zulu(null);
    }
}
