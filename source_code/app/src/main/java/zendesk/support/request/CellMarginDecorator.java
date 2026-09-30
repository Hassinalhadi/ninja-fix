package zendesk.support.request;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import com.zendesk.logger.Logger;
import zendesk.support.R;
import zendesk.support.request.CellType;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CellMarginDecorator extends I {
    public static final int CELL = 1;
    public static final int CELL_LAST = 16;
    public static final int CELL_START_BLOCK = 2;
    public static final int CELL_WITH_LABEL = 8;
    private final ComponentRequestAdapter dataSource;
    private final int groupVerticalMargin;
    private final int verticalMargin;

    public CellMarginDecorator(ComponentRequestAdapter componentRequestAdapter, int i4, int i5) {
        this.dataSource = componentRequestAdapter;
        this.verticalMargin = i4;
        this.groupVerticalMargin = i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    @Override // androidx.recyclerview.widget.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        int i4;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        CellType.Base messageForPos = this.dataSource.getMessageForPos(childAdapterPosition);
        int positionType = messageForPos.getPositionType();
        Rect insets = messageForPos.getInsets();
        if ((positionType & 2) == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((positionType & 8) == 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((positionType & 16) == 16) {
            z11 = true;
        } else {
            z11 = false;
        }
        if ((positionType & 1) == 1) {
            z12 = true;
        } else {
            z12 = false;
        }
        int i5 = -insets.left;
        int i10 = -insets.top;
        int i11 = -insets.right;
        int i12 = -insets.bottom;
        if (z2 && z10) {
            i4 = this.groupVerticalMargin;
        } else {
            if (z2) {
                i10 += this.groupVerticalMargin;
                i4 = this.verticalMargin;
            } else if (z10) {
                i10 += this.verticalMargin;
                i4 = this.groupVerticalMargin;
            } else if (z12) {
                i4 = this.verticalMargin;
            } else {
                Logger.d("RequestActivity", "Unknown position type: %s", Integer.valueOf(positionType));
                if (z11) {
                    i12 = -insets.bottom;
                }
                rect.set(i5, i10, i11, i12);
            }
            i12 += i4;
            if (z11) {
            }
            rect.set(i5, i10, i11, i12);
        }
        i10 += i4;
        i12 += i4;
        if (z11) {
        }
        rect.set(i5, i10, i11, i12);
    }

    public CellMarginDecorator(ComponentRequestAdapter componentRequestAdapter, Context context) {
        this.dataSource = componentRequestAdapter;
        this.verticalMargin = context.getResources().getDimensionPixelOffset(R.dimen.zs_request_message_margin_vertical);
        this.groupVerticalMargin = context.getResources().getDimensionPixelOffset(R.dimen.zs_request_message_group_margin_vertical);
    }
}
