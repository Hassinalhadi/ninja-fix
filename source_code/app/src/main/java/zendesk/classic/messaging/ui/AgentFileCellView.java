package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ao.ad;
import com.zendesk.util.FileUtils;
import java.util.Locale;
import zendesk.classic.messaging.Attachment;
import zendesk.classic.messaging.R;
import zendesk.commonui.UiUtils;

/* loaded from: classes.dex */
public class AgentFileCellView extends LinearLayout implements Updatable<State> {
    private ImageView appIcon;
    private AvatarView avatarView;
    private View botLabel;
    private LinearLayout bubble;
    private Drawable defaultAppIcon;
    private TextView fileDescriptor;
    private TextView fileName;
    private View labelContainer;
    private TextView labelField;

    /* loaded from: classes.dex */
    public static class State {
        private static final String FILE_DESCRIPTOR_FORMATTER = "%s %s";
        private final Attachment attachment;
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final MessagingCellProps props;

        public State(Attachment attachment, MessagingCellProps messagingCellProps, String str, boolean z2, AvatarState avatarState, AvatarStateRenderer avatarStateRenderer) {
            this.attachment = attachment;
            this.props = messagingCellProps;
            this.label = str;
            this.isBot = z2;
            this.avatarState = avatarState;
            this.avatarStateRenderer = avatarStateRenderer;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                State state = (State) obj;
                if (isBot() != state.isBot()) {
                    return false;
                }
                if (getAttachment() == null ? state.getAttachment() != null : !getAttachment().equals(state.getAttachment())) {
                    return false;
                }
                if (getProps() == null ? state.getProps() != null : !getProps().equals(state.getProps())) {
                    return false;
                }
                if (getLabel() == null ? state.getLabel() != null : !getLabel().equals(state.getLabel())) {
                    return false;
                }
                AvatarState avatarState = this.avatarState;
                AvatarState avatarState2 = state.avatarState;
                if (avatarState != null) {
                    return avatarState.equals(avatarState2);
                }
                if (avatarState2 == null) {
                    return true;
                }
            }
            return false;
        }

        public Attachment getAttachment() {
            return this.attachment;
        }

        public AvatarState getAvatarState() {
            return this.avatarState;
        }

        public AvatarStateRenderer getAvatarStateRenderer() {
            return this.avatarStateRenderer;
        }

        public String getFileDescriptor(Context context) {
            Locale locale = Locale.US;
            return ad.amber(UtilsAttachment.formatFileSize(context, this.attachment.getSize()), " ", FileUtils.getFileExtension(this.attachment.getName()));
        }

        public String getLabel() {
            return this.label;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public int hashCode() {
            int i4;
            int i5;
            int i10;
            int i11 = 0;
            if (getAttachment() != null) {
                i4 = getAttachment().hashCode();
            } else {
                i4 = 0;
            }
            int i12 = i4 * 31;
            if (getProps() != null) {
                i5 = getProps().hashCode();
            } else {
                i5 = 0;
            }
            int i13 = (i12 + i5) * 31;
            if (getLabel() != null) {
                i10 = getLabel().hashCode();
            } else {
                i10 = 0;
            }
            int i14 = (((i13 + i10) * 31) + (isBot() ? 1 : 0)) * 31;
            AvatarState avatarState = this.avatarState;
            if (avatarState != null) {
                i11 = avatarState.hashCode();
            }
            return i14 + i11;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public AgentFileCellView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R.layout.zui_view_agent_file_cell_content, this);
    }

    private void setBubbleClickListeners(final State state) {
        this.bubble.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.AgentFileCellView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UtilsAttachment.openAttachment(view, state.getAttachment().getUrl());
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R.id.zui_agent_message_avatar);
        this.bubble = (LinearLayout) findViewById(R.id.zui_cell_file_container);
        this.fileName = (TextView) findViewById(R.id.zui_file_cell_name);
        this.fileDescriptor = (TextView) findViewById(R.id.zui_cell_file_description);
        this.appIcon = (ImageView) findViewById(R.id.zui_cell_file_app_icon);
        this.labelContainer = findViewById(R.id.zui_cell_status_view);
        this.labelField = (TextView) findViewById(R.id.zui_cell_label_text_field);
        this.botLabel = findViewById(R.id.zui_cell_label_supplementary_label);
        this.defaultAppIcon = getContext().getDrawable(R.drawable.zui_ic_insert_drive_file);
        UiUtils.setTint(UiUtils.themeAttributeToColor(R.attr.colorPrimary, getContext(), R.color.zui_color_primary), this.defaultAppIcon, this.appIcon);
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(State state) {
        this.fileName.setText(state.getAttachment().getName());
        this.fileDescriptor.setText(state.getFileDescriptor(getContext()));
        this.appIcon.setImageDrawable(this.defaultAppIcon);
        setBubbleClickListeners(state);
        this.labelField.setText(state.getLabel());
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
    }

    public AgentFileCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public AgentFileCellView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
