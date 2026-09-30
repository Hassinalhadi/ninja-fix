package zendesk.commonui;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2769s6;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"applyWindowInsets", "", "Landroid/view/View;", "insetType", "", "Lzendesk/commonui/InsetType;", "(Landroid/view/View;[Lzendesk/commonui/InsetType;)V", "common-ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SystemWindowInsets {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InsetType.values().length];
            try {
                iArr[InsetType.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InsetType.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InsetType.HORIZONTAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void applyWindowInsets(@NotNull View view, @NotNull final InsetType... insetType) {
        Intrinsics.echo(view, "<this>");
        Intrinsics.echo(insetType, "insetType");
        if (Build.VERSION.SDK_INT >= 35) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: zendesk.commonui.c
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    WindowInsets applyWindowInsets$lambda$1;
                    applyWindowInsets$lambda$1 = SystemWindowInsets.applyWindowInsets$lambda$1(insetType, view2, windowInsets);
                    return applyWindowInsets$lambda$1;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsets applyWindowInsets$lambda$1(InsetType[] insetType, View view, WindowInsets windowInsets) {
        int ime;
        boolean isVisible;
        int statusBars;
        Insets insets;
        int i4;
        int systemBars;
        Insets insets2;
        int i5;
        int ime2;
        int systemBars2;
        Insets insets3;
        int displayCutout;
        Insets insets4;
        int i10;
        int i11;
        int i12;
        int i13;
        Intrinsics.echo(insetType, "$insetType");
        Intrinsics.echo(view, "view");
        Intrinsics.echo(windowInsets, "windowInsets");
        ime = WindowInsets.Type.ime();
        isVisible = windowInsets.isVisible(ime);
        for (InsetType insetType2 : insetType) {
            int i14 = WhenMappings.$EnumSwitchMapping$0[insetType2.ordinal()];
            if (i14 == 1) {
                statusBars = WindowInsets.Type.statusBars();
                insets = windowInsets.getInsets(statusBars);
                i4 = insets.top;
                view.setPadding(view.getPaddingLeft(), i4, view.getPaddingRight(), view.getPaddingBottom());
            } else if (i14 != 2) {
                if (i14 == 3) {
                    systemBars2 = WindowInsets.Type.systemBars();
                    insets3 = windowInsets.getInsets(systemBars2);
                    Intrinsics.delta(insets3, "getInsets(...)");
                    displayCutout = WindowInsets.Type.displayCutout();
                    insets4 = windowInsets.getInsets(displayCutout);
                    Intrinsics.delta(insets4, "getInsets(...)");
                    i10 = insets3.right;
                    i11 = insets4.right;
                    i12 = insets3.left;
                    i13 = insets4.left;
                    int charlie = AbstractC2769s6.charlie(i10, i11, i12, i13);
                    view.setPadding(charlie, view.getPaddingTop(), charlie, view.getPaddingBottom());
                }
            } else {
                if (isVisible) {
                    ime2 = WindowInsets.Type.ime();
                    insets2 = windowInsets.getInsets(ime2);
                } else {
                    systemBars = WindowInsets.Type.systemBars();
                    insets2 = windowInsets.getInsets(systemBars);
                }
                Intrinsics.checkNotNull(insets2);
                i5 = insets2.bottom;
                view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i5);
            }
        }
        return windowInsets;
    }
}
