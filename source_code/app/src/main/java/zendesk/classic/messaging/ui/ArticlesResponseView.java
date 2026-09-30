package zendesk.classic.messaging.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import zendesk.classic.messaging.R;

/* loaded from: classes.dex */
public class ArticlesResponseView extends LinearLayout implements Updatable<State> {
    private AvatarView avatarView;
    private View botLabel;
    private View firstArticleSuggestion;
    private TextView header;
    private View labelContainer;
    private TextView labelField;
    private View secondArticleSuggestion;
    private View thirdArticleSuggestion;

    /* loaded from: classes.dex */
    public static class ArticleSuggestionViewState {
        private final OnArticleSuggestionSelectionListener onArticleSuggestionSelectionListener;
        private final String snippet;
        private final String title;

        public ArticleSuggestionViewState(String str, String str2, OnArticleSuggestionSelectionListener onArticleSuggestionSelectionListener) {
            this.title = str;
            this.snippet = str2;
            this.onArticleSuggestionSelectionListener = onArticleSuggestionSelectionListener;
        }

        public OnArticleSuggestionSelectionListener getOnArticleSuggestionSelectionListener() {
            return this.onArticleSuggestionSelectionListener;
        }

        public String getSnippet() {
            return this.snippet;
        }

        public String getTitle() {
            return this.title;
        }
    }

    /* loaded from: classes.dex */
    public static class State {
        private final List<ArticleSuggestionViewState> articleSuggestionViewStates;
        private final AvatarState avatarState;
        private final AvatarStateRenderer avatarStateRenderer;
        private final boolean isBot;
        private final String label;
        private final MessagingCellProps props;

        public State(String str, boolean z2, MessagingCellProps messagingCellProps, List<ArticleSuggestionViewState> list, AvatarState avatarState, AvatarStateRenderer avatarStateRenderer) {
            this.label = str;
            this.isBot = z2;
            this.props = messagingCellProps;
            this.articleSuggestionViewStates = list;
            this.avatarState = avatarState;
            this.avatarStateRenderer = avatarStateRenderer;
        }

        public List<ArticleSuggestionViewState> getArticleSuggestionViewStates() {
            return this.articleSuggestionViewStates;
        }

        public AvatarState getAvatarState() {
            return this.avatarState;
        }

        public AvatarStateRenderer getAvatarStateRenderer() {
            return this.avatarStateRenderer;
        }

        public ArticleSuggestionViewState getFirstArticleSuggestionViewState() {
            if (this.articleSuggestionViewStates.size() >= 1) {
                return this.articleSuggestionViewStates.get(0);
            }
            return null;
        }

        public int getHeaderText() {
            if (this.articleSuggestionViewStates.size() == 1) {
                return R.string.zui_cell_text_suggested_article_header;
            }
            return R.string.zui_cell_text_suggested_articles_header;
        }

        public String getLabel() {
            return this.label;
        }

        public MessagingCellProps getProps() {
            return this.props;
        }

        public ArticleSuggestionViewState getSecondArticleSuggestionViewState() {
            if (this.articleSuggestionViewStates.size() >= 2) {
                return this.articleSuggestionViewStates.get(1);
            }
            return null;
        }

        public ArticleSuggestionViewState getThirdArticleSuggestionViewState() {
            if (this.articleSuggestionViewStates.size() >= 3) {
                return this.articleSuggestionViewStates.get(2);
            }
            return null;
        }

        public boolean isBot() {
            return this.isBot;
        }
    }

    public ArticlesResponseView(Context context) {
        super(context);
    }

    private void bindArticleSuggestion(final ArticleSuggestionViewState articleSuggestionViewState, View view) {
        int i4;
        if (articleSuggestionViewState != null) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        view.setVisibility(i4);
        if (articleSuggestionViewState == null) {
            return;
        }
        TextView textView = (TextView) view.findViewById(R.id.zui_article_title);
        TextView textView2 = (TextView) view.findViewById(R.id.zui_article_snippet);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: zendesk.classic.messaging.ui.ArticlesResponseView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                articleSuggestionViewState.getOnArticleSuggestionSelectionListener().onArticleSuggestionSelected(ArticlesResponseView.this.getContext());
            }
        };
        textView.setText(articleSuggestionViewState.getTitle());
        textView2.setText(articleSuggestionViewState.getSnippet());
        view.setOnClickListener(onClickListener);
    }

    private void init() {
        setOrientation(0);
        View.inflate(getContext(), R.layout.zui_view_articles_response_content, this);
    }

    private void setSuggestionBackgrounds(List<ArticleSuggestionViewState> list) {
        ArrayList arrayList = new ArrayList(Arrays.asList(this.firstArticleSuggestion, this.secondArticleSuggestion, this.thirdArticleSuggestion));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (arrayList.indexOf(view) == list.size() - 1) {
                view.setBackgroundResource(R.drawable.zui_background_cell_options_footer);
            } else {
                view.setBackgroundResource(R.drawable.zui_background_cell_options_content);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.avatarView = (AvatarView) findViewById(R.id.zui_agent_message_avatar);
        this.header = (TextView) findViewById(R.id.zui_header_article_suggestions);
        this.firstArticleSuggestion = findViewById(R.id.zui_first_article_suggestion);
        this.secondArticleSuggestion = findViewById(R.id.zui_second_article_suggestion);
        this.thirdArticleSuggestion = findViewById(R.id.zui_third_article_suggestion);
        this.labelField = (TextView) findViewById(R.id.zui_cell_label_text_field);
        this.botLabel = findViewById(R.id.zui_cell_label_supplementary_label);
        this.labelContainer = findViewById(R.id.zui_cell_status_view);
    }

    public ArticlesResponseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    @Override // zendesk.classic.messaging.ui.Updatable
    public void update(State state) {
        this.labelField.setText(state.getLabel());
        this.botLabel.setVisibility(state.isBot() ? 0 : 8);
        state.getAvatarStateRenderer().render(state.getAvatarState(), this.avatarView);
        state.getProps().apply(this, this.labelContainer, this.avatarView);
        this.header.setText(state.getHeaderText());
        bindArticleSuggestion(state.getFirstArticleSuggestionViewState(), this.firstArticleSuggestion);
        bindArticleSuggestion(state.getSecondArticleSuggestionViewState(), this.secondArticleSuggestion);
        bindArticleSuggestion(state.getThirdArticleSuggestionViewState(), this.thirdArticleSuggestion);
        setSuggestionBackgrounds(state.getArticleSuggestionViewStates());
    }

    public ArticlesResponseView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        init();
    }
}
