package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import zendesk.classic.messaging.Attachment;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
public class AgentImageCellView extends LinearLayout implements Updatable<State> {
    private AvatarView avatarView;
    private View botLabel;
    private int cornerRadius;
    private ImageView imageView;
    private View labelContainer;
    private TextView labelField;
    private final Drawable placeholder;

    /* loaded from: classes.dex */
    public static class State {
        private final Attachment attachment;
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final Picasso picasso;
        private final MessagingCellProps props;

        public State(Picasso picasso, MessagingCellProps messagingCellProps, Attachment attachment, String str, boolean z2, AvatarState avatarState, AvatarStateRenderer avatarStateRenderer) {
            this.picasso = picasso;
            this.props = messagingCellProps;
            this.attachment = attachment;
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
                if (getPicasso() == null ? state.getPicasso() != null : !getPicasso().equals(state.getPicasso())) {
                    return false;
                }
                if (getProps() == null ? state.getProps() != null : !getProps().equals(state.getProps())) {
                    return false;
                }
                if (getLabel() == null ? state.getLabel() != null : !getLabel().equals(state.getLabel())) {
                    return false;
                }
                if (getAttachment() == null ? state.getAttachment() != null : !getAttachment().equals(state.getAttachment())) {
                    return false;
                }
                if (getAvatarState() != null) {
                    return getAvatarState().equals(state.getAvatarState());
                }
                if (state.getAvatarState() == null) {
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

        public String getLabel() {
            return this.label;
        }

        public Picasso getPicasso() {
            return this.picasso;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public int hashCode() {
            int i4;
            int i5;
            int i10;
            int i11;
            int i12 = 0;
            if (getPicasso() != null) {
                i4 = getPicasso().hashCode();
            } else {
                i4 = 0;
            }
            int i13 = i4 * 31;
            if (getProps() != null) {
                i5 = getProps().hashCode();
            } else {
                i5 = 0;
            }
            int i14 = (i13 + i5) * 31;
            if (getLabel() != null) {
                i10 = getLabel().hashCode();
            } else {
                i10 = 0;
            }
            int i15 = (((i14 + i10) * 31) + (isBot() ? 1 : 0)) * 31;
            if (getAttachment() != null) {
                i11 = getAttachment().hashCode();
            } else {
                i11 = 0;
            }
            int i16 = (i15 + i11) * 31;
            if (getAvatarState() != null) {
                i12 = getAvatarState().hashCode();
            }
            return i16 + i12;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public AgentImageCellView(Context context) {
        super(context);
        this.placeholder = getContext().getDrawable(R.drawable.zui_background_agent_cell);
        init();
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R.layout.zui_view_agent_image_cell_content, this);
        this.cornerRadius = getResources().getDimensionPixelSize(R.dimen.zui_cell_bubble_corner_radius);
    }

    private void loadImageIntoImageView(State state) {
        UtilsCellView.loadImageWithRoundedCorners(state.getPicasso(), state.getAttachment().getUrl(), this.imageView, this.cornerRadius, this.placeholder);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R.id.zui_agent_message_avatar);
        this.imageView = (ImageView) findViewById(R.id.zui_image_cell_image);
        this.labelContainer = findViewById(R.id.zui_cell_status_view);
        this.labelField = (TextView) findViewById(R.id.zui_cell_label_text_field);
        this.botLabel = findViewById(R.id.zui_cell_label_supplementary_label);
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(final State state) {
        loadImageIntoImageView(state);
        this.labelField.setText(state.getLabel());
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        this.imageView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.AgentImageCellView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                UtilsAttachment.openAttachment(view, state.getAttachment().getUrl());
            }
        });
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
    }

    public AgentImageCellView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.placeholder = getContext().getDrawable(R.drawable.zui_background_agent_cell);
        init();
    }

    public AgentImageCellView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.placeholder = getContext().getDrawable(R.drawable.zui_background_agent_cell);
        init();
    }
}
