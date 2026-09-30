package zendesk.support.guide;

import com.zendesk.logger.Logger;
import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zendesk.core.NetworkInfoProvider;
import zendesk.core.RetryAction;
import zendesk.support.ArticleItem;
import zendesk.support.CategoryItem;
import zendesk.support.HelpItem;
import zendesk.support.SectionItem;
import zendesk.support.SeeAllArticlesItem;
import zendesk.support.guide.HelpCenterMvp;
import zendesk.support.guide.HelpMvp;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class HelpAdapterPresenter implements HelpMvp.Presenter {
    private static final Integer RETRY_ACTION_ID = 5;
    private HelpCenterMvp.Presenter contentPresenter;
    private boolean hasError;
    private HelpCenterConfiguration helpCenterUiConfig;
    private HelpMvp.Model model;
    private NetworkInfoProvider networkInfoProvider;
    private boolean noResults;
    private RetryAction retryAction;
    private HelpMvp.View view;
    private List<HelpItem> helpItems = new ArrayList();
    private List<HelpItem> filteredItems = new ArrayList();
    private ZendeskCallback<List<HelpItem>> callback = new ZendeskCallback<List<HelpItem>>() { // from class: zendesk.support.guide.HelpAdapterPresenter.2
        @Override // com.zendesk.service.ZendeskCallback
        public void onError(ErrorResponse errorResponse) {
            HelpCenterMvp.ErrorType errorType;
            if (CollectionUtils.isNotEmpty(HelpAdapterPresenter.this.helpCenterUiConfig.getCategoryIds())) {
                errorType = HelpCenterMvp.ErrorType.CATEGORY_LOAD;
            } else if (CollectionUtils.isNotEmpty(HelpAdapterPresenter.this.helpCenterUiConfig.getSectionIds())) {
                errorType = HelpCenterMvp.ErrorType.SECTION_LOAD;
            } else {
                errorType = HelpCenterMvp.ErrorType.ARTICLES_LOAD;
            }
            HelpAdapterPresenter.this.contentPresenter.onErrorWithRetry(errorType, new RetryAction() { // from class: zendesk.support.guide.HelpAdapterPresenter.2.1
                @Override // zendesk.core.RetryAction
                public void onRetry() {
                    HelpAdapterPresenter.this.hasError = false;
                    HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
                    HelpAdapterPresenter.this.requestHelpContent();
                }
            });
            HelpAdapterPresenter.this.hasError = true;
            HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
        }

        @Override // com.zendesk.service.ZendeskCallback
        public void onSuccess(List<HelpItem> list) {
            HelpAdapterPresenter.this.hasError = false;
            HelpAdapterPresenter.this.helpItems = CollectionUtils.copyOf(list);
            if (HelpAdapterPresenter.this.helpCenterUiConfig.isCollapseCategories()) {
                HelpAdapterPresenter helpAdapterPresenter = HelpAdapterPresenter.this;
                helpAdapterPresenter.filteredItems = helpAdapterPresenter.getCollapsedCategories(helpAdapterPresenter.helpItems);
            } else {
                HelpAdapterPresenter helpAdapterPresenter2 = HelpAdapterPresenter.this;
                helpAdapterPresenter2.filteredItems = CollectionUtils.copyOf(helpAdapterPresenter2.helpItems);
            }
            HelpAdapterPresenter helpAdapterPresenter3 = HelpAdapterPresenter.this;
            helpAdapterPresenter3.noResults = CollectionUtils.isEmpty(helpAdapterPresenter3.filteredItems);
            HelpAdapterPresenter.this.view.showItems(HelpAdapterPresenter.this.filteredItems);
            HelpAdapterPresenter.this.contentPresenter.onLoad();
        }
    };

    public HelpAdapterPresenter(HelpMvp.View view, HelpMvp.Model model, NetworkInfoProvider networkInfoProvider, HelpCenterConfiguration helpCenterConfiguration) {
        this.view = view;
        this.model = model;
        this.networkInfoProvider = networkInfoProvider;
        this.helpCenterUiConfig = helpCenterConfiguration;
    }

    private void addItem(int i4, HelpItem helpItem) {
        this.filteredItems.add(i4, helpItem);
        this.view.addItem(i4, helpItem);
    }

    private void collapseItem(int i4) {
        if (i4 < getItemCount() - 1) {
            int i5 = i4 + 1;
            while (i5 < this.filteredItems.size() && 1 != this.filteredItems.get(i5).getViewType()) {
                removeItem(i5);
            }
        }
    }

    private void expandItem(CategoryItem categoryItem, int i4) {
        int i5 = i4 + 1;
        for (SectionItem sectionItem : categoryItem.getSections()) {
            addItem(i5, sectionItem);
            i5++;
            try {
                Iterator<HelpItem> it = sectionItem.getChildren().iterator();
                while (it.hasNext()) {
                    addItem(i5, it.next());
                    i5++;
                }
            } catch (ClassCastException e) {
                Logger.e("HelpCenterActivity", "Error expanding item", e, new Object[0]);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<HelpItem> getCollapsedCategories(List<HelpItem> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() != 0) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (1 == list.get(i4).getViewType()) {
                    arrayList.add(list.get(i4));
                    ((CategoryItem) list.get(i4)).setExpanded(false);
                }
            }
        }
        return arrayList;
    }

    private int getPaddingItemCount() {
        return this.helpCenterUiConfig.isContactUsButtonVisible() ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadMoreArticles(final SeeAllArticlesItem seeAllArticlesItem) {
        final SectionItem section = seeAllArticlesItem.getSection();
        final RetryAction retryAction = new RetryAction() { // from class: zendesk.support.guide.HelpAdapterPresenter.3
            @Override // zendesk.core.RetryAction
            public void onRetry() {
                HelpAdapterPresenter.this.loadMoreArticles(seeAllArticlesItem);
            }
        };
        if (this.networkInfoProvider.isNetworkAvailable()) {
            this.model.getArticlesForSection(section, this.helpCenterUiConfig.getLabelNames(), new ZendeskCallback<List<ArticleItem>>() { // from class: zendesk.support.guide.HelpAdapterPresenter.4
                @Override // com.zendesk.service.ZendeskCallback
                public void onError(ErrorResponse errorResponse) {
                    HelpAdapterPresenter.this.helpItems.remove(seeAllArticlesItem);
                    Logger.e("HelpCenterActivity", "Failed to load more articles", errorResponse);
                    HelpAdapterPresenter.this.contentPresenter.onErrorWithRetry(HelpCenterMvp.ErrorType.ARTICLES_LOAD, retryAction);
                }

                @Override // com.zendesk.service.ZendeskCallback
                public void onSuccess(List<ArticleItem> list) {
                    int indexOf = HelpAdapterPresenter.this.helpItems.indexOf(seeAllArticlesItem);
                    int indexOf2 = HelpAdapterPresenter.this.filteredItems.indexOf(seeAllArticlesItem);
                    for (ArticleItem articleItem : list) {
                        if (!HelpAdapterPresenter.this.helpItems.contains(articleItem)) {
                            int i4 = indexOf + 1;
                            HelpAdapterPresenter.this.helpItems.add(indexOf, articleItem);
                            section.addArticle(articleItem);
                            if (indexOf2 != -1) {
                                HelpAdapterPresenter.this.filteredItems.add(indexOf2, articleItem);
                                HelpAdapterPresenter.this.view.addItem(indexOf2, articleItem);
                                indexOf2++;
                            }
                            indexOf = i4;
                        }
                    }
                    HelpAdapterPresenter.this.helpItems.remove(seeAllArticlesItem);
                    int indexOf3 = HelpAdapterPresenter.this.filteredItems.indexOf(seeAllArticlesItem);
                    HelpAdapterPresenter.this.filteredItems.remove(seeAllArticlesItem);
                    HelpAdapterPresenter.this.view.removeItem(indexOf3);
                }
            });
        } else {
            this.retryAction = retryAction;
            this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, retryAction);
        }
    }

    private void removeItem(int i4) {
        this.filteredItems.remove(i4);
        this.view.removeItem(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestHelpContent() {
        if (!this.networkInfoProvider.isNetworkAvailable()) {
            RetryAction retryAction = new RetryAction() { // from class: zendesk.support.guide.HelpAdapterPresenter.1
                @Override // zendesk.core.RetryAction
                public void onRetry() {
                    HelpAdapterPresenter.this.requestHelpContent();
                }
            };
            this.retryAction = retryAction;
            this.networkInfoProvider.addRetryAction(RETRY_ACTION_ID, retryAction);
        }
        this.model.getArticles(this.helpCenterUiConfig.getCategoryIds(), this.helpCenterUiConfig.getSectionIds(), this.helpCenterUiConfig.getLabelNames(), this.callback);
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public HelpItem getItem(int i4) {
        return this.filteredItems.get(i4);
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public int getItemCount() {
        if (this.hasError) {
            return 0;
        }
        return Math.max(this.filteredItems.size() + getPaddingItemCount(), 1);
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public HelpItem getItemForBinding(int i4) {
        if (this.filteredItems.size() <= 0 || i4 >= this.filteredItems.size()) {
            return null;
        }
        return this.filteredItems.get(i4);
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public int getItemViewType(int i4) {
        if (this.noResults) {
            return 7;
        }
        if (this.filteredItems.size() > 0) {
            if (i4 == this.filteredItems.size()) {
                return 8;
            }
            return this.filteredItems.get(i4).getViewType();
        }
        return 5;
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public void onAttached() {
        this.networkInfoProvider.register();
        if (CollectionUtils.isEmpty(this.helpItems)) {
            requestHelpContent();
        }
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public boolean onCategoryClick(CategoryItem categoryItem, int i4) {
        if (categoryItem == null) {
            return false;
        }
        boolean expanded = categoryItem.setExpanded(!categoryItem.isExpanded());
        if (expanded) {
            expandItem(categoryItem, this.filteredItems.indexOf(categoryItem));
            return expanded;
        }
        collapseItem(this.filteredItems.indexOf(categoryItem));
        return expanded;
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public void onDetached() {
        this.networkInfoProvider.removeRetryAction(RETRY_ACTION_ID);
        this.networkInfoProvider.unregister();
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public void onSeeAllClick(SeeAllArticlesItem seeAllArticlesItem) {
        loadMoreArticles(seeAllArticlesItem);
    }

    @Override // zendesk.support.guide.HelpMvp.Presenter
    public void setContentPresenter(HelpCenterMvp.Presenter presenter) {
        this.contentPresenter = presenter;
    }
}
