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
import zendesk.configurations.ConfigurationUtil;
import zendesk.core.NetworkInfoProvider;
import zendesk.support.HelpCenterProvider;
import zendesk.support.guide.HelpCenterMvp;

/* loaded from: classes.dex */
public class HelpCenterFragment extends ai {
    public static final String LOG_TAG = "HelpCenterFragment";
    private HelpRecyclerViewAdapter adapter;
    HelpCenterProvider helpCenterProvider;
    NetworkInfoProvider networkInfoProvider;
    private HelpCenterMvp.Presenter presenter;
    private RecyclerView recyclerView;

    @SuppressLint({"RestrictedApi"})
    public static HelpCenterFragment newInstance(HelpCenterConfiguration helpCenterConfiguration) {
        Bundle bundle = new Bundle();
        ConfigurationUtil.addToBundle(bundle, helpCenterConfiguration);
        HelpCenterFragment helpCenterFragment = new HelpCenterFragment();
        helpCenterFragment.setArguments(bundle);
        return helpCenterFragment;
    }

    private void setupRecyclerView() {
        RecyclerView recyclerView = this.recyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.recyclerView.addItemDecoration(new SeparatorDecoration(getContext().getDrawable(R.drawable.zs_help_separator)));
        this.recyclerView.setAdapter(this.adapter);
    }

    @Override // androidx.fragment.app.ai
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        GuideSdkDependencyProvider guideSdkDependencyProvider = GuideSdkDependencyProvider.INSTANCE;
        if (guideSdkDependencyProvider.isInitialized()) {
            HelpCenterConfiguration helpCenterConfiguration = (HelpCenterConfiguration) ConfigurationUtil.fromBundle(getArguments(), HelpCenterConfiguration.class);
            guideSdkDependencyProvider.provideGuideSdkComponent().inject(this);
            HelpRecyclerViewAdapter helpRecyclerViewAdapter = new HelpRecyclerViewAdapter(helpCenterConfiguration, this.helpCenterProvider, this.networkInfoProvider);
            this.adapter = helpRecyclerViewAdapter;
            HelpCenterMvp.Presenter presenter = this.presenter;
            if (presenter != null) {
                helpRecyclerViewAdapter.setContentUpdateListener(presenter);
            }
        }
    }

    @Override // androidx.fragment.app.ai
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.zs_fragment_help, viewGroup, false);
        this.recyclerView = (RecyclerView) inflate.findViewById(R.id.help_center_article_list);
        setupRecyclerView();
        return inflate;
    }

    public void setPresenter(HelpCenterMvp.Presenter presenter) {
        this.presenter = presenter;
        HelpRecyclerViewAdapter helpRecyclerViewAdapter = this.adapter;
        if (helpRecyclerViewAdapter != null) {
            helpRecyclerViewAdapter.setContentUpdateListener(presenter);
        }
    }
}
