package R6;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.google.android.material.chip.Chip;
import delivery.samurai.android.R;
import java.util.ArrayList;
import t1.C2951c;
import t1.C2952d;
import y1.AbstractC3388a;

/* loaded from: classes2.dex */
public final class d extends AbstractC3388a {
    public final /* synthetic */ Chip quebec;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.quebec = chip;
    }

    @Override // y1.AbstractC3388a
    public final void lima(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.f7962p;
        Chip chip = this.quebec;
        if (chip.charlie() && (fVar = chip.teal) != null && fVar.f1978N && chip.f7965a != null) {
            arrayList.add(1);
        }
    }

    @Override // y1.AbstractC3388a
    public final void oscar(int i4, C2952d c2952d) {
        Rect closeIconTouchBoundsInt;
        AccessibilityNodeInfo accessibilityNodeInfo = c2952d.alpha;
        CharSequence charSequence = "";
        if (i4 == 1) {
            Chip chip = this.quebec;
            CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
            } else {
                CharSequence text = chip.getText();
                Context context = chip.getContext();
                if (!TextUtils.isEmpty(text)) {
                    charSequence = text;
                }
                accessibilityNodeInfo.setContentDescription(context.getString(R.string.mtrl_chip_close_icon_content_description, charSequence).trim());
            }
            closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
            accessibilityNodeInfo.setBoundsInParent(closeIconTouchBoundsInt);
            c2952d.bravo(C2951c.golf);
            accessibilityNodeInfo.setEnabled(chip.isEnabled());
            c2952d.juliet(Button.class.getName());
            return;
        }
        accessibilityNodeInfo.setContentDescription("");
        accessibilityNodeInfo.setBoundsInParent(Chip.f7962p);
    }

    @Override // y1.AbstractC3388a
    public final void papa(int i4, boolean z2) {
        int[] iArr;
        Chip chip = this.quebec;
        if (i4 == 1) {
            chip.f7969f = z2;
        }
        f fVar = chip.teal;
        boolean z10 = chip.f7969f;
        boolean z11 = false;
        if (fVar.f1979O != null) {
            if (z10) {
                iArr = new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled};
            } else {
                iArr = f.f1958I0;
            }
            z11 = fVar.ochre(iArr);
        }
        if (z11) {
            chip.refreshDrawableState();
        }
    }
}
