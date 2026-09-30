package zendesk.support.guide;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import com.zendesk.guide.sdk.R;
import com.zendesk.logger.Logger;
import java.util.List;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.CategoryItem;
import zendesk.support.HelpCenterProvider;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
import zendesk.support.guide.HelpCenterMvp;
import zendesk.support.guide.HelpMvp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelpRecyclerViewAdapter extends az implements HelpMvp.View {
    private Context context;
    private int defaultCategoryTitleColour;
    private final HelpCenterConfiguration helpCenterUiConfig;
    private int highlightCategoryTitleColour;
    private HelpMvp.Presenter presenter;

    /* loaded from: classes.dex */
    public class ArticleViewHolder extends HelpViewHolder {
        public ArticleViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(final HelpItem helpItem, int i4) {
            if (helpItem != null && helpItem.getId() != null) {
                this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
                this.textView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpRecyclerViewAdapter.ArticleViewHolder.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        ViewArticleActivity.builder(helpItem.getId().longValue()).show(HelpRecyclerViewAdapter.this.context, HelpRecyclerViewAdapter.this.helpCenterUiConfig.getConfigurations());
                    }
                });
            } else {
                Logger.e("HelpCenterActivity", "Article item was null, cannot bind", new Object[0]);
            }
        }
    }

    /* loaded from: classes.dex */
    public class CategoryViewHolder extends HelpViewHolder {
        private static final int ROTATION_END_LEVEL = 10000;
        private static final String ROTATION_PROPERTY_NAME = "level";
        private static final int ROTATION_START_LEVEL = 0;
        private boolean expanded;
        private Drawable expanderDrawable;

        public CategoryViewHolder(View view) {
            super(view);
            this.textView = (TextView) view;
            Drawable mutate = view.getContext().getDrawable(R.drawable.zs_help_ic_expand_more).mutate();
            this.expanderDrawable = mutate;
            mutate.setTint(UiUtils.themeAttributeToColor(android.R.attr.textColorSecondary, HelpRecyclerViewAdapter.this.context, R.color.zs_fallback_text_color));
            this.expanderDrawable.setTintMode(PorterDuff.Mode.SRC_IN);
            ((TextView) view).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, this.expanderDrawable, (Drawable) null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighlightColor(boolean z2) {
            if (z2) {
                this.textView.setTextColor(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour);
                this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.highlightCategoryTitleColour, PorterDuff.Mode.SRC_IN);
            } else {
                this.textView.setTextColor(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour);
                this.expanderDrawable.setColorFilter(HelpRecyclerViewAdapter.this.defaultCategoryTitleColour, PorterDuff.Mode.SRC_IN);
            }
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, final int i4) {
            int i5 = 0;
            if (helpItem == null) {
                Logger.e("HelpCenterActivity", "Category item was null, cannot bind", new Object[0]);
                return;
            }
            this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
            final CategoryItem categoryItem = (CategoryItem) helpItem;
            boolean isExpanded = categoryItem.isExpanded();
            this.expanded = isExpanded;
            Drawable drawable = this.expanderDrawable;
            if (isExpanded) {
                i5 = 10000;
            }
            drawable.setLevel(i5);
            setHighlightColor(categoryItem.isExpanded());
            this.textView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpRecyclerViewAdapter.CategoryViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    int i10;
                    CategoryViewHolder categoryViewHolder = CategoryViewHolder.this;
                    categoryViewHolder.expanded = HelpRecyclerViewAdapter.this.presenter.onCategoryClick(categoryItem, i4);
                    Drawable drawable2 = CategoryViewHolder.this.expanderDrawable;
                    int i11 = 10000;
                    if (CategoryViewHolder.this.expanded) {
                        i10 = 0;
                    } else {
                        i10 = 10000;
                    }
                    if (!CategoryViewHolder.this.expanded) {
                        i11 = 0;
                    }
                    ObjectAnimator.ofInt(drawable2, CategoryViewHolder.ROTATION_PROPERTY_NAME, i10, i11).start();
                    CategoryViewHolder categoryViewHolder2 = CategoryViewHolder.this;
                    categoryViewHolder2.setHighlightColor(categoryViewHolder2.expanded);
                }
            });
        }

        public boolean isExpanded() {
            return this.expanded;
        }
    }

    /* loaded from: classes.dex */
    public class ExtraPaddingViewHolder extends HelpViewHolder {
        public ExtraPaddingViewHolder(View view) {
            super(view);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, int i4) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class HelpViewHolder extends f0 {
        TextView textView;

        public HelpViewHolder(View view) {
            super(view);
        }

        public abstract void bindTo(HelpItem helpItem, int i4);
    }

    /* loaded from: classes.dex */
    public class LoadingViewHolder extends HelpViewHolder {
        public LoadingViewHolder(View view) {
            super(view);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, int i4) {
        }
    }

    /* loaded from: classes.dex */
    public class NoResultsViewHolder extends HelpViewHolder {
        public NoResultsViewHolder(View view) {
            super(view);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, int i4) {
        }
    }

    /* loaded from: classes.dex */
    public class SectionViewHolder extends HelpViewHolder {
        public SectionViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.section_title);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(HelpItem helpItem, int i4) {
            if (helpItem == null) {
                Logger.e("HelpCenterActivity", "Section item was null, cannot bind", new Object[0]);
            } else {
                this.textView.setText(UiUtils.decodeHtmlEntities(helpItem.getName()));
            }
        }
    }

    /* loaded from: classes.dex */
    public class SeeAllViewHolder extends HelpViewHolder {
        private ProgressBar progressBar;

        public SeeAllViewHolder(View view) {
            super(view);
            this.textView = (TextView) view.findViewById(R.id.help_section_action_button);
            this.progressBar = (ProgressBar) view.findViewById(R.id.help_section_loading_progress);
        }

        @Override // zendesk.support.guide.HelpRecyclerViewAdapter.HelpViewHolder
        public void bindTo(final HelpItem helpItem, int i4) {
            String string;
            if (!(helpItem instanceof SeeAllArticlesItem)) {
                Logger.e("HelpCenterActivity", "SeeAll item was null, cannot bind", new Object[0]);
                return;
            }
            final SeeAllArticlesItem seeAllArticlesItem = (SeeAllArticlesItem) helpItem;
            if (seeAllArticlesItem.isLoading()) {
                this.textView.setVisibility(8);
                this.progressBar.setVisibility(0);
            } else {
                this.textView.setVisibility(0);
                this.progressBar.setVisibility(8);
            }
            SectionItem section = seeAllArticlesItem.getSection();
            if (section != null) {
                string = HelpRecyclerViewAdapter.this.context.getString(R.string.support_help_see_all_n_articles_label, Integer.valueOf(section.getTotalArticlesCount()));
            } else {
                string = HelpRecyclerViewAdapter.this.context.getString(R.string.support_help_see_all_articles_label);
            }
            this.textView.setText(string);
            this.textView.setOnClickListener(new View.OnClickListener() { // from class: zendesk.support.guide.HelpRecyclerViewAdapter.SeeAllViewHolder.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    SeeAllViewHolder.this.textView.setVisibility(8);
                    SeeAllViewHolder.this.progressBar.setVisibility(0);
                    HelpRecyclerViewAdapter.this.presenter.onSeeAllClick((SeeAllArticlesItem) helpItem);
                    seeAllArticlesItem.setLoading(true);
                }
            });
        }
    }

    public HelpRecyclerViewAdapter(HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider, NetworkInfoProvider networkInfoProvider) {
        this.presenter = new HelpAdapterPresenter(this, new HelpModel(helpCenterProvider), networkInfoProvider, helpCenterConfiguration);
        this.helpCenterUiConfig = helpCenterConfiguration;
    }

    private View inflateView(ViewGroup viewGroup, int i4) {
        return LayoutInflater.from(viewGroup.getContext()).inflate(i4, viewGroup, false);
    }

    @Override // zendesk.support.guide.HelpMvp.View
    public void addItem(int i4, HelpItem helpItem) {
        notifyItemInserted(i4);
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemCount() {
        return this.presenter.getItemCount();
    }

    @Override // androidx.recyclerview.widget.az
    public int getItemViewType(int i4) {
        return this.presenter.getItemViewType(i4);
    }

    @Override // androidx.recyclerview.widget.az
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        Context context = recyclerView.getContext();
        this.context = context;
        this.highlightCategoryTitleColour = UiUtils.themeAttributeToColor(R.attr.colorPrimary, context, R.color.zs_fallback_text_color);
        this.defaultCategoryTitleColour = this.context.getColor(R.color.zs_help_text_color_primary);
        this.presenter.onAttached();
    }

    @Override // androidx.recyclerview.widget.az
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.presenter.onDetached();
        this.context = null;
    }

    @Override // zendesk.support.guide.HelpMvp.View
    public void removeItem(int i4) {
        notifyItemRemoved(i4);
    }

    public void setContentUpdateListener(HelpCenterMvp.Presenter presenter) {
        HelpMvp.Presenter presenter2 = this.presenter;
        if (presenter2 != null) {
            presenter2.setContentPresenter(presenter);
        }
    }

    @Override // zendesk.support.guide.HelpMvp.View
    public void showItems(List<HelpItem> list) {
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.az
    public void onBindViewHolder(HelpViewHolder helpViewHolder, int i4) {
        if (helpViewHolder == null) {
            Logger.w("HelpCenterActivity", "Holder was null, possible unexpected item type", new Object[0]);
        } else {
            helpViewHolder.bindTo(this.presenter.getItemForBinding(i4), i4);
        }
    }

    @Override // androidx.recyclerview.widget.az
    public HelpViewHolder onCreateViewHolder(ViewGroup viewGroup, int i4) {
        switch (i4) {
            case 1:
                return new CategoryViewHolder(inflateView(viewGroup, R.layout.zs_row_category));
            case 2:
                return new SectionViewHolder(inflateView(viewGroup, R.layout.zs_row_section));
            case 3:
                return new ArticleViewHolder(inflateView(viewGroup, R.layout.zs_row_article));
            case 4:
                return new SeeAllViewHolder(inflateView(viewGroup, R.layout.zs_row_action));
            case 5:
                return new LoadingViewHolder(inflateView(viewGroup, R.layout.zs_row_loading_progress));
            case 6:
            default:
                Logger.w("HelpCenterActivity", "Unknown item type, returning null for holder", new Object[0]);
                return null;
            case 7:
                return new NoResultsViewHolder(inflateView(viewGroup, R.layout.zs_row_no_articles_found));
            case 8:
                return new ExtraPaddingViewHolder(inflateView(viewGroup, R.layout.zs_row_padding));
        }
    }
}
