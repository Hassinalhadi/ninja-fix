package zendesk.classic.messaging.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
public class ActionOptionsView extends LinearLayout implements Updatable<State> {
    private ViewGroup actionOptionsContainer;
    private TextView actionOptionsHeader;
    private AvatarView avatarView;
    private View botLabel;
    private View labelContainer;
    private TextView labelField;

    /* loaded from: classes.dex */
    public static class ActionOptionState {
        private final String actionOptionName;
        private final View.OnClickListener onClickListener;

        public ActionOptionState(String str, View.OnClickListener onClickListener) {
            this.actionOptionName = str;
            this.onClickListener = onClickListener;
        }

        public String getActionOptionName() {
            return this.actionOptionName;
        }

        public View.OnClickListener getOnClickListener() {
            return this.onClickListener;
        }
    }

    /* loaded from: classes.dex */
    public static class State {
        private final List<ActionOptionState> actionOptions;
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean enabled;
        private final String header;
        private boolean isBot;
        private final String label;
        private final MessagingCellProps props;

        public State(String str, String str2, boolean z2, MessagingCellProps messagingCellProps, List<ActionOptionState> list, boolean z10, AvatarState avatarState, AvatarStateRenderer avatarStateRenderer) {
            this.header = str;
            this.label = str2;
            this.isBot = z2;
            this.props = messagingCellProps;
            this.actionOptions = list;
            this.enabled = z10;
            this.avatarState = avatarState;
            this.avatarStateRenderer = avatarStateRenderer;
        }

        public List<ActionOptionState> getActionOptions() {
            return this.actionOptions;
        }

        public AvatarState getAvatarState() {
            return this.avatarState;
        }

        public AvatarStateRenderer getAvatarStateRenderer() {
            return this.avatarStateRenderer;
        }

        public String getHeader() {
            return this.header;
        }

        public String getLabel() {
            return this.label;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public boolean isBot() {
            return this.isBot;
        }

        public boolean isEnabled() {
            return this.enabled;
        }
    }

    public ActionOptionsView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R.layout.zui_view_action_options_content, this);
        this.avatarView = (AvatarView) findViewById(R.id.zui_agent_message_avatar);
        this.actionOptionsHeader = (TextView) findViewById(R.id.zui_answer_bot_action_options_header);
        this.labelContainer = findViewById(R.id.zui_cell_status_view);
        this.labelField = (TextView) findViewById(R.id.zui_cell_label_text_field);
        this.botLabel = findViewById(R.id.zui_cell_label_supplementary_label);
        this.actionOptionsContainer = (ViewGroup) findViewById(R.id.zui_cell_action_options_container);
    }

    private void updateActionOptions(List<ActionOptionState> list, boolean z2) {
        this.actionOptionsContainer.removeAllViews();
        this.actionOptionsContainer.addView(this.actionOptionsHeader);
        LayoutInflater from = LayoutInflater.from(getContext());
        for (ActionOptionState actionOptionState : list) {
            View inflate = from.inflate(R.layout.zui_view_action_option, this.actionOptionsContainer, false);
            ((TextView) inflate.findViewById(R.id.zui_action_option_name)).setText(actionOptionState.getActionOptionName());
            inflate.setOnClickListener(actionOptionState.getOnClickListener());
            if (list.indexOf(actionOptionState) == list.size() - 1) {
                inflate.setBackgroundResource(R.drawable.zui_background_cell_options_footer);
            }
            inflate.setEnabled(z2);
            this.actionOptionsContainer.addView(inflate);
        }
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(State state) {
        this.actionOptionsHeader.setText(state.getHeader());
        this.labelField.setText(state.getLabel());
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        updateActionOptions(state.getActionOptions(), state.isEnabled());
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
    }

    public ActionOptionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ActionOptionsView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
