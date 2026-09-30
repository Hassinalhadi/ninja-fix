package zendesk.classic.messaging.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class EndUserMessageView extends LinearLayout implements Updatable<EndUserCellMessageState> {
    private int errorTextColor;
    private TextView label;
    private MessageStatusView statusView;
    private int textColor;
    private TextView textField;

    public EndUserMessageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(1);
        setGravity(8388693);
        View.inflate(getContext(), R.layout.zui_view_end_user_message_cell_content, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.textField = (TextView) findViewById(R.id.zui_end_user_message_cell_text_field);
        this.statusView = (MessageStatusView) findViewById(R.id.zui_cell_status_view);
        this.label = (TextView) findViewById(R.id.zui_cell_label_message);
        Context context = getContext();
        this.errorTextColor = UiUtils.resolveColor(R.color.zui_text_color_dark_primary, context);
        this.textColor = UiUtils.resolveColor(R.color.zui_text_color_light_primary, context);
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(EndUserCellMessageState endUserCellMessageState) {
        UtilsEndUserCellView.setClickListener(endUserCellMessageState, this);
        UtilsEndUserCellView.setLongClickListener(endUserCellMessageState, this);
        UtilsEndUserCellView.setLabelErrorMessage(endUserCellMessageState, this.label, getContext());
        UtilsEndUserCellView.setCellBackground(endUserCellMessageState, this.textField);
        MessagingItem.Query.Status status = endUserCellMessageState.getStatus();
        this.textField.setTextColor(UtilsEndUserCellView.isFailedCell(endUserCellMessageState) ? this.errorTextColor : this.textColor);
        this.textField.setText(endUserCellMessageState.getMessage());
        this.textField.setTextIsSelectable(status == MessagingItem.Query.Status.DELIVERED);
        this.textField.requestLayout();
        this.statusView.setStatus(status);
        endUserCellMessageState.getProps().apply(this, this.statusView);
    }

    public EndUserMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EndUserMessageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
