package zendesk.support.guide;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import com.zendesk.guide.sdk.R;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import java.util.WeakHashMap;
import s1.au;
import zendesk.support.ArticleVote;
import zendesk.support.ArticleVoteStorage;
import zendesk.support.HelpCenterProvider;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ArticleVotingView extends RelativeLayout {
    private Long articleId;
    private ArticleVote articleVote;
    private ArticleVoteStorage articleVoteStorage;
    private ImageButton downvoteButton;
    private ViewGroup downvoteButtonFrame;
    private HelpCenterProvider helpCenterProvider;
    private ImageButton upvoteButton;
    private ViewGroup upvoteButtonFrame;

    /* renamed from: zendesk.support.guide.ArticleVotingView$6, reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState;

        static {
            int[] iArr = new int[VoteState.values().length];
            $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState = iArr;
            try {
                iArr[VoteState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[VoteState.UPVOTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[VoteState.DOWNVOTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum VoteState {
        UPVOTED,
        DOWNVOTED,
        NONE;

        public static VoteState fromArticleVote(ArticleVote articleVote) {
            if (articleVote != null && articleVote.getValue() != null) {
                int intValue = articleVote.getValue().intValue();
                if (intValue > 0) {
                    return UPVOTED;
                }
                if (intValue < 0) {
                    return DOWNVOTED;
                }
                return NONE;
            }
            return NONE;
        }
    }

    public ArticleVotingView(Context context) {
        super(context);
        setupViews(context);
    }

    private GradientDrawable buildButtonBackground(Context context, int i4) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.zs_help_voting_button_border_corner_radius);
        int color = context.getColor(R.color.zs_help_voting_button_border);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.zs_help_voting_button_border_width);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimensionPixelSize);
        gradientDrawable.setColor(i4);
        gradientDrawable.setStroke(dimensionPixelSize2, color);
        return gradientDrawable;
    }

    private ColorStateList colorStateList(int i4, int i5) {
        return new ColorStateList(new int[][]{new int[]{android.R.attr.state_activated}, new int[]{android.R.attr.state_pressed}, new int[0]}, new int[]{i4, i4, i5});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void downvoteArticle() {
        boolean z2;
        if (this.articleId == null) {
            Logger.w("ViewArticleActivity", "Cannot downvote article, articleId is null. Make sure you've called bindTo()!", new Object[0]);
            return;
        }
        StringBuilder sb2 = new StringBuilder("hcp == null -> ");
        if (this.helpCenterProvider == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        sb2.append(z2);
        Logger.e("ViewArticleActivity", sb2.toString(), new Object[0]);
        this.helpCenterProvider.downvoteArticle(this.articleId, new ZendeskCallback<ArticleVote>() { // from class: zendesk.support.guide.ArticleVotingView.4
            @Override // com.zendesk.service.ZendeskCallback
            public void onError(ErrorResponse errorResponse) {
                Logger.d("ViewArticleActivity", "Failed to downvote article. " + errorResponse, new Object[0]);
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(R.string.zs_view_article_voted_failed_accessibility_announce));
                ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }

            @Override // com.zendesk.service.ZendeskCallback
            public void onSuccess(ArticleVote articleVote) {
                Logger.d("ViewArticleActivity", "Successfully downvoted article!", new Object[0]);
                ArticleVotingView.this.articleVote = articleVote;
                ArticleVotingView articleVotingView = ArticleVotingView.this;
                articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(R.string.zs_view_article_voted_no_accessibility_announce));
                ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                ArticleVotingView.this.setVotingButtonsClickable(true);
            }
        });
    }

    private StateListDrawable getVotingButtonBackground(int i4) {
        GradientDrawable buildButtonBackground = buildButtonBackground(getContext(), i4);
        GradientDrawable buildButtonBackground2 = buildButtonBackground(getContext(), -1);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_activated}, buildButtonBackground);
        stateListDrawable.addState(new int[]{android.R.attr.state_pressed}, buildButtonBackground);
        stateListDrawable.addState(new int[0], buildButtonBackground2);
        return stateListDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVote() {
        if (this.articleId == null) {
            Logger.w("ViewArticleActivity", "Article vote was null, could not remove vote", new Object[0]);
        } else if (this.articleVote.getId() != null) {
            this.helpCenterProvider.deleteVote(this.articleVote.getId(), new ZendeskCallback<Void>() { // from class: zendesk.support.guide.ArticleVotingView.5
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    Logger.d("ViewArticleActivity", "Failed to remove vote. " + errorResponse.getResponseBody() + "\n" + errorResponse.getResponseBodyType() + "\n" + errorResponse.getUrl(), new Object[0]);
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.updateButtons(VoteState.fromArticleVote(articleVotingView.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(Void r32) {
                    Logger.d("ViewArticleActivity", "Successfully removed vote!", new Object[0]);
                    ArticleVotingView.this.articleVote = null;
                    ArticleVotingView.this.articleVoteStorage.removeStoredArticleVote(ArticleVotingView.this.articleId);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVotingButtonsClickable(boolean z2) {
        this.upvoteButton.setClickable(z2);
        this.downvoteButton.setClickable(z2);
    }

    private void setupViews(Context context) {
        LayoutInflater.from(context).inflate(R.layout.zs_view_article_voting, this);
        this.upvoteButtonFrame = (ViewGroup) findViewById(R.id.upvote_button_frame);
        this.upvoteButton = (ImageButton) findViewById(R.id.upvote_button);
        this.downvoteButtonFrame = (ViewGroup) findViewById(R.id.downvote_button_frame);
        this.downvoteButton = (ImageButton) findViewById(R.id.downvote_button);
        int themeAttributeToColor = UiUtils.themeAttributeToColor(R.attr.colorPrimary, getContext(), R.color.zs_fallback_text_color);
        themeVotingButton(this.upvoteButton, R.drawable.zs_ic_thumb_up, themeAttributeToColor);
        themeVotingButton(this.downvoteButton, R.drawable.zs_ic_thumb_down, themeAttributeToColor);
        this.upvoteButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.ArticleVotingView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote != null && ArticleVotingView.this.articleVote.getValue() != null && ArticleVotingView.this.articleVote.getValue().equals(1)) {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                } else {
                    voteState = VoteState.UPVOTED;
                    ArticleVotingView.this.upvoteArticle();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
        this.downvoteButton.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.ArticleVotingView.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                VoteState voteState;
                ArticleVotingView.this.setVotingButtonsClickable(false);
                if (ArticleVotingView.this.articleVote != null && ArticleVotingView.this.articleVote.getValue() != null && ArticleVotingView.this.articleVote.getValue().equals(-1)) {
                    voteState = VoteState.NONE;
                    ArticleVotingView.this.removeVote();
                } else {
                    voteState = VoteState.DOWNVOTED;
                    ArticleVotingView.this.downvoteArticle();
                }
                ArticleVotingView.this.updateButtons(voteState);
            }
        });
    }

    private void themeVotingButton(ImageButton imageButton, int i4, int i5) {
        StateListDrawable votingButtonBackground = getVotingButtonBackground(i5);
        WeakHashMap weakHashMap = au.alpha;
        imageButton.setBackground(votingButtonBackground);
        Drawable drawable = getContext().getDrawable(i4);
        drawable.setTintList(colorStateList(-1, i5));
        drawable.setTintMode(PorterDuff.Mode.SRC_IN);
        imageButton.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateButtons(VoteState voteState) {
        if (voteState == VoteState.NONE) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.UPVOTED) {
            this.upvoteButtonFrame.setActivated(true);
            this.downvoteButtonFrame.setActivated(false);
        } else if (voteState == VoteState.DOWNVOTED) {
            this.upvoteButtonFrame.setActivated(false);
            this.downvoteButtonFrame.setActivated(true);
        }
        updateContentDesc(voteState);
    }

    private void updateContentDesc(VoteState voteState) {
        int i4 = AnonymousClass6.$SwitchMap$zendesk$support$guide$ArticleVotingView$VoteState[voteState.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    Logger.d("ViewArticleActivity", "Unhandled voteState case", new Object[0]);
                    return;
                } else {
                    this.upvoteButton.setContentDescription(getResources().getString(R.string.zs_view_article_vote_yes_accessibility));
                    this.downvoteButton.setContentDescription(getResources().getString(R.string.zs_view_article_vote_yes_remove_accessibility));
                    return;
                }
            }
            this.upvoteButton.setContentDescription(getResources().getString(R.string.zs_view_article_vote_no_remove_accessibility));
            this.downvoteButton.setContentDescription(getResources().getString(R.string.zs_view_article_vote_no_accessibility));
            return;
        }
        this.upvoteButton.setContentDescription(getResources().getString(R.string.zs_view_article_vote_yes_accessibility));
        this.downvoteButton.setContentDescription(getResources().getString(R.string.zs_view_article_vote_no_accessibility));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void upvoteArticle() {
        Long l10 = this.articleId;
        if (l10 == null) {
            Logger.w("ViewArticleActivity", "Cannot upvote article, articleId is null. Make sure you've called bindTo()!", new Object[0]);
        } else {
            this.helpCenterProvider.upvoteArticle(l10, new ZendeskCallback<ArticleVote>() { // from class: zendesk.support.guide.ArticleVotingView.3
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    Logger.d("ViewArticleActivity", "Failed to upvote article. " + errorResponse, new Object[0]);
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(R.string.zs_view_article_voted_failed_accessibility_announce));
                    ArticleVotingView articleVotingView2 = ArticleVotingView.this;
                    articleVotingView2.updateButtons(VoteState.fromArticleVote(articleVotingView2.articleVote));
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(ArticleVote articleVote) {
                    Logger.d("ViewArticleActivity", "Successfully upvoted article!", new Object[0]);
                    ArticleVotingView.this.articleVote = articleVote;
                    ArticleVotingView articleVotingView = ArticleVotingView.this;
                    articleVotingView.announceForAccessibility(articleVotingView.getResources().getString(R.string.zs_view_article_voted_yes_accessibility_announce));
                    ArticleVotingView.this.articleVoteStorage.storeArticleVote(ArticleVotingView.this.articleId, articleVote);
                    ArticleVotingView.this.setVotingButtonsClickable(true);
                }
            });
        }
    }

    public void bindTo(Long l10, ArticleVoteStorage articleVoteStorage, HelpCenterProvider helpCenterProvider) {
        this.articleVoteStorage = articleVoteStorage;
        this.helpCenterProvider = helpCenterProvider;
        this.articleId = l10;
        if (l10 != null) {
            ArticleVote storedArticleVote = articleVoteStorage.getStoredArticleVote(l10);
            this.articleVote = storedArticleVote;
            updateButtons(VoteState.fromArticleVote(storedArticleVote));
        }
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setupViews(context);
    }

    public ArticleVotingView(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        setupViews(context);
    }
}
