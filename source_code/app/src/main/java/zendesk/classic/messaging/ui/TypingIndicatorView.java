package zendesk.classic.messaging.ui;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.vectordrawable.graphics.drawable.c;
import androidx.vectordrawable.graphics.drawable.e;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
public class TypingIndicatorView extends LinearLayout implements Updatable<State> {
    private final c animationLoopCallback;
    private AvatarView avatarView;
    private View botLabel;
    private View labelContainer;
    private TextView labelField;
    private ImageView typingIndicator;

    /* loaded from: classes.dex */
    public static class State {
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final MessagingCellProps props;

        public State(MessagingCellProps messagingCellProps, String str, boolean z2, AvatarState avatarState, AvatarStateRenderer avatarStateRenderer) {
            this.props = messagingCellProps;
            this.label = str;
            this.isBot = z2;
            this.avatarState = avatarState;
            this.avatarStateRenderer = avatarStateRenderer;
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

        public MessagingCellProps getProps() {
            return this.props;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public TypingIndicatorView(Context context) {
        super(context);
        this.animationLoopCallback = new c() { // from class: zendesk.classic.messaging.ui.TypingIndicatorView.1
            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationEnd(final Drawable drawable) {
                TypingIndicatorView.this.post(new Runnable() { // from class: zendesk.classic.messaging.ui.TypingIndicatorView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((Animatable) drawable).start();
                    }
                });
            }
        };
        init();
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R.layout.zui_view_typing_indicator_content, this);
    }

    private void startAnimatedDrawable() {
        Object drawable = this.typingIndicator.getDrawable();
        c cVar = this.animationLoopCallback;
        int i4 = e.yellow;
        if (drawable != null && cVar != null && (drawable instanceof Animatable)) {
            if (Build.VERSION.SDK_INT >= 24) {
                ((AnimatedVectorDrawable) drawable).registerAnimationCallback(cVar.getPlatformCallback());
            } else {
                ((e) drawable).alpha(cVar);
            }
        }
        ((Animatable) drawable).start();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R.id.zui_agent_message_avatar);
        this.labelContainer = findViewById(R.id.zui_cell_status_view);
        this.labelField = (TextView) findViewById(R.id.zui_cell_label_text_field);
        this.botLabel = findViewById(R.id.zui_cell_label_supplementary_label);
        this.typingIndicator = (ImageView) findViewById(R.id.zui_cell_typing_indicator_image);
        startAnimatedDrawable();
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(State state) {
        if (state.getLabel() != null) {
            this.labelField.setText(state.getLabel());
        }
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
    }

    public TypingIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.animationLoopCallback = new c() { // from class: zendesk.classic.messaging.ui.TypingIndicatorView.1
            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationEnd(final Drawable drawable) {
                TypingIndicatorView.this.post(new Runnable() { // from class: zendesk.classic.messaging.ui.TypingIndicatorView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((Animatable) drawable).start();
                    }
                });
            }
        };
        init();
    }

    public TypingIndicatorView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.animationLoopCallback = new c() { // from class: zendesk.classic.messaging.ui.TypingIndicatorView.1
            @Override // androidx.vectordrawable.graphics.drawable.c
            public void onAnimationEnd(final Drawable drawable) {
                TypingIndicatorView.this.post(new Runnable() { // from class: zendesk.classic.messaging.ui.TypingIndicatorView.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ((Animatable) drawable).start();
                    }
                });
            }
        };
        init();
    }
}
