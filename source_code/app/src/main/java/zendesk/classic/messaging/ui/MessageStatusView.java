package zendesk.classic.messaging.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class MessageStatusView extends AppCompatImageView {
    private int deliveredIconColor;
    private int failedIconColor;
    private int pendingIconColor;

    /* renamed from: zendesk.classic.messaging.ui.MessageStatusView$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status;

        static {
            int[] iArr = new int[MessagingItem.Query.Status.values().length];
            $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status = iArr;
            try {
                iArr[MessagingItem.Query.Status.FAILED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.FAILED_NO_RETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.DELIVERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status[MessagingItem.Query.Status.PENDING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MessageStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    private void init() {
        this.deliveredIconColor = UiUtils.themeAttributeToColor(R.attr.colorPrimary, getContext(), R.color.zui_color_primary);
        this.failedIconColor = UiUtils.resolveColor(R.color.zui_error_text_color, getContext());
        this.pendingIconColor = UiUtils.resolveColor(R.color.zui_cell_pending_indicator_color, getContext());
    }

    public void setStatus(MessagingItem.Query.Status status) {
        int i4 = AnonymousClass1.$SwitchMap$zendesk$classic$messaging$MessagingItem$Query$Status[status.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    setImageResource(0);
                    return;
                } else {
                    setImageTintList(ColorStateList.valueOf(this.pendingIconColor));
                    setImageResource(R.drawable.zui_ic_status_pending);
                    return;
                }
            }
            setImageTintList(ColorStateList.valueOf(this.deliveredIconColor));
            setImageResource(R.drawable.zui_ic_status_sent);
            return;
        }
        setImageTintList(ColorStateList.valueOf(this.failedIconColor));
        setImageResource(R.drawable.zui_ic_status_fail);
    }

    public MessageStatusView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }

    public MessageStatusView(Context context) {
        super(context, null);
        init();
    }
}
