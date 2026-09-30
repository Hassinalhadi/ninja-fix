package J2;

import android.app.Dialog;
import android.text.Spanned;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.appcompat.widget.P0;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.fragment.app.ai;
import androidx.navigation.fragment.NavHostFragment;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC2991f2;

/* loaded from: classes3.dex */
public abstract class f {
    public static Y1.r alpha(ai fragment) {
        DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w;
        Dialog dialog;
        Window window;
        Intrinsics.echo(fragment, "fragment");
        for (ai aiVar = fragment; aiVar != null; aiVar = aiVar.getParentFragment()) {
            if (aiVar instanceof NavHostFragment) {
                return ((NavHostFragment) aiVar).juliet();
            }
            ai aiVar2 = aiVar.getParentFragmentManager().amber;
            if (aiVar2 instanceof NavHostFragment) {
                return ((NavHostFragment) aiVar2).juliet();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return AbstractC2991f2.echo(view);
        }
        View view2 = null;
        if (fragment instanceof DialogInterfaceOnCancelListenerC0627w) {
            dialogInterfaceOnCancelListenerC0627w = (DialogInterfaceOnCancelListenerC0627w) fragment;
        } else {
            dialogInterfaceOnCancelListenerC0627w = null;
        }
        if (dialogInterfaceOnCancelListenerC0627w != null && (dialog = dialogInterfaceOnCancelListenerC0627w.e) != null && (window = dialog.getWindow()) != null) {
            view2 = window.getDecorView();
        }
        if (view2 != null) {
            return AbstractC2991f2.echo(view2);
        }
        throw new IllegalStateException(P0.coral("Fragment ", fragment, " does not have a NavController set"));
    }

    public static void bravo(TextView textView, CharSequence charSequence) {
        boolean z2;
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence != null || text.length() != 0) {
                if (charSequence instanceof Spanned) {
                    if (charSequence.equals(text)) {
                        return;
                    }
                } else {
                    boolean z10 = true;
                    if (charSequence == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (text != null) {
                        z10 = false;
                    }
                    if (z2 == z10) {
                        if (charSequence != null) {
                            int length = charSequence.length();
                            if (length == text.length()) {
                                for (int i4 = 0; i4 < length; i4++) {
                                    if (charSequence.charAt(i4) == text.charAt(i4)) {
                                    }
                                }
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                textView.setText(charSequence);
            }
        }
    }
}
