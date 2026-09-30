package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.classic.messaging.MessagingItem;
import zendesk.classic.messaging.R;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class EndUserFileCellView extends LinearLayout implements Updatable<EndUserCellFileState> {
    private ImageView appIcon;
    private LinearLayout bubble;
    private Drawable defaultAppIcon;
    private TextView fileDescriptor;
    private TextView fileName;
    private FileUploadProgressView fileUploadProgressView;
    private TextView label;
    private MessageStatusView statusView;

    public EndUserFileCellView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(1);
        setGravity(8388693);
        View.inflate(getContext(), R.layout.zui_view_end_user_file_cell_content, this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.bubble = (LinearLayout) findViewById(R.id.zui_cell_file_container);
        this.fileName = (TextView) findViewById(R.id.zui_file_cell_name);
        this.fileDescriptor = (TextView) findViewById(R.id.zui_cell_file_description);
        this.appIcon = (ImageView) findViewById(R.id.zui_cell_file_app_icon);
        this.fileUploadProgressView = (FileUploadProgressView) findViewById(R.id.zui_cell_file_upload_progress);
        this.statusView = (MessageStatusView) findViewById(R.id.zui_cell_status_view);
        this.label = (TextView) findViewById(R.id.zui_cell_label_message);
        Drawable drawable = getContext().getDrawable(R.drawable.zui_ic_insert_drive_file);
        this.defaultAppIcon = drawable;
        if (drawable != null) {
            UiUtils.setTint(UiUtils.themeAttributeToColor(R.attr.colorPrimary, getContext(), R.color.zui_color_primary), this.defaultAppIcon, this.appIcon);
        }
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(EndUserCellFileState endUserCellFileState) {
        UtilsEndUserCellView.setCellBackground(endUserCellFileState, this.bubble);
        UtilsEndUserCellView.setLabelErrorMessage(endUserCellFileState, this.label, getContext());
        UtilsEndUserCellView.setClickListener(endUserCellFileState, this);
        UtilsEndUserCellView.setLongClickListener(endUserCellFileState, this);
        this.statusView.setStatus(endUserCellFileState.getStatus());
        this.fileName.setText(endUserCellFileState.getAttachment().getName());
        this.fileDescriptor.setText(endUserCellFileState.getFileDescriptor(getContext()));
        this.appIcon.setImageDrawable(this.defaultAppIcon);
        if (endUserCellFileState.getStatus() == MessagingItem.Query.Status.PENDING) {
            this.fileUploadProgressView.setVisibility(0);
            this.appIcon.setVisibility(8);
        } else {
            this.fileUploadProgressView.setVisibility(8);
            this.appIcon.setVisibility(0);
        }
        endUserCellFileState.getProps().apply(this, this.statusView);
    }

    public EndUserFileCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public EndUserFileCellView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
