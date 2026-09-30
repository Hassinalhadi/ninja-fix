package com.checkout.components.ui.utils.extensions;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"isKeyboardOpen", "", "Landroid/view/View;", "ui_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ViewExtensionsKt {
    public static final boolean isKeyboardOpen(@NotNull View view) {
        Intrinsics.echo(view, "<this>");
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int height = view.getRootView().getHeight();
        if (height - rect.bottom > (height * 15) / 100) {
            return true;
        }
        return false;
    }
}
