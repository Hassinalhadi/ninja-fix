package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ai;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zendesk.guide.sdk.R;
import java.util.Collections;
import java.util.List;
import zendesk.configurations.ConfigurationUtil;
import zendesk.support.HelpCenterProvider;
import zendesk.support.SearchArticle;

/* loaded from: classes.dex */
public class HelpSearchFragment extends ai {
    private HelpSearchRecyclerViewAdapter adapter;
    private HelpCenterProvider helpCenterProvider;
    private RecyclerView recyclerView;
    private List<SearchArticle> searchArticles = Collections.EMPTY_LIST;
    private String query = "";

    @SuppressLint({"RestrictedApi"})
    public static HelpSearchFragment newInstance(HelpCenterConfiguration helpCenterConfiguration, HelpCenterProvider helpCenterProvider) {
        Bundle bundle = new Bundle();
        ConfigurationUtil.addToBundle(bundle, helpCenterConfiguration);
        HelpSearchFragment helpSearchFragment = new HelpSearchFragment();
        helpSearchFragment.setArguments(bundle);
        helpSearchFragment.helpCenterProvider = helpCenterProvider;
        return helpSearchFragment;
    }

    private void setupRecyclerView() {
        HelpCenterConfiguration helpCenterConfiguration = (HelpCenterConfiguration) ConfigurationUtil.fromBundle(getArguments(), HelpCenterConfiguration.class);
        RecyclerView recyclerView = this.recyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter = new HelpSearchRecyclerViewAdapter(this.searchArticles, this.query, helpCenterConfiguration, this.helpCenterProvider);
        this.adapter = helpSearchRecyclerViewAdapter;
        this.recyclerView.setAdapter(helpSearchRecyclerViewAdapter);
    }

    public void clearResults() {
        HelpSearchRecyclerViewAdapter helpSearchRecyclerViewAdapter = this.adapter;
        if (helpSearchRecyclerViewAdapter != null) {
            helpSearchRecyclerViewAdapter.clearResults();
        }
    }

    @Override // androidx.fragment.app.ai
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.ai
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.zs_fragment_help, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.help_center_article_list);
        setupRecyclerView();
        return inflate;
    }

    public void updateResults(List<SearchArticle> list, String str) {
        RecyclerView recyclerView;
        this.searchArticles = list;
        this.query = str;
        if (this.adapter != null && (recyclerView = this.recyclerView) != null) {
            recyclerView.setVisibility(0);
            this.adapter.update(list, str);
            this.recyclerView.announceForAccessibility(getString(R.string.zs_help_center_search_loaded_accessibility));
        }
    }
}
