package zendesk.classic.messaging.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
public class SystemMessageView extends LinearLayout implements Updatable<State> {
    private TextView systemMessage;

    /* loaded from: classes.dex */
    public static class State {
        private final MessagingCellProps props;
        private final String text;

        public State(MessagingCellProps messagingCellProps, String str) {
            this.props = messagingCellProps;
            this.text = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                State state = (State) obj;
                String str = this.text;
                if (str == null ? state.text != null : !str.equals(state.text)) {
                    return false;
                }
                MessagingCellProps messagingCellProps = this.props;
                MessagingCellProps messagingCellProps2 = state.props;
                if (messagingCellProps != null) {
                    return messagingCellProps.equals(messagingCellProps2);
                }
                if (messagingCellProps2 == null) {
                    return true;
                }
            }
            return false;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public String getText() {
            return this.text;
        }

        public int hashCode() {
            int i4;
            String str = this.text;
            int i5 = 0;
            if (str != null) {
                i4 = str.hashCode();
            } else {
                i4 = 0;
            }
            int i10 = i4 * 31;
            MessagingCellProps messagingCellProps = this.props;
            if (messagingCellProps != null) {
                i5 = messagingCellProps.hashCode();
            }
            return i10 + i5;
        }
    }

    public SystemMessageView(Context context) {
        super(context);
        init();
    }

    private void init() {
        setOrientation(1);
        View.inflate(getContext(), R.layout.zui_view_system_message, this);
        this.systemMessage = (TextView) findViewById(R.id.zui_system_message_text);
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(State state) {
        state.props.apply(this);
        this.systemMessage.setText(state.getText());
    }

    public SystemMessageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public SystemMessageView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
