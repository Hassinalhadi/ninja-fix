package zendesk.support.guide;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import com.zendesk.guide.sdk.R;
import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.LocaleUtil;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelpSearchRecyclerViewAdapter extends az {
    private static final int TYPE_ARTICLE = 531;
    private static final int TYPE_NO_RESULTS = 441;
    private static final int TYPE_PADDING = 423;
    private final HelpCenterProvider helpCenterProvider;
    private final HelpCenterConfiguration helpCenterUiConfig;
    private String query;
    private boolean resultsCleared = false;
    private List<SearchArticle> searchArticles;

    /* loaded from: classes.dex */
    public class HelpSearchViewHolder extends f0 {
        private Context context;
        private TextView subtitleTextView;
        private TextView titleTextView;

        public HelpSearchViewHolder(View view, Context context) {
            super(view);
            this.titleTextView = (TextView) view.findViewById(R.id.title);
            this.subtitleTextView = (TextView) view.findViewById(R.id.subtitle);
            this.context = context;
        }

        public void bindTo(final SearchArticle searchArticle) {
            String str;
            int indexOf;
            if (searchArticle != null && searchArticle.getArticle() != null) {
                if (searchArticle.getArticle().getTitle() != null) {
                    str = searchArticle.getArticle().getTitle();
                } else {
                    str = "";
                }
                if (HelpSearchRecyclerViewAdapter.this.query == null) {
                    indexOf = -1;
                } else {
                    indexOf = str.toLowerCase(Locale.getDefault()).indexOf(HelpSearchRecyclerViewAdapter.this.query.toLowerCase(Locale.getDefault()));
                }
                if (indexOf != -1) {
                    SpannableString spannableString = new SpannableString(str);
                    spannableString.setSpan(new StyleSpan(1), indexOf, HelpSearchRecyclerViewAdapter.this.query.length() + indexOf, 18);
                    this.titleTextView.setText(spannableString);
                } else {
                    this.titleTextView.setText(str);
                }
                this.subtitleTextView.setText(this.context.getString(R.string.help_search_subtitle_format, searchArticle.getCategory().getName(), searchArticle.getSection().getName()));
                this.itemView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpSearchRecyclerViewAdapter.HelpSearchViewHolder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        HelpSearchRecyclerViewAdapter.this.helpCenterProvider.submitRecordArticleView(searchArticle.getArticle(), LocaleUtil.forLanguageTag(searchArticle.getArticle().getLocale()), new ZendeskCallback<Void>() { // from class: zendesk.support.guide.HelpSearchRecyclerViewAdapter.HelpSearchViewHolder.1.1
                            @Override // com.zendesk.service.ZendeskCallback
                            public void onError(ErrorResponse errorResponse) {
                                Logger.e("HelpCenterActivity", "Error submitting Help Center reporting: [reason] %s [isNetworkError] %s [status] %d", errorResponse.getReason(), Boolean.valueOf(errorResponse.isNetworkError()), Integer.valueOf(errorResponse.getStatus()));
                            }

                            @Override // com.zendesk.service.ZendeskCallback
                            public void onSuccess(Void r12) {
                            }
                        });
                        ViewArticleActivity.builder(searchArticle.getArticle()).show(HelpSearchViewHolder.this.itemView.getContext(), HelpSearchRecyclerViewAdapter.this.helpCenterUiConfig.getConfigurations());
                    }
                });
                return;
            }
            Logger.e("HelpCenterActivity", "The article was null, cannot bind the view.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    public class NoResultsViewHolder extends f0 {
        public NoResultsViewHolder(View view) {
            super(view);
        }
    }

    /* loaded from: classes.dex */
    public class PaddingViewHolder extends f0 {
        public PaddingViewHolder(View view) {
            super(view);
        }
    }

    public HelpSearchRecyclerViewAdapter(List<SearchArticle> list, String str, HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider) {
        this.searchArticles = list;
        this.query = str;
        this.helpCenterUiConfig = helpCenterConfiguration;
        this.helpCenterProvider = helpCenterProvider;
    }

    private int getPaddingExtraItem() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    public void clearResults() {
        this.resultsCleared = true;
        this.searchArticles = Collections.EMPTY_LIST;
        this.query = "";
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemCount() {
        if (this.resultsCleared) {
            return 0;
        }
        return Math.max(this.searchArticles.size() + getPaddingExtraItem(), 1);
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemViewType(int i4) {
        if (i4 == 0 && this.searchArticles.size() == 0) {
            return TYPE_NO_RESULTS;
        }
        if (i4 > 0 && i4 == this.searchArticles.size()) {
            return TYPE_PADDING;
        }
        return TYPE_ARTICLE;
    }

    @Override // androidx.recyclerview.widget.az
    public void onBindViewHolder(f0 f0Var, int i4) {
        if (TYPE_ARTICLE == getItemViewType(i4)) {
            ((HelpSearchViewHolder) f0Var).bindTo(this.searchArticles.get(i4));
        }
    }

    @Override // androidx.recyclerview.widget.az
    public f0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        if (i4 != TYPE_PADDING) {
            if (i4 != TYPE_NO_RESULTS) {
                if (i4 != TYPE_ARTICLE) {
                    return null;
                }
                return new HelpSearchViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zs_row_search_article, viewGroup, false), viewGroup.getContext());
            }
            return new NoResultsViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zs_row_no_articles_found, viewGroup, false));
        }
        return new PaddingViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.zs_row_padding, viewGroup, false));
    }

    public void update(List<SearchArticle> list, String str) {
        this.resultsCleared = false;
        this.searchArticles = list;
        this.query = str;
        notifyDataSetChanged();
    }
}
