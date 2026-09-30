package zendesk.classic.messaging.ui;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.M;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class MessagingCellProps {
    private final int avatarVisibility;
    private final int cellSpacing;
    private final int labelVisibility;

    public MessagingCellProps(int i4, int i5, int i10) {
        this.labelVisibility = i4;
        this.cellSpacing = i5;
        this.avatarVisibility = i10;
    }

    public void apply(View view) {
        apply(view, null, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MessagingCellProps messagingCellProps = (MessagingCellProps) obj;
            if (this.labelVisibility == messagingCellProps.labelVisibility && this.cellSpacing == messagingCellProps.cellSpacing) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.labelVisibility * 31) + this.cellSpacing;
    }

    public void apply(View view, View view2) {
        apply(view, view2, null);
    }

    public void apply(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(this.labelVisibility);
        }
        if (view3 != null) {
            view3.setVisibility(this.avatarVisibility);
        }
        ((ViewGroup.MarginLayoutParams) ((M) view.getLayoutParams())).bottomMargin = this.cellSpacing;
        view.requestLayout();
    }
}
